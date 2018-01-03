USE db_employee
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
 name  nvarchar(32) not null,
 job nvarchar(32),
 mgr nvarchar(32),
 hiredate datetime,
 sal money,
 comm money,
 deptno nvarchar(32),
 foreign key(Deptno) references tb_dept(Deptno),
 foreign key(mgr) references tb_leader(mgr)
)
INSERT INTO tb_emp

SELECT '001','BLAKE','����Ա','001','2010-7-22',9000,800,'10' UNION
SELECT '002','�㻪Ϊ','����Ա','001','2009-5-19',6000,100,'20' UNION
SELECT '003','����','SMITH','005','2011-11-18',3000,500,'30' UNION
SELECT '004','���Ƿ�','SMITH','005','2012-8-24',6000,600,'10' UNION
SELECT '005','������','SMITH','001','2015-6-24',8000,400,'30' UNION
SELECT '006','������','����Ա','005','2014-8-24',5000,800,'20' UNION
SELECT '007','Ԭ����','����Ա','001','2006-6-14',6000,300,'10' UNION
SELECT '008','��Ц��','����Ա','005','2017-8-23',6000,500,'30'


--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ
CREATE table tb_dept(
Deptno nvarchar(32) primary key,
Deptname nvarchar(32) not null,
Location nvarchar(32)
)
INSERT INTO tb_dept
SELECT '10','SALES','����' UNION
SELECT '20','CS','NEW YORK' UNION
SELECT '30','JAVA','�Ϻ�'
 
CREATE table tb_leader(
mgr nvarchar(32) primary key,
name  nvarchar(32) not null
)
INSERT INTO tb_leader
SELECT '001','BLAKE'  UNION
SELECT '005','��ӨӨ'


--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_dept where Deptname='SALES'
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * from tb_emp where sal=(select MAX(sal)from tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT em.empno as Ա�����,em.name as ����,em.deptno as ���� from tb_emp em
where em.sal in(select MAX(em.sal)from tb_emp em
group BY deptno)
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * from tb_emp 
where sal in(select MAX(sal)from tb_emp 
group BY deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * from tb_emp
 where sal >(select AVG(sal)from tb_emp 
 )
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_dept where Deptname='SALES'
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT *
from tb_emp em
where em.mgr IN(
select le.mgr
from tb_leader le
WHERE le.name='BLAKE')

--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT *FROM tb_emp where job='SMITH'
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
 --where---group by---having
 SELECT em.deptno as ���ű��
 from tb_emp em
GROUP BY em.deptno
HAVING AVG(em.sal)<
(SELECT AVG(em.sal)
FROM tb_emp em
where em.deptno='10')

--10.��ѯ��NEW YORK����������Ա�� 
select * FROM tb_emp em 
WHERE em.deptno IN(
select de.Deptno
from tb_dept de
WHERE de.Location='NEW YORK')

--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 

--13���ҳ�нˮ��ߵ������ 
SELECT TOP 5 *from tb_emp em 
ORDER by em.sal desc
--14���г�����������Ա�������в��źͲ�����Ϣ

SELECT *
from tb_dept de
where de.Deptno IN(
SELECT em.deptno
from tb_emp em
group by em.deptno
HAVING count(em.deptno)>=3)
--15����ѯ�����ְ��5��Ա��
SELECT TOP 5  *from tb_emp em
ORDER BY em.hiredate ASC 
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
select em.job as ����,COUNT(em.deptno) as �˹�����ȫ����Ա����
from tb_emp em
group by em.job
having MIN(sal)>1500
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
  SELECT name FROM tb_emp WHERE sal IN
  (SELECT MIN(sal) FROM tb_emp GROUP BY job)
--18����нˮ��͵Ĺ�Ա���ڲ��ŵ�����
select de.Deptname
from tb_dept de
WHERE de.Deptno IN(
SELECT eem.deptno  from tb_emp eem WHERE eem.sal IN(
SELECT MIN(em.sal )from tb_emp em))



