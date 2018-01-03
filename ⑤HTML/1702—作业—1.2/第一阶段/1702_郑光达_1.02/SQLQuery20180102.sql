CREATE database db_Prepaidphonesystem

USE db_Prepaidphonesystem

--用户表
--用户编号	整型	主键
--姓名	字符型	
--身份证号	字符型	唯一，长度为18
create table tb_user(
userid int primary key,
name nvarchar(32),
idc nvarchar(18) unique not null )

--号码表
--号码编号	整型	主键
--手机号码	字符型	唯一，长度为11
--号码状态	整型	0(未注册)1(已注册)2(已注销)
create table tb_number(
Num int primary key,
tnumber nvarchar(11),
Stn int check(stn = 0 or stn = 1 or stn = 2))

--号码编号	整型	外键引用号码表
--用户编号	整型	外键引用用户表
--注册时间	日期型	
--注销时间	日期型	
--最后充值时间	日期型	
--cccccc	浮点型	默认为0

CREATE table tb_Lopn(
id int identity(1,1)primary key,
userid int ,
foreign key (userid) references tb_user(userid),
Num int,
foreign key (Num) references tb_number(Num),
rdate datetime,
LTime datetime,
Lrtime datetime,
balance float default 0)

--根据要求完成以下问题：
--一、	根据表结构创建对应的表（30分）
--二、	插入数据，每张表至少两条数据(10分)

INSERT INTO tb_user
SELECT 1,'卜英超' ,'371481199311109835'	UNION
SELECT 2,'岑涵蕾' ,'360725197802188287'	UNION
SELECT 3,'胡乐珍' ,'140400199403046825'

INSERT INTO tb_number 
SELECT 001,'15225327957',0 UNION
SELECT 002,'15625565958',1 UNION
SELECT 003,'18825432959',2 

INSERT INTO tb_Lopn
SELECT 001,1,'2017-1-16','2018-1-1','2017-10-1',37.5 UNION 
SELECT 002,2,'2016-2-16','2017-6-1','2017-3-1',15.5 UNION 
SELECT 003,3,'2015-3-16','2016-8-1','2016-5-1',18.5 

SELECT * FROM tb_Lopn
--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE tb_Lopn  SET balance = balance+100
WHERE userid =001 
AND Num =1

--四、	在已购号码表中删除号码状态为已注销的数据（10分）
		
DELETE FROM  tb_number where Stn = 2

--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT *
from tb_Lopn lo
where lo.userid = (
	SELECT nu.Num
	from tb_number nu
	WHERE nu.Stn = 1)
--六、	查询出所有未注册的手机号(10分)
SELECT nu.tnumber
from tb_number nu
where Stn = 0
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT *
from tb_Lopn lo,tb_number nu
where lo.userid =(
	SELECT nu.Num
	from tb_number nu
	where nu.Stn = 1)
	AND lo.balance <10
	AND lo.Num = nu.Num
	