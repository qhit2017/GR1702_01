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

CREATE database db_emp
USE db_emp
----
CREATE table tb_mgr(
mgr nvarchar(32) primary key,
mname nvarchar(32) not null)
----
CREATE table tb_Dept(
Deptno nvarchar(32) primary key,
Deptname nvarchar(32) not null,
Location nvarchar(32) not null)
----
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(32) not null,
job nvarchar(32) not null,
mgr nvarchar(32) ,
foreign key(mgr) references tb_mgr(mgr),
hiredate date not null,
sal money not null,
comm money not null,
deptno nvarchar(32) ,
foreign key(deptno) references tb_Dept(deptno))

INSERT INTO tb_mgr(mgr,mname)VALUES
('001','BLAKE'),('002','孙书欣'),('003','孙相丽'),('004','时启梦'),('005','王振华')INSERT INTO tb_Dept(Deptno,Deptname,Location)VALUES('05','SALES','上海'),('10','rd','北京'),('15','fae','苏州'),('20','asd','杭州'),('30','bnu','广州'),('45','lan','NEW YORK'),('50','fei','南京')INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)VALUES('01','tom','推销员','004','2005-7-5',2000,1900,'05'),('02','mary','经理','001','2004-10-15',4000,1500,'45'),('03','海洋','经理','003','2003-7-7',4000,1500,'30'),('04','SMITH','推销员','005','2005-10-5',2500,1500,'05'),('05','鹏波','清洁工','003','2005-3-15',1500,1500,'15'),('06','玉柱','推销员','002','2002-1-12',3000,500,'05'),('07','董飞','经理','001','2007-10-24',4000,500,'15'),('08','老黑','保安','004','2005-8-5',2000,1500,'10'),('09','贾珂','推销员','002','2007-1-5',2500,700,'30'),('10','李兰','客服','002','2010-3-5',3000,800,'50'),('11','陆笑杰','客服','002','2010-3-6',3000,1000,'15'),('12','王文轩','经理','001','2005-1-5',2000,1500,'10')--1.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp WHERE deptno=(
SELECT tb_Dept.Deptno from tb_Dept where Deptname='SALES' )
--2.查询公司中薪水最高的员工信息 
SELECT *  from tb_emp where sal = (
	SELECT max(sal) from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT * FROM tb_emp where empno in
(SELECT empno FROM tb_emp GROUP BY deptno,empno,sal HAVING sal in(
SELECT MAX(sal) from tb_emp GROUP BY deptno))
	
--4.查询各部门最高薪水的员工信息 
SELECT * FROM tb_emp where empno in
(SELECT empno FROM tb_emp WHERE sal =any (
SELECT MAX(sal) from tb_emp GROUP BY deptno))

SELECT TOP 1 ename FROM
tb_emp  GROUP BY deptno,ename  ORDER BY sal desc

--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * from tb_emp WHERE empno in(
SELECT empno FROM tb_emp GROUP BY deptno,empno,sal HAVING sal > ANY (
SELECT AVG(sal) from tb_emp GROUP BY deptno))

--6.查询部门名称是‘SALES’的员工信息 
SELECT*FROM tb_emp WHERE
deptno=(SELECT tb_Dept.Deptno from tb_Dept WHERE Deptname='SALES')

--7.查询领导者是‘BLAKE’的员工信息 
SELECT*FROM tb_emp WHERE
mgr=(SELECT mgr from tb_mgr where mname='BLAKE' )

--8.查询和SMITH工作相同的员工信息 
SELECT* FROM tb_emp where job=(
SELECT job from tb_emp where ename='SMITH')

--9.查询平均工资比10部门低的部门编号 
SELECT deptno from tb_emp GROUP BY deptno HAVING AVG(sal)<(
SELECT AVG(sal) from tb_emp GROUP BY deptno HAVING deptno='10')

--10.查询在NEW YORK工作的所有员工 
SELECT ename from tb_emp where deptno=(
SELECT tb_Dept.Deptno from tb_Dept WHERE Location='NEW YORK')


--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名 
--13、找出薪水最高的五个人 
SELECT TOP 5 em.ename 
from tb_emp em 
order BY sal DESC

--14、列出至少有三个员工的所有部门和部门信息
SELECT de.Location,de.Deptno,de.Deptname from tb_Dept de
WHERE de.Deptno IN (
SELECT em.deptno 
from tb_emp em 
group BY em.deptno
HAVING COUNT(em.empno)>=3 )
--15、查询最后入职的5名员工
SELECT TOP 5 em.ename from tb_emp em ORDER BY em.hiredate asc
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
select COUNT(empno),job from tb_emp group BY job HAVING job in(SELECT em.job from tb_emp em GROUP BY em.job HAVING MIN(em.sal)>1500)
--17、列出各种工作的最低工资以及从事该工作的雇员姓名
SELECT MIN(sal),job,ename from tb_emp GROUP BY job,ename

--18、求薪水最低的部门经理所在部门的名称

