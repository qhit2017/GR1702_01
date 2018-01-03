--emp表是雇员信息表 
--empno 就是雇员的员工编号， employee number
--ename 员工姓名， emlployee name
--job 员工的工作是什么比如推销员，经理等
--mgr 上级编号
--hiredate受雇日期
--sal工资
--comm奖金
--deptno部门编号
CREATE table tb_emp(
eno int identity(1,1) primary key,
ename nvarchar(32) not null,
job nvarchar(32),
mgr int,
hiredate datetime,
sal money,
comm money,
deptno smallint,
foreign key(deptno) references tb_dept(deptno)
)
INSERT INTO tb_emp VALUES 
('李莉莉','经理','01','20150712',7600,3000,005)
INSERT INTO tb_emp VALUES 
('李莉莉','经理','01','20150712',7600,3000,005),
('盛明春','经理','02','20160319',5500,2000,008),
('孔于辉','办事员','03','20140707',8000,3200,004),
('曾祥顺','员工','04','20170303',5000,1500,009),
('BLAKE','总经理','05','20140712',8000,4500,007),
('张鹏','办事员','06','20161111',6666,2222,007),
('SMITH','员工','07','20170123',5000,2300,008),
('柴年年','员工','08','20160912',4600,3000,005),
('李云龙','办事员','09','20160412',5600,2500,001),
('王帅杰','经理','11','20150705',5600,2000,002),
('小鱼儿','经理','12','20160809',5600,2000,003),
('周芷若','经理','13','20170303',5600,2000,006)
INSERT INTO tb_emp VALUES
('花无缺','办事员','14','20150303',5600,2000,010)
INSERT INTO tb_emp VALUES
('徐大大','经理','15','20130303',8500,4000,010)
INSERT INTO tb_emp VALUES
('陈晨','领导者','16','20130303',6000,6000,010)
SELECT * FROM tb_emp 
--Dept 部门表
--Deptno 部门编号
--Deptname 部门名称
--Location 地址
CREATE table tb_dept(
deptno smallint primary key,
dnmae nvarchar(32) not null,
location nvarchar(32)
)
SELECT *from tb_dept 
INSERT INTO tb_dept VALUES 
(001,'NEW YORK','周口市'),
(002,'SALES','周口市'),
(003,'后勤部','周口市'),
(004,'研发部','周口市'),
(005,'财务部','周口市'),
(006,'督察部','周口市'),
(007,'经销部','周口市'),
(008,'人事部','周口市'),
(009,'总务部','周口市')
INSERT INTO tb_dept VALUES 
(010,'总部','NEW YORK')


SELECT * FROM tb_dept 
--1.查询部门名称是‘SALES’的员工信息
----连续查询 
select *from tb_dept d,tb_emp e
where d.dnmae ='SALES'
AND d.deptno =e.deptno 
----另一种方法
SELECT *FROM tb_emp where deptno=(
SELECT deptno from tb_dept where dnmae ='SALES')
--2.查询公司中薪水最高的员工信息 
 SELECT *from tb_emp 
 WHERE sal=( select MAX(sal) from tb_emp )
 
--3.查询各部门中最高薪水的员工编号，姓名… 
SELECT e.eno,e.ename,e.deptno,e.sal FROM tb_emp e
  where sal=any(select MAX(sal) from tb_emp group by deptno )

--4.查询各部门最高薪水的员工信息 
SELECT * FROM tb_emp where sal in(
select max(sal) from tb_emp group BY deptno  
)
--5.查询薪水大于该部门平均薪水的员工信息
SELECT * FROM tb_emp  WHERE sal
>any(
SELECT avg(sal) from tb_emp group by deptno 
)
--6.查询部门名称是‘SALES’的员工信息 
----内连接
SELECT * FROM tb_dept d INNER JOIN tb_emp e 
ON d.deptno =e.deptno  
WHERE d.dnmae ='SALES'

--7.查询领导者是‘BLAKE’的员工信息 
SELECT *FROM tb_emp where ename = 'BLAKE'

--8.查询和SMITH工作相同的员工信息
SELECT * FROM tb_emp where job=
(SELECT job FROM tb_emp where ename='SMITH')

--9.查询平均工资比10部门低的部门编号
SELECT AVG(sal) from tb_emp group BY deptno HAVING AVG(sal)< (
select AVG(sal) from tb_emp e where deptno='10')

--10.查询在NEW YORK工作的所有员工
SELECT * FROM tb_emp e where e.deptno IN( 
SELECT de.deptno  FROM tb_dept de where de.location = 'NEW YORK')

--11.查询10号部门的员工在整个公司中所占的比例
SELECT count(eno) from tb_emp where deptno='10'

--12、查询比普通员工的最高薪水还要高的领导者姓名

SELECT ename from tb_emp where ename='领导者' sal >( 
SELECT MAX(sal) from tb_emp)

--13、找出薪水最高的五个人
SELECT TOP 5 sal from tb_emp ORDER BY sal DESC 
--14、列出至少有三个员工的所有部门和部门信息


--15、查询最后入职的5名员工
SELECT TOP 5 hiredate from tb_emp ORDER by hiredate desc
--16、列出最低薪金大于1500的各种工作以及从事此工作的全部雇员人数

--17、列出各种工作的最低工资以及从事该工作的雇员姓名

--18、求薪水最低的部门经理所在部门的名称

