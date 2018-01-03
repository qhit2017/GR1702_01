CREATE database db_employee001
USE db_employee001
--雇员表
CREATE table tb_employee(
empno nvarchar(18) primary key ,
ename nvarchar(32) not null,
job nvarchar(32),
mgr nvarchar(16),
hiredate date,
sal money ,
comm money,
Deptno nvarchar(32) not null foreign key references tb_department(Deptno))

sp_help tb_employee
INSERT into tb_employee(empno,ename ,job ,mgr ,hiredate ,sal  ,comm ,Deptno )
values('35','SMITH','经理','a','2011-09-08',8000,4000,'20'),
('28','chao','组员','b','2011-11-08',3300,1100,'20'),
('24','ting','组员','c','1998-08-08',5100,500,'11'),
('25','ming','组长','d','1999-08-29',4300,1900,'10')

SELECT *FROM tb_employee 
CREATE table tb_department(
Deptno nvarchar(32) primary key,
Deptname nvarchar(32),
Location nvarchar(32))
sp_help tb_department
INSERT into tb_department (Deptno ,Deptname,Location)
values('20','rd','America')


--1.查询部门名称是‘SALES’的员工信息 
SELECT *from tb_employee where Deptno IN (
SELECT Deptno
from  tb_department where Deptname='sales')
--2.查询公司中薪水最高的员工信息 
SELECT*from tb_employee where sal =(
SELECT MAX(sal) from tb_employee)
--3.查询各部门中最高薪水的员工编号，姓名…
SELECT empno as 员工编号 ,ename as 姓名 
from tb_employee 
WHERE sal in(
SELECT  distinct(MAX(sal)) from tb_employee
group BY deptno
 )
 
--4.查询各部门最高薪水的员工信息 
    SELECT * 
from tb_employee 
WHERE sal in(
SELECT  distinct(MAX(sal)) from tb_employee
group BY deptno
 )
 
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * 
from tb_employee 
where sal > any (
SELECT AVG(sal) 
from tb_employee
group BY Deptno 
  )

--6.查询部门名称是‘SALES’的员工信息
SELECT *
from tb_employee 
WHERE Deptno =(
SELECT Deptno
from tb_department 
where Deptname='sales' ) 
--7.查询领导者是‘BLAKE’的员工信息 
SELECT * FROM tb_employee 
where mgr ='blake'
--8.查询和SMITH工作相同的员工信息
SELECT *FROM tb_employee
where job = (
SELECT job from tb_employee
where ename ='SMITH')
--9.查询平均工资比10部门低的部门编号 
SELECT Deptno
from tb_employee
group BY Deptno 
HAVING AVG(sal+comm)< (
SELECT AVG(sal+comm) 
from tb_employee
where deptno='10' )

--10.查询在NEW YORK工作的所有员工 
SELECT  empno as 编号 ,ename as 姓名 
from tb_employee 
where Deptno in(
select deptno
from tb_department  
where Location = 'new york'  ) 
--11.查询10号部门的员工在整个公司中所占的比例：
 
--12、查询比普通员工的最高薪水还要高的领导者姓名 

--13、找出薪水最高的五个人 
SELECT TOP 5 sal from tb_employee order BY sal DESC 
--14、列出至少有三个员工的所有部门和部门信息
SELECT *from tb_department 

--15、查询最后入职的5名员工
SELECT TOP 5  hiredate from tb_employee order BY hiredate DESC 
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
--17、列出各种工作的最低工资以及从事该工作的雇员姓名
--18、求薪水最低的部门经理所在部门的名称


