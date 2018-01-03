--EMP表结构说明：
--emp表是雇员信息表 
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

CREATE table tb_emp(
no int identity(1,1) primary key,
name nvarchar(32) not null,
job nvarchar(16),
mar nvarchar(16),
hiredate datetime,
sal money,
comm money,
deptno nvarchar(16),
foreign key(deptno) references tb_dept(deptno) 
)
INSERT INTO tb_emp VALUES
('赵舞阳','办事员','001','20171227',3500,2000,'10'),
('SMITH','经理','001','20171227',4500,2000,'10'),
('李利利','经理','001','20171227',4500,2000,'10'),
('李云龙','经理','002','20171227',4500,2000,'20'),
('曾祥顺','办事员','003','20171227',3500,2000,'30'),
('盛明春','经理','004','20171227',4500,2000,'10'),
('徐云梦','经理','005','20171227',4500,2000,'20'),
('于和璧','办事员','006','20171227',3500,2000,'30'),
('孙涵','办事员','007','20171227',3500,2000,'40'),
('郑广达','办事员','008','20171227',3500,2000,'30'),
('BLAKE','经理','008','20171227',3500,2000,'40')

CREATE table tb_dept(
deptno nvarchar(16) primary key,
deptname nvarchar(16),
location nvarchar(16)
)
INSERT INTO tb_dept VALUES
('10','rd','杭州'),
('20','fae','北京'),
('30','rd','南京'),
('40','SALES','NEW YORK')
--1.查询部门名称是‘SALES’的员工信息
SELECT * FROM tb_emp e where e.deptno in (  
SELECT d.deptno FROM  tb_dept d where deptname='SALES')
--2.查询公司中薪水最高的员工信息 
SELECT *  from tb_emp where sal=(SELECT MAX(sal) from tb_emp )
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT no,name from tb_emp WHERE
 sal =any(
SELECT MAX(sal) from tb_emp )   
--4.查询各部门最高薪水的员工信息 
SELECT * from tb_emp WHERE
sal =any(
SELECT MAX(sal) from tb_emp )
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT*from tb_emp where   sal
> ANY (SELECT avg(sal) from tb_emp group BY deptno )
--6.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp e where e.deptno in (  
SELECT d.deptno FROM  tb_dept d where deptname='SALES')
--7.查询领导者是‘BLAKE’的员工信息 
SELECT * FROM tb_emp e WHERE e.job ='经理' and e.name ='BLAKE'
--8.查询和SMITH工作相同的员工信息 
SELECT * from tb_emp where job =(SELECT job from tb_emp where name='SMITH')
--9.查询平均工资比10部门低的部门编号(不会) 
SELECT DISTINCT deptno  from tb_emp where
(SELECT AVG(sal)  from tb_emp where deptno='10')> 

(SELECT AVG(sal) from tb_emp GROUP BY deptno  
 ) 
--10.查询在NEW YORK工作的所有员工
 SELECT e.name from tb_emp e WHERE e.deptno IN(
 SELECT d.deptno from tb_dept d WHERE d.location ='NEW YORK' 
  )

--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名
 
--13、找出薪水最高的五个人
 
--14、列出至少有三个员工的所有部门和部门信息

--15、查询最后入职的5名员工

--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称
