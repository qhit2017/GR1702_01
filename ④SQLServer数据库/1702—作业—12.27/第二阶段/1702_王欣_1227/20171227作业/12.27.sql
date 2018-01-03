CREATE database db_emp
---雇员信息表
CREATE table tb_emp(
empno nvarchar(32)primary key,
ename nvarchar(16)not null,
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal decimal(8,4),
COMM money,
deptno nvarchar(16),
foreign key (deptno)references tb_dept(deptno))
INSERT INTO tb_emp VALUES
('20170101','张三','推销员','01','2011-1-4',2000,500,'10'),
('20170102','胡歌','经理','02','2002-11-14',5000,1000,'20'),
('20170103','刘毅换','推销员','01','2015-3-27',800,1000,'30'),
('20170104','吴亦凡','推销员','02','2016-5-1',950,100,'20'),
('20170105','霍尊','推销员','02','2012-12-4',2150,350,'20'),
('20170106','BLAKE','经理','01','2018-1-2',8000,2000,'30'),
('20170107','SMITH','推销员','01','2017-7-1',1800,100,'10'),
('20170108','赵奕欢','推销员','02','2013-6-30',3600,400,'20'),
('20170109','邓紫棋','推销员','01','2010-4-4',4200,200,'30'),
('20170110','拉扎尔','推销员','02','2011-1-6',7800,0,'30')
---部门表
CREATE table tb_dept(
deptno nvarchar(16)primary key,
deptname  nvarchar(16),
location nvarchar(16))
INSERT INTO tb_dept VALUES
('10','SALES','上海'),
('20','RD','NEW YORK'),
('30','MD','北京')
--1.查询部门名称是‘SALES’的员工信息
SELECT*FROM tb_dept where deptname='SALES'
--2.查询公司中薪水最高的员工信息
SELECT*FROM tb_emp where sal =(SELECT MAX(sal)from tb_emp) 
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT deptno,ename FROM tb_emp where sal =(SELECT MAX(sal)from tb_emp) 
--4.查询各部门最高薪水的员工信息
  SELECT*FROM tb_emp where sal in(SELECT MAX(sal)from tb_emp group BY deptno) 
--5.查询薪水大于该部门平均薪水的员工信息
SELECT*FROM tb_emp where sal>(SELECT AVG(sal)from tb_emp ) 
--6.查询部门名称是‘SALES’的员工信息
SELECT*FROM tb_dept where deptname='SALES'
--7.查询领导者是‘BLAKE’的员工信息
SELECT*FROM tb_emp where ename='BLAKE' 
--8.查询和SMITH工作相同的员工信息 
SELECT ename from tb_emp where job =(
SELECT job from tb_emp where ename='SMITH')
--9.查询平均工资比10部门低的部门编号
SELECT em.deptno as 部门编号,avg(em.sal) 
FROM tb_emp em 
group BY em.deptno 
HAVING AVG(em.sal)<'10'
--10.查询在NEW YORK工作的所有员工
SELECT*FROM tb_dept where location='NEW YORK'
--11.查询10号部门的员工在整个公司中所占的比例：
 
--12、查询比普通员工的最高薪水还要高的领导者姓名
 SELECT em.ename from tb_emp em where em.sal>(
 SELECT MAX(em.sal) from tb_emp em where deptno=MAX(em.sal))
--13、找出薪水最高的五个人 
--14、列出至少有三个员工的所有部门和部门信息
--15、查询最后入职的5名员工
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
--17、列出各种工作的最低工资以及从事该工作的雇员姓名
--18、求薪水最低的部门经理所在部门的名称
