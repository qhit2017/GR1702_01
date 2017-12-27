CREATE table tb_emp(
empno char(16)primary key,
ename nvarchar(20)not null,
deptno nvarchar(50),
job nvarchar(16),
sal smallint,
comm smallint,
hiredate datetime,
sex nvarchar(5) check (sex='boy'or sex='girl')  )

SELECT * from tb_emp

INSERT INTO tb_emp VALUES 
(001,'Arry','30','办事员',6000,500,'2005-11-24','girl'),
(002,'李静静','10','办事员',6000,1500,'2014-11-22','girl'),
(003,'夏杰','20','办事员',2200,800,'2014-8-20','boy'),
(004,'rose','30','办事员',3300,900,'2014-5-20','girl'),
(005,'柴年年','20','办事员',8000,300,'2015-11-20','boy'),
(006,'李小豪','人事部','办事员',6000,500,'2014-11-20','boy')     
                             
----1  选择部门30中的所有员工。
SELECT ename AS 员工 FROM tb_emp where deptno='30'
----2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT ename as 姓名 ,empno as 工号, deptno as 部门 FROM tb_emp  WHERE job='办事员'
----3  找出奖金高于薪金的员工。
SELECT ename as 姓名  from tb_emp where comm  >sal
----4  找出奖金高于薪金60%的员工。
 SELECT ename as 姓名  from  tb_emp where comm >sal*(1+0.6)
----5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
select * from tb_emp where (deptno='10'and job='经理') or (deptno='20'and job='办事员')
----6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
----以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
select * from tb_emp 
where (deptno='10'and job='经理') or (deptno='20'and job='办事员')
or (job NOT IN ('经理','办事员')and sal>=2000)
----7  找出有奖金的员工的不同工作。 
select job as 工作 from tb_emp where comm is not null group BY job
----8  找出没有奖金或奖金低于100的员工。
select ename as 姓名 from tb_emp where comm is null or comm <100
----9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
 select AVG (sal) as 平均薪水,deptno as 部门名 from tb_emp group by deptno order by avg(sal) desc
----10  找出早于2012年前受雇的员工。
select ename as 姓名 ,hiredate as受雇日期 from tb_emp where hiredate < '2012'
----11 查询公司员工薪水总数
select  sum(sal)as总薪水 from tb_emp 
----12  显示正好为5个字符的员工的姓名。   
SELECT ename as 姓名 from tb_emp where ename like '_____%' and len(ename) = 5
---- 13  显示不带有'R'的员工的姓名。
select  ename as 姓名 from tb_emp where ename NOT LIKE'%R%'
----14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
select COUNT (deptno)as 员工人数,deptno as部门 from tb_emp group  by  deptno order by count (deptno) desc
----15  查询每个部门女员工的人数。  
SELECT deptno as 部门,count(ename)as总人数 from tb_emp where sex='girl' group by deptno
----16  显示2007年到2017年之间入职的员工的姓名和受雇日期。
 select ename as 姓名,hiredate as 受雇日期 from tb_emp 
 where hiredate between 2007 and 2017 
----17  显示员工的详细资料，按姓名排序。
 select * from tb_emp order by ename 
----18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
 select ename as姓名 ,hiredate as受雇日期 from   tb_emp order by  hiredate
----19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。 
select *from tb_emp   order by job  desc,sal 
----20  查询员工薪水高于平均值的员工信息。
select * from tb_emp where sal > (select AVG (sal) from tb_emp )
----21  查询每个员工总收入（总收入包括奖金和薪水）。
 select sum(sal+comm) as 总收入 ,ename as 姓名 from tb_emp group by ename 
----22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
 select avg(comm) as 平均奖金,AVG (sal) as 平均薪水,deptno as 部门,job as 职位 from tb_emp group by job ,deptno order by avg(comm) , AVG (sal),deptno
----23  查询员工姓名，重复的姓名只出现一次。
select distinct(ename) as重复姓名 from tb_emp 
----24  查询员工姓名不重复的员工信息。
select  distinct( ename )as不重复姓名 from tb_emp  where ename is not null
----25  显示姓名字段的任何位置包含'A'的所有员工的姓名。 
select  ename from tb_emp where ename LIKE'A%'OR ename ='_A%'OR ename ='___A%'
----26  查询员工姓名重复的员工，显示人员姓名、重复条数。 
select ename as 姓名,COUNT(ename)as 重复条数 from tb_emp group by ename 
having COUNT(ename)>1
order by COUNT (ename) desc
----27  查询所有员工工资都在900～3000之间的部门信息。
select ename as 姓名,sal as 薪水 from tb_emp  where sal between 900 and 3000
----28  查询每个职位的最低工资，并按照工资进行升学排序。
select  job as职位,min(sal) as最低工资 from tb_emp group by job order by MIN (sal)asc

