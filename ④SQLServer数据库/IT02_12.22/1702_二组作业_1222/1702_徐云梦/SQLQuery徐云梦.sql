CREATE table tb_emp(
empno int identity  primary key,
ename nvarchar(16) not null,
deptno nvarchar(16),
job nvarchar(8),
sal money,
comm money,
hiredate date,
sex nvarchar
)
INSERT into tb_emp VALUES
('张三','10','员工',4000,2000,'20150201','男'),
('王二','10','员工',5000,2500,'20140201','男'),
('李丽','10','办事员',6000,2800,'20150201','女'),
('盛明春','10','办事员',5500,2000,'20160725','男'),
('李利利','10','经理',7000,3000,'20151020','女'),
('张鹏','20','员工',5000,2000,'20161201','男'),
('于鱼','20','员工',4000,2000,'20170201','男'),
('徐大大','20','经理',7000,3000,'20150809','女'),
('陈晨','20','经理',7000,2900,'20150315','男'),
('张平','20','员工',4000,2000,'20170412','男'),
('三三','20','办事员',4000,2000,'20160201','女'),
('柴就','20','员工',4000,2000,'20150201','男'),
('李龙','30','经理',6500,3200,'20150201','男'),
('孔子','30','办事员',6100,2000,'20170501','男'),
('王璐','30','办事员',6000,2000,'20161201','女'),
('赵丽','30','员工',3500,2000,'20170501','女'),
('郑郝','30','员工',3000,3100,'20170201','男')
SELECT * FROM tb_emp
---1.选择部门30中的所有员工
select * FROM tb_emp where deptno='30'
---2.列出所有办事员（CLERK）的姓名，雇员编号和部门编号
SELECT ename,empno,deptno from tb_emp where job='办事员'
---3.找出奖金高于薪金的员工
SELECT * FROM tb_emp where sal<comm
---4.找出奖金高于薪金60%的员工
SELECT * FROM tb_emp where COMM>sal*0.6
---5.找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料
SELECT * FROM tb_emp where deptno='10' AND job='经理' or deptno='20' AND job='办事员'
---6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部
---   门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料
SELECT * FROM tb_emp 
where deptno='10' AND job='经理' or deptno='20' AND job='办事员' 
OR job='员工' AND sal>='2000'
---7  找出有奖金的员工的不同工作
SELECT empno,ename,job from tb_emp where comm IS  NOT NULL 
---8.找出没有奖金或奖金低于100的员工
SELECT ename from tb_emp where comm<100
---9.查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序
SELECT AVG(sal) as 平均薪水,deptno as 部门 from tb_emp 
GROUP BY deptno order BY AVG(sal) desc
---10.找出早于2012年前受雇的员工
INSERT INTO tb_emp VALUES('郑开','30','员工',3000,3100,'20101111','男')
INSERT INTO tb_emp VALUES('Mikol','20','员工',4000,2100,'20121111','男')
INSERT INTO tb_emp VALUES('Rose','20','员工',3000,2100,'20161111','女')
INSERT INTO tb_emp VALUES('Anm','30','员工',3500,2100,'20161111','女')
INSERT INTO tb_emp VALUES('Hany','30','员工',2500,3000,'20170321','男')

SELECT ename from tb_emp where hiredate<'2012'
---11.查询公司员工薪水总数
SELECT SUM(sal) as 薪水总数 FROM tb_emp 
---12.显示正好为5个字符的员工的姓名
SELECT * FROM tb_emp where ename LIKE '_____'
---13.显示不带有'R'的员工的姓名
SELECT ename FROM tb_emp where ename not LIKE  '%R%'
---14.查询每个部门员工人数和部门名，并按照员工人数进行降序排序
SELECT COUNT(deptno) as 员工人数,deptno from tb_emp
group BY deptno ORDER BY COUNT(deptno) desc
---15.查询每个部门女员工的人数
SELECT COUNT(*) as 女员工的人数,deptno FROM tb_emp 
where sex='女'
group BY deptno 
---16.显示2007年到2017年之前入职的员工的姓名和受雇日期
SELECT ename,hiredate from tb_emp 
where hiredate>'2007' OR hiredate<'2017'
---17.显示员工的详细资料，按姓名排序
SELECT * FROM tb_emp order BY ename ASC  
---18.显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面
select ename,hiredate FROM tb_emp order BY hiredate ASC 
---19.显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序
SELECT ename,job,comm from tb_emp order BY job DESC,sal,comm
---20.查询员工薪水高于平均值的员工信息
SELECT * from tb_emp where sal > (select AVG(sal) from tb_emp )
---21.查询每个员工总收入（总收入包括奖金和薪水）
SELECT ename,SUM(sal+comm) as 总收入 from  tb_emp group BY ename
---22.查询每个部门不同职位的平均奖金，平均薪水，部门和职位名
select deptno,job,AVG(comm) as 平均奖金,AVG(sal) as 平均薪水
 from tb_emp group BY deptno,job
---23  查询员工姓名，重复的姓名只出现一次
SELECT distinct(ename) from tb_emp
---24  查询员工姓名不重复的员工信息

SELECT * from tb_emp where ename 
IN (SELECT ename from tb_emp 
group BY ename HAVING  COUNT(*) <2 )


---25  显示姓名字段的任何位置包含'A'的所有员工的姓名
SELECT ename FROM tb_emp where ename LIKE  '%A%'
---26  查询员工姓名重复的员工，显示人员姓名、重复条数

SELECT ename as 名字,COUNT(ename)as 重复条数 
from tb_emp group BY ename HAVING  COUNT(ename) >1

---27  查询所有员工工资都在900～3000之间的部门信息
SELECT deptno,ename from tb_emp where sal>900 AND sal<3000
---28  查询每个职位的最低工资，并按照工资进行升学排序
SELECT job,Min(sal) as 最低工资 from tb_emp
group BY job order BY Min(sal) ASC








 