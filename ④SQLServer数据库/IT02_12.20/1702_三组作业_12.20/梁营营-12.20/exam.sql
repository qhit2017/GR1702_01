--切换数据库
use db_student1
--创建表
CREATE table tb_student1(
id char(16)   primary key,
name nvarchar(16) not null,
age smallint ,
sex char(8) check(sex='boy' or sex='gril' ) default 'boy',
dept nvarchar(16),
grade  smallint
)
--添加记录
INSERT INTO tb_student1(id,name,age,sex,dept,grade) 
values('1','刘勇',19,'boy','IS',96),
('2','刘梅梅',18,'gril','IS',89),
('3','陈晨',20,'boy','IS',77),
('4','赵丽',17,'gril','学前教育',68),
('5','韩林',21,'boy','IS',89),
('6','刘梅梅',18,'gril','学前教育',89),
('7','李林',19,'boy','IS',96),
('8','梁冲',20,'boy','IS',81),
('9','李永立',20,'boy','CS',86),
('10','张鹏',19,'boy','MA',89),
('11','刘海英',18,'gril','学前教育',89),
('12','李东',19,'boy','IS',85),
('13','赵丽颖',24,'gril','IS',79),
('14','张海涛',19,'boy','IS',72),
('15','陈亮亮',22,'boy','MA',59),
('16','林海英',20,'gril','IS',84),
('22','钱千',18,'boy','IS',89),
('23','王振',20,'boy','IS',55),
('24','东方美美',18,'gril','学前教育',49),
('25','王雯',18,'gril','学前教育',58),
('26','王颖',18,'gril','MA',76),
('27','刘虹',18,'gril','CS',39),
('28','张子画',16,'boy','IS',82),
('29','赵桦',17,'boy','MA',70),
('30','刘冲',19,'boy','CS',85),
('31','孙子涵',22,'boy','MA',98),
('34','孙邵辉',20,'boy','IS',54),
('35','田建辉',18,'boy','IS',46),
('36','张鹏涛',16,'boy','MA',26),
('37','田轩',18,'boy','IS',84),
('38','刘子墨',19,'boy','CS',80),
('39','张威',18,'boy','MA',73),
('40','姚斌',19,'boy','IS',66),
('41','孙海云',18,'boy','MA',92),
('42','梁良',18,'boy','IS',48),
('43','王莉',18,'gril','学前教育',36),
('44','李峰',17,'boy','MA',98),
('45','夏萧绎',18,'boy','CS',52),
('46','张晴晴',18,'gril','IS',91),
('47','殷燕',18,'gril','IS',59),
('48','王洋',15,'boy','MA',87),
('49','刘小易',18,'gril','IS',36),
('50','韩翰',22,'boy','IS',86),
('51','孔云',18,'boy','学前教育',75),
('52','周晓晓',18,'gril','IS',44),
('53','樊斌',18,'boy','IS',86),
('54','刘丹华',17,'gril','IS',55),
('55','徐雪儿',18,'gril','IS',84),
('60','王枫',18,'boy','IS',56)
INSERT INTO tb_student1(id,name,age,sex,dept,grade) VALUES('09102040203','刘奔',19,'boy','IS',89)
INSERT INTO tb_student1(id,name,age,sex,dept,grade) VALUES('09108569856','郝亮亮',19,'boy','IS',null)

--查看表结构
sp_help tb_student1

--查看表中记录
select * from tb_student1

--1、查询全体学生的学号与姓名
select id,name from tb_student1
--2、查询全体学生的姓名、学号、专业
select name,id,dept from tb_student1
--3、查全体学生的姓名及其出生年份
select name,year(GETDATE())-age as 出生年份 from tb_student1
--4、查询“计算机科学”专业全体学生的名单
select 名单=name from tb_student1 where dept='CS'
--5、查询所有年龄在20岁以下的学生姓名及其年龄
select name,age from tb_student1 where age < 20
--6、查询未成年的学生的人数和平均成绩 
select COUNT(age) as 数量,AVG(grade) as 平均成绩  from tb_student1 where age<18
--7、查询成绩有不及格的学生的学号
select id from tb_student1 where grade<60
--8、查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄
select name,dept,age from tb_student1 where age BETWEEN 18 AND 22
--9、查询年龄不在20~23岁之间的学生姓名、专业和年龄
select name,dept,age from tb_student1 where age NOT BETWEEN 20 AND 23
--10、查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别
select name,sex from tb_student1 where dept IN('IS','MA','CS')
--11、查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别
select name,sex from tb_student1 where dept NOT IN ('IS','MA','CS')
--12、查询学号为09102040203的学生的详细情况
select * from tb_student1 where id = '09102040203'
--13、查询所有姓“张”学生的姓名、学号和性别
select name,id,sex from tb_student1 where name  like '张%'
--14、查询姓“李”且全名为三个汉字的学生的姓名
select name from tb_student1 where name  like '李__'
--15、查询名字中第2个字为“丽”字的学生的姓名和学号
select name,id from tb_student1 where name like '_丽%'
--16、查询所有不姓“陈”的学生姓名
select name from tb_student1 where name not like '陈%'
--17、查询缺少成绩的学生的学号和姓名
select id,name from tb_student1 where grade is null
--18、查询每个专业内学生的平均成绩
select  AVG(grade) as 平均成绩  from tb_student1 group by dept 
--19、查所有有成绩的学生的学号和姓名
select id,name from tb_student1 where dept is not null
--20、查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列
select * from tb_student1 order by dept asc,age desc
--21、查询学生总人数
select count(id)as 总人数 from tb_student1
--22、查询男生和女生的人数
select count(*) from tb_student1 group by sex
--23、查询每个专业的平均成绩，结果按照成绩降序排列 
select dept ,avg(grade)as grade from tb_student1 group by dept order by grade desc
--24、查询每个专业中成绩最好的学生成绩
select max(grade) from tb_student1 group by dept 
--25、查询每个专业中成绩最差的学生成绩
select min(grade) from tb_student1 group by dept
--26、查询平均成绩最差的专业的名字 (不会)
select  avg(grade) from tb_student1  group BY dept
--27、查询男生和女生的平均成绩
select avg(grade) from tb_student1 group by sex
--28、查询成绩高于平均成绩的学生姓名和成绩 (不会)
--29、查询专业学生人数超过50人的专业名 (不会)
select COUNT(id) from tb_student1 where COUNT(dept) > 50
--30、查询“计算机”专业未成年学生的平均成绩和专业名 (不会)
