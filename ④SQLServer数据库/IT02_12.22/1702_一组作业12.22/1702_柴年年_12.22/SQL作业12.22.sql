create database db_emp
create table tb_emp(
empno char(11) primary key ,--工号
ename char(16),--姓名
deptno char(16),--部门
job char(8),--职位
sal decimal (8,4), --薪水
comm money,--奖金
diredate date,--受雇日期
sex char(4) check(sex='男' or sex='女') default '男'--性别
)
insert into tb_emp 
values (1,'张三','30','员工',1000,50,'2017-08-01','男'),
(2,'李四','30','员工',1500,80,'2016-09-01','女'),
(3,'王二','30','办事员',2000,60,'2015-11-01','男'),
(4,'麻子','30','办事员',2500,90,'2014-12-01','男'),
(5,'张大炮','20','办事员',5300,2500,'2013-01-13','女'),
(6,'曾祥顺','20','办事员',5400,3000,'2012-01-14','女'),
(7,'王帅杰','30','经理',5500,3500,'2011-01-15','男'),
(8,'孙敬虔','30','经理',6200,4000,'2010-01-16','男'),
(9,'李继光','30','经理',6300,4500,'2009-01-17','男'),
(10,'王琪','研发部','经理',6400,5000,'2008-01-18','男'),
(11,'Tom','20','员工',6500,5500,'2007-01-19','男'),
(12,'jiory','20','员工',6600,6000,'2006-01-20','女'),
(13,'mory','20','办事员',6700,6500,'2005-01-21','男'),
(14,'keke','20','经理',6800,7000,'2004-01-22','女'),
(15,'ken','20','经理',6900,7500,'2003-01-23','男'),
(16,'刘备','20','经理',7000,8000,'2002-01-24','女'),
(17,'诸葛亮','10','员工',7100,8500,'2001-01-25','男'),
(18,'董卓','10','员工',7200,8600,'2000-01-26','男'),
(19,'貂蝉','10','办事员',7300,8700,'2017-02-27','女'),
(20,'吕布','10','办事员',7400,8800,'2017-03-28','男'),
(21,'张飞','10','办事员',7500,8900,'2017-04-29','女'),
(22,'关羽','10','办事员',7600,9000,'2017-05-30','女'),
(23,'马超','10','经理',7700,9100,'2017-06-01','男'),
(24,'夏侯淳','10','经理',7800,9200,'2017-07-01','男')


--1  选择部门30中的所有员工。
select*from tb_emp where deptno='30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
select ename,empno,deptno from tb_emp where job='办事员'
--3  找出奖金高于薪金的员工。
select *from tb_emp where comm>sal
--4  找出奖金高于薪金60%的员工。
select top 60  percent * from tb_emp where comm>sal
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
select * from tb_emp where deptno='10' and job='经理' or deptno='20' and job='办事员'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
--以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
select * from tb_emp 
where deptno='10' and job='经理' or deptno='20' and job='办事员'
or deptno='10' and job!='经理' and job!='办事员'
or deptno='20' and job!='经理' and job!='办事员'
or deptno='30' and job!='经理' and job!='办事员'
and comm>=2000
--7  找出有奖金的员工的不同工作。
select ename,comm,job from tb_emp where not comm is null
--8  找出没有奖金或奖金低于100的员工。
select * from tb_emp where comm is null or comm<100
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
select deptno,AVG(sal) from tb_emp group by deptno order by AVG(sal)desc
--10  找出早于2012年前受雇的员工。
select * from tb_emp where year(diredate)<2012
--11 查询公司员工薪水总数。
select SUM(sal) as 薪水总数 from tb_emp 
--12  显示正好为5个字符的员工的姓名。
select ename from tb_emp where ename='_____'
--13  显示不带有'R'的员工的姓名。
select ename from tb_emp where ename not like '%R%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
select deptno,COUNT(job) as 人数 from tb_emp 
group by deptno order by COUNT(job) desc
--15  查询每个部门女员工的人数。
select deptno,COUNT(job) as 人数 from tb_emp 
where sex='女' group by deptno 
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
select ename,diredate from tb_emp 
where YEAR(diredate)>2007 and YEAR(diredate)<2017  
--17  显示员工的详细资料，按姓名排序。
select * from tb_emp order by ename asc 
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
select ename,diredate from tb_emp order by diredate asc 
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
select ename,job,sal,comm from tb_emp order by job desc,sal,comm   
--20  查询员工薪水高于平均值的员工信息。
select * from tb_emp where sal >(SELECT AVG(sal) FROM tb_emp )
--21 查询每个员工总收入（总收入包括奖金和薪水）。
select ename,SUM(sal+comm) as 总收入 from tb_emp group by ename 
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
select deptno,job,AVG(comm) as 平均奖金,AVG(sal) as 平均薪水 
from tb_emp group by deptno,job 
--23 查询员工姓名，重复的姓名只出现一次。
select DISTINCT ename from tb_emp 
--24  查询员工姓名不重复的员工信息。
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
select ename from tb_emp where ename like '%A%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
--27  查询所有员工工资都在900～3000之间的部门信息。
select ename,deptno from tb_emp where sal>900 AND sal<3000
--28  查询每个职位的最低工资，并按照工资进行升学排序。
select job,MIN(sal) as 最低工资 from tb_emp 
group by job order by MIN(sal) asc