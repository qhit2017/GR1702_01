--用户表
--用户编号	整型	主键
--姓名	字符型	
--身份证号	字符型	唯一，长度为18

CREATE table tb_user(
uno int primary key ,
uname nvarchar(16),
cer nvarchar(18)unique not null check (len(cer)=18) ,
)

--号码表
--号码编号	整型	主键
--手机号码	字符型	唯一，长度为11
--号码状态	整型	0(未注册)1(已注册)2(已注销)

CREATE table tb_number(
nid tinyint primary key,
nphone nvarchar(11) check(len(nphone)=11) unique  not null,
nstate tinyint check(nstate=0 or nstate=1 or nstate=2),
)

--已购号码表
--号码编号	整型	外键引用号码表
--用户编号	整型	外键引用用户表
--注册时间	日期型	
--注销时间	日期型	
--最后充值时间	日期型	
--余额	浮点型	默认为0

CREATE table tb_bought(
uno int ,
nid tinyint,
foreign key(uno) references tb_user(uno),
foreign key(nid) references tb_number(nid),
beginline date ,
endline date ,
addline date,
balance decimal(16,2) default 0                                                                                         
)


INSERT INTO tb_user (uno,uname,cer)
VALUES 
(1,'刘雨衡','123456789987456711'),
(2,'高洁','123456789987654322'),
(3,'夏杰','123456789123456733'),
(4,'团长','123456789123456744'),
(5,'孔于辉','123456789123456755')


INSERT INTO tb_number(nid,nphone,nstate)VALUES
(1,'12345678911',0),
(2,'12345678912',1),
(3,'12345678913',2),
(4,'12345678914',1)


INSERT INTO tb_bought(uno,nid,beginline,endline,addline,balance) VALUES
(1,1,'2015-08-26','2020-08-26','2016-05-20',25.2),
(2,2,'2013-04-26','2029-08-26','2017-05-07',30.2),
(3,3,'2014-07-20','2020-08-20','2016-05-12',50),
(4,4,'2015-03-04','2020-03-04','2016-09-20',66)


--一、	根据表结构创建对应的表（30分）

--二、	插入数据，每张表至少两条数据(10分)

--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE tb_bought SET balance=100 WHERE uno=1 AND  nid=1

--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE FROM tb_bought WHERE nid IN(
SELECT nid from tb_number WHERE nstate=2 )

--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * FROM tb_user WHERE uno IN (
SELECT uno from tb_bought)



