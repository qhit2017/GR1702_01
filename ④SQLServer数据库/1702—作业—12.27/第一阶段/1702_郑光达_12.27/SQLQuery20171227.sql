CREATE database db_EMPBJG

USE db_EMPBJG

--emp表是雇员信息表 
--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--job 比如推销员,mgr 上级编号,hiredate受雇日期,sal工资,comm奖金,deptno部门编号,

CREATE table tb_emp(
	empno nvarchar(32) primary key,
	ename nvarchar(32),
	job nvarchar(32),
	leader nvarchar(32),
	foreign key(leader) references tb_lead(leader),
	hiredate datetime,
	sal money,
	comm money,
	deptno nvarchar(32)
	foreign key(deptno) references tb_Dept(deptno)
)
CREATE table tb_lead(
leader nvarchar(32)primary key,
Leadname nvarchar(32))
INSERT INTO tb_lead
SELECT '10011','BLAKE'UNION
SELECT '10010','blue'


INSERT INTO tb_emp 
SELECT '007','李五','推销员','10011','2017/12/27',9500,9500,'1700'UNION
SELECT '002','李四','推销员','10011','2017/12/27',9500,9500,'1701'UNION
SELECT '001','张三','经理','10010','2017/12/26',8000,8000,'1702'UNION
SELECT '003','王二','推销员','10011','2017/12/27',5000,2000,'1701'UNION
SELECT '004','麻子','经理','10010','2015/11/26',5200,5000,'1702'UNION
SELECT '005','周五','推销员','10011','2018/10/27',6600,5200,'1701'UNION
SELECT '006','正旺','经理','10010','2014/11/25',4600,2000,'1702'


--Dept 部门表,Deptno 部门编号,Deptname 部门名称,Location 地址
CREATE table tb_Dept(
	Deptno nvarchar(32)primary key,
	Deptname nvarchar(32),
	Location nvarchar(32)
)
INSERT INTO tb_Dept
SELECT '1700','45634','河南省信阳市' UNION
SELECT '1701','SALES','河南省信阳市' UNION
SELECT '1702','清华it','河南省周口市' 



--1.查询部门名称是‘SALES’的员工信息 
SELECT *
from tb_emp em
WHERE em.deptno =(
	SELECT de.Deptno
	from tb_Dept de
	where Deptname = 'SALES')

--2.查询公司中薪水最高的员工信息 
SELECT *
from tb_emp em
where em.sal =(

	SELECT max(sal)
	from tb_emp
	
)
--3.查询各部门中最高薪水的员工编号，姓名
SELECT de.Deptname,em.empno,em.ename
from tb_emp em , tb_Dept de
where em.sal IN(

	SELECT max(sal)
	from tb_emp em,tb_Dept de
	WHERE de.Deptno = em.deptno
	GROUP BY de.Deptno)
	
AND de.Deptno = em.deptno
	

--4.查询各部门最高薪水的员工信息
SELECT *
from  tb_Dept de ,tb_emp em 
where em.sal IN(

	SELECT max(sal)
	from tb_emp em,tb_Dept de
	WHERE de.Deptno = em.deptno
	GROUP BY de.Deptno
	
	)	
AND de.Deptno = em.deptno

--5.查询薪水大于该部门平均薪水的员工信息 

SELECT *
from tb_emp em,tb_Dept de 
where em.sal IN (
	SELECT em.sal 
	from tb_emp em INNER JOIN tb_Dept de
	ON de.Deptno = em.deptno
	
	WHERE  em.sal >(
		SELECT AVG(em.sal)
		from tb_emp em,tb_Dept de
		WHERE de.Deptno = em.deptno
		GROUP BY de.Deptno
		)

	GROUP BY em.deptno
	)
	AND de.Deptno = em.deptno


--6.查询部门名称是‘SALES’的员工信息 
SELECT *
from tb_emp em
WHERE em.deptno =(
	SELECT de.Deptno
	from tb_Dept de
	where Deptname = 'SALES')

--7.查询领导者是‘BLAKE’的员工信息 
SELECT *
from tb_emp em
where em.ename= 'BLAKE'

--8.查询和SMITH工作相同的员工信息 
SELECT *
from tb_emp 
where job = (
	SELECT em.job
	from tb_emp em
	WHERE em.ename='SMITH')

--9.查询平均工资比10部门低的部门编号 


--10.查询在NEW YORK工作的所有员工 
SELECT *
from tb_emp em
WHERE em.deptno =(
	SELECT de.Deptno
	from tb_Dept de
	where Deptname = 'NEW YORK')
--11.查询10号部门的员工在整个公司中所占的比例： 


--12、查询比普通员工的最高薪水还要高的领导者姓名 

--13、找出薪水最高的五个人 
                                                                                                             
SELECT TOP 5*FROM tb_emp 
 SELECT em.
 from tb_emp em
 
--14、列出至少有三个员工的所有部门和部门信息
SELECT *
from tb_emp em,tb_Dept de 
WHERE em.deptno IN 
	(SELECT COUNT(em.deptno)
	from tb_Dept de ,tb_emp em 
	where  de.Deptno = em.deptno
	group BY de.Deptno
	)

and em.deptno > 2
	
--15、查询最后入职的5名员工

--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称

