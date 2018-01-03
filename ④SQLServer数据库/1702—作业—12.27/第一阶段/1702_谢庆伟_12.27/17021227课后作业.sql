CREATE database db_staffs
GO
USE db_staffs 
GO 
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(32),
location nvarchar(32))
GO 
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(32),
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal money,
comm money,
deptno nvarchar(32) foreign key references tb_dept(deptno))
GO 
INSERT INTO tb_dept VALUES 
('10','personnel','beijing'),
('20','planning','shanghai'),
('30','SALES','newyork')
UPDATE tb_dept SET deptname ='personnel' WHERE deptno ='10'
UPDATE tb_dept SET deptname ='planning' WHERE deptno ='20'
SELECT * FROM tb_dept 
GO 
DELETE tb_emp 
INSERT INTO tb_emp VALUES 
('001','Lily','总裁',null,'2001-12-04',15000,6300,'10'),
('002','Tom','经理','004','2006-10-13',8500,4500,'20'),
('003','Jason','主管','001','2014-06-26',9500,2300,'30'),
('004','Mary','总经理','001','2012-08-16',12000,3000,'10'),
('005','blake','经理','004','2015-10-22',8600,5200,'20'),
('006','lacy','CLERK','002','2008-09-10',4100,2300,'30'),
('007','King','MANAGER','005','2016-12-12',5500,2000,'10'),
('008','Johnson','smith','005','2017-01-16',3500,2000,'20'),
('009','Stewart','CLERK','005','2004-07-26',4600,3000,'30'),
('010','Powell','smith','002','2009-04-12',4400,2100,'10'),
('011','perry','CLERK','005','2003-05-17',2500,3000,'20'),
('012','Marshall','MANAGER','002','2012-08-14',8600,4200,'30'),
('013','James','CLERK','005','2014-05-19',3500,2000,'10'),
('014','Long','MANAGER','002','2015-06-13',4500,3000,'20'),
('015','Rose','CLERK','005','2016-07-18',2800,NULL,'30')
GO 
--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where de.deptname ='SALES'
--2.查询公司中薪水最高的员工信息 
SELECT * FROM tb_emp where sal=(SELECT MAX(sal) FROM tb_emp) 
----3.查询各部门中最高薪水的员工编号，姓名（瑕疵） 
SELECT e.empno as 编号,e.ename as 姓名 FROM tb_emp e where e.empno IN 
(select empno from tb_emp emp where emp.sal IN 
(SELECT MAX(sal) FROM tb_emp em RIGHT JOIN tb_dept de ON em.deptno =de.deptno group by de.deptno))
----4.查询各部门最高薪水的员工信息 （瑕疵）
SELECT * FROM tb_emp e where e.empno IN 
(select empno from tb_emp emp where emp.sal IN 
(SELECT MAX(sal) FROM tb_emp em RIGHT JOIN tb_dept de ON em.deptno =de.deptno group by de.deptno))
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * FROM tb_emp e where e.empno IN 
(select emp.empno from tb_emp emp where emp.sal IN 
(SELECT em.empno FROM tb_emp em RIGHT JOIN tb_dept de ON em.deptno =de.deptno group by de.deptno,em.sal,em.empno HAVING em.sal>AVG(em.sal)))
--6.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where de.deptname ='SALES'
--7.查询领导者是‘BLAKE’的员工信息 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where em.ename ='BLAKE'
--8.查询和SMITH工作相同的员工信息 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where em.job ='SMITH' 
--9.查询平均工资比10部门低的部门编号 
SELECT de.deptno as '平均工资<10部门的部门编号' from tb_dept de WHERE de.deptno IN
(select em.deptno from tb_emp em group by em.deptno having avg(em.sal)<
(select avg(emp.sal) from tb_emp emp group by emp.deptno having emp.deptno='10'))
--10.查询在NEW YORK工作的所有员工 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where de.location ='newyork' 
--11.查询10号部门的员工在整个公司中所占的比例： 
select (replace(CONVERT(decimal(18,2),
(SELECT count(em.empno) from tb_emp em where em.deptno ='10')*100/(SELECT count(emm.empno) from tb_emp emm)),
' ','') + '%') as '10号部门员工所占比例'
--12、查询比普通员工的最高薪水还要高的领导者姓名
SELECT e.ename as 姓名 from tb_emp e where e.sal> 
 (SELECT MAX(em.sal)from tb_emp em WHERE em.mgr IN 
 (select emp.empno from tb_emp emp where emp.job='经理'))
--13、找出薪水最高的五个人
SELECT top 5 em.ename as 姓名,em.sal as 薪水 from tb_emp em ORDER BY em.sal DESC  
--14、列出至少有三个员工的所有部门和部门信息
SELECT * FROM tb_dept where deptno IN 
(select em.deptno from tb_emp em group by em.deptno having count(em.empno)>3)
--15、查询最后入职的5名员工
SELECT top 5 em.ename as 姓名,em.hiredate as 入职时间 from tb_emp em ORDER BY em.hiredate DESC  
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
SELECT job,COUNT(empno) from tb_emp GROUP BY job HAVING min(sal+comm)>1500  
----17、列出各种工作的最低工资以及从事该工作的雇员姓名(缺少姓名列)
SELECT job as 职位,MIN(sal)as 最低薪水 from tb_emp e GROUP BY e.job 
--18、求薪水最低的部门经理所在部门的名称
SELECT de.deptname as 薪水最低经理部门名称 from tb_dept de where de.deptno IN 
(select em.deptno from tb_emp em where em.job='经理' and sal=
(select min(sal)from tb_emp where job='经理' ))
