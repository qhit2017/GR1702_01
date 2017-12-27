CREATE database db_emp
CREATE table tb_emp(
---工号
empno tinyint primary key,
---姓名
ename nvarchar(10),
---部门
deptno nvarchar(20),
---职位
job nvarchar(20),
---薪水
sal decimal(10,4),
---奖金
comm money,
---受雇日期
hiredate date,
---性别
Sex nvarchar(4) check(Sex='男' or Sex='女')
)
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,Sex)
VALUES (001,'tom',10,'办事员',2500,3000,'2014-10-1','男'),
      (002,'Arry',10,'办事员',500,3000,'2011-8-1','女'),
      (003,'赵丽颖',20,'办事员',4500,3000,'2008-9-1','女'),
      (004,'ToTo',10,'经理',2500,5000,'2017-11-1','男'),
      (005,'coco',10,'办事员',2500,1000,'2012-8-1','女'),
      (006,'杨洋',20,'办事员',2000,3000,'2006-8-1','男'),
      (007,'鹿晗',10,'经理',2000,3000,'2005-11-11','男'),
      (008,'coco',20,'办事员',2500,2000,'2004-7-1','女'),
      (009,'张大大',10,'经理',2500,50,'2007-8-1','男'),
      (010,'大张伟',30,'办事员',2000,NULL,'2016-8-1','男'),
      (011,'张一山',30,'办事员',3500,3000,'2014-8-1','男'),
      (012,'天天',30,'经理',3000,1000,'2015-6-1','男'),
      (013,'Mary',10,'办事员',2600,700,'2013-8-1','女'),
      (014,'李宇春',30,'经理',2500,6000,'2012-10-10','女'),
      (015,'刘德华',10,'办事员',2000,5000,'2010-8-1','男'),
      (016,'糖宝',20,'经理',800,1000,'2011-8-11','女'),
      (017,'大宝',10,'员工',2000,2000,'2011-8-11','男'),
      (018,'baby',30,'员工',2500,3000,'2011-8-11','女'),
      (019,'杨阳洋',20,'员工',2000,2500,'2011-8-11','男'),
      (020,'土豆',10,'员工',2000,2000,'2011-8-11','女')
---1.选择部门30中的所有员工
SELECT * FROM tb_emp where deptno='30' 
---2.列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT  ename,empno,deptno from tb_emp where job='办事员'
---3.找出奖金高于薪金的员工。
SELECT * FROM tb_emp WHERE sal<comm
---4.找出奖金高于薪金60%的员工。
SELECT TOP 60 percent * from tb_emp where sal<comm
---5.找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
SELECT *  FROM tb_emp WHERE deptno='10' AND job='经理' or deptno='20' and job='办事员'
---6.找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
SELECT * FROM tb_emp where deptno='10' AND job='经理' or deptno='20' and job='办事员' OR  job!='经理'AND job!='办事员'  AND sal>=2000 AND comm>=2000
---7.找出有奖金的员工的不同工作。
SELECT job,ename,comm  FROM tb_emp where not comm is null 
---8.找出没有奖金或奖金低于100的员工。
SELECT * FROM tb_emp WHERE comm is null OR comm < 100
---9.查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT deptno,AVG(sal) as 平均薪水 FROM tb_emp group by deptno order by avg(sal) DESC 
---10.找出早于2012年前受雇的员工。
SELECT * FROM tb_emp WHERE YEAR(hiredate)<2012  
---11.查询公司员工薪水总数。
SELECT SUM(sal) as 薪水总数 FROM tb_emp   
---12.显示正好为5个字符的员工的姓名。
select ename from tb_emp where ename='_____'
---13.显示不带有'R'的员工的姓名。
select ename from tb_emp where ename not like '%R%'
---14.查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
select deptno,COUNT(job) as 人数 from tb_emp group by deptno order by COUNT(job) desc
---15.查询每个部门女员工的人数。
select deptno,COUNT(job) as 人数 from tb_emp where sex='女' group by deptno 
---16.显示2007年到2017年之前入职的员工的姓名和受雇日期。
select ename,hiredate from tb_emp where YEAR(hiredate)>2007 and YEAR(hiredate)<2017  
---17.显示员工的详细资料，按姓名排序。
select * from tb_emp order by ename asc 
---18.显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
select ename,hiredate from tb_emp order by hiredate asc 
---19.显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
select ename,job,sal,comm from tb_emp order by job desc,sal,comm   
---20.查询员工薪水高于平均值的员工信息。
select * from tb_emp where sal >(SELECT AVG(sal) FROM tb_emp )
---21.查询每个员工总收入（总收入包括奖金和薪水）。
select ename,SUM(sal+comm) as 总收入 from tb_emp group by ename 
---22.查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
select deptno,job,AVG(comm) as 平均奖金,AVG(sal) as 平均薪水 from tb_emp group by deptno,job 
---23.查询员工姓名，重复的姓名只出现一次。
select DISTINCT ename from tb_emp 
---24.查询员工姓名不重复的员工信息。
---25.显示姓名字段的任何位置包含'A'的所有员工的姓名。
select ename from tb_emp where ename like '%A%'
---26.查询员工姓名重复的员工，显示人员姓名、重复条数。
---27.查询所有员工工资都在900～3000之间的部门信息。
select ename,deptno from tb_emp where sal>900 AND sal<3000
---28.查询每个职位的最低工资，并按照工资进行升学排序。
select job,MIN(sal) as 最低工资 from tb_emp group by job order by MIN(sal) asc