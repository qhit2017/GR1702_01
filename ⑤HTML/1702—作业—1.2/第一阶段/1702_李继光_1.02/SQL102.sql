CREATE database db_phone
USE db_phone
--用户表
--用户编号	整型	主键
--姓名	字符型	
--身份证号	字符型	唯一，长度为18
CREATE table tb_user(
No int primary key,
name nvarchar(32),
id nvarchar(18) unique)
--号码表
--号码编号	整型	主键
--手机号码	字符型	唯一，长度为11
--号码状态	整型	0(未注册)1(已注册)2(已注销)
CREATE table tb_number(
numberNo int primary key,
Pnumber nvarchar(11) unique,
status int check(status = 0 or status = 1 or status = 2)
)
--已购号码表
--号码编号	整型	外键引用号码表
--用户编号	整型	外键引用用户表
--注册时间	日期型
--注销时间	日期型
--最后充值时间	日期型
--余额	浮点型	默认为0
CREATE table tb_buy(
numberNo int,
No int,
foreign key(numberNo) references tb_number(numberNo),
foreign key(No) references tb_user(No),
regdate date,
logout date,
topup date,
balance decimal(8,4) default 0)
--一、	根据表结构创建对应的表（30分）
--二、	插入数据，每张表至少两条数据(10分)
INSERT INTO tb_user values
('01','lifei','411481199710245116'),
('02','lele','411481199811075114'),
('03','xinx','411481199810205115')
-----------------------------
INSERT INTO tb_number VALUES
('106','13555655666','1'),
('101','18203709505','1'),
('102','17637420573','1'),
('103','13565656666','1'),
('104','13665659966','0'),
('105','13555658666','2')
------------------------------
INSERT INTO tb_buy VALUES
('106','01','2015-10-24','2025-10-24','2018-1-02',9.55),
('101','01','2015-10-24','2025-10-24','2018-1-02',29.55),
('102','01','2016-11-02','2025-10-24','2018-1-02',30),
('103','03','2017-8-24','2025-10-24','2018-1-02',50),
('105','02','2014-10-24','2018-1-1','2017-12-31',0)

--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE tb_buy SET balance= balance+100 
where numberNo = '101'AND No= '01' 
--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE tb_buy  FROM tb_number,tb_buy 
where tb_buy.numberNo = tb_number.numberNo 
AND status = '2' 
--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * FROM tb_user where No in(
	SELECT No from tb_buy ,tb_number 
	where tb_buy.numberNo = tb_number.numberNo 
	AND status = 1)
--六、	查询出所有未注册的手机号(10分)
SELECT Pnumber from tb_number where status = 0
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息
SELECT tb_user.No,name,id,Pnumber as 手机号  
from tb_number, tb_buy, tb_user  where status = 1 
AND balance <10 
AND tb_buy.numberNo = tb_number.numberNo 
AND tb_buy.No = tb_user.No 