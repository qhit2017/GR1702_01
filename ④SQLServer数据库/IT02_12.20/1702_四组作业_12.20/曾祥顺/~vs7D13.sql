
create database db_student
use db_student
---------------------------
create table tb_student(
sno char(5) primary key,
sname char(20) not null,
ssex char(4) check(ssex='男' or ssex='女') default '男' not null,
sage smallint not null,
sdept char(20),
grade smallint)
---------------------------
select * from tb_student
drop table tb_student
---------------------------
insert into tb_student
select  '01','曾祥顺','男',20,'清华IT',99 union
select  '02','柴年年','男',21,'清华IT',11 union
select  '03','孙敬虔','男',18,'清华IT',66 union
select  '04','王帅杰','男',20,'清华IT',88 union
select  '05','张鹏','男',20,'清华IT',55 union
select  '06','李静静','女',19,'清华IT',88 union
select  '07','夏杰','男',20,'清华IT',55 
---------------------------
--1'查询全体学生的学号与姓名。
select sno,sname from tb_student

--2'查询全体学生的姓名、学号、专业。
select sno,sname,sdept from tb_student

--3'查全体学生的姓名及其出生年份。
select sname as 姓名,YEAR(GETDATE())-sage as 出生年 from tb_student

--4'查询“清华IT”专业全体学生的名单。
select * from tb_student where sdept='清华IT'

--5'查询所有年龄在20岁以下的学生姓名及其年龄。
select sname,sage from tb_student where sage<20

--6'查询未成年的学生的人数和平均成绩。
select  avg(grade)as 平均成绩,count(sage) as 人数 from tb_student where sage<20 

--7'查询成绩有不及格的学生的学号。
select sno from tb_student where grade<60 

--8'查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
select sname,sage,sdept from tb_student where sage between 18 and 22

--9'查询年龄不在20~23岁之间的学生姓名、专业和年龄
select sname,sage,sdept from tb_student where sage>23 and sage<20

--10'查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别
select sname,ssex from tb_student where sdept in ('信息系','数学系')

--11'查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select sname,ssex from tb_student where sdept not in ('信息系','数学系')

--12'
select * from tb_student where sno='05'
--13'
select sname,ssex,sno from tb_student where sname like '张_'
--14'
select sname,ssex,sno from tb_student where sname like '李__'
--15'
select sname,sno from tb_student where sname like '_静_'
--16'
select sname from tb_student where sname not like '王%'
--17'
select sname,sno from tb_student where grade=null
--18'
select sdept,AVG(grade) from tb_student group by sdept
--19'
select sname,sno from tb_student where grade is not null
--20'
select * from tb_student order by sdept asc,sage desc
--21'
select COUNT(*)as 总数 from tb_student 
--22'
select ssex,COUNT(*) from tb_student group by ssex 
--23'
select  sdept,AVG(grade)as grade from tb_student  group by sdept order by grade desc    
--24'
select sdept,max(grade) from tb_student group by sdept
--25'
select sdept,min(grade) from tb_student group by sdept
--26'
     
--27'
select ssex,AVG(grade) from tb_student  group by ssex
--28'

--29'
select sdept,COUNT(*) from tb_student group by sdept
--30'
