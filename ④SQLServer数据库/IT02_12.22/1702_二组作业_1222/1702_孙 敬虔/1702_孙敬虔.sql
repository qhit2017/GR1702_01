CREATE database db_emp
USE db_emp
create table tb_emp(
empno nvarchar(32)primary key,
ename nvarchar(16)not null,
deptno nvarchar(16),
job nvarchar(16),
sal smallint,
comm money,
hiredate date,
Sex nvarchar(2)check(Sex='男'or Sex='女')
)
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,
Sex )
VALUES
('02','王一','10','经理',2000,300,'2017-05-12','女'),
('05','李二','10','经理',2000,300,'2010-05-12','男'),
('03','王老三','20','办事员',2000,300,'2013-04-13','男'),
('04','王老四','20','办事员',2000,300,'2007-10-22','男'),
('06','孙杰','20','经理',2000,300,'2014-07-19','女'),
('07','李杰','30','办事员',2000,300,'2012-01-29','男'),
('08','王云','30','办事员',2000,300,'2011-05-15','女'),
('09','王小云','30','经理',2000,300,'2010-08-12','女'),
('10','王老五','30','经理',2000,300,'2012-03-19','男')
SELECT * FROM tb_emp
--选择部门30中的所有员工
SELECT * FROM tb_emp where deptno ='30'
--列出所有办事员的姓名，雇员编号和部门编号
SELECT ename,empno,deptno from tb_emp where job='办事员'
--找出奖金高于薪金的员工
SELECT * FROM tb_emp where sal<comm
--找出奖金高于薪金60%的员工
--找出部门10中所有经理和部门20中所有办事员的详细资料
SELECT * FROM tb_emp where deptno='10'
--找出部门10中所有经理，部门20中所有办事员，以及所有部门中即不是经理又不是办事员
--但薪金大于或等于2000的所有员工的详细资料。
SELECT * FROM tb_emp where 
(deptno = '20'AND job = '办事员') 
or job not IN ('经理','办事员')                                          
OR sal>=2000
--找出有奖金的员工的不同工作。
SELECT job from tb_emp where comm IS NOT null GROUP BY  job 
--找出没有奖金或奖金低于100的员工。
SELECT * FROM tb_emp where comm<100 OR comm IS NULL  
--查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT deptno, avg(sal)as 平均薪水 from tb_emp GROUP BY deptno order by avg(sal) desc
--找出早于2012年前受雇的员工。
SELECT * FROM tb_emp where year(hiredate)<2012 
--查询公司员工薪水总数。
select SUM(sal)as 薪水总数 from tb_emp 
--显示正好为5个字符的员工的姓名。
--显示不带有'R'的员工的姓名。
SELECT ename from tb_emp where ename not LIKE '%R%'
--查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
SELECT deptno,COUNT(ename)as 员工人数 from tb_emp group by deptno ORDER BY COUNT(ename)
--查询每个部门女员工的人数。
SELECT deptno,COUNT(Sex)as 女员工人数 from tb_emp  where Sex='女' GRoup by deptno
--显示2007年到2017年之前入职的员工的姓名和受雇日期。 
SELECT ename , hiredate from tb_emp where YEAR(hiredate)>=2007 AND YEAR(hiredate)<=2017
--显示员工的详细资料，按姓名排序。
SELECT * FROM tb_emp  ORDER by ename
--显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT ename,hiredate  from tb_emp ORDER by year(hiredate)
--显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。查询员工薪水高于平均值的员工信息。
--查询每个员工总收入（总收入包括奖金和薪水）。
SELECT ename , sal+comm as 总收入 from tb_emp  
--查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
--查询员工姓名，重复的姓名只出现一次。
SELECT distinct(ename) from tb_emp 
 
