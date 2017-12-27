USE wyk
CREATE table tb_emp(
empno char(16) primary key,
ename char(8),
deptno char(8),
job char(8),
sal money,
comm money,
hiredate char(20),
Ssex char(8) check(Ssex = 'man' or Ssex = 'women')
)
sp_help tb_emp
select empno,ename,deptno,job,sal,COMM,hiredate,Ssex from tb_emp
INSERT  into tb_emp(empno,ename,deptno,job,sal,COMM,hiredate,Ssex)
values(1,'李勇','10','办事员',2000,100,20151202,'man'),
(2,'tom','20','办事员',2000,200,20100822,'man'),
(3,'Roes','30','经理',5000,2000,20080222,'women'),
(4,'Lili','40','经理',8000,9000,20041015,'women'),
(5,'baobo','20','办事员',2000,200,20040915,'man'),
(6,'王猛','10','办事员',2000,200,20100521,'man'),
(7,'康永丽','20','经理',10000,20000,20110122,'women'),
(8,'斯拉夫','20','办事员',2000,300,20130621,'women')

--1、选择部门30中的所有员工。
SELECT 名单=ename FROM tb_emp WHERE deptno='30'
--2、列出所有办事员(CLERK)的姓名，雇员编号和部门编号。
SELECT ename,empno,deptno FROM tb_emp WHERE job='办事员'
--3、找出奖金高于薪金的员工。
SELECT ename FROM tb_emp WHERE comm > sal
--4、找出奖金高于薪金60%的员工。
SELECT ename  FROM  tb_emp WHERE comm >sal*(1+0.6)
--5、找出部门10中所有经理(MANAGER)和部门20中所有办事员(CLERK)的详细资料。
SELECT * FROM tb_emp WHERE (deptno='10'and job='经理') or (deptno='20'and job='办事员')
--6、找出部门10中所有经理(MANAGER)，部门20中所有办事员(CLERK)，以及所有部门中既不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
SELECT * FROM tb_emp 
WHERE (deptno='10'and job='经理') or (deptno='20'and job='办事员')
or (job NOT IN ('经理','办事员')and sal>=2000)
--7、找出有奖金的员工的不同工作。
SELECT job as 工作 FROM tb_emp WHERE comm is not null group BY job
--8、找出没奖金或奖金低于100的员工。
SELECT ename FROM tb_emp WHERE comm is null or comm <100
--9、查询每个部门的平均薪水和部门名，并按薪水由高到低进行排序。
SELECT AVG (sal) as 平均薪水,deptno as 部门名 FROM tb_emp group by deptno order by avg(sal) desc
--10、找出早于2012年前受雇的员工。
SELECT ename ,hiredate FROM tb_emp WHERE hiredate < '2012'
--11、查询公司员工薪水总数。
SELECT  sum(sal) FROM tb_emp
--12、显示正好为5个字符的员工的姓名。
SELECT ename FROM tb_emp WHERE ename like '%%'AND LEN(ename)=5
--13、显示不带有‘R’的员工的姓名。
SELECT ename FROM tb_emp WHERE ename NOT LIKE'%R%'
--14、查询每个部门员工人数和部门名，并按照员工人数进行降序排列。
SELECT count(deptno) as 员工人数 ,deptno AS 部门名 FROM tb_emp group  BY deptno order by count (deptno) desc
--15、查询每个部门女员工的人数。
SELECT deptno ,count(ename) FROM tb_emp WHERE Ssex='girl' group by deptno
--16、显示2007年到2017年之前入职的员工的姓名和受雇日期。
SELECT ename as 姓名,hiredate as 受雇日期 FROM tb_emp 
WHERE hiredate between 2007 and 2017 
--17、显示员工的详细资料，并按姓名排序。
SELECT * FROM tb_emp order by ename 
--18、显示所有员工的姓名和受雇日期，跟据其服务年限，将最老的员工排在最前面。】
SELECT ename ,hiredate FROM   tb_emp order by  hiredate
--19、显示所有员工的姓名、工作和薪金，按工作的降序排列，若工作相同则按薪金排序。
SELECT*FROM  tb_emp ORDER BY job DESC ,sal
--20、查询员工薪水高于平均值的员工信息。
SELECT * FROM tb_emp WHERE sal > (select AVG (sal) from tb_emp )
--21、查询每个员工总收入(总收入包括奖金和薪水)。
SELECT sum(sal+comm) as 总收入 ,ename as 姓名 FROM tb_emp group by ename
--22、查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
SELECT avg(comm) as 平均奖金,AVG (sal) as 平均薪水,deptno as 部门,job as 职位 FROM 
tb_emp group by job ,deptno order by avg(comm) , AVG (sal),deptno
--23、查询员工姓名，重复的姓名只出现一次。
SELECT distinct(ename)FROM tb_emp
--24、查询员工姓名不重复的员工信息。
SELECT  distinct( ename )FROM tb_emp  WHERE ename is not null
--25、显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT  ename FROM tb_emp WHERE ename LIKE'A%'OR ename ='_A%'OR ename ='___A%'
--26、查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT ename ,COUNT(ename) FROM tb_emp group BY ename 
HAVING COUNT(ename)>1 ORDER BY COUNT(ename) desc
--27、查询所有员工工资都在900-3000之间的部门信息。
SELECT ename ,sal FROM tb_emp  WHERE sal between 900 and 3000
--28、查询每个职位的最低工资，并按照工资进行升学排序。
SELECT  job,min(sal) FROM tb_emp group by job order by MIN (sal)asc