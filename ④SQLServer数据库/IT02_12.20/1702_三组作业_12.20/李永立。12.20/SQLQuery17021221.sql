CREATE database db_liyongli
USE db_liyongli 
CREATE table tb_student(
sno char(10) primary key ,
sname nvarchar(32) not null,
ssex char(6) check (ssex='boy' or ssex='gril') default 'boy',
sage smallint,
sdept char(10),
grade smallint)
sp_help tb_student
SELECT *from  tb_student
INSERT into tb_student values
(2,'b','gril',20,'is',89),
(3,'c','boy',23,'cs',41),
(4,'d','gril',17,'ma',21),
(5,'e','boy',14,'kungfu',52),
(6,'f','boy',10,'cs',63),
(7,'g','boy',15,'ma',52),
(8,'h','gril',21,'ma',44),
(9,'j','boy',23,'ma',89),
(10,'k','boy',25,'ma',90),
(11,'o','gril',40,'ma',45),
(12,'i','boy',31,'ma',62),
(13,'u','boy',22,'cs',50),
(14,'李克强','boy',27,'ma',41),
(15,'张帅','boy',25,'ma',36),
(16,'吴丽','gril',36,'ma',14),
(09102040203,'z','gril',36,'ma',14),
(17,'李梅梅','gril',12,'ma',44),
(20,'张丽浩 ','boy',16,'mm',78),
(34,'吴美丽','gril',14,'cs',87),
(31,'赵丽','gril',23,'ma',52)


INSERT into tb_student values
(124,'陈真','gril',10,'is',0)

--用SQL语句完成下列单表查询：
---1.查询全体学生的学号与姓名。
SELECT sno, sname from tb_student

---2.查询全体学生的姓名，学号，专业
SELECT sname as 姓名,sno as 学号,sdept as 专业 from tb_student

---3.查全体学生的姓名及其出生年份。
select sname,year(getdate())- sage as 出生年份 from tb_student

--4.查询“计算机科学”专业全体学生的名单。
SELECT sname as 名单 from tb_student where sdept ='cs'

--5.查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT sname as 姓名,sage as 年龄 from  tb_student where sage <20

---6.查询未成年的学生的人数和平均成绩。
SELECT COUNT(sage) as 人数,AVG(grade) as 平均成绩 from tb_student where sage <18 

--7.查询成绩有不及格的学生的学号。
SELECT sno as 学号 from tb_student where grade<60

--9.查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT  sname as  姓名, sdept as 专业, sage as 年龄 FROM tb_student where sage NOT BETWEEN 20 AND 23

--10.查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT  sname as 姓名, ssex as 性别 FROM tb_student where sdept IN ('is','ma', 'cs')

---11.查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
SELECT  sname as 姓名, ssex as 性别 FROM tb_student where sdept not IN ('is','ma', 'cs')

---12.查询学号为09102040203的学生的详细情况。
SELECT *FROM tb_student where sno =09102040203

---13.查询所有姓“张”学生的姓名、学号和性别。
SELECT sname as 姓名,sno as 学号, ssex as 性别 FROM tb_student where sname LIKE '张%'

--14.查询姓“李”且全名为三个汉字的学生的姓名。
SELECT Sname as 姓名 FROM tb_student  where sname  LIKE '李__' 
  
--15.查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT sname as 姓名, sno as 学号 FROM tb_student where sname like '_丽%'

--16.查询所有不姓“陈”的学生姓名。
SELECT sname from tb_student where sname  not like '陈%'

--17.查询缺少成绩的学生的学号和姓名。
SELECT sname as 姓名, sno as 学号 FROM tb_student where grade=0

--18.查询每个专业内学生的平均成绩。
SELECT  AVG(grade) as cs系平均成绩 FROM tb_student  where sdept='cs'
SELECT  AVG(grade) as is系平均成绩 FROM tb_student  where sdept='ma'
SELECT  AVG(grade) as ma系平均成绩 FROM tb_student  where sdept='is'

---19.查所有有成绩的学生的学号和姓名。
SELECT sname as 姓名, sno as 学号 FROM tb_student where  not grade=0

--20.查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。


--21.查询学生总人数。
SELECT COUNT(sno) as 学生总人数 FROM tb_student 

--22.查询男生和女生的人数。

--23.查询每个专业的平均成绩，结果按照成绩降序排列.

--24.查询每个专业中成绩最好的学生成绩。

--25.查询每个专业中成绩最差的学生成绩。

--26.查询平均成绩最差的专业的名字。
--27.查询男生和女生的平均成绩。
--28.查询成绩高于平均成绩的学生姓名和成绩。
select AVG(grade) as 平均成绩 FROM tb_student 
select sname as 姓名, grade as 成绩 FROM tb_student where  grade>54
--29.查询专业学生人数超过50人的专业名。
SELECT sdept as 专业名  FROM tb_student where 
--30.查询“计算机”专业未成年学生的平均成绩和专业名。
select AVG(grade) as 平均成绩, sdept

