create database db_EMP
USE db_EMP
create table tb_staffSH(
empno int primary key,
ename nvarchar(16)not null,
deptno nvarchar(20),
jop nvarchar(12),
id int not null,
sal money,
comm money,
hiredate date,
sex char(2)check(sex='男'or sex='女')default'男' not null)
sp_help tb_staffSH  
insert into tb_staffSH(empno,ename,deptno,jop,id,sal,comm,hiredate,sex)
values(1,'李天','销售部','经理',01,35000,12000,'20030613','男'),
      (2,'王菲','销售部','员工',01,6500,2000,'20110215','女'),
      (3,'于和璧','公关部','员工',02,2500,800,'20150515','女'),
      (4,'王迎阔','公关部','经理',02,33500,8000,'20150621','男'),
      (5,'郑光达','广告部','经理',03,51000,12000,'20150426','男'),
      (6,'陈亮亮','后勤部','员工',04,1500,200,'20150124','男'),
      (7,'王迎阔','公关部','经理',02,33500,22000,'20150621','男'),
      (8,'盛明春','后勤部','员工',04,1500,600,'20150906','男'),
      (9,'刘天伟','后勤部','经理',04,5500,1000,'20151120','男'),
      (10,'赵武阳','广告部','员工',03,7500,2600,'20150906','男'),
      (11,'MAK','销售部','员工',01,35000,12000,'20030613','男'),
      (12,'LUCY','销售部','员工',01,6500,2000,'20110215','女'),
      (13,'ROUS','公关部','员工',02,2500,800,'20150515','女'),
      (14,'JERY','公关部','员工',02,33500,8000,'20150621','男'),
      (15,'RJG','广告部','员工',03,7100,2000,'20150426','男'),
      (16,'TOM','后勤部','员工',04,1500,200,'20150124','男'),
      (17,'DEM','公关部','员工',02,6350,4900,'20150621','男'),
      (18,'KK','后勤部','员工',04,1500,1600,'20150906','男'),
      (19,'NAJ','后勤部','员工',04,5500,1000,'20151120','男'),
      (20,'赵明','广告部','员工',03,7500,2600,'20150906','男'),
      (21,'路飞','销售部','员工',01,8500,4000,'20030613','男'),
      (22,'鸣人','销售部','员工',01,6500,2000,'20110215','女'),
      (23,'任盈盈','公关部','员工',02,9500,5800,'20150515','女'),
      (24,'高渐离','公关部','员工',02,7500,5000,'20150621','男'),
      (25,'后羿','广告部','员工',03,5100,2000,'20150426','男'),
      (26,'鲁班','后勤部','员工',04,3500,1200,'20150124','男'),
      (27,'姜子牙','公关部','员工',02,13500,8000,'20150621','男'),
      (28,'亚瑟','后勤部','员工',04,5500,4600,'20150906','男'),
      (029,'百里玄测','后勤部','办事员',04,5500,3000,'20151120','男'),
      (30,'李白','广告部','员工',03,9500,7600,'20150906','男')
      
---1.查询全部员工信息 
select * from tb_staffSH
---2.
select ename,empno,deptno from tb_staffSH where jop='员工'
--3.
SELECT * FROM tb_staffSH where sal<comm
--4.
SELECT * FROM tb_staffSH where comm>sal*0.6 
--5.
SELECT *FROM tb_staffSH where jop='经理'AND id=01
SELECT *FROM tb_staffSH where jop='员工'AND id=02
--6.
SELECT *FROM tb_staffSH where jop!='经理' or jop!='办事员' and sal>2000
--7.
SELECT jop from tb_staffSH where comm>0
--8.奖金低于1000的员工
SELECT * FROM tb_staffSH where comm<1000
---9.
select AVG (sal) as 平均薪水,deptno as 部门名 from tb_staffSH
group by deptno order by avg(sal) desc
----10
SELECT * FROM tb_staffSH where hiredate<'2012'
---11
select  sum(sal) from tb_staffSH
--12
--select ename from tb_staffSH where ename=ename nvarchar(5)
SELECT ename as姓名 from tb_staffsh where ename like '_____%' and len(ename) = 5

---13
SELECT ename from tb_staffSH where ename not LIKE '%R%'
--14
SELECT deptno,count(empno) FROM tb_staffSH
group by deptno order by count(empno) desc
--15
SELECT COUNT(empno)as 人数,deptno from tb_staffSH where sex='女' GROUP BY deptno 
--16
SELECT ename,hiredate from tb_staffSH where hiredate BETWEEN '2007' AND '2017'
--17
select * from tb_staffSH order by ename 
---18
SELECT ename,hiredate from tb_staffSH order BY hiredate
--19
SELECT ename,sal from tb_staffSH ORDER BY jop DESC ,sal
--20
SELECT *FROM tb_staffSH where sal>(select AVG(sal)from tb_staffSH )
--21
SELECT SUM(sal)+SUM(comm)as 总收入,ename as 姓名 from tb_staffSH group by ename
--22
SELECT AVG(sal)as 平均工资,AVG(comm)as 平均奖金,deptno,jop FROM tb_staffSH
group by jop,deptno order by avg(comm) , AVG (sal),deptno
--23不会distinct什么意思
--SELECT ename from tb_staffSH 
select distinct(ename)from tb_staffSH 
--24
select  distinct(ename)from tb_staffSH   where ename is not null
--25
SELECT ename from tb_staffSH where ename LIKE '%A%';
--26
SELECT ename ,COUNT(ename) FROM tb_staffSH  group BY ename 
HAVING COUNT(ename)>1 ORDER BY COUNT(ename) desc
--27
SELECT * FROM tb_staffSH where sal BETWEEN 900 AND 3000
--28
SELECT  jop,min(sal) FROM tb_staffSH group by jop order by MIN (sal)asc