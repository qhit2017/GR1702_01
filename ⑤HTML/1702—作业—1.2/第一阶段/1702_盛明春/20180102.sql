CREATE table tb_user(
no  int primary key,
name nvarchar(16) not null,
id  nvarchar(18)unique  
)
--用户表
INSERT INTO tb_user VALUES
(4,'曾祥顺','412722199504294512'), 
(1,'李利利','410241998050445623'),
(2,'徐云梦','410241997050445623'),
(3,'盛明春','412722199704294912')
 SELECT *FROM tb_user
  
CREATE table tb_number(
nno int primary key,
pno  nvarchar(11)unique,
state int check(state='0'or state='1'or state='2')
)
--号码表
INSERT INTO tb_number values
(4,'15658457908','1'),
(1,'15513457908','1'),
(2,'18413457908','0'),
(3,'15657457908','2')

SELECT* FROM  tb_number 
CREATE table tb_bought(
no  int,
nno int,
etime datetime,
foreign key(no) references tb_user(no),
foreign key(nno) references tb_number(nno),
ntime datetime,
endtime datetime,
balance decimal(5,2) default'0' 
)
--已购号码表
INSERT INTO tb_bought(no, nno,etime,endtime,balance) VALUES
(4,4,'20170102','20171230','5')
INSERT INTO tb_bought(no,nno) VALUES 
(2,2)
INSERT INTO tb_bought(no,nno,etime,ntime,endtime,balance) VALUES 
(3,3,'20170402','20180102 ','20171230','0')
SELECT *FROM tb_bought 
-- 一、	根据表结构创建对应的表（30分）
--二、	插入数据，每张表至少两条数据(10分)
--三、	修改号码编号为1，用户编号为1的余额增加100（10分）
UPDATE tb_bought SET balance +='100' WHERE no =1 AND nno =1 
--四、	在已购号码表中删除号码状态为已注销的数据（10分）
DELETE FROM  tb_bought WHERE nno IN (
SELECT nno from tb_number where state ='2' )  
--五、	写出查询已注册手机号的用户信息的查询语句(10分)
SELECT * FROM tb_user where no IN(
SELECT no from tb_bought where nno IN(
SELECT nno from tb_number where state ='1'
)  
)
--六、	查询出所有未注册的手机号(10分)
SELECT pno  from tb_number where state ='0'
--七、	查询出所有已注册并且余额小于10的手机号码以及用户信息
SELECT u.no,u.name,u.id,n.pno from tb_bought b, tb_number n, tb_user u
WHERE b.balance <10  
AND n.state ='1'
AND b.no = u.no 
AND b.nno = n.nno  
