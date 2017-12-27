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
sex char(2)check(sex='��'or sex='Ů')default'��' not null)
sp_help tb_staffSH  
insert into tb_staffSH(empno,ename,deptno,jop,id,sal,comm,hiredate,sex)
values(1,'����','���۲�','����',01,35000,12000,'20030613','��'),
      (2,'����','���۲�','Ա��',01,6500,2000,'20110215','Ů'),
      (3,'�ں��','���ز�','Ա��',02,2500,800,'20150515','Ů'),
      (4,'��ӭ��','���ز�','����',02,33500,8000,'20150621','��'),
      (5,'֣���','��沿','����',03,51000,12000,'20150426','��'),
      (6,'������','���ڲ�','Ա��',04,1500,200,'20150124','��'),
      (7,'��ӭ��','���ز�','����',02,33500,22000,'20150621','��'),
      (8,'ʢ����','���ڲ�','Ա��',04,1500,600,'20150906','��'),
      (9,'����ΰ','���ڲ�','����',04,5500,1000,'20151120','��'),
      (10,'������','��沿','Ա��',03,7500,2600,'20150906','��'),
      (11,'MAK','���۲�','Ա��',01,35000,12000,'20030613','��'),
      (12,'LUCY','���۲�','Ա��',01,6500,2000,'20110215','Ů'),
      (13,'ROUS','���ز�','Ա��',02,2500,800,'20150515','Ů'),
      (14,'JERY','���ز�','Ա��',02,33500,8000,'20150621','��'),
      (15,'RJG','��沿','Ա��',03,7100,2000,'20150426','��'),
      (16,'TOM','���ڲ�','Ա��',04,1500,200,'20150124','��'),
      (17,'DEM','���ز�','Ա��',02,6350,4900,'20150621','��'),
      (18,'KK','���ڲ�','Ա��',04,1500,1600,'20150906','��'),
      (19,'NAJ','���ڲ�','Ա��',04,5500,1000,'20151120','��'),
      (20,'����','��沿','Ա��',03,7500,2600,'20150906','��'),
      (21,'·��','���۲�','Ա��',01,8500,4000,'20030613','��'),
      (22,'����','���۲�','Ա��',01,6500,2000,'20110215','Ů'),
      (23,'��ӯӯ','���ز�','Ա��',02,9500,5800,'20150515','Ů'),
      (24,'�߽���','���ز�','Ա��',02,7500,5000,'20150621','��'),
      (25,'����','��沿','Ա��',03,5100,2000,'20150426','��'),
      (26,'³��','���ڲ�','Ա��',04,3500,1200,'20150124','��'),
      (27,'������','���ز�','Ա��',02,13500,8000,'20150621','��'),
      (28,'��ɪ','���ڲ�','Ա��',04,5500,4600,'20150906','��'),
      (029,'��������','���ڲ�','����Ա',04,5500,3000,'20151120','��'),
      (30,'���','��沿','Ա��',03,9500,7600,'20150906','��')
      
---1.��ѯȫ��Ա����Ϣ 
select * from tb_staffSH
---2.
select ename,empno,deptno from tb_staffSH where jop='Ա��'
--3.
SELECT * FROM tb_staffSH where sal<comm
--4.
SELECT * FROM tb_staffSH where comm>sal*0.6 
--5.
SELECT *FROM tb_staffSH where jop='����'AND id=01
SELECT *FROM tb_staffSH where jop='Ա��'AND id=02
--6.
SELECT *FROM tb_staffSH where jop!='����' or jop!='����Ա' and sal>2000
--7.
SELECT jop from tb_staffSH where comm>0
--8.�������1000��Ա��
SELECT * FROM tb_staffSH where comm<1000
---9.
select AVG (sal) as ƽ��нˮ,deptno as ������ from tb_staffSH
group by deptno order by avg(sal) desc
----10
SELECT * FROM tb_staffSH where hiredate<'2012'
---11
select  sum(sal) from tb_staffSH
--12
--select ename from tb_staffSH where ename=ename nvarchar(5)
SELECT ename as���� from tb_staffsh where ename like '_____%' and len(ename) = 5

---13
SELECT ename from tb_staffSH where ename not LIKE '%R%'
--14
SELECT deptno,count(empno) FROM tb_staffSH
group by deptno order by count(empno) desc
--15
SELECT COUNT(empno)as ����,deptno from tb_staffSH where sex='Ů' GROUP BY deptno 
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
SELECT SUM(sal)+SUM(comm)as ������,ename as ���� from tb_staffSH group by ename
--22
SELECT AVG(sal)as ƽ������,AVG(comm)as ƽ������,deptno,jop FROM tb_staffSH
group by jop,deptno order by avg(comm) , AVG (sal),deptno
--23����distinctʲô��˼
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