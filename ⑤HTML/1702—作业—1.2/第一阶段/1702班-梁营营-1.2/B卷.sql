CREATE database db_system
USE db_system
--用户表
--用户编号	整型	主键
--姓名	字符型	
--身份证号	字符型	唯一，长度为18
CREATE table tb_clientele(
cid int primary key,
cname nvarchar(16) not null,
cnum nvarchar(18) unique)

--添加用户表数据
INSERT INTO tb_clientele
 VALUES ('1','Jack','0010588'),
 ('2','Tom','0011588'),
 ('3','Jenny','0012588'),
 ('4','Lily','0013588'),
 ('5','Jason','0014588'),
 ('6','HanMeimei','0014586'),
 ('7','Lady','0065888')
 --查看用户表中记录
 SELECT * FROM tb_clientele
 
 

--号码表 
--号码编号	整型	主键
--手机号码	字符型	唯一，长度为11
--号码状态	整型	0(未注册)1(已注册)2(已注销)

create table tb_num(
nid int primary key,
number nvarchar(11) unique,
state int check(state='0' or state='1' or state='2'))


--添加号码表数据
INSERT INTO tb_num
VALUES ('1','15856894758','0'),
('2','13523634758','1'),
('3','17613284758','0'),
('4','15923465893','1'),
('5','18725817587','0'),
('6','15756894758','2'),
('7','15585964763','0')

--查看号码表中记录
SELECT * FROM tb_num





--已购号码表
--号码编号	整型	外键引用号码表
--用户编号	整型	外键引用用户表
--注册时间	日期型	
--注销时间	日期型	
--最后充值时间	日期型	
--余额	浮点型	默认为0

CREATE table tb_bought(
nid int ,
cid int ,
foreign key (nid) references tb_num (nid),
foreign key (cid) references tb_clientele (cid),
registertime date,
canceltime date,
turtime date,
balance float default '0'
)

--添加已购号码数据
INSERT INTO tb_bought
VALUES ('1','1',null,NULL,NULL,0),
('2','2','2011-09-03',NULL,'2017-12-12',52.6),
('3','3',null,NULL,NULL,0),
('4','4','2008-03-25',NULL,'2017-11-23',9.2),
('5','5',null,NULL,NULL,0),
('6','6','2005-08-26','2017-01-03','2014-08-03',-135.9),
('7','7',null,NULL,NULL,0)
 
 --查看已购号码中记录
 SELECT * FROM tb_bought
 


--一、	根据表结构创建对应的表（30分）  (已做)
--二、	插入数据，每张表至少两条数据(10分)  (已做)
--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE tb_bought SET balance=balance+'100' WHERE cid='1' AND nid = '1'
--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE  tb_bought WHERE nid IN(
SELECT nid from tb_num where state='2')
--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT  *  from tb_clientele where cid IN(
SELECT cid from tb_bought where nid in(
SELECT nid from tb_num where state='1'))
--六、	查询出所有未注册的手机号(10分)
SELECT number FROM tb_num where state='0'
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT cl.cid,cl.cname,cl.cnum,nu.number
from tb_clientele cl,tb_num nu,tb_bought bo
WHERE bo.nid=nu.nid AND bo.cid=cl.cid
and nu.state='2' AND bo.balance<'10'
