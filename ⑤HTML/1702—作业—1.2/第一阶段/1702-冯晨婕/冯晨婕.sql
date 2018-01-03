CREATE DATABASE db_phonenum
USE db_phonenum
-----------------------------------------------
--用户表
--用户编号	整型	主键
--姓名	字符型	
--身份证号	字符型	唯一，长度为18
CREATE table tb_user(
uid  int primary key,
uname nvarchar(32) not null,
unum  nvarchar(18) unique
)
INSERT INTO tb_user VALUES 
(1,'TOM','416945523689845781'),
(1701,'张三','410265874569512364'),
(1702,'李四','410265523684562464'),
(1703,'tamlls','416945523689845631')
SELECT * FROM tb_user 

--号码表
--号码编号	整型	主键
--手机号码	字符型	唯一，长度为11
--号码状态	整型	0(未注册)1(已注册)2(已注销)
CREATE table tb_number(
nid int primary key,
nip nvarchar(11) unique ,
nstate  int  check (nstate='0' or nstate='1' or nstate='2')
)
INSERT INTO tb_number VALUES 
(1,'15039963043',0),
(2,'13526138237',1),
(3,'15037254123',2)

--已购号码表
--号码编号	整型	外键引用号码表
--用户编号	整型	外键引用用户表
--注册时间	日期型	
--注销时间	日期型	
--最后充值时间	日期型	
--余额	浮点型	默认为0
CREATE TABLE tb_listnumber(
nid int ,
uid  int,
foreign key (nid) references tb_number,
foreign key (uid) references tb_user,
register date,
cancel date,
lasttop date,
 balance  decimal (8,4) default 0
)

INSERT INTO tb_listnumber VALUES 
(1,1701,'2003-01-02','2007-12-21','2007-12-10',3),
(2,1702,'2005-03-12','2011-10-11','2011-09-10',5),
(3,1703,'2016-04-25','2017-12-01','2017-10-29',10)
SELECT * FROM tb_listnumber


INSERT INTO tb_number VALUES 
(1,'15039963043',0),
(2,'13526138237',1),
(3,'15037254123',2)

--根据要求完成以下问题：
--一、	根据表结构创建对应的表（30分）
--二、	插入数据，每张表至少两条数据(10分)
--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE tb_listnumber  SET balance=balance+100WHERE  nid  = '1'

SELECT*FROM tb_listnumber
--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE  FROM tb_listnumber 
WHERE  nid = (SELECT nid FROM tb_number  WHERE nstate='2')

--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * from tb_user  WHERE uid IN (
SELECT NU.nid
 from tb_number NU WHERE nu.nstate = '1')
--------
SELECT * FROM tb_user where uid=(
	SELECT n.nid from tb_number n,tb_listnumber l
	WHERE l.nstate='1' 
	AND l.nid= l.nid
) 
--六、	查询出所有未注册的手机号(10分)
SELECT nu.nip as 未注册的手机号 from tb_number nu WHERE nu.nstate = '0'
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT * FROM tb_user where uid=(
 SELECT L.uid from tb_number n, tb_listnumber L
  WHERE  balance<10
  AND L.nid= n.nid)