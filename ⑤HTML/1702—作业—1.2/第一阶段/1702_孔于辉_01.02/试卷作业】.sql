CREATE DATABASE DB_TONGXU
USE DB_TONGXU
--用户表
--用户编号	整型	主键
--姓名	字符型	
--身份证号	字符型	唯一，长度为18
CREATE TABLE TB_USER(
ID INT PRIMARY KEY,
NAME NVARCHAR(16),
NUMBER  NVARCHAR(18)UNIQUE )
--号码表
--号码编号	整型	主键
--手机号码	字符型	唯一，长度为11
--号码状态	整型	0(未注册)1(已注册)2(已注销)
CREATE TABLE TB_TELE(
TEID INT PRIMARY KEY,
TENUMBER NVARCHAR(11) UNIQUE,
TENUMBERSTATE INT CHECK(TENUMBERSTATE=0 OR TENUMBERSTATE=1 OR TENUMBERSTATE=2))
--已购号码表
--号码编号	整型	外键引用号码表
--用户编号	整型	外键引用用户表
--注册时间	日期型	
--注销时间	日期型	
--最后充值时间	日期型	
--余额	浮点型	默认为0
CREATE TABLE TBPURCHASED(
TEID INT,
ID INT,
REGISTERDATE DATETIME,
LOGOUTDATE DATETIME,
CHONGZHIDATE DATETIME,
BALACE DECIMAL(8,4) DEFAULT 0,
FOREIGN KEY(TEID) REFERENCES TB_TELE(TEID),
FOREIGN KEY(ID) REFERENCES TB_USER(ID))
INSERT INTO TB_USER VALUES 
(1,'李利利',123456789123456789),
(2,'徐云梦',123456789123456781),
(3,'李云龙',123456789123456740),
(4,'柴年年',123454589123456789),
(5,'于合璧',123456789123451789),
(6,'曾祥顺',123556789123456789),
(7,'夏小雨',123456755912345678),
(8,'李永利',123456589123456789),
(9,'盛明春',123456789223456789)
SELECT *FROM TB_USER 
INSERT INTO TB_TELE VALUES 
(1,12345678911,0),
(2,12345678912,1),
(3,12345699913,2),
(4,12345678914,0),
(5,12345674915,1),
(6,12345672916,2),
(7,12345478917,0),
(8,12345378918,1),
(9,12345678966,2)
INSERT INTO TBPURCHASED VALUES 
(1,1,'2010-02-05','2012-02-05','2011-11-11',3.6),
(2,2,'2010-02-05','2012-02-05','2011-11-11',23.6),
(3,3,'2010-02-05','2012-02-05','2011-11-11',33.6),
(4,4,'2010-02-05','2012-02-05','2011-11-11',300.6),
(5,5,'2010-02-05','2012-02-05','2011-11-11',35.6),
(6,6,'2010-02-05','2012-02-05','2011-11-11',34.6),
(7,7,'2010-02-05','2012-02-05','2011-11-11',8.6),
(8,8,'2010-02-05','2012-02-05','2011-11-11',7.6),
(9,9,'2010-02-05','2012-02-05','2011-11-11',16.6)
--根据要求完成以下问题：
--一、	根据表结构创建对应的表（30分）
--二、	插入数据，每张表至少两条数据(10分)
--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE TBPURCHASED SET BALACE = BALACE +100 WHERE TEID =1 AND ID = 1
--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE TBPURCHASED WHERE TEID IN (
	SELECT TE.TEID FROM TB_TELE TE WHERE TE.TENUMBERSTATE = 2)
--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * FROM TB_USER WHERE ID IN(
	SELECT TB.ID  FROM TBPURCHASED TB WHERE TB.TEID IN(
		SELECT TE.TEID  FROM TB_TELE TE WHERE TE.TENUMBERSTATE = 1))
--六、	查询出所有未注册的手机号(10分)
SELECT TE.TENUMBER  FROM TB_TELE TE WHERE TE.TENUMBERSTATE = 0
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息（20分）
SELECT TB.TENUMBER, US.ID ,US.NAME ,US.NUMBER    FROM TB_TELE  TB, TB_USER US , TBPURCHASED TBP 
WHERE TB.TENUMBERSTATE = 1
AND TBP.BALACE <10
AND TB.TEID = TBP.TEID 
AND TBP.ID = US.ID 
