create database db_EMPS 
use db_EMPS
--emp���ǹ�Ա��Ϣ�� 
--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--job Ա���Ĺ�����ʲô��������Ա�������
--mgr �ϼ����
--hiredate�ܹ�����
--sal����
--comm����
--deptno���ű��

CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate date,
sal decimal(8,4),
comm money,
deptno nvarchar(32)
foreign key(deptno) references tb_Dept(Deptno),
foreign key(mgr) references tb_leadership(mgr)
) 
insert into tb_emp
SELECT '002','���','����Ա','001','2013-08-16',5600,3500,'10' union
SELECT '003','����','����Ա','001','2012-05-06',4600,3500,'10' union
SELECT '005','С��','����Ա','004','2008-10-06',6600,100,'20' union
SELECT '006','��̹�','SMITH','004','2013-04-11',5600,50,'20' union
SELECT '008','С��','����Ա','007','2014-08-19',4900,100,'30' union
SELECT '009','ΰ��','SMITH','007','2013-08-06',5600,120,'30' union
SELECT '010','�Ļ�','����Ա','007','2015-10-07',3600,320,'30'
-- �쵼��
create table tb_leadership(
mgr nvarchar(32)primary key,
name nvarchar(32) not null,
sal money,
Deptname nvarchar(16)
)
insert into  tb_leadership
SELECT '001','������',9800,'SALES'union
SELECT '004','С��',8600,'JAVA'union
SELECT '007','BLAKE',8000,'CS'

--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ

CREATE table tb_Dept(
Deptno nvarchar(32) primary key,                            
Deptname nvarchar(16) not null,
Location nvarchar(32)
)
insert into tb_Dept
SELECT '10','SALES','����' union
SELECT '20','JAVA','NEW YORK' union
SELECT '30','CS','���' 

--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
select * from tb_emp em
where em.deptno IN(
select De.Deptno
from tb_Dept De 
where De.Deptname = 'SALES')
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * from tb_emp where sal=( select MAX(sal) from tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ������� 
select empno as Ա�����,ename as ����
FROM tb_emp  
where sal in(select MAX(sal) from tb_emp GROUP by  Deptno)
--4.��ѯ���������нˮ��Ա����Ϣ 
select * FROM tb_emp 
where sal IN (SELECT MAX(sal) from tb_emp GROUP by  Deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * FROM tb_emp
where sal >ANY(select avg(sal) from tb_emp group BY deptno)
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
select * from tb_emp em
where em.deptno IN(
select De.Deptno
from tb_Dept De 
where De.Deptname = 'SALES')
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ
SELECT* FROM tb_emp
where mgr IN(
SELECT Le.mgr 
from tb_leadership  Le
WHERE Le.name='BLAKE')
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
 SELECT * FROM tb_emp where job='SMITH'
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
select deptno as ���ű��   from tb_emp group BY deptno 
HAVING avg(sal)<(select avg(sal) from tb_emp where deptno='10')
--10.��ѯ��NEW YORK����������Ա�� 
SELECT * from tb_emp em
WHERE em.deptno IN(
select De.Deptno from tb_Dept De
WHERE De.Location='NEW YORK')
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı�����

--**�������

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
SELECT le.name
 from tb_leadership le
 WHERE le.sal>(
SELECT max(em.sal)
from tb_emp em)
--13���ҳ�нˮ��ߵ������ 
--****��֪��զ���쵼�Ĺ���Ҳ���ȥ
select TOP 5 *
from tb_emp em 
order BY em.sal DESC 
--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT *
from tb_Dept De
where De.Deptno IN(
SELECT em.deptno
from tb_emp em
GROUP BY em.deptno
HAVING COUNT(em.deptno)>=3
)
--15����ѯ�����ְ��5��Ա��
select TOP 5 *
from tb_emp em order BY em.hiredate desc 
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
SELECT en.job as ����,COUNT(en.empno)  as ��Ա����
from tb_emp en 
GROUP BY en.job 
HAVING  en.job IN(
SELECT em.job  
from tb_emp em 
GROUP BY em.job 
HAVING MIN(em.sal )>1500)
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

---**�����̫��
SELECT em.ename as ��Ա����,em.sal as ��͹���
from tb_emp em 
where em.sal IN(
SELECT MIN(sal) 
from tb_emp em
GROUP BY em.job)
 

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
SELECT le.Deptname as ��������
from tb_leadership le
WHERE le.sal in(
SELECT MIN(le.sal)
from tb_leadership le)
