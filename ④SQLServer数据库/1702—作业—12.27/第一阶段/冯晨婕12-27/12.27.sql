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

--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址

--创建雇员表
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal decimal(8,4),
comm money,
deptno nvarchar(16)
foreign key (deptno) references tb_dept (deptno))  
----
INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) VALUES
('1' ,'rose','经理','01','2002-12-1',8978,1999    ,'10')

 --创建部门表
CREATE table tb_dept(
deptno nvarchar(16) primary key,
deptname nvarchar(16) not null,
location nvarchar(10))
INSERT INTO tb_dept VALUES
('10','SALES',' BEIJING'),
('15','F','NEW YORK'),
('20','C','HONGKUNG'),
('25','A','NEW YORK'),
('30','B','SHANGHAI'),
('35','G','GUANGZHOU'),
('40','Y','BEIJING')



