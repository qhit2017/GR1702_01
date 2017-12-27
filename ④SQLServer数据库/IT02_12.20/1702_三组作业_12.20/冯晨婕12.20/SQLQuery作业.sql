 use db_staff
create table tb_student(
sno char(11) primary key,
sname char(20),
ssex char(2) check(ssex='男'or ssex='女')default'男',
sage smallint,
sdept char(20),
grade  smallint  )
select sno,sname,ssex,sage,sdept,grade from tb_student
--
select *FROM tb_student
insert into tb_student(sno,sname,ssex,sage,sdept,grade)
values ('200215121','张一','男',20,'cs',98),
('200215122','bill','男',18,'cs',78),
('200215123','cici','女',16,'ma',87),
('200215124','eall','男',20,'cs',67),
('200215125','李静','男',20,'ma',56),
('200215126','jack','女',18,'is',98),
('200215127','hello','男',23,'cs',46),
('200215128','讲文明','男',20,'is',45),
('200215129','郭小米','女',21,'is',76),
('200215130','kill','女',19,'cs',87),
('200215131','lily','男',21,'ma',58),
('200215132','max','男',22,'cs',98),
('200215133','null','男',20,'ma',76),
('200215134','欧耶','男',20,'is',56),
('200215135','push','男',20,'cs',76),
('200215136','韩梅梅','女',16,'ma',87),
('200215137','roes','女',22,'cs',88),
('200215138','stiven','男',20,'ma',99),
('200215139','tall','女',21,'is',66),
('200215140','王小明','男',18,'cs',36),
('200215141','张丽丽','女',18,'cs',98),
('200215142','wow','男',17,'cs',56),
('200215143','cc','女',19,'cs',67),
('200215144','杨以','男',20,'ma',87),
 ('200215145','郑成功','男',20,'cs',88) 
--1.	查询全体学生的学号与姓名
SELECT *FROM tb_student
--2.	查询全体学生的姓名、学号、专业。
 SELECT sname,sno,sdept FROM tb_student
--3.	查全体学生的姓名及其出生年份。 
SELECT sname  ,year(GETdate())-sage as 出生年份  from tb_student
--4.	查询“计算机科学”专业全体学生的名单。
SELECT 名单=sname FROM tb_student WHERE sdept='cs'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT sname,sage FROM tb_student WHERE sage<20
 --6.	查询未成年的学生的人数和平均成绩。
SELECT count (sage) as未成年人数,AVG(grade) as平均成绩 FROM tb_student WHERE sage<18
--7.	查询成绩有不及格的学生的学号。
SELECT 名单=grade FROM tb_student WHERE grade<60
 --8.	查询年龄在18~22岁（包括18岁和22岁）
-- 之间的学生的姓名、专业和年龄。
SELECT sname  ,sdept,sage FROM tb_student  WHERE sage between  18 and 22
SELECT sname  ,sdept,sage FROM tb_student WHERE (SAGE>=18)AND(SAGE<=22)
 

--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT sname  ,sdept,sage FROM tb_student  WHERE sage NOT  between  20 and 23
SELECT sname  ,sdept,sage FROM tb_student WHERE (SAGE>=18)AND(SAGE<=22)
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
INSERT INTO tb_student(sno,sname,sdept)VALUES(250,'爱丽丝','DANCE'),(251,'疯帽','DANCE')
SELECT sname  ,sdept,ssex FROM tb_student WHERE  sdept= 'cs' or sdept= 'is'  OR sdept= 'ma'
SELECT sname  ,sdept,ssex FROM tb_student WHERE  sdept IN( 'cs','is','ma')
--11.	查询既不是信息系、数学系，
--也不是计算机科学系的学生的姓名和性别。
SELECT sname  ,sdept,ssex FROM tb_student WHERE  sdept NOT IN( 'cs','is','ma')
--12.	查询学号为200215145的学生的详细情况。
select *FROM tb_student WHERE sno='200215145'
--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT sname  ,sno,ssex FROM tb_student  WHERE sname LIKE'张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT sname   FROM tb_student  WHERE sname LIKE '李——'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT sname  ,sno FROM tb_student  WHERE sname LIKE'_丽%'
--16.	查询所有不姓“陈”的学生姓名。
SELECT sname   FROM tb_student  WHERE sname  not LIKE '陈%'
--17.	查询缺少成绩的学生的学号和姓名。
SELECT sname   sno  FROM tb_student  WHERE grade=NULL
--18.	查询每个专业内学生的平均成绩
SELECT AVG(grade) as cs平均成绩 FROM tb_student  WHERE sdept ='cs'
SELECT AVG(grade) as is平均成绩 FROM tb_student  WHERE sdept ='is'
SELECT AVG(grade) as ma平均成绩 FROM tb_student  WHERE sdept ='ma'
SELECT AVG(grade) as 所有平均成绩   FROM tb_student  WHERE sdept IN('ma','is','cs')
--19.	查所有有成绩的学生的学号和姓名。
SELECT sname  ,sno FROM tb_student  WHERE grade BETWEEN 1 AND 100



--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
--21.	查询学生总人数。
--22.	查询男生和女生的人数。
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
--24.	查询每个专业中成绩最好的学生成绩。
--25.	查询每个专业中成绩最差的学生成绩。
--26.	查询平均成绩最差的专业的名字。
--27.	查询男生和女生的平均成绩。
--28.	查询成绩高于平均成绩的学生姓名和成绩。
--29.	查询专业学生人数超过50人的专业名。
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。

