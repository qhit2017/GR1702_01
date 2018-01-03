CREATE database db_login
USE db_login
-----
CREATE table tb_user(
uid int primary key,
uname nvarchar(32),
number nvarchar(18)Unique,
)
INSERT INTO tb_user VALUES
(1,'李静静','411522199810109617'),
(2,'盛明春','411558199905019672'),
(3,'徐云梦','411666199708088888'),
(5,'孔于辉','411502747474646464'),
(6,'李云龙','411502799951828258')

-----
CREATE table tb_tnumber(
tid int primary key,
pnumber nvarchar(11),
statenumber int check(statenumber=0 or statenumber=1 or statenumber=2 )
)
INSERT INTO tb_tnumber VALUES
(1,'15564874844',2),
(2,'16672828145',0),
(3,'16666666666',1),
(4,'18885546455',2)
-----
CREATE table tb_cnumber(
uid int,
tid int,
foreign key(uid) references tb_user(uid),
foreign key(tid) references tb_tnumber(tid),
cdate datetime,
cadate datetime,
cpay datetime,
cbalance decimal(20,2) default 0
)
INSERT INTO tb_cnumber VALUES
(1,1,'2017-8-6','2020-9-5','2020-4-6','741.2'),
(2,2,'2017-5-6','2020-8-5','2020-7-4','74.2'),
(3,3,'2017-5-6','2020-6-5','2020-4-6','1.5'),
(6,4,'2017-4-6','2020-5-5','2020-3-6','4.2')
--一、	根据表结构创建对应的表（30分）
--二、	插入数据，每张表至少两条数据(10分)
--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE tb_cnumber SET cbalance=cbalance+100 WHERE uid=1
--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE FROM tb_cnumber WHERE tid in(
	SELECT tn.tid from tb_tnumber tn where statenumber=2
)
--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * FROM tb_user where uid=(
	SELECT cn.uid from tb_tnumber tn,tb_cnumber cn
	WHERE tn.statenumber=1
	AND tn.tid= cn.tid
)
--六、	查询出所有未注册的手机号(10分)
SELECT tn.pnumber from tb_tnumber tn
WHERE tn.statenumber=0
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT * FROM tb_user where uid=(
 SELECT cn.uid from tb_tnumber tn, tb_cnumber cn
  WHERE cn.cbalance<10
  AND tn.tid= cn.tid
)
