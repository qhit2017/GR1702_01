 CREATE database db_empty
USE db_empty

--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--job 员工的工作是什么比如推销员，经理等
--mgr 上级编号
--hiredate受雇日期
--sal工资
--comm奖金
--deptno部门编号

--创建雇员表
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal money,
comm money,
deptno nvarchar(16)
foreign key (deptno) references tb_dept (deptno))  
-----
--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--job 员工的工作是什么比如推销员，经理等
--mgr 上级编号
--hiredate受雇日期
--sal工资
--comm奖金
--deptno部门编号
----
INSERT INTO tb_emp  VALUES
('1' ,'rose','经理','01','2009-12-1',8978,1999    ,'10'),
('2' ,'BLACK','经理','022','2005-12-1',9990,5999    ,'20')
SELECT *FROM  tb_emp
INSERT INTO tb_emp  VALUES
('3' ,'Kimi','推销员','033','2015-08-11',5978,3000,'10'),
('4' ,'Vivian','办事员','01','2006-08-21',5978,3000 ,'35'),
('5' ,'Jack','经理','033','2012-08-19',4900,2000 ,'45'),
('6' ,'Tom','推销员','022','2016-08-28',4500,2000,'35'),
('7' ,'Emma','办事员','01','2009-12-1',8978,5000 ,'50'),
('8' ,'Sophia','办事员','033','2009-12-21',6778,2999 ,'55'),
('9' ,'lvy','经理','022','2016-06-27',5000,1999 ,'30'),
('10' ,'may','经理','01','2016-12-11',5000,1999    ,'35')



 --创建部门表
--Dept 部门表

--Deptno 部门编号
--Deptname 部门名称
--Location 地址 
--
SELECT *FROM tb_dept
--- 
CREATE table tb_dept(
deptno n_empvarchar(16) primary key,
deptname nvarchar(16) not null,
location nvarchar(10))
INSERT INTO tb_dept VALUES

('45','SALES','NEW YORK '),
('50','SALES','NEW YORK '),
('55','C','GUANGZHOU '),
('10','SALES',' BEIJING'),
('15','F','NEW YORK'),
('20','C','HONGKUNG'),
('25','A','NEW YORK'),
('30','B','SHANGHAI'),
('35','G','GUANGZHOU'),
('40','Y','BEIJING')
--------------------------------------------------------------------------------

--1.查询部门名称是‘SALES’的员工信息 
SELECT* FROM tb_dept WHERE deptname='SALES'

--2.查询公司中薪水最高的员工信息 
SELECT* FROM tb_emp WHERE sal=
(
SELECT MAX(sal) FROM tb_emp)

--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT em.empno,em.ename FROM tb_emp  em WHERE sal in (
SELECT MAX(sal) FROM tb_emp
GROUP BY Deptno)


--4.查询各部门最高薪水的员工信息 
SELECT em.empno FROM tb_emp  em WHERE sal in (
SELECT MAX(sal) FROM tb_emp
GROUP BY Deptno)

--5.查询薪水大于该部门平均薪水的员工信息 

--6.查询部门名称是‘SALES’的员工信息
SELECT* FROM tb_dept WHERE deptname='SALES' 

--7.查询领导者是‘BLAKE’的员工信息 
SELECT* FROM tb_emp  em WHERE  em.ename='BLACK'
--8.查询和SMITH工作相同的员工信息 

--9.查询平均工资比10部门低的部门编号 

--10.查询在NEW YORK工作的所有员工 


--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名 
--13、找出薪水最高的五个人 
--14、列出至少有三个员工的所有部门和部门信息
--15、查询最后入职的5名员工
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称




