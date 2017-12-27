CREATE database db_lyh
CREATE table tb_lyh(
Sno char(20) primary key,
Sname char(16) not null,
Ssex char(2) check(Ssex='男'or Ssex='女'),
Sage smallint,
sdep char(32),
Grade smallint)

INSERT INTO tb_lyh 
VALUES('001','虾笑鱼','男',6,'CS',86),
('002','团战长','男',76,'ma',72),
('003','孔存志','女',56,'is',38),
('004','夏洁洁','女',36,'is',21),
('005','高杰杰','男',16,'ma',33),
('006','刘美男','男',21,'cs',99)
SELECT*FROM tb_lyh
--查询全体学生的学号和名字
SELECT SNO,SNAME FROM tb_lyh
--查询全体学生的姓名、学号、专业、
SELECT SNAME,SNO,Sdep from tb_lyh
--查全体学生的姓名及其出生年份
SELECT Sname as 姓名,YEAR(GETDATE())-Sage as 出生年份 from tb_lyh
--4.	查询“计算机科学”专业全体学生的名单。
SELECT Sname from tb_lyh WHERE sdep='cs'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄
SELECT Sname,sage from tb_lyh WHERE sage<20
--6.	查询未成年的学生的人数和平均成绩
SELECT Count(Sage)未成年人人数,AVG (Grade)平均成绩 FROM tb_lyh
--7.	查询成绩有不及格的学生的学号
SELECT Sname,Grade from tb_lyh WHERE Grade<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
SELECT Sname,sdep,Sage from tb_lyh WHERE Sage BETWEEN 18 AND 22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT Sname,Sdep,sage from tb_lyh where Sage NOT  BETWEEN 20 AND 23
