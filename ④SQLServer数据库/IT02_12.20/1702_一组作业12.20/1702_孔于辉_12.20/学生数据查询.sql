USE db_staff
create table tb_student(
Sno char(32) primary key,
Sname char(32) not null,
Ssex char(16) check(Ssex='男' or Ssex='女')default '男',
Sage smallint not null,
Sdept char(20),
Grade smallint)
insert into tb_student(Sno,Sname,Ssex,Sage,Sdept,Grade) values
(201701,'张三','男',19,'cs',85),
(201702,'李四','男',20,'is',85),
(201703,'王丽','女',18,'ma',95),
(201704,'王趁','女',22,'ma',65),
(201705,'徐娜','女',21,'cs',75),
(201706,'张进','男',15,'is',55),
(201707,'李磊','男',16,'ma',25),
(201708,'胡勇','男',19,'ma',65),
(09102040203,'张咯','男',23,'ma',65),
(09102040204,'陈江','男',17,'ma',75),
(09102040205,'柴江','男',15,'ma',55)
--1.查询全体学生的学号与姓名。
select Sno,Sname from tb_Student
--2.查询全体学生的姓名、学号、专业。
select Sname,Sno,Sdept from tb_Student
--3.查全体学生的姓名及其出生年份。
select Sname as 姓名,year(GETDATE())-Sage as 出生年 from tb_Student
--4.查询“计算机科学”专业全体学生的名单。
select Sname,Sdept from tb_Student where Sdept='cs'
--5.查询所有年龄在20岁以下的学生姓名及其年龄。
select Sname,Sage from tb_Student where Sage <20
--6.查询未成年的学生的人数和平均成绩。
select 未成年的学生的人数=count(Sage),平均成绩=avg(Grade) from tb_Student where Sage < 18
--7.查询成绩有不及格的学生的学号。
select Sno,Grade from tb_Student where Grade <60
--8.查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
select Sname as 姓名,Sdept as 学科,Sage as 年龄 from tb_Student where Sage >=18 and Sage<=22
SELECT Sname as 姓名,Sdept as 学科,Sage as 年龄 from tb_Student where Sage BETWEEN 18 AND 22
--9.查询年龄不在20~23岁之间的学生姓名、专业和年龄。
select Sname as 姓名,Sdept as 学科,Sage as 年龄 from tb_Student where not Sage >=20 and Sage<=23
--10.查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
insert into tb_student(Sno,Sname,Sage,Sdept)VALUES(21101,'李利利',18,'dance'),
(21102,'徐云梦',25,'dance')
select Sname,Ssex from tb_Student where Sdept='is' or Sdept='cs'or Sdept='ma'
select Sname,Ssex from tb_Student where Sdept IN('is','cs','ma')
--11.查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select Sname,Ssex from tb_Student  where not Sdept='is' and not Sdept='cs'and not Sdept='ma'
select Sname,Ssex from tb_Student where Sdept not IN('is','cs','ma')
--12.查询学号为09102040203的学生的详细情况。
SELECT * FROM tb_student WHERE Sno=09102040203
--13.查询所有姓“张”学生的姓名、学号和性别。
select Sname,Sno,Ssex from tb_Student where Sname like'张%' 
--14.查询姓“李”且全名为三个汉字的学生的姓名
SELECT Sname from tb_student where Sname LIKE '李%' AND LEN(Sname) =3                                                                               
--15.查询名字中第2个字为“丽”字的学生的姓名和学号。
select Sname,Sno,Ssex from tb_Student where Sname like'%丽' 
--16.查询所有不姓“陈”的学生姓名。
select Sname,Sno,Ssex from tb_Student where not Sname like'陈%'  
--17.查询缺少成绩的学生的学号和姓名。
SELECT Sno,Sname FROM tb_student where Grade IS  NULL 
--18.查询每个专业内学生的平均成绩。
SELECT Sdept AS 专业名称,AVG(Grade)as 平均成绩 FROM tb_student GROUP BY Sdept 
--19.查所有有成绩的学生的学号和姓名。
SELECT Sno,Sname FROM tb_student where Grade  IS not NULL
--20.查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
 SELECT * FROM tb_student ORDER BY Sdept ASC,Sage DESC
--21.查询学生总人数。
SELECT COUNT(Sname) as 学生总人数 FROM tb_student
--22.查询男生和女生的人数。
SELECT  Ssex as 性别,COUNT(Ssex)as 人数 FROM tb_student GROUP BY Ssex 
--23.查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT Sdept as 专业 ,AVG(Grade)AS 平均成绩 FROM tb_student group BY Sdept ORDER BY 平均成绩 DESC 
--24.查询每个专业中成绩最好的学生成绩。
SELECT Sdept as 专业 ,MAX(Grade)as 最高分 from tb_student GROUP BY Sdept
--25.查询每个专业中成绩最差的学生成绩。
SELECT Sdept as 专业 ,MIN(Grade)as 最低分 from tb_student GROUP BY Sdept
--26.查询平均成绩最差的专业的名字。
--27.查询男生和女生的平均成绩。
SELECT Ssex AS 性别,AVG(Grade)as 平均成绩 FROM tb_student GROUP BY Ssex 
--28.查询成绩高于平均成绩的学生姓名和成绩。
--29.查询专业学生人数超过5人的专业名。
SELECT Sdept as 专业, COUNT(Sdept) as 人数 FROM tb_student GROUP BY Sdept HAVING COUNT(Sdept)>5 
--30.查询“计算机”专业未成年学生的平均成绩和专业名。
