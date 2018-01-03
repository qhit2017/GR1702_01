--EMP表结构说明：
CREATE database db_EMP
--emp表是雇员信息表        表名
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
mgr nvarchar(32),--上级编号
foreign key(mgr) references tb_superior(mgr),
hiredate date,
sal money,
comm money,
Deptno nvarchar(16),--部门编号
foreign key(Deptno) references tb_Dept(Deptno),
)
---------------------------------------------------------------------
--Dept 部门表     表名
--Deptno 部门编号
--Deptname 部门名称
--Location 地址
CREATE table tb_Dept(
Deptno nvarchar(16) primary key,---部门编号
Deptname nvarchar(16), --部门名称
Location  nvarchar(32)) --地址)
-------------------------------
--上级表
create table tb_superior(
mgr nvarchar(32) primary key,
mname nvarchar(32))--上级名字
----------------------插入数据----------------------------------
---上级表---
INSERT INTO tb_superior (mgr, mname)VALUES 
('001','BLAKE'),
('002','孙书欣'),
('003','孙相丽'),
('004','时启梦'),
('005','王振华')

---部门表---
INSERT INTO tb_Dept( Deptno, Deptname, Location)VALUES
('05','SALES','上海'),
('10','rd','北京'),
('15','fae','苏州'),
('20','asd','杭州'),
('30','bnu','广州'),
('45','lan','NEW YORK'),
('50','fei','南京')  
---雇员信息表---
INSERT INTO tb_emp (empno,ename,job,mgr,hiredate,sal,comm,Deptno)
VALUES ('01','tom','推销员','004','2005-7-5',2000,1900,'05'),
('02','mary','经理','001','2004-10-15',4000,1500,'45'),
('03','海洋','经理','003','2003-7-7',4000,1500,'30'),
('04','SMITH','推销员','005','2005-10-5',2500,1500,'05'),
('05','鹏波','清洁工','003','2005-3-15',1500,1500,'15'),
('06','玉柱','推销员','002','2002-1-12',3000,500,'05'),
('07','董飞','经理','001','2007-10-24',4000,500,'15'),
('08','老黑','保安','004','2005-8-5',2000,1500,'10'),
('09','贾珂','推销员','002','2007-1-5',2500,700,'30'),
('10','李兰','客服','002','2010-3-5',3000,800,'50'),
('11','陆笑杰','客服','002','2010-3-6',3000,1000,'15'),
('12','王文轩','经理','001','2005-1-5',2000,1500,'10')
----------------------------------------------------------------------
--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp where Deptno =  
(SELECT Deptno from tb_Dept where Deptname = 'SALES')  
--2.查询公司中薪水最高的员工信息 
SELECT * FROM tb_emp where sal = (SELECT MAX(sal) from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT empno,ename from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--4.查询各部门最高薪水的员工信息 
SELECT * from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * from tb_emp where sal > ANY
(SELECT AVG(sal) from tb_emp  
GROUP BY Deptno)
--6.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Deptname ='SALES')
--7.查询领导者是‘BLAKE’的员工信息 
SELECT * FROM tb_emp where mgr =(
SELECT mgr from tb_superior where mname ='BLAKE')
--8.查询和SMITH工作相同的员工信息 
SELECT * FROM tb_emp where job = (
SELECT job from tb_emp where ename = 'SMITH')
--9.查询平均工资比10部门低的部门编号 
SELECT Deptno from tb_emp group BY Deptno HAVING avg(sal) < (
SELECT AVG(tb_emp.sal) from tb_emp,tb_Dept 
where tb_Dept.Deptno = '10'
AND tb_emp.Deptno = tb_Dept.Deptno) 
--10.查询在NEW YORK工作的所有员工 
select ename  from tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Location = 'NEW YORK')
--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名

--13、找出薪水最高的五个人 
SELECT TOP 5 * from tb_emp ORDER BY sal DESC 
--14、列出至少有三个员工的所有部门和部门信息
SELECT * from tb_Dept where Deptno IN  
(SELECT Deptno from tb_emp group BY tb_emp.Deptno HAVING COUNT(ename)>=3)
--15、查询最后入职的5名员工
SELECT TOP 5 * FROM tb_emp ORDER BY hiredate DESC
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名
SELECT em.ename as 雇员姓名,em.sal 
from tb_emp em
WHERE em.sal IN(
SELECT min(em.sal)
from tb_emp em
GROUP BY em.job)
--18、求薪水最低的部门经理所在部门的名称
SELECT Deptname  from tb_Dept where Deptno = 
	(SELECT top 1 Deptno from tb_emp where job = '经理' ORDER BY sal ) 
