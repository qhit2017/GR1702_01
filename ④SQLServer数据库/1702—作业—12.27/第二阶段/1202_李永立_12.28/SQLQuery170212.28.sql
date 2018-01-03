CREATE database db_employee001
USE db_employee001
--��Ա��
CREATE table tb_employee(
empno nvarchar(18) primary key ,
ename nvarchar(32) not null,
job nvarchar(32),
mgr nvarchar(16),
hiredate date,
sal money ,
comm money,
Deptno nvarchar(32) not null foreign key references tb_department(Deptno))

sp_help tb_employee
INSERT into tb_employee(empno,ename ,job ,mgr ,hiredate ,sal  ,comm ,Deptno )
values('35','SMITH','����','a','2011-09-08',8000,4000,'20'),
('28','chao','��Ա','b','2011-11-08',3300,1100,'20'),
('24','ting','��Ա','c','1998-08-08',5100,500,'11'),
('25','ming','�鳤','d','1999-08-29',4300,1900,'10')

SELECT *FROM tb_employee 
CREATE table tb_department(
Deptno nvarchar(32) primary key,
Deptname nvarchar(32),
Location nvarchar(32))
sp_help tb_department
INSERT into tb_department (Deptno ,Deptname,Location)
values('20','rd','America')


--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT *from tb_employee where Deptno IN (
SELECT Deptno
from  tb_department where Deptname='sales')
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT*from tb_employee where sal =(
SELECT MAX(sal) from tb_employee)
--3.��ѯ�����������нˮ��Ա����ţ�������
SELECT empno as Ա����� ,ename as ���� 
from tb_employee 
WHERE sal in(
SELECT  distinct(MAX(sal)) from tb_employee
group BY deptno
 )
 
--4.��ѯ���������нˮ��Ա����Ϣ 
    SELECT * 
from tb_employee 
WHERE sal in(
SELECT  distinct(MAX(sal)) from tb_employee
group BY deptno
 )
 
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * 
from tb_employee 
where sal > any (
SELECT AVG(sal) 
from tb_employee
group BY Deptno 
  )

--6.��ѯ���������ǡ�SALES����Ա����Ϣ
SELECT *
from tb_employee 
WHERE Deptno =(
SELECT Deptno
from tb_department 
where Deptname='sales' ) 
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * FROM tb_employee 
where mgr ='blake'
--8.��ѯ��SMITH������ͬ��Ա����Ϣ
SELECT *FROM tb_employee
where job = (
SELECT job from tb_employee
where ename ='SMITH')
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
SELECT Deptno
from tb_employee
group BY Deptno 
HAVING AVG(sal+comm)< (
SELECT AVG(sal+comm) 
from tb_employee
where deptno='10' )

--10.��ѯ��NEW YORK����������Ա�� 
SELECT  empno as ��� ,ename as ���� 
from tb_employee 
where Deptno in(
select deptno
from tb_department  
where Location = 'new york'  ) 
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı�����
 
--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 

--13���ҳ�нˮ��ߵ������ 
SELECT TOP 5 sal from tb_employee order BY sal DESC 
--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT *from tb_department 

--15����ѯ�����ְ��5��Ա��
SELECT TOP 5  hiredate from tb_employee order BY hiredate DESC 
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����


