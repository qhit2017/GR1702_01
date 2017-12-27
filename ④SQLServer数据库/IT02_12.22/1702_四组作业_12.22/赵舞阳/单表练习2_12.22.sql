CREATE database db_wy
CREATE table tb_emp(
empno nvarchar(32)primary key,
ename char(16)not null,
deptno char(16)not null,
job char(16),
sal money,
comm money,
hiredate date,
sex char(16)check (sex='boy' or sex='girl')
)
--查看表结构
sp_help tb_emp
--插入表数据
INSERT INTO tb_emp VALUES
('201701','张静','10','CLERK',1000,100,'2007-5-13','girl'),
('201702','张晓倩','30','CLERK',900,50,'2017-5-3','girl'),
('201703','王五无','20','MANAGER',4000,500,'2009-1-13','boy'),
('201704','六天奥','10','CLERK',1100,150,'2012-12-28','boy'),
('201705','余罪','10','CLERK',1500,50,'2014-3-19','boy'),
('201706','甫士忍','20','CLERK',1250,250,'2011-9-30','boy'),
('201707','关于','30','CLERK',800,50,'2015-12-31','girl'),
('201708','曹孟德','30','MANAGER',5000,500,'2007-1-1','boy'),
('201709','张翼德','30','CLERK',1950,650,'2016-5-23','boy'),
('201710','乔大','20','CLERK',1000,150,'2015-5-4','girl'),
('201711','孙尚香','20','CLERK',1050,150,'2014-1-13','girl'),
('201712','貂蝉','10','CLERK',2000,650,'2013-7-28','girl'),
('201713','吕奉先','10','MANAGER',9000,1000,'2007-7-13','boy'),
('201714','刘红','20','CLERK',700,100,'2017-1-13','girl'),
('201715','mary','10','CLERK',1850,350,'2016-4-24','girl'),
('201716','Jack','30','CLERK',2000,600,'2011-5-13','boy')
INSERT INTO tb_emp (empno,ename,deptno,sal,comm,hiredate,sex) VALUES
('201718','tom','10',2000,1000,'2017-12-24','boy')
INSERT INTO tb_emp VALUES
('201717','mark','10','CLERK',800,1000,'2017-12-24','boy')
--查询表中数据
SELECT * from tb_emp
--1选择部门30中的所有员工。
select * FROM tb_emp where deptno='30'
--2列出所有办事员（CLERK）的姓名，雇员编号和部门编号。 
SELECT ename 姓名,empno 雇员编号,deptno 部门编号 from tb_emp where job='CLERK'
--3找出奖金高于薪金的员工。
SELECT ename 姓名 FROM tb_emp where comm>sal
--4找出奖金高于薪金60%的员工。
SELECT top 60 percent sal,ename 姓名 FROM tb_emp where comm>sal 
--5找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
SELECT * FROM tb_emp where job='MANAGER' AND deptno='10' OR job='CLERK' AND deptno='20'
--6找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。 
SELECT * FROM tb_emp where job='MANAGER' AND deptno='10' OR job='CLERK' AND deptno='20' OR deptno='10' and job NOT IN ('MANAGER','CLERK') AND sal>=2000
--7找出有奖金的员工的不同工作。
SELECT ename 员工,deptno 部门 FROM tb_emp where comm is NOT null
--8找出没有奖金或奖金低于100的员工。
SELECT ename 员工,comm 奖金 FROM tb_emp where comm is NOT null and comm<100
--9查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT avg(sal) 平均薪水,deptno 部门名 FROM tb_emp
group BY deptno
ORDER BY avg(sal)
desc
--10找出早于2012年前受雇的员工。
SELECT ename 员工,hiredate 日期 FROM tb_emp where hiredate<'2012-1-1'
--11查询公司员工薪水总数。 
SELECT SUM(sal) 薪水总数 from tb_emp
--12显示正好为5个字符的员工的姓名。
select ename 姓名 FROM tb_emp where ename LIKE'_____' and LEN(ename)=5
--13显示不带有'R'的员工的姓名。 
SELECT ename 姓名 from tb_emp where ename NOT like'%R%'
--14查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
SELECT avg(ename) 员工人数,deptno 部门名 FROM tb_emp
group BY deptno
ORDER BY AVG(ename)
desc
--15查询每个部门女员工的人数。
SELECT count(sex) 人数 FROM tb_emp where sex = 'girl'
--16显示2007年到2017年之前入职的员工的姓名和受雇日期。 
select ename,hiredate from tb_emp where year(hiredate)>2007 and YEAR(hiredate)<2017
--17显示员工的详细资料，按姓名排序。 
SELECT * FROM tb_emp order BY ename asc
--18显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。 
SELECT ename 姓名,hiredate 受雇日期 FROM tb_emp order BY hiredate asc
--19显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。 
select ename 姓名,job 工作,sal 薪金 from tb_emp order by job desc,sal
--20查询员工薪水高于平均值的员工信息。
select*from tb_emp
where comm>(select AVG(comm)from tb_emp) 
--21查询每个员工总收入（总收入包括奖金和薪水）。
 select ename,SUM(sal+comm)as 总收入 from tb_emp group by ename  
--22查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
select AVG(comm)as 平均奖金,AVG(sal)as 平均薪水,deptno as 部门,job as 职位 from tb_emp group by deptno,job 
--23查询员工姓名，重复的姓名只出现一次。
select distinct ename from  tb_emp 
--24查询员工姓名不重复的员工信息。
SELECT * from tb_emp where ename LIKE tb_emp.ename
select * from tb_emp where ename in(
select ename from  tb_emp group by ename having COUNT(*)<2)
--25显示姓名字段的任何位置包含'A'的所有员工的姓名。 
select*from tb_emp where ename like'%a%' 
--26查询员工姓名重复的员工，显示人员姓名、重复条数。
select ename ,count(1)as 重复条数 from tb_emp group by ename having COUNT(1)>=2
--27查询所有员工工资都在900～3000之间的部门信息。
select*from tb_emp where sal>900 and sal<3000
--28查询每个职位的最低工资，并按照工资进行升学排序。
select job as 职位,min(sal)as 最低工资 from tb_emp group by job order by min(sal) 