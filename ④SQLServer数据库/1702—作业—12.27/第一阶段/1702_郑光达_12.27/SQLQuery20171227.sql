CREATE database db_EMPBJG

USE db_EMPBJG

--emp���ǹ�Ա��Ϣ�� 
--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--job ��������Ա,mgr �ϼ����,hiredate�ܹ�����,sal����,comm����,deptno���ű��,

CREATE table tb_emp(
	empno nvarchar(32) primary key,
	ename nvarchar(32),
	job nvarchar(32),
	leader nvarchar(32),
	foreign key(leader) references tb_lead(leader),
	hiredate datetime,
	sal money,
	comm money,
	deptno nvarchar(32)
	foreign key(deptno) references tb_Dept(deptno)
)
CREATE table tb_lead(
leader nvarchar(32)primary key,
Leadname nvarchar(32))
INSERT INTO tb_lead
SELECT '10011','BLAKE'UNION
SELECT '10010','blue'


INSERT INTO tb_emp 
SELECT '007','����','����Ա','10011','2017/12/27',9500,9500,'1700'UNION
SELECT '002','����','����Ա','10011','2017/12/27',9500,9500,'1701'UNION
SELECT '001','����','����','10010','2017/12/26',8000,8000,'1702'UNION
SELECT '003','����','����Ա','10011','2017/12/27',5000,2000,'1701'UNION
SELECT '004','����','����','10010','2015/11/26',5200,5000,'1702'UNION
SELECT '005','����','����Ա','10011','2018/10/27',6600,5200,'1701'UNION
SELECT '006','����','����','10010','2014/11/25',4600,2000,'1702'


--Dept ���ű�,Deptno ���ű��,Deptname ��������,Location ��ַ
CREATE table tb_Dept(
	Deptno nvarchar(32)primary key,
	Deptname nvarchar(32),
	Location nvarchar(32)
)
INSERT INTO tb_Dept
SELECT '1700','45634','����ʡ������' UNION
SELECT '1701','SALES','����ʡ������' UNION
SELECT '1702','�廪it','����ʡ�ܿ���' 



--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT *
from tb_emp em
WHERE em.deptno =(
	SELECT de.Deptno
	from tb_Dept de
	where Deptname = 'SALES')

--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT *
from tb_emp em
where em.sal =(

	SELECT max(sal)
	from tb_emp
	
)
--3.��ѯ�����������нˮ��Ա����ţ�����
SELECT de.Deptname,em.empno,em.ename
from tb_emp em , tb_Dept de
where em.sal IN(

	SELECT max(sal)
	from tb_emp em,tb_Dept de
	WHERE de.Deptno = em.deptno
	GROUP BY de.Deptno)
	
AND de.Deptno = em.deptno
	

--4.��ѯ���������нˮ��Ա����Ϣ
SELECT *
from  tb_Dept de ,tb_emp em 
where em.sal IN(

	SELECT max(sal)
	from tb_emp em,tb_Dept de
	WHERE de.Deptno = em.deptno
	GROUP BY de.Deptno
	
	)	
AND de.Deptno = em.deptno

--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 

SELECT *
from tb_emp em,tb_Dept de 
where em.sal IN (
	SELECT em.sal 
	from tb_emp em INNER JOIN tb_Dept de
	ON de.Deptno = em.deptno
	
	WHERE  em.sal >(
		SELECT AVG(em.sal)
		from tb_emp em,tb_Dept de
		WHERE de.Deptno = em.deptno
		GROUP BY de.Deptno
		)

	GROUP BY em.deptno
	)
	AND de.Deptno = em.deptno


--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT *
from tb_emp em
WHERE em.deptno =(
	SELECT de.Deptno
	from tb_Dept de
	where Deptname = 'SALES')

--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT *
from tb_emp em
where em.ename= 'BLAKE'

--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT *
from tb_emp 
where job = (
	SELECT em.job
	from tb_emp em
	WHERE em.ename='SMITH')

--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 


--10.��ѯ��NEW YORK����������Ա�� 
SELECT *
from tb_emp em
WHERE em.deptno =(
	SELECT de.Deptno
	from tb_Dept de
	where Deptname = 'NEW YORK')
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 


--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 

--13���ҳ�нˮ��ߵ������ 
                                                                                                             
SELECT TOP 5*FROM tb_emp 
 SELECT em.
 from tb_emp em
 
--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT *
from tb_emp em,tb_Dept de 
WHERE em.deptno IN 
	(SELECT COUNT(em.deptno)
	from tb_Dept de ,tb_emp em 
	where  de.Deptno = em.deptno
	group BY de.Deptno
	)

and em.deptno > 2
	
--15����ѯ�����ְ��5��Ա��

--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����

