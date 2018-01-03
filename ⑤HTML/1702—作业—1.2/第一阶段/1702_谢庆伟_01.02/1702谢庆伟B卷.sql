--创建数据库
CREATE database db_sqltest
GO 
--切换数据库
USE db_practice 
GO 
-- 一、编写SQL语句实现创建表结构
  --创建用户表，id为主键
CREATE table tb_user(
id int primary key,
name nvarchar(16) not null,
nameid nvarchar(18) check(len(nameid)=18) unique)
GO  
  --创建号码表，numid 为主键
CREATE table tb_number(
numid int primary key,
phonenum nvarchar(11) check(len(phonenum)=11) unique,
status smallint check(status in (0,1,2)))
GO 
  --创建已购号码表，添加标识列主键，
  --numid引用号码表numid,id引用用户表id
CREATE table tb_yetnum(
number int identity(1,1) primary key,
numid int foreign key references tb_number(numid),
id int foreign key references tb_user(id),
startdate date,
backdate date,
intoend date,
surplus decimal(6,2) default 0)
GO 
--二、	编写SQL语句插入数据
INSERT INTO tb_user VALUES
(1,'张三','412723200012110651'),
(2,'李四','412723199912120654'),
(3,'王五','412723199805150655'),
(4,'周六','412723199706266026'),
(5,'李七','412723199607275730'),
(6,'刘八','412723199802186455'),
(7,'陈九','412723200009196555'),
(8,'张三','412723200012106530'),
(9,'李四','412723199912106530'),
(10,'关羽','412723199812106530'),
(11,'刘备','412723199712106530'),
(12,'张飞','412723199612106530'),
(13,'诸葛亮','412723200012126530')
go 
INSERT INTO tb_number VALUES
(1,'13673989941',0),
(2,'13673989241',1),	
(3,'15238718872',2),	
(4,'15936937759',2),	
(5,'15212356464',1),	
(6,'13662595965',2),
(7,'13673941899',0),
(8,'13673941892',1),
(9,'15238772188',2),
(10,'15936959377',2),
(11,'15212364564',1),
(12,'13662565959',2),
(13,'15965432589',0)
GO 
INSERT INTO tb_yetnum VALUES 
(1,1,NULL,NULL,NULL,0),	
(2,2,'1904-02-19',NULL,'1999-01-29',1.76),		
(3,3,'2001-02-02','2009-06-15','2009-05-02',-5.17),	
(4,4,'2003-01-29','2010-10-30','2010-10-01',-30.56),		
(5,5,'2005-06-24',null,'2017-12-02',66.72),
(6,6,'1904-01-29','1906-01-29','1905-01-29',-0.56),
(7,7,null,null,null,0),
(8,8,'2003-01-29',null,'2017-11-29',8.56),
(9,9,'2005-01-29','2008-02-27','2008-01-02',-20.65),
(10,10,'2007-01-01','2015-03-29','2014-12-02',-10.96),
(11,11,'2009-01-02',NULL,'2017-12-31',56.87),
(12,12,'2013-05-06','2017-09-05','2017-07-15',-6.87),
(13,13,null,NULL,null,0)
--SELECT * FROM tb_yetnum 
GO 
--三、修改号码编号为1，用户编号为1的余额增加100
UPDATE tb_yetnum SET surplus=surplus+100 WHERE numid =1 AND id =1
GO 
PRINT '修改成功,余额+100'

--四、在已购号码表中删除号码状态为已注销的数据
DELETE tb_yetnum WHERE numid IN 
(SELECT numid from tb_number where status =2)
GO 
PRINT '删除成功'

--五、写出查询已注册手机号的用户信息的查询语句
SELECT * FROM tb_user where id IN 
(SELECT id from tb_yetnum where numid IN 
(SELECT numid from tb_number where status =1))

--六、查询出所有未注册的手机号
SELECT phonenum 未注册手机号 from tb_number where status =0

--七、查询出所有已注册并且余额小于10的手机号码以及用户信息
SELECT num.phonenum 手机号码,us.id 用户编号,us.name 用户姓名,us.nameid 身份证号 
FROM tb_user us inner JOIN tb_yetnum yet on us.id =yet.id 
INNER JOIN tb_number num ON num.numid =yet.numid
WHERE num.status =1 AND yet.surplus <10 

--或者↓
SELECT a.phonenum 手机号码,us.id 用户编号,us.name 用户姓名,us.nameid 身份证号 
FROM tb_user us,
(SELECT yet.id,num.phonenum from tb_yetnum yet RIGHT JOIN tb_number num on yet.numid =num.numid 
WHERE num.status =1 AND yet.surplus <10) a 
WHERE a.id =us.id 

--或者↓
SELECT num.phonenum 手机号码,us.id 用户编号,us.name 用户姓名,us.nameid 身份证号 
FROM tb_user us,tb_number num,tb_yetnum yet
WHERE us.id =yet.id AND yet.numid =num.numid
and num.status =1 AND yet.surplus <10