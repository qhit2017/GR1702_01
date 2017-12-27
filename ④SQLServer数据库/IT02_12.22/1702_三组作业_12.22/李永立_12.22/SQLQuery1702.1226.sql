CREATE database db_emp
USE db_emp
CREATE table tb_emp(
empno nvarchar(16) primary key ,
ename nvarchar(32) not null ,
deptno nvarchar(32) ,
job nvarchar(16),
sal money ,
comm money,
hiredate date ,
sex char(6) check(sex='man' or sex= 'woman'))
sp_help tb_emp
INSERT into tb_emp 
values(67,'jeckd','30','组员',1100,3200,'2014-10-11','man'),
 (3,'jeck','20','经理',4500,3200,'2014-11-11','man'),
 (4,'jeck','10','经理',4500,3200,'2015-01-11','woman'),
 (5,'jeck','10','组长',2500,200,'2012-02-11','man'),
 (6,'jeck','20','经理',4500,3200,'2016-10-11','woman'),
 (7,'jeck','10','组长',2500,3200,'2011-02-08','man'),
 (8,'jeck','20','经理',4500,3200,'2011-10-15','man'),
 (9,'jeck','20','组长',3500,1200,'2000-10-20','woman'),
  (10,'jeck','20','经理',4500,3200,'2014-10-11','man')
 SELECT *FROM  tb_emp 
 
-- 1  选择部门30中的所有员工。 
SELECT *FROM tb_emp where deptno='30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT  ename , empno ,deptno from tb_emp where job = '办事员'
--3  找出奖金高于薪金的员工。
SELECT ename from  tb_emp  where sal <comm
--4  找出奖金高于薪金60%的员工。 
SELECT ename from tb_emp where sal<comm*6/10
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
SELECT *FROM tb_emp where deptno ='10' and job ='经理'or deptno ='20'and job ='办事部'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
--以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
SELECT *FROM tb_emp where deptno='10'AND job='经理' or deptno ='20'and job ='办事部' 
OR  deptno NOT BETWEEN '经理' AND '办事员'AND  sal>=2000
--7  找出有奖金的员工的不同工作。 
SELECT DISTINCT (job) from tb_emp where comm IS not null
--8  找出没有奖金或奖金低于100的员工。
SELECT ename,comm from tb_emp where comm IS  null OR comm<100 
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
select AVG(sal)as 平均薪水, deptno from tb_emp  GROUP BY deptno ORDER BY AVG(sal)
--10  找出早于2012年前受雇的员工。
SELECT ename,hiredate from tb_emp where year(hiredate )<2012

--11  查询公司员工薪水总数。
SELECT sum(sal+comm) from tb_emp 
--12  显示正好为5个字符的员工的姓名。
select ename from tb_emp where  len(ename)=5
--13  显示不带有'R'的员工的姓名。
SELECT ename from tb_emp  where ename  not like '%r%' 
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
SELECT  COUNT(deptno)as 人数 , deptno from tb_emp GROUP BY deptno ORDER BY COUNT(deptno) desc
--15  查询每个部门女员工的人数。
SELECT COUNT(empno) as 人数,deptno  from tb_emp where sex ='woman' group BY deptno 
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
SELECT ename ,year(hiredate)  from tb_emp where year(hiredate) between 2007 AND 2017
--17  显示员工的详细资料，按姓名排序。 
SELECT *FROM tb_emp order BY ename 
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT ename ,year(hiredate) from tb_emp order BY year(hiredate)
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。 
SELECT ename ,job, sal from tb_emp order BY job desc,sal
--20  查询员工薪水高于平均值的员工信息。
SELECT * from tb_emp where  sal >
(SELECT AVG(sal) from tb_emp ) 
--21  查询每个员工总收入（总收入包括奖金和薪水）。
SELECT ename, SUM(sal+comm)  from tb_emp group BY ename
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
SELECT avg(comm),avg(sal) ,deptno ,job from tb_emp group BY deptno ,job
--23  查询员工姓名，重复的姓名只出现一次。
SELECT distinct (ename) from tb_emp
--24  查询员工姓名不重复的员工信息。
select ename FROM tb_emp group by ename HAVING COUNT(*)=1 

--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT ename from tb_emp where ename LIKE '%a%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT COUNT(ename),ename from tb_emp group BY ename HAVING COUNT(ename)>1
--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT DISTINCT (deptno) from tb_emp where sal BETWEEN 900 AND 3000 
--28  查询每个职位的最低工资，并按照工资进行升学排序。
SELECT min(sal) from tb_emp group BY job ORDER  BY min(sal) 
