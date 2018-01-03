create database db_Emp
--emp表是雇员信息表 
--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--job 员工的工作是什么比如推销员，经理等
--mgr 上级编号
--hiredate受雇日期
--sal工资
--comm奖金
--deptno部门编号
create table tb_emp(
empno nvarchar(32) primary key, ---员工编号
ename nvarchar(16) not null,    ---员工姓名
job nvarchar(32), ---员工的工作
mgr nvarchar(32), ---上级编号
hiredate nvarchar(32),---受雇日期
sal decimal(10,4), ---工资
comm money,   ---奖金
deptno nvarchar(32), ---部门编号
foreign key(deptno) references tb_dept(deptno),
foreign key(mgr) references tb_superior(mgr)
)
--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址
create table tb_dept(
deptno nvarchar(32) primary key,---部门编号
deptname nvarchar(32),   ---部门名称
location nvarchar(32)   ---地址
)
---上级表
create table tb_superior(
mgr nvarchar(32) primary key,
supname nvarchar(16) not null,
salary money
)

insert into tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
values(001,'SMITH','经理',1,'2014-2-1',1500,340,01),
      (002,'toto','SMITH',1,'2013-2-1',4500,1040,01),
      (003,'koko','员工',1,'2012-2-1',5500,1500,01),
      (004,'jojo','经理',2,'2011-2-1',6500,100,02),
      (005,'妞妞','推销员',2,'2010-2-1',1000,150,02),
      (006,'颖宝','经理',2,'2017-2-1',3500,300,02),
      (007,'大毛','员工',3,'2001-2-1',3500,340,03),
      (008,'小毛','推销员',3,'2007-2-1',5500,140,03),
      (009,'大豆','经理',4,'2008-2-1',1000,150,04),
      (010,'毛豆','推销员',4,'2010-10-1',4600,1500,04),
      (011,'小小','经理',5,'2009-2-1',2500,340,05),
      (012,'兔兔','员工',5,'2015-2-1',2500,250,05),
      (013,'coco','推销员',6,'2017-10-11',1500,1000,06),
      (014,'BoBo','经理',6,'2015-4-1',4500,140,06),
      (015,'QQ','推销员',6,'2014-10-10',5500,300,06)

insert into tb_dept(deptno,deptname,location)
values(01,'10','上海'),
      (02,'SALES','北京'),
      (03,'NEW YORK','杭州'),
      (04,'20','苏州'),
      (05,'30','澳门'),
      (06,'40','河南')

insert into tb_superior(mgr,supname,salary)
values(1,'张大大',7500),
      (2,'BLAKE',6000),
      (3,'赵丽颖',5000),
      (4,'大张伟',4500),
      (5,'baby',7000),
      (6,'kimm',5500)
-----------------------------------------------------      
--1.查询部门名称是‘SALES’的员工信息 
select * from tb_dept de,tb_emp em
 where de.deptname ='SALES' 
    and de.deptno = em.deptno 
--2.查询公司中薪水最高的员工信息 
select * from tb_emp where sal=(select MAX(sal) from tb_emp )  
--3.查询各部门中最高薪水的员工编号，姓名… 
select em.empno,em.ename,em.sal from tb_emp em where em.sal  in(
 SELECT MAX(em.sal) from tb_emp em group by em.deptno
 )                            
--4.查询各部门最高薪水的员工信息 
select * from tb_emp em where em.sal  in(
 SELECT MAX(em.sal) from tb_emp em group by em.deptno
 ) 
--5.查询薪水大于该部门平均薪水的员工信息  
select * from tb_emp em
 WHERE em.sal>ANY(select AVG(em.sal) from tb_emp em group by em.deptno 
 )
--6.查询部门名称是‘SALES’的员工信息 
select * from tb_dept de INNER JOIN  tb_emp EM
 ON DE.deptno=EM.deptno
  where de.deptname ='SALES'
--7.查询领导者是‘BLAKE’的员工信息
SELECT * FROM tb_emp em where em.mgr IN(
 SELECT su.mgr from tb_superior su WHERE su.supname='BLAKE'
 )
--8.查询和SMITH工作相同的员工信息 
SELECT * FROM tb_emp WHERE job='SMITH'
--9.查询平均工资比10部门低的部门编号 
select em.deptno from tb_emp em
 group by em.deptno
  HAVING AVG(em.sal)  < any(select AVG(em.sal)
   from tb_emp em INNER JOIN tb_dept de ON em.deptno=de.deptno
    WHERE de.deptname='10')
--10.查询在NEW YORK工作的所有员工 
SELECT * from  tb_emp em WHERE EM.deptno IN(
 select de.deptno from tb_dept de WHERE de.deptname='NEW YORK'
 )
--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名
SELECT SU.supname FROM tb_superior SU
 WHERE SU.salary >any (SELECT MAX(EM.sal) FROM tb_emp EM )
--13、找出薪水最高的五个人 
SELECT TOP 5 sal,ename FROM tb_emp order BY sal desc 
--14、列出至少有三个员工的所有部门和部门信息
SELECT * from tb_dept de
 WHERE de.deptno IN(
 SELECT em.deptno FROM  tb_emp em  GROUP BY em.deptno HAVING COUNT(em.empno)>=3
 )
--15、查询最后入职的5名员工
SELECT TOP 5 EM.hiredate,EM.ename FROM tb_emp EM ORDER BY EM.hiredate DESC
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
SELECT EEN.job ,COUNT(EEN.empno) AS 人数 FROM tb_emp EEN GROUP BY job HAVING EEN.job IN(
SELECT EM.job FROM tb_emp EM GROUP BY EM.job HAVING MIN(EM.sal) > 1500)
--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称
 SELECT DE.deptname FROM tb_dept DE WHERE DE.deptno IN(
  SELECT EeM.deptno FROM tb_emp EeM  WHERE EeM.job='经理' and EeM.sal =(
    SELECT MIN(EM.sal) FROM tb_emp EM WHERE EM.job='经理' ) )
