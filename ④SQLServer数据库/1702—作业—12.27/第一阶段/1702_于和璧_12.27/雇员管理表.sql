create database db_EMPS 
use db_EMPS
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
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate date,
sal decimal(8,4),
comm money,
deptno nvarchar(32)
foreign key(deptno) references tb_Dept(Deptno),
foreign key(mgr) references tb_leadership(mgr)
) 
insert into tb_emp
SELECT '002','李静静','推销员','001','2013-08-16',5600,3500,'10' union
SELECT '003','亮亮','推销员','001','2012-05-06',4600,3500,'10' union
SELECT '005','小豪','办事员','004','2008-10-06',6600,100,'20' union
SELECT '006','李继光','SMITH','004','2013-04-11',5600,50,'20' union
SELECT '008','小李','推销员','007','2014-08-19',4900,100,'30' union
SELECT '009','伟哥','SMITH','007','2013-08-06',5600,120,'30' union
SELECT '010','四火','办事员','007','2015-10-07',3600,320,'30'
-- 领导表
create table tb_leadership(
mgr nvarchar(32)primary key,
name nvarchar(32) not null,
sal money,
Deptname nvarchar(16)
)
insert into  tb_leadership
SELECT '001','郭亚茹',9800,'SALES'union
SELECT '004','小光',8600,'JAVA'union
SELECT '007','BLAKE',8000,'CS'

--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址

CREATE table tb_Dept(
Deptno nvarchar(32) primary key,                            
Deptname nvarchar(16) not null,
Location nvarchar(32)
)
insert into tb_Dept
SELECT '10','SALES','北京' union
SELECT '20','JAVA','NEW YORK' union
SELECT '30','CS','天津' 

--1.查询部门名称是‘SALES’的员工信息 
select * from tb_emp em
where em.deptno IN(
select De.Deptno
from tb_Dept De 
where De.Deptname = 'SALES')
--2.查询公司中薪水最高的员工信息 
SELECT * from tb_emp where sal=( select MAX(sal) from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名… 
select empno as 员工编号,ename as 姓名
FROM tb_emp  
where sal in(select MAX(sal) from tb_emp GROUP by  Deptno)
--4.查询各部门最高薪水的员工信息 
select * FROM tb_emp 
where sal IN (SELECT MAX(sal) from tb_emp GROUP by  Deptno)
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * FROM tb_emp
where sal >ANY(select avg(sal) from tb_emp group BY deptno)
--6.查询部门名称是‘SALES’的员工信息 
select * from tb_emp em
where em.deptno IN(
select De.Deptno
from tb_Dept De 
where De.Deptname = 'SALES')
--7.查询领导者是‘BLAKE’的员工信息
SELECT* FROM tb_emp
where mgr IN(
SELECT Le.mgr 
from tb_leadership  Le
WHERE Le.name='BLAKE')
--8.查询和SMITH工作相同的员工信息 
 SELECT * FROM tb_emp where job='SMITH'
--9.查询平均工资比10部门低的部门编号 
select deptno as 部门编号   from tb_emp group BY deptno 
HAVING avg(sal)<(select avg(sal) from tb_emp where deptno='10')
--10.查询在NEW YORK工作的所有员工 
SELECT * from tb_emp em
WHERE em.deptno IN(
select De.Deptno from tb_Dept De
WHERE De.Location='NEW YORK')
--11.查询10号部门的员工在整个公司中所占的比例：

--**这个不会

--12、查询比普通员工的最高薪水还要高的领导者姓名
SELECT le.name
 from tb_leadership le
 WHERE le.sal>(
SELECT max(em.sal)
from tb_emp em)
--13、找出薪水最高的五个人 
--****不知道咋把领导的工资也算进去
select TOP 5 *
from tb_emp em 
order BY em.sal DESC 
--14、列出至少有三个员工的所有部门和部门信息
SELECT *
from tb_Dept De
where De.Deptno IN(
SELECT em.deptno
from tb_emp em
GROUP BY em.deptno
HAVING COUNT(em.deptno)>=3
)
--15、查询最后入职的5名员工
select TOP 5 *
from tb_emp em order BY em.hiredate desc 
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
SELECT en.job as 工作,COUNT(en.empno)  as 雇员人数
from tb_emp en 
GROUP BY en.job 
HAVING  en.job IN(
SELECT em.job  
from tb_emp em 
GROUP BY em.job 
HAVING MIN(em.sal )>1500)
--17、列出各种工作的最低工资以及从事该工作的雇员姓名

---**结果不太对
SELECT em.ename as 雇员姓名,em.sal as 最低工资
from tb_emp em 
where em.sal IN(
SELECT MIN(sal) 
from tb_emp em
GROUP BY em.job)
 

--18、求薪水最低的部门经理所在部门的名称
SELECT le.Deptname as 部门名称
from tb_leadership le
WHERE le.sal in(
SELECT MIN(le.sal)
from tb_leadership le)
