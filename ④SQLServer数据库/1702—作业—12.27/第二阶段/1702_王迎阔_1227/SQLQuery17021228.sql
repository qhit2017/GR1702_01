CREATE database db_table
USE db_table
--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(32) not null,
location nvarchar(16) )
INSERT INTO tb_dept(deptno,deptname,location)
VALUES(01,'RD','china'),
(02,'IM','America '),
(03,'CS','England ')

--emp表是雇员信息表 
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
ename nvarchar(32) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate datetime,
sal money,
comm money,
deptno nvarchar(32)
foreign key (deptno) references tb_dept (deptno)
)
INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES(1001,'SALES','办事员','001',2014-01-15,3000,200,'01'),
(1002,'mrsa','办事员','002',2014-01-15,3000,200,'01'),
(1003,'lilei','办事员','003',2014-01-15,3000,200,'02'),
(1004,'Lili','经理','004',2014-01-15,3000,200,'02'),
(1005,'SMITH','办事员','005',2014-01-15,3000,200,'03'),
(1006,'bory','经理','006',2014-01-15,3000,200,'03'),
(1007,'BLAKE','经理','007',2014-01-15,3000,200,'01')

--1.查询部门名称是‘RD’的员工信息 
SELECT * FROM tb_dept WHERE deptname = 'RD'
--2.查询公司中薪水最高的员工信息
SELECT *FROM tb_emp WHERE sal=(SELECT MAX(sal) FROM tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT em.empno,em.ename 
from tb_emp em WHERE sal=(SELECT MAX(sal) from tb_emp)
--4.查询各部门最高薪水的员工信息 
SELECT * FROM tb_emp where sal in (SELECT MAX(sal) FROM tb_emp GROUP BY deptno)
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT *
from tb_emp
WHERE sal>(SELECT AVG(sal) FROM tb_emp) 
--6.查询部门名称是‘RD’的员工信息 
SELECT * FROM tb_dept WHERE deptname = 'RD'
--7.查询领导者是‘BLAKE’的员工信息 
SELECT * FROM tb_emp WHERE ename = 'BLAKE'
--8.查询和SMITH工作相同的员工信息 
SELECT * FROM tb_emp WHERE job ='SMITH'
--9.查询平均工资比1部门低
SELECT deptno from tb_emp GROUP BY deptno HAVING avg(sal)<(
select avg(em.sal)
from tb_emp em WHERE em.deptno='1')      
--10.查询在RD工作的所有员工 
SELECT*
from tb_emp
WHERE deptno IN(
SELECT de.deptno
from tb_dept de
WHERE de.location='RD')
--11.查询02号部门的员工在整个公司中所占的比例：
 
--12、查询比普通员工的最高薪水还要高的领导者姓名 

--13、找出薪水最高的五个人 
SELECT top 5 *FROM tb_emp em                                            
ORDER BY em.hiredate ASC
--14、列出至少有三个员工的所有部门和部门信息

--15、查询最后入职的5名员工

--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称

--删除某个字段
--ALTER table tb_XXX drop 所要删除内容 
--如果有约束条件要先删除约束条件
--ALTER table tb_XXX drop constraint(约束)+约束条件
--修改字段
--ALTER table tb_  alter column recommend 修改内容 

