CREATE database db_phone
USE db_phone
--用户编号,姓名,身份证号
CREATE table tb_user(
id int primary key,
uname nvarchar(32)not null,
number nvarchar(18) unique)
--号码编号,手机号码,号码状态
CREATE table tb_number(
idnum int primary key,
number nvarchar(11) unique,
statenum int check(statenum=0 or statenum=1 or statenum=2))
--号码编号,用户编号,注册时间,注销时间,最后充值时间,余额
CREATE table tb_buynunber(
iid int identity(1,1)primary key,
idnum int,
foreign key (idnum) references tb_number(idnum),
id int,
foreign key (id) references tb_user(id),
dateline date,
logout date,
Pay date,
balance float default 0)
--根据要求完成以下问题：
--一、根据表结构创建对应的表（30分）
--二、插入数据，每张表至少两条数据(10分)
INSERT INTO tb_user
SELECT 1,'张三',410125197203025011 union
SELECT 2,'李四',410125197211241234 union
SELECT 3,'王五',410185199705015016 union
SELECT 4,'赵六',410125199905135024 union
SELECT 5,'虎气',410125199202040506
SELECT * FROM tb_user
insert INTO tb_number
SELECT 001,13608677777,0 union
SELECT 002,13838384388,1 union
SELECT 003,12478965563,2 union
SELECT 004,12478555554,1 union
SELECT 005,15003840612,2
SELECT * from tb_number
insert INTO tb_buynunber
SELECT 001,5,'20140507','20180101','20170328',100 union
SELECT 002,4,'20110102','20190312','20160513',5 union
SELECT 003,3,'20140507','20170101','20170511',11 union
SELECT 004,2,'20140507','20160101','20170718',50 union
SELECT 005,1,'20140507','20150101','20170912',1000
SELECT * FROM tb_buynunber
--三、修改号码编号为001，用户编号为5的余额增加100（10分）
update tb_buynunber SET balance=balance+100 where id=5 AND idnum=1
--四、在已购号码表中删除号码状态为已注销(2)的数据（10分）
DELETE 
FROM tb_buynunber where idnum IN(  
SELECT nu.idnum
from tb_number nu
WHERE nu.statenum=2)
--五、写出查询已注册手机号的用户信息的查询语句(10分)
SELECT us.id,us.uname,us.number
from tb_user us,tb_number nu,tb_buynunber bu
where nu.statenum=1
AND nu.idnum=bu.idnum
AND bu.id=us.id
--六、查询出所有未注册的手机号(10分)
SELECT number as 未注册手机号 from tb_number where statenum=0
--七、查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT us.id,us.uname,us.number
from tb_user us,tb_number nu,tb_buynunber bu
WHERE nu.statenum=1 AND bu.balance<10
AND nu.idnum= bu.idnum
AND bu.id= us.id