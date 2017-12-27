create database db_zhaowuyang
CREATE table tb_student(
sno char(11)primary key,
sname char(20)not null,
ssex char(8)check(ssex='man'or ssex='women')default 'man',
sage smallint,
sdept char(20))
CREATE table tb_course(
cno char(4)primary key,
cname char(20),
cpno char(4),
credit smallint)
CREATE table tb_sc(
sno char(11)primary key,
cno char(4),
grade smallint)
--查看当前数据库下有哪几张表
SELECT name from sys.objects where type='U'
--查看学生表结构
sp_help tb_student
--查看学生表详细信息
SELECT * from tb_student
--查看课程表结构
sp_help tb_course
--查看课程表详细信息
SELECT * from tb_course
--查看选课表结构
sp_help tb_sc
--查看选课表详细信息
select *from tb_sc
INSERT INTO tb_student VALUES('1','lucy','women',14,'CS'),
('2','张某','man',17,'IS'),('3','张小倩','women',20,'IS'),
('4','陈俊','man',23,'IS'),('5','李木子','women',22,'MA'),
('6','三叶','women',30,'CS'),('7','李龙','man',14,'IS'),
('8','领丽','women',18,'IS'),('9','Jack','man',16,'MA'),
('10','lucy','women',18,'CS')
INSERT INTO tb_course VALUES('1','CS','2',4),
('2','IS','5',5),('3','IS','6',2),('4','MA','1',6),
('5','MA','4',1),('6','MA','3',3)
INSERT INTO tb_sc VALUES('200215121','1',98),
('200215122','2',24),('200215123','3',36),
('200215124','4',52),('200215125','5',63),
('200215126','6',74),('200215127','6',91),
('200215128','5',83),('200215129','4',12),
('200215131','1',60)
--1、查询全体学生的学号与姓名。
SELECT sno as 学号,sname as 姓名 from tb_student
--2、查询全体学生的姓名、学号、所在系。
select sno 学号,sname 姓名,sdept 所在系 FROM tb_student
--3、查询全体学生的详细记录。
select * FROM tb_student
--4、查全体学生的姓名及其出生年份。
select Sname 姓名,YEAR(GETDATE())-sage 出生年份 FROM tb_student
--6、查询选修了课程的学生学号（即有选修记录）。
select sno 学号 from tb_sc
--7、查询计算机科学系全体学生的名单。
select sname 计算机科学系 from tb_student where Sdept='CS'
--8、查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT Sname 姓名,sage 年龄 FROM tb_student where sage < 20
--9、查询考试成绩有不及格的学生的学号。
SELECT sno 不及格学生学号 FROM tb_sc where grade<60
--10、查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、系别和年龄
SELECT sname 姓名,sdept 系别,sage 年龄 FROM tb_student where sage BETWEEN 18 AND 22
--11、查询年龄不在20~23岁之间的学生姓名、系别和年龄
select sname 姓名,sdept 系别,sage 年龄 FROM tb_student where not sage BETWEEN 18 AND 23
--12、查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT sname 姓名,ssex 性别 FROM tb_student where sdept in ('IS','MA','CS')
--13、查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
SELECT sname 姓名,ssex 性别 FROM tb_student where sdept not in ('IS','MA','CS')
--14、查询学号为1的学生的详细情况。
SELECT * FROM tb_student where sno='1'
--15、查询所有姓“张”学生的姓名、学号和性别。
SELECT sname 姓名,sno 学号,ssex 性别 FROM tb_student where sname LIKE '张%'
--16、查询姓“李”且全名为三个汉字的学生的姓名。
SELECT sname 姓名 FROM tb_student where sname LIKE '李%' and len(sname) = '3'
--17、查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT Sname 姓名,sno 学号 FROM tb_student where sname like '_丽_'
--18、查询所有不姓“陈”的学生姓名。
SELECT sname 姓名 FROM tb_student where sname not LIKE '陈%'
--19、查询DB_Design课程的课程号和学分。
SELECT cno 课程号,credit 学分 FROM tb_course
--21、某些学生选修课程后没有参加考试，所以有选课记录，
--但没有考试成绩。查询缺少成绩的学生的学号和相应的课程号。

--22、查所有有成绩的学生学号和课程号。

--23、查询选修了3号课程的学生的学号及其成绩，查询结果按分数降序排列。

--24、查询全体学生情况，查询结果按所在系号升序排列，同一系中的学生按年龄降序排列。

--25、查询学生总人数。

--26、查询选修了数学课程的学生人数。

--27、计算1号课程的学生平均成绩。

--28、查询选修1号课程的学生最高分数。

--29、查询学号为200215121的学生选修课程的总学分数。

--30、求各个课程号及相应的选课人数。

--31、查询选修了3门以上课程的学生学号。