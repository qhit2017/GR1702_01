CREATE database db_WX
CREATE table tb_student(
sno char(11)primary key,
sname char(20)not null,
ssex char(8)check(ssex='man'or ssex='women')default'man',
sage smallint,
sdept char(20))
CREATE table tb_course(
cno char(4)primary key,
cname char(20)not null,
cpno char(4),
ccredit smallint)
CREATE table tb_sc(
sno char(11)primary key,
cno char(4),
grade smallint)
---查看当前数据库下的所有表
SELECT name from sys.objects where type='u'
---查看学生表结构
sp_help tb_student
---查看学生表详细信息
SELECT*FROM tb_student
---查看课程表结构
sp_help tb_course
---查看课程表详细结构
SELECT*FROM tb_course
---查看选课表结构
sp_help tb_sc
---查看选课表详细结构
SELECT*FROM tb_sc
INSERT INTO tb_student VALUES('1','jackie','man',18,'IS'),
('2','张丽丽','women',19,'CS'),
('3','孙漂亮','man',23,'MA'),
('4','李晶晶','women',21,'CS'),
('5','梁亮亮','man',16,'IS'),
('6','冯霸气','women',13,'MA'),
('7','杨可爱','man',20,'IS'),
('8','张丽美','women',17,'CS'),
('9','陈六六','man',22,'IS'),
('200215121','罗猪猪','women',42,'MA')
INSERT INTO tb_course VALUES('1','lili',5,7),
('2','miacel',0,8),
('3','jerry',1,9),
('4','tom',2,5),
('5','vivi',3,3)
INSERT INTO tb_sc VALUES('200215121','1',24),
('200215122','2',99),
('200215123','3',67),
('200215124','2',43),
('200215125','5',84),
('200215126','4',79),
('200215127','3',75),
('200215128','5',87),
('200215129','4',83),
('200215120','1',95)
---查询全体学生的学号与姓名
SELECT sno 学号,sname 姓名 from tb_student
---查询全体学生姓名学号所在系
select sname 姓名,sno 学号,sdept 所在系 from tb_student
---查询全体学生的详细记录
select*FROM tb_student
---查询全体学生的姓名及其出生年份
select sname 姓名,YEAR(GETDATE())-sage 出生年份 from tb_student
---查询选修了课程的学生学号（即有选修记录）
select sno from tb_sc 
---查询计算机科学系全体学生名单
select Sname 计算机科学系 from tb_student where sdept='CS'
---查询所有年龄在20岁以下的学生姓名及其年龄
SELECT SNAME 名字,sage 年龄 from tb_student where sage<20
---查询考试成绩有不及格的学生的学号
SELECT sno 学号 from tb_sc where grade<60
---查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名，系别和年龄
SELECT Sname 名字,sdept 系别,sage 年龄 from tb_student where sage between 18 AND 22
---查询年龄不在20~23岁之间的学生姓名，系别和年龄
SELECT sname 姓名,sdept 系别,sage 年龄 from tb_student where sage NOT BETWEEN 20 AND 23
---查询信息系（IS）数学系（MA）和计算机科学系（CS）学生的姓名和性别
SELECT sname 姓名,ssex 性别 from tb_student where sdept IN ('IS','CS','MA')
---查询学号为1的学生的详细情况
SELECT sno from tb_student where sno= 1
---查询所有姓张学生的姓名学号和性别
SELECT sname,sno,ssex from tb_student where sname LIKE '张%'
---查询姓李且全名为三个汉字的学生的姓名
SELECT sname from tb_student where sname LIKE '李__'
---查询名字中第2个字为丽字的学生的姓名和学号
SELECT sname,sno from tb_student where sname LIKE '_丽%'
---查询所有不姓陈的学生姓名
SELECT sname from tb_student where sname NOT LIKE '陈%'



