
CREATE database db_EMPB
USE db_EMPB
CREATE table tb_emp(
empno nvarchar(32)primary key,
ename nvarchar(16)not null,
job nvarchar(32),
mgr nvarchar(32),
hiredate date,
sal money,
comm smallint,
deptno nvarchar(32)
)
CREATE table tb_Dept(
deptno int identity(1,1)primary key,
deptname nvarchar(16)not null,
location nvarchar(32)
)
INSERT INTO tb_emp VALUES  
('01','李山','经理','001',2017-02-23,6000,2000,'11'),
('02','二胡','员工','002',2017-02-23,3000,1000,'11'),
('03','小白','员工','003',2017-02-23,3000,1000,'11'),
('04','张一山','经理','004',2017-02-23,5000,2000,'11'),
('05','风格','经理','005',2017-02-23,6000,2000,'10'),
('06','SMITH','员工','006',2017-02-23,3000,1000,'10'),
('07','李白','员工','007',2017-02-23,3000,1000,'10'),
('08','李云龙','员工','008',2017-02-23,3000,1000,'10')
INSERT INTO tb_Dept(deptno,deptname,location)VALUES
(10,'SALES','NEW YORK'),
(11,'SALES','NEW YORK')

--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_Dept where deptname='SALES' 

--2.查询公司中薪水最高的员工信息 
SELECT *  FROM tb_emp where sal=(SELECT max(sal) FROM tb_emp) 

--3.查询各部门中最高薪水的员工编号，姓名… 

--4.查询各部门最高薪水的员工信息 

--5.查询薪水大于该部门平均薪水的员工信息 

--6.查询部门名称是‘SALES’的员工信息 

--7.查询领导者是‘BLAKE’的员工信息 

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



  

