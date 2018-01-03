CREATE database tb_EMPs
---雇员信息表 
CREATE table tb_emp(
emono nvarchar(32)primary key,
ename nvarchar(32) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate date,
sal money,
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_dept(deptno),
foreign key(mgr) references tb_superior(mgr)
)
------部门表
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(16) not null,
Location nvarchar(32)
)
----- 上级表
CREATE table tb_superior(
mgr nvarchar(32)primary key,
mname nvarchar(32))
---上级表插入
INSERT INTO tb_superior (mgr,mname)
VALUES ('002','还行'),
('003','就这'),
('004','mary'),
('005','jike')
---部门表
INSERT INTO tb_dept(deptno,deptname,Location)VALUES 
('05','SALES','上海'),
('10','rd','北京'),
('20','asd','苏州'),
('30','bnu','杭州'),
('45','lan','NEW YORK'),
('50','fei','南京')
---雇员信息表
INSERT INTO tb_emp(emono,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES('01','刘晨','推销员','004','2017-5-21',1000,500,'05'),
('02','孙敬虔','办事员','002','2017-4-21',6000,800,'20'),
('03','盛明春','办事员','005','2017-3-21',7000,600,'30'),
('04','李云龙','打酱油','003','2017-3-22',1000,100,'10'), 
('05','李一龙','经理','003','2010-5-29',10000,1000,'20'),
('06','张大炮','保洁员','005','2017-5-21',4000,500,'45'),
('07','李继光','科长','003','2017-10-24',9000,1000,'20'),
('08','张珊','秘书','002','2017-5-21',8000,500,'10'),
('09','不知道','办事员','004','2015-8-27',6000,500,'50'),
('10','李四','副经理','005','2015-5-11',9000,900,'05'),
('11','厉害了','办事员','003','2017-5-21',8000,500,'10')

--1.查询部门名称是‘SALES’的员工信息
 SELECT *FROM tb_emp where deptno=
 (SELECT deptno from tb_dept where deptname='SALES')
--2.查询公司中薪水最高的员工信息 
SELECT *FROM tb_emp where sal=(select MAX(sal)from tb_emp) 
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT emono,ename from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--4.查询各部门最高薪水的员工信息 
SELECT * from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--5.查询薪水大于该部门平均薪水的员工信息 
SELECT * from tb_emp where sal > ANY
(SELECT AVG(sal) from tb_emp  
GROUP BY Deptno)
--6.查询部门名称是‘SALES’的员工信息 
SELECT * FROM tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Deptname ='SALES')
--7.查询领导者是‘jike’的员工信息 
SELECT * FROM tb_emp where mgr =(
SELECT mgr from tb_superior where mname ='jike')
--8.查询和SMITH工作相同的员工信息 
SELECT * FROM tb_emp where job = (
SELECT job from tb_emp where ename = 'SMITH')
--9.查询平均工资比10部门低的部门编号 
SELECT Deptno from tb_emp group BY Deptno HAVING avg(sal) < (
SELECT AVG(tb_emp.sal) from tb_emp,tb_Dept 
where tb_Dept.Deptno = '10'
AND tb_emp.Deptno = tb_Dept.Deptno)
--10.查询在NEW YORK工作的所有员工 
select ename  from tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Location = 'NEW YORK')

--11.查询10号部门的员工在整个公司中所占的比例： 

--12、查询比普通员工的最高薪水还要高的领导者姓名
 
--13、找出薪水最高的五个人 
SELECT TOP 5 * from tb_emp ORDER BY sal DESC 
--14、列出至少有三个员工的所有部门和部门信息

--15、查询最后入职的5名员工
SELECT TOP 5* FROM tb_emp order by hiredate desc
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称
SELECT Deptname  from tb_Dept where Deptno = 
	(SELECT top 1 Deptno from tb_emp where job = '经理' ORDER BY sal ) 
