create  table tb_xxy(
Sno nvarchar(16) primary key,
Sname nvarchar(10) not null,
Ssex nvarchar(8) check(Ssex='boy' or Ssex='gril'),
Sage smallint ,
Sdept nvarchar(16),
Grade smallint)

sp_help tb_xxy

INSERT into tb_xxy values(
'1','jackie','boy',15,'IS',88),
('2','tom','boy',20,'IS',66),
('3','李永立','boy',22,'IS',90),
('4','mary','gril',22,'CS',92),
('5','lucy','boy',22,'MA',96),
('6','陈真','boy',16,'MA',78),
('7','刘丽','gril',24,'CS',88)

SELECT * from tb_xxy

INSERT INTO tb_xxy (Sno,Sname,Ssex,Sage,Sdept)
VALUES('9','老王','boy',22,'IT')

--1.	查询全体学生的学号与姓名。
SELECT Sno,Sname from tb_xxy

--2.	查询全体学生的姓名、学号、专业。
SELECT Sname,Sno,Sdept from tb_xxy

--3.	查全体学生的姓名及其出生年份。
SELECT SNAME,YEAR(GETDATE())-Sage as 出生年份 from tb_xxy

--4.	查询“计算机科学”专业全体学生的名单。
SELECT Sname from tb_xxy WHERE Sdept='CS'

--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT Sname,Sage from tb_xxy WHERE Sage<20

--6.查询未成年的学生的人数和平均成绩。
SELECT COUNT(Sage)as 未成年人数,AVG(Grade)as 平均分 FROM tb_xxy where Sage<18

--7.	查询成绩有不及格的学生的学号。
SELECT Sname,Sno from tb_xxy where Grade<60

--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
SELECT SNAME,Sdept,Sage from tb_xxy where Sage BETWEEN 18 AND 22

--9.查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT SNAME,Sdept,Sage from tb_xxy where Sage NOT BETWEEN 20 AND 23

--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT Sname,Ssex from tb_xxy where Sdept IN ('IS','MA','CS')

--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
SELECT Sname,Ssex from tb_xxy where Sdept NOT IN ('IS','MA','CS')

--12.	查询学号为09102040203的学生的详细情况。
SELECT*FROM tb_xxy where Sno=09102040203

--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT sname,sno,ssex from tb_xxy WHERE Sname LIKE '张%'

--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT sname from tb_xxy WHERE Sname LIKE '李__'

--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT sname,sno from tb_xxy WHERE Sname LIKE '_丽%'

--16.	查询所有不姓“陈”的学生姓名。
SELECT sname from tb_xxy WHERE Sname NOT LIKE '陈%'

--17.	查询缺少成绩的学生的学号和姓名。
SELECT sname,sno from tb_xxy WHERE   Grade IS null

--18.	查询每个专业内学生的平均成绩。
SELECT AVG(Grade) as CS专业平均成绩 FROM tb_xxy where Sdept='CS'
SELECT AVG(Grade) as IT专业平均成绩 FROM tb_xxy where Sdept='IT'
SELECT AVG(Grade) as IS专业平均成绩 FROM tb_xxy where Sdept='IS'
SELECT AVG(Grade) as MA专业平均成绩 FROM tb_xxy where Sdept='MA'

--19.	查所有有成绩的学生的学号和姓名。
