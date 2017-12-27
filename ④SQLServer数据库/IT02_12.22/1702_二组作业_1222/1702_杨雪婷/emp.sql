USE db_emp 
CREATE table tb_emp(
empno char(32) primary key,
ename nvarchar(23) not null,
deptno nvarchar(23),
job nvarchar(23),
sal smallint ,
comm smallint,
hiredate datetime,
sex nvarchar(14) check(sex='男' or sex='女'))
INSERT INTO tb_emp (empno,ename,deptno,job,sal,comm,hiredate,sex) VALUES 
('0001','张无忌',20,'经理',7000,3000,'2017-02-25','男'),
('0002','周芷若',10,'经理',7000,2300,'2017-02-25','女'),
('0003','赵敏',30,'办事员',4000,1000,'2017-02-25','女'),
('0004','李秋雨',20,'主任',3000,1000,'2017-02-25','女'),
('0005','李重阳',30,'公关',2000,1000,'2012-02-25','女'),
('0006','黄瑶',20,'保安',2000,1000,'2015-03-13','女'),
('0007','黄药师',30,'实习生',2000,1000,'2012-03-03','男'),
('0008','康敏',30,'清洁工',3000,1000,'2016-09-01','女'),
('0009','郭靖',20,'清洁工',4000,1000,'2015-010-25','男'),
('00010','小龙女',10,'实习生',2000,900,'2013-06-25','女'),
('00011','杨过',20,'实习生',2000,900,'2011-08-25','男'),
('00012','瑛姑',10,'办事员',5000,1000,'2011-06-25','女'),
('00013','李秋月',30,'保安',3000,1000,'2015-07-25','男'),
('00014','李秋燕',10,'保安',2000,1000,'2014-05-25','女'),
('00015','冯默峰',30,'公关',2000,1000,'2013-12-25','男'),
('00016','李莫愁',30,'公关',2000,1000,'2014-02-24','女'),
('00017','Lawson',30,'实习生',3500,3600,'2013-09-01','女'),
('00018','张三丰',10,'实习生',2000,1000,'2014-02-25','男')
SELECT * FROM tb_emp 
--1  选择部门30中的所有员工。
SELECT  ename,deptno from tb_emp where deptno =30
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
 SELECT ename ,empno,deptno from tb_emp 
 where job='办事员'
--3  找出奖金高于薪金的员工。
 select ename from tb_emp  where sal < comm
--4  找出奖金高于薪金60%的员工。 
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
 select * from tb_emp  where deptno = '10' or deptno = '20'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。 
--7  找出有奖金的员工的不同工作。
 SELECT*FROM tb_emp where comm IS NOT NULL
--8  找出没有奖金或奖金低于100的员工。 
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
select deptno,AVG(sal) as 平均薪水 from tb_emp group by deptno order by AVG(sal) desc
--10  找出早于2012年前受雇的员工。
SELECT  ename,hiredate from tb_emp where hiredate <'2012'
--11  查询公司员工薪水总数。
 select sum(sal)  as 薪水总数 from tb_emp 
--12  显示正好为5个字符的员工的姓名。
--13  显示不带有'R'的员工的姓名。
select  ename from tb_emp where ename NOT LIKE 'R'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
--15  查询每个部门女员工的人数。
select  deptno, COUNT (ename) as 人数 from tb_emp where sex='女' group by  deptno
--16  显示2007年到2017年之间入职的员工的姓名和受雇日期。
 select ename,hiredate from tb_emp where hiredate between '2007' and '2017'
--17  显示员工的详细资料，按姓名排序。 
select * from tb_emp order by ename 
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。 
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。 
--20  查询员工薪水高于平均值的员工信息。 
--21  查询每个员工总收入（总收入包括奖金和薪水）。 
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
 select deptno,job,AVG(comm) as 奖金平均值, AVG(sal) as 薪水平均值 from tb_emp group by deptno,job
--23  查询员工姓名，重复的姓名只出现一次。
--24  查询员工姓名不重复的员工信息。
select distinct(ename) from tb_emp 
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名
select ename from tb_emp where ename like 'A'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT ename as 名字,COUNT(ename)as 重复条数 
from tb_emp group BY ename HAVING  COUNT(ename) >1
--27  查询所有员工工资都在900～3000之间的部门信息。
select * from tb_emp where sal between 900 and 3000
--28  查询每个职位的最低工资，并按照工资进行升学排序。
