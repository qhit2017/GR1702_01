 CREATE  database db_system
--用户表
CREATE table tb_users(
id int  primary key,
name  nvarchar(32) not null,
number nvarchar(18)unique)

--插入用户数据
INSERT INTO tb_users VALUES
('1','孙敬虔','411024199708146231'),
('2','李云龙','411024194507146431'),
('3','李一龙','411024194405146241'),
('4','李二龙','411024198502176241')
SELECT*from tb_users
--号码表
CREATE table tb_directory(
did int  primary key,
dphone nvarchar(11)unique, 
dstate int check(dstate=0 or dstate=1 or dstate=2))

--插入号码数据
INSERT INTO tb_directory VALUES 
('106','13555655666','1'),
('101','18203709505','1'),
('102','17637420573','1'),
('103','13565656666','1'),
('104','13665659966','0'),
('105','13555658666','2')
SELECT*FROM tb_directory


--已购号码表
CREATE table tb_buy(
did int,
id int,
foreign key(did) references tb_directory(did),
foreign key(id) references tb_users(id),
regdate date,
logout date,
topup date,
balance decimal(8,4) default 0)--余额
-- 插入已购号码信息
INSERT INTO tb_buy values
('106','01','2015-10-24','2025-10-24','2018-1-02',9.55),
('101','01','2015-10-24','2025-10-24','2018-1-02',29.55),
('102','01','2016-11-02','2025-10-24','2018-1-02',30),
('103','03','2017-8-24','2025-10-24','2018-1-02',50),
('105','02','2014-10-24','2018-1-1','2017-12-31',0)
SELECT*FROM tb_buy
--根据要求完成以下问题：
--一、	根据表结构创建对应的表（30分）
--二、	插入数据，每张表至少两条数据(10分)
--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
 UPDATE tb_buy SET balance= balance+100 
where did = '101'AND id= '01'
--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE tb_buy  FROM tb_directory,tb_buy 
where tb_buy.did = tb_directory.did 
AND dstate = '2' 
--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * FROM tb_users where id in(
	SELECT id from tb_buy ,tb_directory
	where tb_buy.did = tb_directory.did 
	AND dstate = 1)
--六、	查询出所有未注册的手机号(10分)
SELECT dphone from tb_directory where dstate = 0 
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT tb_users.id,name,number,dphone as 手机号  
from tb_directory, tb_buy, tb_users  where dstate = 1 
AND balance <10 
AND tb_buy.did = tb_directory.did 
AND tb_buy.id = tb_users.id 

