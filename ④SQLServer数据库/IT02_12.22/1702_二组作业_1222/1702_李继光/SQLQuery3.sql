CREATE database db_emp
CREATE table tb_emp(
empno nvarchar(10) primary key,
ename nvarchar(32) not null,
deptno nvarchar(10),
job nvarchar(16),
sal money,
comm money,
hiredate date,
Sex nvarchar(2) check(Sex='男'or Sex='女'))
INSERT INTO tb_emp (empno ,ename,deptno,job ,sal ,comm ,hiredate ,Sex) 
VALUES('12','周海洋','10','打酱油',2000,1500,'2010-10-20','男'), 
('02','王玉柱','10','销售经理',2500,2000,'1998-5-24','男'),
('03','孙书欣','01','总经理',10000,9600,'1998-10-20','女'),
('04','孙相丽','10','经理',7000,1500,'1995-10-20','女'),
('05','王文轩','20','经理',5000,1500,'1995-10-20','男'),
('06','胡倩','20','办事员',3000,1500,'1995-10-20','女'),
('07','王振华','15','科长',4000,1500,'1995-10-20','男'),
('08','夏本权','10','秘书',2000,1500,'1995-10-20','男'),
('09','于和璧','10','保洁员',2000,1500,'1995-10-20','男'),
('10','时启梦','01','副经理',8000,7500,'1998-6-23','女'),
('11','陆笑杰','30','办事员',8000,7500,'1998-6-23','女')
SELECT * FROM tb_emp 
--1  选择部门30中的所有员工。
SELECT * FROM tb_emp where  deptno = '30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT ename ,  empno,deptno from tb_emp where job= '办事员'
--3  找出奖金高于薪金的员工。
SELECT * FROM tb_emp where  comm>sal 
--4  找出奖金高于薪金60%的员工.
SELECT * FROM tb_emp where comm>(1+0.6)*sal
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。 
SELECT * FROM tb_emp where (deptno ='10'AND job ='经理')or(deptno ='20' AND job = '办事员') 
--6  找出部门10中所有经理（MANAGER），
--   部门20中所有办事员（CLERK），
--   以及所有部门中即不是经理又不是办事员
--   但薪金大于或等于2000的所有员工的详细资料。
SELECT * FROM tb_emp where 
(deptno = '20'AND job = '办事员') 
or job not IN ('经理','办事员')                                          
OR sal>=2000
--7  找出有奖金的员工的不同工作。
SELECT job from tb_emp where comm IS NOT null GROUP BY  job 
--8  找出没有奖金或奖金低于100的员工。
SELECT * FROM tb_emp where comm<100 OR comm IS NULL  
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT deptno, avg(sal)as 平均薪水 from tb_emp GROUP BY deptno order by avg(sal) desc
--10  找出早于2012年前受雇的员工。
SELECT * FROM tb_emp where year(hiredate)<2012 
--11  查询公司员工薪水总数。
select SUM(sal)as 薪水总数 from tb_emp 
--12  显示正好为5个字符的员工的姓名。

--13  显示不带有'R'的员工的姓名。
SELECT ename from tb_emp where ename not LIKE '%R%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
SELECT deptno,COUNT(ename)as 员工人数 from tb_emp group by deptno ORDER BY COUNT(ename)
--15  查询每个部门女员工的人数。
SELECT deptno,COUNT(Sex)as 女员工人数 from tb_emp  where Sex='女' GRoup by deptno
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。 
SELECT ename , hiredate from tb_emp where YEAR(hiredate)>=2007 AND YEAR(hiredate)<=2017
--17  显示员工的详细资料，按姓名排序。
SELECT * FROM tb_emp  ORDER by ename
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT ename,hiredate  from tb_emp ORDER by year(hiredate)
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。

--20  查询员工薪水高于平均值的员工信息。 
SELECT * FROM tb_emp where sal>(SELECT AVG(sal) from tb_emp )
--21  查询每个员工总收入（总收入包括奖金和薪水）。
SELECT ename , sal+comm as 总收入 from tb_emp  
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
 
--23  查询员工姓名，重复的姓名只出现一次。
SELECT distinct(ename) from tb_emp 
--24  查询员工姓名不重复的员工信息。


--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT ename from tb_emp where ename LIKE '%A%' 
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。

--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT deptno from tb_emp where sal>=900 AND sal <=3000 GROUP by deptno
--28  查询每个职位的最低工资，并按照工资进行升学排序。
SELECT job ,MIN(sal) as 最低工资 FROM tb_emp group BY job ORDER BY MIN(sal) 
 