CREATE database db_emp111

--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址

CREATE table tb_dert(
deptho nvarchar(32) primary key,
deptnname nvarchar(32)not null,
location nvarchar(32))
----- 领导表
---编号
----名称
CREATE table tb_leader(
lno nvarchar(16)primary key,
lname nvarchar(16) not null,
lsal money)
---------emp表是雇员信息表 
--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--mgr 上级编号
--hiredate受雇日期
--sal工资
--comm奖金
--deptno部门编号
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
lno nvarchar(16),
hiredate datetime,
sal money,
com money,
deptno nvarchar(32),
foreign key(deptno) references tb_dert(deptho),
foreign key(lno) references tb_leader(lno))
INSERT INTO tb_dert VALUES 
('1','NEWYORK','上海'),
('2','BGHRD','北京'),
('3','NHRTS','杭州'),
('4','LOKJD','南京'),
('5','CUHDJ','广州'),
('6','HHYSD','澳门'),
('7','HKIDB','香港'),
('8','KSYDH','天津'),
('9','VDSHV','郑州'),
('10','NEWYORK','周口')
INSERT INTO tb_leader VALUES
('13','NEWYORK',55896),
('1','SALES',36596),
('2','JSDGU',25896),
('3','VMVHC',25896),
('4','CASIO',25896),
('5','VSISN',258276),
('6','CISUC',29896),
('7','BLHHH',25896),
('8','FDUSS',649896),
('9','FIDID',62696),
('10','CVIVK',28496)
SELECT *FROM tb_emp 
INSERT INTO tb_emp VALUES 
('0036','SALES','1','2012-05-04',444600,600,'2'),
('0032','SALES','1','2012-05-04',444600,600,'2'),
('0033','SALES','1','2012-05-04',444600,600,'2'),
('0034','SALES','1','2012-05-04',444600,600,'2'),
('0035','SALES','1','2012-05-04',444600,600,'2'),
('0037','SALES','1','2012-05-04',444600,600,'2'),
('0012','BG','2','2017-05-04',43600,600,'2'),
('0013','NH','3','2015-05-04',152600,600,'3'),
('0014','LO','4','2017-05-04',25600,600,'4'),
('0015','CU','5','2014-05-04',167700,600,'5'),
('0016','HH','6','2017-05-04',132660,600,'6'),
('0017','HK','7','2017-05-04',130200,600,'7'),
('0018','KS','8','2016-05-04',1340,600,'8'),
('0019','VD','9','2014-05-04',15000,600,'9'),
('0020','NE','10','2013-05-04',1500,1000,'10'),
('001','SMITH','1','2012-05-04',4600,600,'1'),
('002','BGHRD','2','2017-05-04',3600,600,'2'),
('003','NHRTS','3','2015-05-04',52600,600,'3'),
('004','LOKJD','4','2017-05-04',5600,600,'4'),
('005','CUHDJ','5','2014-05-04',67700,600,'5'),
('006','HHYSD','6','2017-05-04',32660,600,'6'),
('007','HKIDB','7','2017-05-04',30200,600,'7'),
('008','KSYDH','8','2016-05-04',340,600,'8'),
('009','VDSHV','9','2014-05-04',5000,600,'9'),
('010','NEWYORK','10','2013-05-04',500,1000,'10')

-----------------------------------------------------

--1.查询部门名称是‘SALES’的员工信息 
SELECT * from tb_emp em WHERE  em.deptno =( 
	SELECT de.deptho from tb_dert de where de.deptnname ='SALES')

--2.查询公司中薪水最高的员工信息 
SELECT * FROM tb_emp em WHERE em.sal = (
	SELECT MAX(eem.sal)from tb_emp eem)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT em.empno ,em.ename  FROM tb_emp em WHERE em.sal IN (
	SELECT MAX(eem.sal)from tb_emp eem GROUP BY eem.deptno )
--4.查询各部门最高薪水的员工信息 
SELECT * FROM tb_emp em WHERE em.sal IN (
	SELECT MAX(eem.sal)from tb_emp eem GROUP BY eem.deptno )
--5.查询薪水大于该部门平均薪水的员工信息
SELECT * FROM tb_emp WHERE  sal > ANY (
	SELECT AVG(em.sal)from tb_emp em GROUP BY em.deptno )
--6.查询部门名称是‘SALES’的员工信息 
SELECT * from tb_emp WHERE lno = (
	SELECT le.lno  from tb_leader le where le.lname ='SALES')
--7.查询领导者是‘BLAKE’的员工信息 
SELECT * from tb_emp em WHERE em.lno IN (
	SELECT le.lno  from tb_leader le WHERE le.lname ='BLAKE')
--8.查询和SMITH工作相同的员工信息 
SELECT * from tb_emp em WHERE em.deptno =(
	SELECT em.deptno from tb_emp em WHERE em.ename ='SMITH')
--9.查询平均工资比10部门低的部门编号 
SELECT eem.deptno from tb_emp eem GROUP BY deptno HAVING  AVG(eem.sal)<( 
	SELECT AVG(em.sal ) from tb_emp em where deptno ='10')
--10.查询在NEWYORK工作的所有员工 
SELECT * FROM tb_emp WHERE deptno in (
	SELECT de.deptho  from tb_dert de WHERE de.deptnname ='NEWYORK')
--11.查询10号部门的员工在整个公司中所占的比例： 
--12、查询比普通员工的最高薪水还要高的领导者姓名 
SELECT em.ename from tb_emp em GROUP BY em.ename  HAVING  MAX(em.sal)> ANY(
	SELECT le.lsal  from tb_leader le )
--13、找出薪水最高的五个人 
SELECT TOP 5 em.sal,em.empno  from tb_emp em ORDER BY em.sal DESC  
--14、列出至少有三个员工的所有部门和部门信息
SELECT * from tb_dert de WHERE de.deptho IN(  
	SELECT em.deptno  from tb_emp em GROUP BY em.deptno HAVING COUNT(em.empno)>3)
--15、查询最后入职的5名员工
SELECT  TOP 5 * from tb_emp eem WHERE eem.hiredate IN  (
	SELECT TOP 5 em.hiredate  from tb_emp em ORDER BY  em.hiredate DESC )
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名
SELECT DISTINCT  MIN(em.sal), em.ename from tb_emp em GROUP BY em.deptno,em.ename 
--18、求薪水最低的雇员所在部门的名称
SELECT deptnname  from tb_dert where deptho IN(
	SELECT eem.deptno from tb_emp eem WHERE eem.sal =(
		SELECT MIN(em.sal)from tb_emp em ))
--19、求薪水最低的部门经理所在部门的名称
SELECT lee.lname from tb_leader lee WHERE lee.lsal =(
	SELECT MIN(le.lsal)from tb_leader le)