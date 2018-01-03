CREATE database db_phones
use db_phones

--用户表
--用户编号	整型	主键
--姓名	字符型	
--身份证号	字符型	唯一，长度为18

CREATE table tb_user(
sid int primary key,
sname nvarchar(16) not null,
ID nvarchar(18) unique
)
--插入数据
INSERT INTO tb_user(sid,sname,ID)
VALUES(001,'亚茹','686852113146688'),
(002,'大古','125468795123215'),
(003,'阔','755646515643515'),
(004,'阿达','412781514534616'),
(005,'小寒','561654561657415'),
(006,'老孔','451564641455468'),
(007,'小豪','765165746515641')
INSERT INTO tb_user(sid,sname,ID)
VALUES(008,'继光','456165765146555')
SELECT * from tb_user
--号码表
--号码编号	整型	主键
--手机号码	字符型	唯一，长度为11
--号码状态	整型	0(未注册)1(已注册)2(已注销)
create table tb_number(
cid int primary key,
cnumber nvarchar(11) unique,
status int  check(status = 0 or status = 1 or status =2)
)
INSERT INTO tb_number(cid,cnumber,status)
VALUES(1,'13145216688',1),
(2,'15153485135',0),
(3,'12154531654',2),
(4,'15895415687',1),
(5,'12137652186',0),
(6,'15156461657',1),
(7,'13651567545',2)
INSERT INTO tb_number(cid,cnumber,status)
VALUES(8,'54153541655',1)
SELECT * from tb_number

--已购号码表
--号码编号	整型	外键引用号码表
--用户编号	整型	外键引用用户表
--注册时间	日期型	
--注销时间	日期型	
--最后充值时间	日期型	
--余额	浮点型	默认为0
CREATE table tb_buy(
a int identity(1,1) primary key,
sid int,
cid int,
foreign key(cid) references tb_number(cid),
foreign key(sid) references tb_user(sid),
register date,
logout date,
topup date,
balance decimal(8,2) default '0'
)
INSERT INTO tb_buy(sid,cid,register,logout,topup,balance)
VALUES(001,1,'2017-01-01',null,'2018-01-01',52.1),
(002,2,null,null,null,null),
(003,3,'2017-05-01','2017-12-27','2017-07-01',23.1),
(004,4,'2017-03-11',null,'2017-07-23',32.5),
(005,5,null,null,null,null),
(006,6,'2017-04-20',null,'2017-12-17',16.5),
(007,7,'2017-02-21','2017-12-29','2017-10-21',32.1)
INSERT INTO tb_buy(sid,cid,register,logout,topup,balance)
VALUES(008,8,'2017-07-21',null,'2017-12-29',9.5)

SELECT * from tb_buy 
--一、	根据表结构创建对应的表（30分）

--如上所示


--二、	插入数据，每张表至少两条数据(10分)

--如上所示


--三、	修改号码编号为1，用户编号为001的余额增加100（10分）
UPDATE tb_buy SET balance=(balance+100)
WHERE sid=001 AND cid=1

--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE tb_buy 
WHERE logout IS not null
--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * FROM  tb_user
where sid IN(  
SELECT bu.sid
from tb_buy bu
where bu.register IS NOT null)


--六、	查询出所有未注册的手机号(10分)
SELECT nu.cnumber as 手机号码      
from tb_number  nu
WHERE nu.status=0

--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT us.sid as 用户编号 ,us.sname as 姓名,us.ID as 身份证号, nu.cnumber as 手机号码
from tb_number nu,tb_user us,tb_buy bu   
where bu.register IS NOT NULL
AND bu.balance<10
and us.sid = bu.sid
and bu.cid = nu.cid 