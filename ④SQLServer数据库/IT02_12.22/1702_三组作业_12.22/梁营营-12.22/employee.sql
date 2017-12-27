--切换数据库
USE db_employee
--创建数据库
CREATE database db_employee
--创建表结构
CREATE table tb_employee(
empno char(16) primary key,
ename nvarchar(10) not null,
deptno nvarchar(16),
job nvarchar(16) ,
sal money ,
comm decimal(8,4),
hiredate date,
sex char(10) check(sex='man' or sex='woman')
)
--查看表结构
sp_help tb_employee

--插入多条记录
INSERT INTO tb_employee(empno,ename,deptno,job,sal,comm,hiredate,sex) 
VALUES ('001','Lily','10','CLERK',5000,6300,'2001-12-04','woman'),
('002','Tom','20','MANAGER',5500,4500,'2006-10-13','man'),
('003','Jason','30','CLERK',3500,2300,'2014-06-26','man'),
('004','Mary','40','CLERK',4000,3000,'2012-08-16','woman'),
('005','Walker','50','MANAGER',4600,5200,'2015-10-22','man'),
('006','Wilson','60','CLERK',4100,2300,'2008-09-10','man'),
('007','King','70','MANAGER',5500,2000,'2016-12-12','man'),
('008','Johnson','80','CLERK',3500,2000,'2017-01-16','man'),
('009','Stewart','90','CLERK',4600,3000,'2004-07-26','man'),
('010','Powell','10','MANAGER',4400,2100,'2009-04-12','man'),
('011','perry','10','CLERK',2500,3000,'2003-05-17','man'),
('012','Marshall','20','MANAGER',8600,4200,'2012-08-14','man'),
('013','James','30','CLERK',3500,2000,'2014-05-19','man'),
('014','Long','40','MANAGER',4500,3000,'2015-06-13','man'),
('015','Rose','50','CLERK',2800,NULL,'2016-07-18','woman'),
('016','Rose','60','MANAGER',6800,2000,'2005-02-16','woman'),
('017','Vera','70','CLERK',3600,NULL,'2003-09-28','woman'),
('018','Starr','80','CLERK',2500,3000,'2015-06-27','woman'),
('019','Penny','90','MANAGER',5000,3200,'2014-09-15','woman'),
('020','Lacy','20','MANAGER',6400,3200,'2003-01-19','woman'),
('021','Ivy','10','CLERK',2300,85,'2002-05-21','woman'),
('022','Crace','20','MANAGER',5500,2500,'2016-03-25','woman'),
('023','Bess','30','CLERK',3600,NULL,'2017-06-23','woman'),
('024','Robinson','40','MANAGER',5600,3400,'2014-08-10','man'),
('025','Martinez','50','CLERK',4800,2400,'2004-10-23','man'),
('026','Sims','60','MANAGER',5900,2600,'2016-12-08','man'),
('027','Rogers','70','CLERK',4200,3000,'2009-07-06','man'),
('028','Peters','80','CLERK',1500,NULL,'2012-08-22','man'),
('029','Lawson','90','CLERK',3500,3600,'2013-09-01','man'),
('030','Kelly','30','CLERK',4000,3000,'2014-04-26','man')


--查看表中多条记录
SELECT * FROM tb_employee

--1、选择部门30中的所有员工
select * from tb_employee where deptno = '30'
--2、列出所有办事员（CLERK）的姓名，雇员编号和部门编号
select ename,empno,deptno from tb_employee where job = 'CLERK'
--3、找出奖金高于薪金的员工
select ename from tb_employee where sal < comm
--4、找出奖金高于薪金60%的员工
--5、找出部门10中所有经理(MANAGER)和部门20中所有办事员(CLERK)的详细资料
select * from tb_employee where deptno = '10' or deptno = '20' 
--6、找出部门10中所有经理(MANAGER),部门20中所有办事员(CLERK)的详细资料,以及所有
--   部门中既不是经理又不是办事员,但薪金大于或等于2000的所有员工的详细资料 
--7、找出有奖金的员工的不同工作
select ename,job from tb_employee where comm is not null
--8、找出没有奖金或奖金低于100的员工
select ename from tb_employee where comm is null or comm < 100
--9、查询每个部门的平均薪水和部门名,并按照薪水由高到低进行排序
select deptno,AVG(sal) as 平均薪水 from tb_employee group by deptno order by AVG(sal) desc
--10、找出早于2012年前受雇的员工
select ename from tb_employee where hiredate < '2012'
--11、查询公司员工薪水总数
select sum(sal)  as 薪水总数 from tb_employee
--12、显示正好为5个字符的员工的姓名
select ename from tb_employee where LEN (ename) = '5'
--13、显示不带有’R‘的员工的姓名
select ename from tb_employee where ename not like '%R%'
--14、查询每个部门员工人数和部门名,并按照员工人数进行降序排列
select deptno,COUNT(ename) as 员工人数 from tb_employee group by deptno order by COUNT(ename) desc
--15、查询每个部门女员工的人数
select  deptno, COUNT (ename) as 人数 from tb_employee where sex='woman' group by  deptno
--16、显示2007年到2017年之前入职的员工的姓名和受雇日期
select ename,hiredate from tb_employee where hiredate between '2007' and '2017'
--17、显示员工的详细资料,按姓名排序
select * from tb_employee order by ename 
--18、显示员工的姓名和受雇日期,根据其服务年限,将最老的员工排在最前面
select ename,hiredate from tb_employee order by hiredate 
--19、显示所有员工的姓名、工作和薪金,按工作的降序排列,若工作相同则按薪金排序
select ename,job,sal from tb_employee group by ename,job,sal order by job,sal desc
--20、查询员工薪水高于平均值的员工信息
select * from tb_employee where sal>(select AVG(sal) from tb_employee)
--select AVG(sal) from tb_employee (查询薪水平均值)
--21、查询每个员工总收入（总收入包括奖金和薪水） 不懂
select ename,SUM(sal+comm) from tb_employee group by ename
--22、查询每个部门不同职位的平均奖金,平均薪水,部门和职位名
select deptno,job,AVG(comm) as 奖金平均值, AVG(sal) as 薪水平均值 from tb_employee group by deptno,job
--23、查询员工姓名,重复的姓名只出现一次
select distinct(ename) from tb_employee 
--24、查询员工姓名不重复的员工信息
select * from tb_employee where ename 
--25、显示姓名字段的任何位置包含’A‘的所有员工的姓名
select ename from tb_employee where ename like '%A%'
--26、查询员工姓名重复的员工,显示人员姓名、重复条数
--27、查询所有员工工资都在900~3000之间的部门信息
select * from tb_employee where sal between 900 and 3000
--28、查询每个职位的最低工资,并按照工资进行升序排序
select job,MIN(sal) as 最低工资 from tb_employee  group by job order by job asc

