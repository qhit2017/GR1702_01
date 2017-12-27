create table tb_student(
sno nvarchar(16) primary key,
sname nvarchar(32) not null,
ssex nvarchar(8) check(ssex='boy' or ssex='girl') default 'boy',
sage smallint ,
adept nvarchar(16),
grate smallint
)
insert into tb_student values(
'1','jack','boy',15,'IS',73),
('2','jack1','boy',16,'IS',73),
('3','Marry','girl',16,'MA',73),
('4','Marry1','girl',17,'MA',73),
('5','Mick','boy',16,'CS',50),
('6','Mick1','boy',16,'CS',73),
('09102040203','张利杰','boy',16,'IS',73),
('09102040204','李华','girl',16,'MA',45),
('09102040205','张丽','girl',17,'MA',73),
('09102040206','陈立成','boy',16,'CS',69),
('09102040207','李晓明','boy',16,'CS',73)
select * from tb_student
--1.查询全体学生的学号与姓名。
select sno,sname from tb_student
--2.查询全体学生的姓名、学号、专业。
select sname,sno,adept from tb_student
--3.查全体学生的姓名及其出生年份。
select sname, year(getdate())-sage as 出生年份 from tb_student
--4.查询“计算机科学”专业全体学生的名单。
select '名单'=sname from tb_student where adept='cs'
--5.查询所有年龄在20岁以下的学生姓名及其年龄。
select sname,sage from tb_student where sage<20
--6.查询未成年的学生的人数和平均成绩。
select count(sage)as未成年人数,avg(grate) as平均成绩
from tb_student where sage<18
--7.查询成绩有不及格的学生的学号。
select sno as不及格的学生的学号 from tb_student where grate<60
--8.查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
insert into tb_student(sno,sname ,adept,sage) values(
7,'jom','IS',19)
select sname,adept,sage from tb_student where sage between 18 and 22
--9.查询年龄不在20~23岁之间的学生姓名、专业和年龄。
insert into tb_student(sno,sname ,adept,sage) values(
8,'jom','IS',25)
select sname,adept,sage from tb_student where sage not between 20 and 23
--10.查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
insert into tb_student(sno,sname ,adept,sage) values(
10,'jem','IT',25)
select sname , ssex from tb_student where adept in('IS','MA','CS')
--11.查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select sname , ssex from tb_student where adept not in('IS','MA','CS')
--12.查询学号为09102040203的学生的详细情况。
select *  from tb_student where sno=09102040203
--13.查询所有姓“张”学生的姓名、学号和性别
select sname , sno ,ssex from tb_student where sname like'张%'
--14.查询姓“李”且全名为三个汉字的学生的姓名。
select sname , sno ,ssex from tb_student where sname like'李%' and len(sname)=3
--15.查询名字中第2个字为“丽”字的学生的姓名和学号。
select sname , sno ,ssex from tb_student where sname like'_丽'
--16.查询所有不姓“陈”的学生姓名。
select sname , sno ,ssex from tb_student where sname not like'陈%'
--17.查询缺少成绩的学生的学号和姓名。
select sname , sno from tb_student where grate is null
--18.查询每个专业内学生的平均成绩。
select adept,AVG(grate) from tb_student group by adept 
--19.查所有有成绩的学生的学号和姓名。
select sname , sno from tb_student where grate is not null







