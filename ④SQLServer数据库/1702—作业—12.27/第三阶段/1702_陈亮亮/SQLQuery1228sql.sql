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
CREATE database db_employee
USE db_employee
CREATE table tb_emp(
empno nvarchar(32)primary key,
ename nvarchar(32)not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate nvarchar(32),
sal money,
comm money,
deptno nvarchar(32))
INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno )
VALUES (1,'小明','经理',01,'20030516',36000,13000,001),
          (11,'李磊','推销员',1,'20131016',3000,800,001),
          (12,'王菲','推销员',1,'20090724',4500,1200,001),
          (13,'孙涵','推销员',1,'20120924',3500,1200,001),
       (2,'马云','经理',02,'19950625',53000,37000,002),
          (21,'张哲平','程序员',2,'20091016',13000,6800,002),
          (22,'郭高辉','程序员',2,'20130324',15000,7200,002),
          (23,'杨云辉','程序员',2,'20110924',12500,5200,001),
       (3,'BLAKE','经理',03,'20011125',22000,10000,10),
          (31,'王佩佩','记者',3,'20051016',8000,4800,10),
          (32,'范梦娜','记者',3,'20090724',5500,2200,10),
          (33,'大眼','记者',3,'20110924',6500,4200,10)
  
 CREATE table tb_Dept(
 Deptno nvarchar(32) primary key,
Deptname nvarchar(32),
Location nvarchar(32))
INSERT INTO tb_Dept(Deptno,Deptname,Location) VALUES
 (001,'销售部','上海'),
 (002,'研发部','北京'),
 (10,'SALES','NEW YORK')
--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp em WHERE em.deptno IN(
SELECT de.Deptno from tb_Dept de WHERE de.Deptname = 'SALES' )
--2.查询公司中薪水最高的员工信息 
SELECT * FROM tb_emp where sal=(SELECT MAX(sal)from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT * FROM tb_emp where sal=(SELECT MAX(sal)from tb_emp)
--4.查询各部门最高薪水的员工信息 
SELECT * FROM tb_emp where sal IN(SELECT MAX(sal)from tb_emp group BY deptno)
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

 
     