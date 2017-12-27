USE db_employee
CREATE table tb_company(
empno char(16)primary key,
ename nvarchar(32)not null,
deptno nvarchar(50),
job nvarchar(16),
sal smallint,
comm smallint,
hiredate datetime,
sex nvarchar(5) check (sex='boy'or sex='girl')  )
sp_help tb_company
SELECT * from tb_company
ALTER table tb_company drop PK__tb_compa__AF4C318A31EC6D26
INSERT INTO tb_company VALUES 

(1,'于和璧','研发部','经理',9000,9500,'2013-1-19','boy'),
(2,'孙寒','人事部','办事员',6000,500,'2014-5-21','boy'),
(3,'王迎阔','销售部','经理',7000,1500,'2007-6-27','boy'),
(4,'郑光达','研发部','办事员',8888,8888,'2017-12-25','boy'),
(5,'Arry','30','办事员',6000,500,'2005-11-24','girl'),
(6,'李小豪','人事部','办事员',6000,500,'2014-11-20','boy'),
(7,'曾祥顺','财务部','会计',6000,900,'2006-8-20','boy'),
(8,'李静静','10','办事员',6000,1500,'2014-11-22','girl'),
(9,'李少庆','20','办事员',2200,800,'2014-8-20','boy'),
(10,'杨雪婷','销售部','办事员',6000,700,'2004-11-2','girl'),
(11,'lily','销售部','办事员',6000,800,'2014-11-20','girl'),
(12,'孔于辉','研发部','委员',3300,300,'2004-5-21','boy'),
(13,'王帅杰','研发部','办事员',6000,500,'2014-11-20','boy'),
(14,'mike','研发部','办事员',6600,600,'2014-11-20','boy'),
(15,'盛名春','生产技术部','办事员',8800,500,'2014-11-20','boy'),
(16,'古国鑫','10','经理',4400,500,'2012-11-20','boy'),
(17,'John','人事部','办事员',5500,500,'2014-11-20','boy'),
(18,'John','生产技术部','办事员',7000,500,'2014-11-20','boy'),
(19,'John','人事部','办事员',9000,100,'2014-11-20','boy'),
(20,'梁营营','20','办事员',8000,300,'2015-11-20','girl'),
(21,'赵舞阳','人事部','办事员',4000,700,'2017-11-20','boy'),
(22,'Johnaon ','安全监察部','委员',3000,500,'2014-11-20','boy'),
(23,'李永利','人事部','办事员',6000,500,'2014-11-20','boy'),
(24,'Maria','安全监察部','办事员',7000,500,'2014-11-20','girl'),
(25,'刘天伟','人事部','委员',6000,500,'2014-11-20','boy'),
(26,'夏杰','安全监察部','办事员',6000,500,'2013-11-20','boy'),
(27,'mary','安全监察部','办事员',7000,1100,'2012-11-20','girl'),
(28,'Jason','生产技术部','办事员',7000,0,'2014-11-20','boy'),
(29,'王欣','人事部','办事员',9000,500,'2015-11-20','girl'),
(30,'李小豪','人事部','办事员',6000,500,'2014-11-20','boy')


select * FROM  tb_company

----1  选择部门30中的所有员工。

SELECT ename AS 员工 FROM tb_company where deptno='30'

----2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。

SELECT ename ,empno, deptno FROM tb_company  WHERE job='办事员'
----3  找出奖金高于薪金的员工。

SELECT ename  from tb_company where comm >sal 

----4  找出奖金高于薪金60%的员工。

 SELECT ename  from  tb_company where comm >sal*(1+0.6)
 
----5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。

select * from tb_company where (deptno='10'and job='经理') or (deptno='20'and job='办事员')

----6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
----以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。

select * from tb_company 
where (deptno='10'and job='经理') or (deptno='20'and job='办事员')
or (job NOT IN ('经理','办事员')and sal>=2000)

----7  找出有奖金的员工的不同工作。 

select job as 工作 from tb_company where comm is not null group BY job
----8  找出没有奖金或奖金低于100的员工。

select ename from tb_company where comm is null or comm <100
----9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。

 select AVG (sal) as 平均薪水,deptno as 部门名 from tb_company group by deptno order by avg(sal) desc
----10  找出早于2012年前受雇的员工。

select ename ,hiredate from tb_company where hiredate < '2012'
----11 查询公司员工薪水总数

select  sum(sal) from tb_company  
----12  显示正好为5个字符的员工的姓名。 
  
SELECT ename from tb_company where ename like '_____%' and len(ename) = 5
---- 13  显示不带有'R'的员工的姓名。

select  ename from tb_company where ename NOT LIKE'%R%'
----14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。

select COUNT (deptno)as 员工人数,deptno from tb_company group  by  deptno order by count (deptno) desc
----15  查询每个部门女员工的人数。  

SELECT deptno ,count(ename) from tb_company where sex='girl' group by deptno
----16  显示2007年到2017年之间入职的员工的姓名和受雇日期。

 select ename as 姓名,hiredate as 受雇日期 from tb_company 
 where hiredate between 2007 and 2017 
----17  显示员工的详细资料，按姓名排序。

 select * from tb_company order by ename 
----18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。

 select ename ,hiredate from   tb_company order by  hiredate
----19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
 
 select*FROM  tb_company ORDER BY job DESC ,sal 
----20  查询员工薪水高于平均值的员工信息。

select * from tb_company where sal > (select AVG (sal) from tb_company )
----21  查询每个员工总收入（总收入包括奖金和薪水）。

 select sum(sal+comm) as 总收入 ,ename as 姓名 from tb_company group by ename 
----22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。

 select avg(comm) as 平均奖金,AVG (sal) as 平均薪水,deptno as 部门,job as 职位 from tb_company group by job ,deptno order by avg(comm) , AVG (sal),deptno
----23  查询员工姓名，重复的姓名只出现一次。

select distinct(ename)from tb_company 
----24  查询员工姓名不重复的员工信息。
           
select  distinct( ename )from tb_company  where ename is not null
----25  显示姓名字段的任何位置包含'A'的所有员工的姓名。 

select  ename from tb_company where ename LIKE'A%'OR ename ='_A%'OR ename ='___A%'
----26  查询员工姓名重复的员工，显示人员姓名、重复条数。 

SELECT ename ,COUNT(ename) from  tb_company group BY ename 
HAVING COUNT(ename)>1 
ORDER BY COUNT(ename) desc
----27  查询所有员工工资都在900～3000之间的部门信息。

select ename ,sal from tb_company  where sal between 900 and 3000
----28  查询每个职位的最低工资，并按照工资进行升学排序。

select  job,min(sal) from tb_company group by job order by MIN (sal)asc

