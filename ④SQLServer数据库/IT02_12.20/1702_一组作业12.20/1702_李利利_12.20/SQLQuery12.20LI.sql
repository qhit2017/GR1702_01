create database db_Student
create table tb_Student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check (Ssex='男' or Ssex='女') default '男' not null,
Sage smallint not null,
Sdept char(20),
Grade smallint
)

select Sno,Sname,Ssex,Sage,Sdept,Grade from tb_Student
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept,Grade)
values(200215001,'李勇','男',20,'CS',98),
      (200215002,'刘晨','女',19,'CS',66),
      (200215003,'王敏','女',18,'MA',79),
      (200215004,'张立','男',25,'IS',89),
      (200215005,'赵丽颖','女',20,'IS',99),
      (200215006,'李小勇','男',21,'CS',86),
      (200215007,'刘小晨','女',19,'CS',88),
      (200215008,'王小敏','女',18,'MA',57),
      (200215009,'张小立','男',12,'IS',77),
      (200215010,'颖宝','女',20,'IS',68),
      (200215011,'李大勇','男',20,'CS',79),
      (200215012,'刘大晨','女',19,'CS',97),
      (200215013,'王大敏','女',18,'MA',78),
      (200215014,'张大大','男',19,'IS',94),
      (09102040203,'陈坤','男',15,'CH',46)
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept,Grade)
values(09102040204,'杨幂','女',24,'FAE',null)
--1.查询全体学生的学号与姓名
select Sno,Sname from tb_Student
--2.查询全体学生的姓名、学号、专业。
select Sname,Sno,Sdept from tb_Student
--3.查全体学生的姓名及其出生年份。
select Sname,YEAR(GETDATE())-Sage as 出生年份 from tb_Student
--4.查询“计算机科学”专业全体学生的名单。
select Sname,Sdept from tb_Student where Sdept='CS'
--5.查询所有年龄在20岁以下的学生姓名及其年龄。
select Sname,Sage from tb_Student where Sage<20
--6.查询未成年的学生的人数和平均成绩。
select count(Sage) as 未成年人数,avg(Grade) as 平均成绩 from tb_Student where Sage<18
--7.查询成绩有不及格的学生的学号。
select Sno as 不及格的学生的学号 from tb_Student where Grade<60
--8.查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
select Sname,Sdept,Sage from tb_Student where Sage>=18 AND Sage<=23
select Sname,Sdept,Sage from tb_Student where Sage between 18 and 22
--9.查询年龄不在20~23岁之间的学生姓名、专业和年龄。
select Sname,Sdept,Sage from tb_Student where NOT Sage between 20 and 23
--10.查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
select Sname,Ssex from tb_Student where Sdept='IS' OR Sdept='MA' OR Sdept='CS'
select Sname,Ssex from tb_Student where Sdept IN('IS','MA','CS')
--11.查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select Sname,Ssex from tb_Student where not Sdept IN('IS','MA','CS')
--12.查询学号为09102040203的学生的详细情况。
select * from tb_Student where Sno=09102040203 
--13.查询所有姓“张”学生的姓名、学号和性别。
select Sname,Sno,Sage from tb_Student where Sname like ('张%')
--14.查询姓“李”且全名为三个汉字的学生的姓名。
select Sname,Sno,Sage from tb_Student where Sname like ('李%') AND LEN(Sname)=3                                  
--15.查询名字中第2个字为“丽”字的学生的姓名和学号。
select Sname,Sno,Sage from tb_Student where Sname like ('_丽%')
--16.查询所有不姓“陈”的学生姓名。
select Sname,Sno,Sage from tb_Student where not Sname like ('陈%')
--17.查询缺少成绩的学生的学号和姓名。
select Sno,Sname from tb_Student where Grade is null
--18.查询每个专业内学生的平均成绩。
select Sdept, count(Sdept) AS 人数,avg(Grade) as 平均成绩 from tb_Student group by Sdept
--19.查所有有成绩的学生的学号和姓名。
select Sno,Sname from tb_Student where not Grade is null
--20.查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
select * from tb_Student order by Sdept asc,Sage desc
--21.查询学生总人数。
select count(Sname) as 学生总人数 from tb_Student 
--22.查询男生和女生的人数。
select Ssex , count(Ssex) as 人数 from tb_Student group by Ssex
--23.查询每个专业的平均成绩，结果按照成绩降序排列。
select Sdept, avg(Grade) as 平均成绩 from tb_Student group by Sdept order by 平均成绩 desc
--24.查询每个专业中成绩最好的学生成绩。
select Sdept , max(Grade) as 成绩最好 from tb_Student group by Sdept
--25.查询每个专业中成绩最差的学生成绩。
select Sdept , MIN(Grade) as 成绩最差 from tb_Student group by Sdept
--26.查询平均成绩最差的专业的名字。
--27.查询男生和女生的平均成绩。
select Ssex,AVG(Grade) from tb_Student group by Ssex
--28.查询成绩高于平均成绩的学生姓名和成绩。
--29.查询专业学生人数超过4人的专业名。
select Sdept,count(Sdept) from tb_Student group by Sdept having count(Sdept)>4
--30.查询“计算机”专业未成年学生的平均成绩和专业名。