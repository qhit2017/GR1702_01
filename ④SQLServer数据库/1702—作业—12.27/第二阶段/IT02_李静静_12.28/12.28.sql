CREATE database db_employee
USE db_employee
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
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(32),
job nvarchar(32),
mgr nvarchar(32),
hiredate datetime,
sal money,
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_Dept(deptno)
)
INSERT INTO tb_emp VALUES
('01','LOMO','SALES','001','2017-12-12',2000,100,'1'),
('02','BLAKE','领导者','002','2017-12-12',4000,100,'2'),
('03','李四','领导者','003','2017-12-12',3000,100,'3'),
('04','张三','SMITH','004','2017-12-12',1000,100,'4'),
('05','王二','SMITH','005','2017-12-12',3000,100,'5'),
('06','麻子','NEW YORK','006','2017-12-12',3000,100,'6'),
('07','小偷','NEW YORK','007','2017-12-12',3000,100,'7'),
('08','判官','SALES','008','2017-12-12',3000,100,'8'),
('09','june','部门经理','009','2017-12-12',3000,100,'9'),
('010','mick','部门经理','0010','2017-12-12',3000,100,'10')

--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址
CREATE table tb_Dept(
deptno nvarchar(32) primary key,
deptname nvarchar(32),
location nvarchar(32)
)
INSERT INTO tb_Dept VALUES
('1','SALES','上海'),
('2','领导者','上海'),
('3','领导者','上海'),
('4','SMITH','上海'),
('5','SMITH','上海'),
('6','NEW YORK','上海'),
('7','NEW YORK','上海'),
('8','SALES','上海'),
('9','部门经理','上海'),
('10','部门经理','上海')
--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp em,tb_Dept de
WHERE em.deptno IN
(

	SELECT de.deptno
	from tb_Dept de
	WHERE de.deptname = 'SALES')
	
and em.deptno = de.deptno
--2.查询公司中薪水最高的员工信息 
SELECT * FROM tb_emp
where sal=(select MAX(sal) from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名…  
SELECT em.empno,em.ename
from tb_emp em,tb_Dept de
where em.sal IN (

		SELECT max(em.sal)
		from tb_Dept de,tb_emp em
		where de.deptno = em.deptno
		GROUP BY em.deptno
		)
		
AND de.deptno = em.deptno
--4.查询各部门最高薪水的员工信息 
SELECT *
from tb_emp em,tb_Dept de
where em.sal IN (

		SELECT max(em.sal)
		from tb_Dept de,tb_emp em
		where de.deptno = em.deptno
		GROUP BY em.deptno
		)
		
AND de.deptno = em.deptno
--5.查询薪水大于该部门平均薪水的员工信息 

--6.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp em,tb_Dept de
WHERE em.deptno IN
(

	SELECT de.deptno
	from tb_Dept de
	WHERE de.deptname = 'SALES')
	
and em.deptno = de.deptno
--7.查询领导者是‘BLAKE’的员工信息 

--8.查询和SMITH工作相同的员工信息 

--9.查询平均工资比10部门低的部门编号 

--10.查询在NEW YORK工作的所有员工 
SELECT * FROM tb_emp em,tb_Dept de
WHERE em.deptno IN
(
   SELECT de.deptno
	from tb_Dept de
	WHERE de.deptname = 'NEW YORK')
	
and em.deptno = de.deptno
--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名 

--13、找出薪水最高的五个人
 SELECT TOP 5 sal from tb_emp order BY sal desc
--14、列出至少有三个员工的所有部门和部门信息

--15、查询最后入职的5名员工
SELECT TOP 5 hiredate from tb_emp order BY hiredate desc
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称



