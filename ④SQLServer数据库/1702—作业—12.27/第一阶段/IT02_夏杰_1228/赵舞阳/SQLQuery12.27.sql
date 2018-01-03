CREATE database db_emp
USE db_emp
CREATE table tb_employee(
empno nvarchar(32)primary key,
ename nvarchar(16)not null,
job nvarchar(32),
mgr char(32),
hiredate date,
sal money,
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_dept(deptno)
)
CREATE table tb_dept(
deptno nvarchar(32)primary key,
deptname nvarchar(16),
location nvarchar(50)
)
INSERT INTO tb_employee VALUES
('20170101','张三','推销员','01','2011-1-4',2000,500,'10'),
('20170102','胡歌','经理','02','2002-11-14',5000,1000,'20'),
('20170103','刘毅换','推销员','01','2015-3-27',800,1000,'10'),
('20170104','吴亦凡','推销员','02','2016-5-1',950,100,'20'),
('20170105','霍尊','推销员','02','2012-12-4',2150,350,'20'),
('20170106','BLAKE','经理','01','2018-1-2',8000,2000,'30'),
('20170107','SMITH','推销员','01','2017-7-1',1800,100,'10'),
('20170108','赵奕欢','推销员','02','2013-6-30',3600,400,'20'),
('20170109','邓紫棋','推销员','01','2010-4-4',4200,200,'10'),
('20170110','拉扎尔','推销员','02','2011-1-6',7800,0,'20')
INSERT INTO tb_dept VALUES
('10','SALES','上海'),
('20','RD','北京'),
('30','RDB','杭州')
--1.查询部门名称是‘SALES’的员工信息 
SELECT * from tb_employee em 
where em.deptno IN(
	SELECT de.deptno
	from tb_dept de
	where deptname ='SALES'
	AND em.deptno=de.deptno)
--2.查询公司中薪水最高的员工信息 
SELECT * from tb_employee where sal IN(
SELECT max(sal) from tb_employee)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT empno 员工编号,ename 姓名,deptno 部门 from tb_employee where sal IN(
SELECT max(sal) from tb_employee
group BY deptno)
--4.查询各部门最高薪水的员工信息 
SELECT * from tb_employee where sal IN(
SELECT max(sal) from tb_employee
group BY deptno)
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT sal,deptno from tb_employee group by deptno, sal HAVING sal>any(
SELECT avg(sal) from tb_employee group BY deptno)
--6.查询部门名称是‘SALES’的员工信息 

--7.查询领导者是‘BLAKE’的员工信息 

--8.查询和SMITH工作相同的员工信息 
--9.查询平均工资比10部门低的部门编号 
--10.查询在NEW YORK工作的所有员工 
--11.查询10号部门的员工在整个公司中所占的比例： 
--12、查询比普通员工的最高薪水还要高的领导者姓名 
--13、找出薪水最高的五个人 
select TOP 5 sal 薪水 from tb_employee order BY sal desc
--14、列出至少有三个员工的所有部门和部门信息
--15、查询最后入职的5名员工
select TOP 5 hiredate 入职时间 from tb_employee order BY hiredate desc
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
--17、列出各种工作的最低工资以及从事该工作的雇员姓名
--18、求薪水最低的部门经理所在部门的名称
SELECT deptno from tb_dept where deptno in(
SELECT min(sal) from tb_employee where job='经理')