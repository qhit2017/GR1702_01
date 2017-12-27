CREATE database tb_emp
CREATE table tb_emp(
empno char(11)primary key,--工号
ename char(20),--姓名
deptno char(16),--部门
job char(8),--职位
sal money,--薪水
comm char(8),--奖金
hiredate date, --受雇日期
Sex char(2)check(Sex='男' or Sex='女')default '男',--性别
)
insert into tb_emp (empno,ename,deptno,job,sal,comm,hiredate,Sex) 
values(1,'刘晨','10','员工',5000,500,'2017-5-21','女'),
(2,'孙敬虔','01','办事员',6000,800,'2017-4-21','男'),
(3,'盛明春','01','办事员',7000,600,'2017-3-21','女'),
(4,'李云龙','10','打酱油',1000,100,'2017-3-22','女'), 
(5,'李一龙','20','经理',10000,1000,'2010-5-29','男'),
(6,'张大炮','20','保洁员',4000,500,'2017-5-21','男'),
(7,'李继光','15','科长',9000,1000,'2017-10-24','男'),
(8,'张珊','10','秘书',8000,500,'2017-5-21','女'),
(9,'不知道','10','办事员',6000,500,'2015-8-27','女'),
(10,'李四','01','副经理',9000,900,'2015-5-11','女'),
(11,'厉害了','30','办事员',8000,500,'2017-5-21','女')
insert into tb_emp (empno,ename,deptno,job,sal,comm,hiredate,Sex)
VALUES(16,'RDRY','13','办事员',8000,67,'2006-04-24','男')--增加语句
SELECT * FROM tb_emp
DELETE tb_emp WHERE empno='16'--删除
UPDATE  tb_emp SET ename ='李三'WHERE ename='李四'--更改语句  

--1  选择部门30中的所有员工。
SELECT * FROM tb_emp where  deptno = '30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT ename ,  empno,deptno from tb_emp where job= '办事员'
--3  找出奖金高于薪金的员工。
SELECT * FROM tb_emp where  comm>sal 
--4  找出奖金高于薪金60%的员工.
SELECT * FROM tb_emp where comm>(1+0.6)*sal
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。 
SELECT *FROM tb_emp WHERE deptno ='10'AND job='经理'OR
deptno ='20'AND job ='办事员' 
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
SELECT *FROM tb_emp  WHERE deptno='10'AND job ='经理'OR deptno='20'AND job='办事员'
OR (job NOT IN ('办事员','经理'))AND sal>=2000
--7  找出有奖金的员工的不同工作。
SELECT job from tb_emp where comm IS NOT null GROUP BY  job 
--8  找出没有奖金或奖金低于100的员工。
SELECT * FROM tb_emp where comm<100 OR comm IS NULL  
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT job as '工作' , avg(sal)as'平均薪水'
FROM tb_emp 
GROUP BY job
ORDER BY avg(sal)
--10  找出早于2012年前受雇的员工。
SELECT *FrOM tb_emp WHERE hiredate<'2012-1-1'
--11  查询公司员工薪水总数。
SELECT sum(sal)as'总数'FROM tb_emp
--12  显示正好为5个字符的员工的姓名。
SELECT ename FROM tb_emp WHERE ename LIKE'_____'--包含字符用like
--13  显示不带有'R'的员工的姓名。
SELECT ename
FROM tb_emp 
WHERE  ename NOT like'R%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
SELECT  deptno as'部门名',count(job)as'员工人数'
FROM tb_emp 
GROUP BY deptno
ORDER BY  count(job) DESC--降序，升序 asc
--15  查询每个部门女员工的人数。
SELECT deptno as'部门' ,count(sex)as'女员工'
FROM tb_emp WHERE Sex='女'GROUP BY deptno
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
SELECT ename,hiredate
FROM tb_emp
WHERE hiredate NOT BETWEEN '2007' and '2017'AND hiredate<'2007'
--BETWEEN   AND  到什么----之间 
--17  显示员工的详细资料，按姓名排序。
SELECT * FROM tb_emp  ORDER by ename
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT ename,hiredate  from tb_emp ORDER by year(hiredate)
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
 
--20  查询员工薪水高于平均值的员工信息。 
SELECT * FROM tb_emp where sal >(SELECT AVG(sal) FROM tb_emp )  
--21  查询每个员工总收入（总收入包括奖金和薪水）。
SELECT ename , sal+comm as 总收入 from tb_emp  
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
--23  查询员工姓名，重复的姓名只出现一次。
 SELECT distinct ename as 员工的姓名 FROM tb_emp 
--24  查询员工姓名不重复的员工信息。
SELECT *FROM tb_emp where ename IN(SELECT ename FROM tb_emp group by ename HAVING  COUNT(*)<2 )
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
 SELECT  ename as 员工的姓名 FROM tb_emp where ename='%A%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。

--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT deptno as 部门, ename as 员工的姓名 
FROM tb_emp where sal  BETWEEN 900 AND 3000
--28  查询每个职位的最低工资，并按照工资进行升学排序。
SELECT job as 职位,MIN(sal) as 最低工资  FROM tb_emp GROUP BY job ORDER BY MIN(sal) ASC
 