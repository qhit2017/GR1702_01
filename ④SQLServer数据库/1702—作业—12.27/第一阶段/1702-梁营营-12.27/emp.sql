CREATE database db_emp
USE db_emp

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

 --创建部门表
CREATE table tb_dept(
deptno nvarchar(16) primary key,
deptname nvarchar(16) not null,
location nvarchar(10))


INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES ('001','Lily','CLERK','01','2001-12-04',5000,6300,'10'),
('002','Tom','BLAKE','02','2006-10-13',5500,4500,'11'),
('003','Jason','CLERK','03','2014-06-26',3500,2300,'12'),
('004','Mary','CLERK','04','2012-08-16',4000,3000,'13'),
('005','Walker','MANAGER','05','2015-10-22',4600,5200,'14'),
('006','Wilson','CLERK','06','2008-09-10',4100,2300,'15'),
('007','SMITH','MANAGER','07','2016-12-12',5500,2000,'16'),
('008','Johnson','CLERK','08','2017-01-16',3500,2000,'17'),
('009','Stewart','CLERK','09','2004-07-26',4600,3000,'18'),
('010','Powell','MANAGER','10','2009-04-12',4400,2100,'19'),
('011','perry','CLERK','11','2003-05-17',2500,3000,'20'),
('012','Marshall','MANAGER','12','2012-08-14',8600,4200,'30'),
('013','James','CLERK','13','2014-05-19',3500,2000,'35'),
('014','Long','MANAGER','14','2015-06-13',4500,3000,'36'),
('015','Rose','CLERK','15','2016-07-18',2800,NULL,'37')
INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES ('016','HanMeimei','CLERK','16','2006-12-04',5000,6300,'40')

INSERT INTO tb_dept(deptno,deptname,location)
VALUES('10','SALES','上海'),
('11','SALES','上海'),
('12','SE','香港'),
('13','SE','香港'),
('14','SALES','上海'),
('15','AS','澳门'),
('16','SALES','上海'),
('17','SE','香港'),
('18','SALES','上海'),
('19','SE','香港'),
('20','SALES','上海'),
('30','AS','澳门'),
('35','SALES','上海'),
('36','AS','澳门'),
('37','SE','香港')
INSERT INTO tb_dept(deptno,deptname,location)
VALUES('40','SALES','NEW YORK')


--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_dept where deptname = 'SALES'
--2.查询公司中薪水最高的员工信息 
SELECT * FROM tb_emp where sal = 
(SELECT MAX(sal) from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名… 
--4.查询各部门最高薪水的员工信息 
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * FROM tb_emp where sal>
(SELECT AVG(sal) from tb_emp)
--6.查询部门名称是‘SALES’的员工信息 
--7.查询领导者是‘BLAKE’的员工信息 
SELECT * FROM tb_emp where job = 'BLAKE'
--8.查询和SMITH工作相同的员工信息 
SELECT * FROM tb_emp where ename = 'SMITH'
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

