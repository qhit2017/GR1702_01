CREATE table tb_emp(
empno int identity(1,1) primary key,
ename nvarchar(16) not null,
deptno nvarchar(16),
job nvarchar(8),
sal money,
comm money,
hiredate date ,
sex  nvarchar 
)
SELECT * FROM tb_emp
INSERT INTO tb_emp VALUES
('王帅杰','30','经理',5500,1500,'20000801','男'),
 ('李利利','30','经理',5500,1500,'20080801','男'),
 ('于和璧','20','办事员',2500,1000,'20100202','男'),
 ('李云龙','10','经理',5500,1500,'20090901','男'),
 ('徐云梦','10','经理',5500,1500,'20080606','女'),
 ('陈俊燚','20','办事员',2500,1000,'20080908','男'),
 ('盛明春','30','经理',5500,1500,'20080907','男'),
 ('孔于辉','20','经理',5500,2000,'20080608','男'),
 ('王迎阔','30','办事员',2500,1500,'20080504','男'),
 ('王欣','20','经理',5500,1500,'20080203','女'),
 ('孙涵','30','后勤',3500,1000,'20080705','男'),
 ('夏杰','10','经理',5500,1500,'20080604','女')
 INSERT INTO tb_emp VALUES  
  ('曾祥顺','10','经理',1500,10000,'20080604','女')
 INSERT INTO tb_emp(ename, deptno,job, sal,  sex)VALUES
 ('jakea','10','后勤',3500,'女')
--1  选择部门30中的所有员工。
 SELECT * FROM tb_emp WHERE deptno ='30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT ename as 姓名,empno as 雇员编号,deptno AS 部门编号 FROM tb_emp
 WHERE job ='办事员'
--3  找出奖金高于薪金的员工。
SELECT * FROM tb_emp WHERE comm > sal 
--4  找出奖金高于薪金60%的员工。
SELECT * FROM tb_emp WHERE comm >(1+0.6)*sal
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
SELECT * FROM tb_emp 
 WHERE  deptno ='10'AND job ='经理' OR deptno ='20'AND job ='办事员'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
--以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
SELECT * FROM tb_emp 
 WHERE  deptno ='10'AND job ='经理' or deptno ='20'AND job ='办事员'
or (job not IN('经理','办事员') AND  sal>='2000')  
--7  找出有奖金的员工的不同工作。
SELECT ename as 员工 ,job as 工作 FROM tb_emp WHERE comm IS not NULL 
--8  找出没有奖金或奖金低于100的员工。
SELECT ename,comm FROM tb_emp WHERE comm IS  NULL  OR comm<100
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT AVG(sal)as 平均薪水,deptno as 部门名  FROM tb_emp group BY deptno
ORDER BY AVG(sal) desc
--10  找出早于2012年前受雇的员工。
SELECT ename as 员工  FROM tb_emp WHERE hiredate <'2012'
--11 查询公司员工薪水总数。
SELECT SUM(sal) as 公司员工薪水总数 FROM tb_emp
--12  显示正好为5个字符的员工的姓名。
SELECT ename as 员工的姓名 FROM tb_emp where ename LIKE'_____'
--13  显示不带有'R'的员工的姓名。
SELECT ename as 员工的姓名 FROM tb_emp where ename NOT  LIKE'%r%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
SELECT COUNT(deptno) as 员工人数,deptno as 部门名  FROM tb_emp group BY deptno 
ORDER BY COUNT(deptno)desc
--15  查询每个部门女员工的人数。
SELECT COUNT(deptno) as 女员工人数,deptno as 部门名  FROM tb_emp where sex='女' group BY deptno 
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
SELECT ename as 员工的姓名,hiredate as 受雇日期 FROM tb_emp where hiredate not  BETWEEN '2007'AND '2017'AND hiredate <'2007'
--17  显示员工的详细资料，按姓名排序。
SELECT *FROM tb_emp ORDER BY ename ASC
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT ename as 员工的姓名,hiredate as 受雇日期 FROM tb_emp ORDER BY hiredate asc
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
SELECT ename as 员工的姓名,job as 工作, sal as 薪金 FROM tb_emp ORDER BY job DESC ,sal      
--20  查询员工薪水高于平均值的员工信息。
SELECT * FROM tb_emp  where sal>all(SELECT AVG(sal)from tb_emp ) 
--21 查询每个员工总收入（总收入包括奖金和薪水）。
SELECT ename as 员工的姓名,SUM(sal+comm) FROM tb_emp GROUP BY ename  
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
SELECT AVG(comm) as 平均奖金,AVG(sal) as 平均薪水,deptno as 部门,job as 职位 FROM tb_emp GROUP BY deptno,job
--23 查询员工姓名，重复的姓名只出现一次。
SELECT distinct ename as 员工的姓名 FROM tb_emp 
--24  查询员工姓名不重复的员工信息。（不会）
SELECT *FROM tb_emp where ename IN(SELECT ename FROM tb_emp group by ename HAVING  COUNT(*)<2 )
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT  ename as 员工的姓名 FROM tb_emp where ename='%A%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT  ename as 员工的姓名 , COUNT( ename ) as 重复条数 
FROM tb_emp GROUP BY ename HAVING  COUNT( ename )>1

--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT deptno as 部门, ename as 员工的姓名 FROM tb_emp where sal  BETWEEN 900 AND 3000
--28  查询每个职位的最低工资，并按照工资进行升学排序
SELECT job as 职位,MIN(sal) as 最低工资  FROM tb_emp GROUP BY job ORDER BY MIN(sal) ASC