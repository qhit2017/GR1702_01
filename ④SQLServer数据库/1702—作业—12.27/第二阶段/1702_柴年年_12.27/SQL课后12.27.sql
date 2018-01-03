--EMP表结构说明：
--emp表是雇员信息表 
--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--job 员工的工作是什么比如推销员，经理等
--mgr 上级编号     hiredate受雇日期   sal工资
--comm奖金   deptno部门编号   Dept 部门表
--Deptno 部门编号   Deptname 部门名称   Location 地址

DELETE from tb_emp
CREATE database db_emplyee
CREATE table tb_emp(
emono nvarchar(32)primary key,
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate date,
sal decimal(8,4),
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_dept(deptno),
foreign key(mgr) references tb_superior(mgr)
)
INSERT INTO tb_emp VALUES 
(10014,'hjkh','经理','1001','2014-11-04',8800,2000,10),
(10002,'tom','推销员','1002','2014-05-16',7000,3000,03),
(10003,'lucy','推销员','1003','2012-03-17',6000,3500,02),
(10004,'林肯','前台','1004','2016-10-05',8000,3600,05),
(10005,'鲁迅','经理','1003','2017-06-03',7000,2600,07),
(10006,'曾祥顺','前台','1002','2010-11-15',6000,4100,05),
(10007,'王帅杰','经理','1004','2003-06-16',7000,3600,03),
(10008,'孙敬虔','推销员','1001','2009-12-25',9500,4100,08),
(10009,'张鹏','经理','1002','2015-10-19',5400,2900,06),
(10010,'jack','经理','1003','2013-05-16',7500,3200,07),
(10011,'mike','经理','1004','2008-10-25',8500,4100,01),
(10012,'murray','经理','1002','2013-06-23',8800,5400,04),
(10013,'join','经理','1003','2009-12-12',7600,2100,09)
create table tb_superior(
mgr nvarchar(32) primary key,
suname nvarchar(16) not null
)
insert into tb_superior values
(1001,'BLAKE'),
(1002,'11111'),
(1003,'22222'),
(1004,'33333')
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(16) not null,
Location nvarchar(32)
)
--Deptno 部门编号   Deptname 部门名称   Location 地址
INSERT INTO tb_dept VALUES
(01,'SALES','1厂'),
(02,'SMITH','lenden'),
(03,'vwx','NEW YORK'),
(04,'abc','2厂'),
(05,'def','3厂'),
(06,'ghi','5厂'),
(07,'jkl','6厂'),
(08,'mno','4厂'),
(09,'pqr','7厂'),
(10,'stu','8厂')
select * from tb_emp
--1.查询部门名称是‘SALES’的员工信息
select * from tb_emp,tb_dept 
where tb_dept.deptname = 'SALES'
and tb_emp.deptno=tb_dept.deptno
--2.查询公司中薪水最高的员工信息
select * from tb_emp where sal=(
select max(sal) from tb_emp)
--3.查询各部门中最高薪水的员工编号，姓名…
select emono,ename,deptno from tb_emp where sal in (
select max(sal) from tb_emp group by deptno)
--4.查询各部门最高薪水的员工信息
select * from tb_emp where sal in(
select max(sal) from tb_emp group by deptno)
--5.查询薪水大于该部门平均薪水的员工信息
select * from tb_emp where sal>any(
select avg(sal)from tb_emp group by deptno)
--6.查询部门名称是‘SALES’的员工信息
select * from tb_emp,tb_dept 
where tb_dept.deptname='SALES'
and tb_emp.deptno=tb_dept.deptno
--7.查询领导者是‘BLAKE’的员工信息
select * from tb_emp,tb_superior where tb_superior.suname='BLAKE'
and tb_emp.mgr=tb_superior.mgr
--8.查询和SMITH工作相同的员工信息
select * from tb_emp,tb_dept where tb_dept.deptname='SMITH'
and tb_emp.deptno=tb_dept.deptno
--9.查询平均工资比10部门低的部门编号
select e.deptno from tb_emp e group by e.deptno having avg(sal)<(
select sal from tb_emp where deptno='10')
--10.查询在NEW YORK工作的所有员工
select * from tb_emp where tb_emp.deptno in(
select deptno from tb_dept where Location='NEW YORK')
--11.查询10号部门的员工在整个公司中所占的比例
--12、查询比普通员工的最高薪水还要高的领导者姓名
--13、找出薪水最高的五个人
select top 5 * from tb_emp order by sal desc
--14、列出至少有三个员工的所有部门和部门信息
--15、查询最后入职的5名员工
select top 5*from tb_emp order by hiredate desc
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
--17、列出各种工作的最低工资以及从事该工作的雇员姓名
select ename,sal from tb_emp where sal in(
select e.job,min(e.sal) from tb_emp e group by e.job)
--18、求薪水最低的部门经理所在部门的名称
select deptname from tb_dept where deptno in(
select e.deptno from tb_emp e where e.sal =(
select min(sal) from tb_emp where job='经理'))
