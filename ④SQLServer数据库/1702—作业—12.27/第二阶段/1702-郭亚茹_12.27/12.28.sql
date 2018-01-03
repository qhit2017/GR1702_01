USE db_employee
--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--job 员工的工作是什么比如推销员，经理等
--mgr 上级编号
--hiredate受雇日期
--sal工资
--comm奖金
--deptno部门编号

CREATE table tb_emp(
 empno nvarchar(32) primary key,
 name  nvarchar(32) not null,
 job nvarchar(32),
 mgr nvarchar(32),
 hiredate datetime,
 sal money,
 comm money,
 deptno nvarchar(32),
 foreign key(Deptno) references tb_dept(Deptno),
 foreign key(mgr) references tb_leader(mgr)
)
INSERT INTO tb_emp

SELECT '001','BLAKE','推销员','001','2010-7-22',9000,800,'10' UNION
SELECT '002','胥华为','办事员','001','2009-5-19',6000,100,'20' UNION
SELECT '003','李依','SMITH','005','2011-11-18',3000,500,'30' UNION
SELECT '004','王亚芳','SMITH','005','2012-8-24',6000,600,'10' UNION
SELECT '005','杨霄坤','SMITH','001','2015-6-24',8000,400,'30' UNION
SELECT '006','吕俩名','办事员','005','2014-8-24',5000,800,'20' UNION
SELECT '007','袁长江','推销员','001','2006-6-14',6000,300,'10' UNION
SELECT '008','韩笑宇','推销员','005','2017-8-23',6000,500,'30'


--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址
CREATE table tb_dept(
Deptno nvarchar(32) primary key,
Deptname nvarchar(32) not null,
Location nvarchar(32)
)
INSERT INTO tb_dept
SELECT '10','SALES','深圳' UNION
SELECT '20','CS','NEW YORK' UNION
SELECT '30','JAVA','上海'
 
CREATE table tb_leader(
mgr nvarchar(32) primary key,
name  nvarchar(32) not null
)
INSERT INTO tb_leader
SELECT '001','BLAKE'  UNION
SELECT '005','秦莹莹'


--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_dept where Deptname='SALES'
--2.查询公司中薪水最高的员工信息 
SELECT * from tb_emp where sal=(select MAX(sal)from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT em.empno as 员工编号,em.name as 姓名,em.deptno as 部门 from tb_emp em
where em.sal in(select MAX(em.sal)from tb_emp em
group BY deptno)
--4.查询各部门最高薪水的员工信息 
SELECT * from tb_emp 
where sal in(select MAX(sal)from tb_emp 
group BY deptno)
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * from tb_emp
 where sal >(select AVG(sal)from tb_emp 
 )
--6.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_dept where Deptname='SALES'
--7.查询领导者是‘BLAKE’的员工信息 
SELECT *
from tb_emp em
where em.mgr IN(
select le.mgr
from tb_leader le
WHERE le.name='BLAKE')

--8.查询和SMITH工作相同的员工信息 
SELECT *FROM tb_emp where job='SMITH'
--9.查询平均工资比10部门低的部门编号 
 --where---group by---having
 SELECT em.deptno as 部门编号
 from tb_emp em
GROUP BY em.deptno
HAVING AVG(em.sal)<
(SELECT AVG(em.sal)
FROM tb_emp em
where em.deptno='10')

--10.查询在NEW YORK工作的所有员工 
select * FROM tb_emp em 
WHERE em.deptno IN(
select de.Deptno
from tb_dept de
WHERE de.Location='NEW YORK')

--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名 

--13、找出薪水最高的五个人 
SELECT TOP 5 *from tb_emp em 
ORDER by em.sal desc
--14、列出至少有三个员工的所有部门和部门信息

SELECT *
from tb_dept de
where de.Deptno IN(
SELECT em.deptno
from tb_emp em
group by em.deptno
HAVING count(em.deptno)>=3)
--15、查询最后入职的5名员工
SELECT TOP 5  *from tb_emp em
ORDER BY em.hiredate ASC 
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
select em.job as 工作,COUNT(em.deptno) as 此工作的全部雇员人数
from tb_emp em
group by em.job
having MIN(sal)>1500
--17、列出各种工作的最低工资以及从事该工作的雇员姓名
  SELECT name FROM tb_emp WHERE sal IN
  (SELECT MIN(sal) FROM tb_emp GROUP BY job)
--18、求薪水最低的雇员所在部门的名称
select de.Deptname
from tb_dept de
WHERE de.Deptno IN(
SELECT eem.deptno  from tb_emp eem WHERE eem.sal IN(
SELECT MIN(em.sal )from tb_emp em))



