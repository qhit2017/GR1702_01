CREATE database db_emp1
 CREATE table tb_emp(
 empno nvarchar(32) primary key,
 ename nvarchar(32),
 job nvarchar(18),
 mgr nvarchar(18),
 hiredate datetime,
 sal money,
 comm money,
 deptno nvarchar(32)
 foreign key(deptno) references tb_dept(deptno)
 )
 INSERT INTO tb_emp
 VALUES ('001','BLAKE','领导者','0001','2017-6-20',7000,500,'01'),
 ('002','徐云梦','工作者','0002','2017-6-21',7000,500,'02'),
 ('003','李静静','被动者','0003','2017-6-20',7000,500,'03'),
 ('004','孔于辉','清洁工','0004','2017-6-20',7000,500,'04'),
 ('005','盛明春','熬夜的','0005','2017-6-25',7000,500,'05'),
 ('006','曾祥顺','大股东','0006','2017-6-20',7000,500,'06'),
 ('007','李云龙','工作者','0007','2017-6-22',7000,500,'07'),
 ('008','李少庆','熬夜的','0008','2017-6-20',7000,500,'08'),
 ('009','柴年年','被动者','0009','2017-6-20',7000,500,'09'),
 ('010','李利利','清洁工','0010','2017-6-21',7000,500,'10'),
 ('011','夏姐姐','工作者','0011','2017-6-25',7000,500,'01'),
 ('012','BLAKE1','领导者','0001','2017-6-20',9000,600,'02')
 -----
 CREATE table tb_dept(
 deptno nvarchar(32) primary key,
 deptname nvarchar(32),
 location nvarchar(32)
 )
 --------
 INSERT INTO tb_dept 
 VALUES('01','sales','河北'),
 ('02','bbc','河西'),
 ('03','abc','河南'),
 ('04','fbi','河东'),
 ('05','jjc','NEW YORK'),
 ('06','xjj','江西'),
 ('07','jjx','江东'),
 ('08','ccb','江南'),
 ('09','ssb','江北'),
 ('10','cbc','东北')
 
--1.查询部门名称是‘SALES’的员工信息 
SELECT * from tb_emp em LEFT JOIN tb_dept de
on de.deptno=em.deptno 
WHERE de.deptname='SALES'
--2.查询公司中薪水最高的员工信息 
SELECT * from tb_emp where sal =(
	SELECT MAX(sal) from tb_emp
)
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT em.empno,em.ename from tb_emp em 
WHERE  em.sal in(
SELECT max(eem.sal) from tb_emp eem
GROUP BY eem.deptno
)
--4.查询各部门最高薪水的员工信息 

--5.查询薪水大于该部门平均薪水的员工信息
SELECT *FROM tb_emp where empno =(
SELECT em.empno from tb_emp em group by em.deptno,em.empno,em.sal having sal >any(
select AVG(sal) from tb_emp eem GROUP BY eem.deptno,eem.sal ))
----

SELECT *
from
(SELECT deptno,AVG(sal) b from tb_emp group BY deptno)a,tb_emp em
WHERE a.deptno=em.deptno
AND a.b<em.sal


--6.查询部门名称是‘SALES’的员工信息 
SELECT * from tb_emp em,tb_dept de WHERE de.deptname='SALES'AND em.deptno=de.deptno 
--7.查询领导者是‘BLAKE’的员工信息 
SELECT *FROM tb_emp EM WHERE EM.ename='BLAKE' AND EM.job='领导者'
--8.查询和SMITH工作相同的员工信息 
SELECT *
FROM tb_emp EM
WHERE EM.deptno in(SELECT DEP.deptno FROM tb_dept DEP , tb_emp EMP WHERE EM.ename='BLAKE'
AND DEP.deptno= EM.deptno
 )
 ---
 SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where em.ename ='BLAKE' 
--9.查询平均工资比10部门低的部门编号
SELECT em.deptno from tb_emp em group BY em.deptno having AVG(em.sal)<any
(select sal from tb_emp eem where eem.deptno='10'
)
--10.查询在NEW YORK工作的所有员工 
SELECT* from tb_dept de, tb_emp em
WHERE de.deptno= em.deptno
AND de.location='NEW YORK'

--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名
 SELECT em.ename from tb_emp em where em.sal>(
	SELECT max(ee.sal) from tb_emp ee WHERE ee.job='工作者'
 )AND em.job='领导者'
--13、找出薪水最高的五个人

SELECT TOP 6 em.sal from tb_emp em   ORDER BY em.sal desc 

--14、列出至少有三个员工的所有部门和部门信息
SELECT * FROM tb_dept where deptno IN(
SELECT em.deptno from tb_emp em group BY em.deptno 
HAVING count(em.deptno)>=2
)
--15、查询最后入职的5名员工
SELECT top 5 * from tb_emp em ORDER BY em.hiredate ASC 
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数
SELECT COUNT(em.deptno),em.job from tb_emp em LEFT join tb_dept de 
ON de.deptno= em.deptno
 GROUP BY em.job having min(em.sal)>1500
--17、列出各种工作的最低工资以及从事该工作的雇员姓名
SELECT em.ename,em.sal from tb_emp em WHERE em.sal IN(
select min(sal) from tb_emp group BY job)
-----
SELECT em.ename,em.sal
from (select min(sal),job from tb_emp group BY job)a right join
tb_emp em
WHERE cd.job=em.job
----
SELECT job as 职位,MIN(sal)as 最低薪水 from tb_emp e GROUP BY e.job 
--18、求薪水最低的部门经理所在部门的名称
SELECT de.deptname as 薪水最低经理部门名称 from tb_dept de where de.deptno IN 
(select em.deptno from tb_emp em where em.job='领导者' and sal=
(select min(sal)from tb_emp where job='领导者' ))

 