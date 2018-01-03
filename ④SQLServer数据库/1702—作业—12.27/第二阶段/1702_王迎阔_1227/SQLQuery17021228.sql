CREATE database db_table
USE db_table
--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(32) not null,
location nvarchar(16) )
INSERT INTO tb_dept(deptno,deptname,location)
VALUES(01,'RD','china'),
(02,'IM','America '),
(03,'CS','England ')

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
ename nvarchar(32) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate datetime,
sal money,
comm money,
deptno nvarchar(32)
foreign key (deptno) references tb_dept (deptno)
)
INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES(1001,'SALES','����Ա','001',2014-01-15,3000,200,'01'),
(1002,'mrsa','����Ա','002',2014-01-15,3000,200,'01'),
(1003,'lilei','����Ա','003',2014-01-15,3000,200,'02'),
(1004,'Lili','����','004',2014-01-15,3000,200,'02'),
(1005,'SMITH','����Ա','005',2014-01-15,3000,200,'03'),
(1006,'bory','����','006',2014-01-15,3000,200,'03'),
(1007,'BLAKE','����','007',2014-01-15,3000,200,'01')

--1.��ѯ���������ǡ�RD����Ա����Ϣ 
SELECT * FROM tb_dept WHERE deptname = 'RD'
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ
SELECT *FROM tb_emp WHERE sal=(SELECT MAX(sal) FROM tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT em.empno,em.ename 
from tb_emp em WHERE sal=(SELECT MAX(sal) from tb_emp)
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * FROM tb_emp where sal in (SELECT MAX(sal) FROM tb_emp GROUP BY deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT *
from tb_emp
WHERE sal>(SELECT AVG(sal) FROM tb_emp) 
--6.��ѯ���������ǡ�RD����Ա����Ϣ 
SELECT * FROM tb_dept WHERE deptname = 'RD'
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * FROM tb_emp WHERE ename = 'BLAKE'
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * FROM tb_emp WHERE job ='SMITH'
--9.��ѯƽ�����ʱ�1���ŵ�
SELECT deptno from tb_emp GROUP BY deptno HAVING avg(sal)<(
select avg(em.sal)
from tb_emp em WHERE em.deptno='1')      
--10.��ѯ��RD����������Ա�� 
SELECT*
from tb_emp
WHERE deptno IN(
SELECT de.deptno
from tb_dept de
WHERE de.location='RD')
--11.��ѯ02�Ų��ŵ�Ա����������˾����ռ�ı�����
 
--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 

--13���ҳ�нˮ��ߵ������ 
SELECT top 5 *FROM tb_emp em                                            
ORDER BY em.hiredate ASC
--14���г�����������Ա�������в��źͲ�����Ϣ

--15����ѯ�����ְ��5��Ա��

--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����

--ɾ��ĳ���ֶ�
--ALTER table tb_XXX drop ��Ҫɾ������ 
--�����Լ������Ҫ��ɾ��Լ������
--ALTER table tb_XXX drop constraint(Լ��)+Լ������
--�޸��ֶ�
--ALTER table tb_  alter column recommend �޸����� 

