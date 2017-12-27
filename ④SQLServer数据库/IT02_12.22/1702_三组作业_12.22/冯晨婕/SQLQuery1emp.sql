USE db_staff
CREATE table tb_emp(
empno char(32)primary key,
ename nvarchar (16),
deptno nvarchar(16),
job nvarchar(16),
sal money,
comm money,
hiredate date,
sex char(8)check(sex='man'or sex='women'))
---
SELECT*from tb_emp
---
select empno,ename,deptno,job,sal,comm,hiredate,sex from tb_emp
insert INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)
VALUES('1','Tom',10,'经理',18000,9000,'2004-09-09','man'),
('2','Jack',10,'副经理',6000,4000,'2010-10-07','man'),
('3','Lucy',20,'办事员',4800,5800,'2013-08-06','women'),
('4','Alina',30,'公关',7700,5000,'2012-09-01','women'),
('5','MIKE',30,'保安',3500,1000,'2014-08-06','man'),
('6','Marry',20,'办事员',4800,5200,'2012-05-23','women'),
('7','Rose',20,'办事员',4500,1800,'2011-01-01','women'),
('8','Jerry',30,'保安',2000,1000,'2013-03-30','man'),
('9','Candies',30,'清洁工',3800,2000,'2015-09-29','women'),
('10','CC',30,'实习生',2000,1000,'2017-02-22','women')
---1.选择部门30中所有员工
SELECT* from tb_emp where deptno=30
---2.列出所有办事员(CLERK)的姓名，雇员编号和部门编号
SELECT ename as 姓名,empno as 雇员编号,deptno as 部门编号 from tb_emp
---3.找出奖金高于薪金的员工
select*FROM tb_emp where comm>sal
---4.找出奖金高于薪金60%的员工
SELECT*FROM tb_emp where comm>sal*(1+0.6)
---5.找出部门10中所有经理和部门20中所有办事员的详细资料
SELECT*FROM tb_emp where deptno BETWEEN 10 AND 20
---6.找出部门10中所有经理，部门20中所有办事员，
---以及所有部门中既不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料
SELECT*FROM tb_emp where deptno BETWEEN 10 AND 20 
---7.找出有奖金的员工的不同工作
SELECT*FROM tb_emp where comm IS NOT NULL
---8.找出没有奖金或奖金低于100的员工
SELECT*FROM tb_emp where comm IS NULL OR comm<100
---9.查询每个部门的平均薪水和部门名，并按照薪水由高到低进行排序
SELECT avg(sal) FROM tb_emp where AVG(sal) ORDER BY sal DESC!!!!
---10.找出早于2012年前受雇的员工
SELECT*FROM tb_emp where hiredate<'2012'
---11.查询公司员工薪水总数
SELECT sum(sal)as 薪水总数 from tb_emp
---12.显示正好为5个字符的员工的姓名
select ename as 姓名 from tb_emp where ename LIKE'%'AND LEN(ename)=5
---13.显示不带有'R'的员工的姓名
SELECT ename as 姓名 FROM tb_emp where ename not LIKE'%R%'
---14.查询每个部门员工人数和部门名，并按照员工人数进行降序排序
SELECT SUM(deptno) from tb_emp xs
---15.查询每个部门女员工的人数
SELECT COUNT(sex)  AS 女员工的人数  from tb_emp WHERE sex ='women'
