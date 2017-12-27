create database lishaoqing_1219
use lishaoqing_1219

create table tb_student(
Sno char(16) primary key,
Sname nvarchar(32),
Ssex char(8) check(Ssex='man' or Ssex='women') default'man',
Sage smallint,
Sdept char(16),
grade smallint)
select * from tb_student
sp_help tb_student
--alter table tb_student add Ssex char(8) check(Ssex='man' or Ssex='women') default'man'

insert into tb_student (Sno,Sname,Sage,Sdept,grade,Ssex)
values('021004','李鸿章',25,'IS',70,'man'),
('091020','袁世凯',23,'MA',80,'man'),
('021006','李靖',22,'CS',65,'man'),
('021007','张天瑞',19,'MA',50,'women'),
('021009','王丽丽',21,'CS',22,'women'),
('021000','陈世美',20,'IS',43,'man')
insert into tb_student (Sno,Sname,Sage,Sdept,grade,Ssex)
values('021013','陈哥',15,'队长',43,'man'),
('021012','陈美',18,'保安',43,'man')

insert into tb_student (Sno,Sname,Sage,Sdept,Ssex)
values('0210135','和哥',15,'队长','man'),
('0210124','生美',18,'保安','man')


--(1)
select Sno,Sname from tb_student
--(2)
select Sno,Sname,Sdept from tb_student
--(3)
select Sname,Sage from tb_student
--(4)
select Sname from tb_student where Sdept='CS'
--(5)
select Sname,Sage from tb_student where Sage<20
--（6）查询未成年的学生人数和平均成绩
SELECT 未成年人数=COUNT(Sname),平均成绩=AVG(grade) from tb_student where Sage<18
--(7) 
select Sno from tb_student where grade<60
--(8)
select Sname,Sdept,Sage from tb_student where Sage BETWEEN 18 AND 22
--(9)
select Sname,Sdept,Sage from tb_student where Sage<20 or Sage>=23
--(10)
select Sname,Ssex from tb_student where Sdept='IS' or Sdept='MA' or Sdept='CS'
select Sname,Ssex from tb_student where Sdept IN ('IS','MA','CS')
--(11)       【有错】
select Sname,Ssex from tb_student where Sdept<>'IS' and Sdept<>'MA' and Sdept<>'CS'
select Sname,Ssex from tb_student where Sdept NOT IN ('IS','MA','CS')
--(12)
select * from tb_student where Sno='091020'
--(13)
--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT Sname,Sno,Ssex from tb_student where Sname LIKE '张%'
--(14)
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT Sname from tb_student where Sname LIKE '李__'
--(15)
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT Sname,Sno from tb_student where Sname LIKE '_丽%'
--(16)
--16.	查询所有不姓“陈”的学生姓名。
SELECT Sname from tb_student where Sname not LIKE '陈%' 
--(17)【有错】
SELECT Sno,Sname FROM tb_student WHERE grade=null
--(18)
--18.	查询每个专业内学生的平均成绩。

--(19)			【有错】
SELECT Sno,Sname FROM tb_student WHERE grade is not NULL
--(20)
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。

--21.	查询学生总人数。
SELECT 学生总人数=COUNT(Sno) from tb_student  
--22.	查询男生和女生的人数。【】
select 男生总人数=COUNT(Sname) from tb_student where Ssex='man' 
select 女生总人数=COUNT(Sname) from tb_student where Ssex='women'
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT AVG(grade) from tb_student order BY AVG(grade) desc where Sdept='IS'
--24.	查询每个专业中成绩最好的学生成绩。

--25.	查询每个专业中成绩最差的学生成绩。

--26.	查询平均成绩最差的专业的名字。

--27.	查询男生和女生的平均成绩。

--28.	查询成绩高于平均成绩的学生姓名和成绩

--29.	查询专业学生人数超过50人的专业名。【】
SELECT Sdept from tb_student where COUNT(Sname )>3 
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。


