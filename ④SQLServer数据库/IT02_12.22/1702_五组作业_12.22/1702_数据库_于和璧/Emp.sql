use bd_test
create table tb_emp(
empno int primary key,
ename nvarchar(16) not null,
deptno nvarchar(32),
job nvarchar(12),
sal money,
comm money,
hiredate date,
Sex char(2) check(Sex='男' or Sex='女') default '男'
) 
insert INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,Sex)
values (001,'小豪','50','经理',6500,4500,'2005-08-15','男'),
(002,'大古','50','办事员',4500,4000,'2006-10-23','男'),
(003,'阔','50','部员',3000,5500,'2013-05-24','男'),
(004,'伟哥','10','经理',8500,4500,'2004-02-13','男'),
(005,'四火','10','办事员',4500,2500,'2007-05-05','男'),
(006,'郭亚茹','40','经理',9500,6500,'2010-04-12','女'),
(007,'李静静','40','办事员',6500,3000,'2010-08-17','女'),
(008,'杨雪婷','40','部员',4500,2500,'2017-06-16','女'),
(009,'老刘','30','经理',7500,3500,'2005-08-11','男'),
(010,'老孔','30','办事员',4000,4500,'2012-09-25','男'),
(011,'夏杰','30','部员',2000,1500,'2006-10-05','男'),
(012,'曾祥顺','20','经理',4000,8000,'2014-09-23','男'),
(013,'小春','20','办事员',2500,3500,'2015-07-25','男'),
(014,'小寒','20','办事员',2300,3000,'2015-08-15','男'),
(015,'小光','20','部员',2200,50,'2015-08-15','男')
insert into tb_emp(empno,ename,deptno,job,sal,hiredate,Sex)
values(016,'小亮','20','部员',1200,'2015-08-15','男')

---------------------------------------------------------
sp_help tb_emp
select * from tb_emp
--1  选择部门30中的所有员工 。
select ename as 员工 from tb_emp where deptno='30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
select ename as 姓名,empno as 雇员编号,deptno as 部门编号
from tb_emp where job='办事员'
--3  找出奖金高于薪金的员工。
select ename as 姓名 from tb_emp where comm>sal
--4  找出奖金高于薪金60%的员工。
select ename as 姓名 from tb_emp 
where comm > (1+0.6)*sal
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
select * from tb_emp where (deptno='10' and job='经理' ) or (deptno= '20' and job='办事员')
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
--以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
select * from tb_emp where (deptno='10' and job='经理' ) or (deptno= '20' and job='办事员')
or (job NOT IN('经理','办事员') and sal>=2000)
--7  找出有奖金的员工的不同工作。
select job as 工作 from tb_emp where job IS not null group by job
--8  找出没有奖金或奖金低于100的员工。
select ename as 姓名 from tb_emp where (comm IS  NULL) OR (comm<100)
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
select AVG (sal) as 平均薪水,deptno as 部门名 
from tb_emp group by deptno order by avg(sal) desc
--10  找出早于2012年前受雇的员工。
select ename AS 姓名,hiredate as 受雇日期 from tb_emp where hiredate < '2012'
   
--11  查询公司员工薪水总数。
select  sum(sal) as 薪水总数  from tb_emp
--12  显示正好为5个字符的员工的姓名。
 SELECT ename from tb_emp where ename like '%' and len(ename) = 5
--13  显示不带有'R'的员工的姓名。
 select  ename  as 姓名 from tb_emp where ename NOT LIKE'%R%'

--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
select COUNT (deptno)as 员工人数,deptno as 部门 from tb_emp group  by  deptno order by count (deptno) desc
 
--15  查询每个部门女员工的人数。
SELECT deptno as 部门 ,count(ename) as 人数 from tb_emp where sex='女' group by deptno

--16  显示2007年到2017年之间入职的员工的姓名和受雇日期。
 select ename as 姓名,hiredate as 受雇日期 from tb_emp 
 where hiredate between '2007' and '2017' 
--17  显示员工的详细资料，按姓名排序。
 select * from tb_emp order by ename asc 
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
 select ename as 姓名 ,hiredate  as 受雇日期 from  tb_emp order by  hiredate asc
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
 select ename as 姓名,job as 工作,sal as 薪金 
 from tb_emp order by job ,sal desc
--20  查询员工薪水高于平均值的员工信息。
select * from tb_emp where sal > (select AVG (sal) from tb_emp )
--21  查询每个员工总收入（总收入包括奖金和薪水）。
select sum(sal+comm) as 总收入 ,ename as 姓名 from tb_emp group by ename 
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
select avg(comm) as 平均奖金,AVG (sal) as 平均薪水,deptno as 部门,job as 职位 
from tb_emp group by job ,deptno 
--23  查询员工姓名，重复的姓名只出现一次。
select distinct(ename) AS 不重复名单 from tb_emp 
--24  查询员工姓名不重复的员工信息。
SELECT * FROM tb_emp where ename in(
select distinct( ename )from tb_emp )
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
select  ename as 姓名 from tb_emp where ename LIKE'%A%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
select ename as 姓名,COUNT(ename) as 重复条数
from tb_emp group by ename
having  COUNT(ename)>1
--27  查询所有员工工资都在900～3000之间的部门信息。
select ename as 姓名,sal as 工资 from tb_emp  where sal between 900 and 3000

--28  查询每个职位的最低工资，并按照工资进行升序排序。
select  job as 职位 ,min(sal)as  最低工资 from tb_emp group by job order by MIN (sal)asc

