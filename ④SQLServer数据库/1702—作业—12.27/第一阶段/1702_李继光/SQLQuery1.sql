--EMP��ṹ˵����
CREATE database db_EMP
--emp���ǹ�Ա��Ϣ��        ����
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
ename nvarchar(32),
job nvarchar(32),
mgr nvarchar(32),--�ϼ����
foreign key(mgr) references tb_superior(mgr),
hiredate date,
sal money,
comm money,
Deptno nvarchar(16),--���ű��
foreign key(Deptno) references tb_Dept(Deptno),
)
---------------------------------------------------------------------
--Dept ���ű�     ����
--Deptno ���ű��
--Deptname ��������
--Location ��ַ
CREATE table tb_Dept(
Deptno nvarchar(16) primary key,---���ű��
Deptname nvarchar(16), --��������
Location  nvarchar(32)) --��ַ)
-------------------------------
--�ϼ���
create table tb_superior(
mgr nvarchar(32) primary key,
mname nvarchar(32))--�ϼ�����
----------------------��������----------------------------------
---�ϼ���---
INSERT INTO tb_superior (mgr, mname)VALUES 
('001','BLAKE'),
('002','������'),
('003','������'),
('004','ʱ����'),
('005','����')

---���ű�---
INSERT INTO tb_Dept( Deptno, Deptname, Location)VALUES
('05','SALES','�Ϻ�'),
('10','rd','����'),
('15','fae','����'),
('20','asd','����'),
('30','bnu','����'),
('45','lan','NEW YORK'),
('50','fei','�Ͼ�')  
---��Ա��Ϣ��---
INSERT INTO tb_emp (empno,ename,job,mgr,hiredate,sal,comm,Deptno)
VALUES ('01','tom','����Ա','004','2005-7-5',2000,1900,'05'),
('02','mary','����','001','2004-10-15',4000,1500,'45'),
('03','����','����','003','2003-7-7',4000,1500,'30'),
('04','SMITH','����Ա','005','2005-10-5',2500,1500,'05'),
('05','����','��๤','003','2005-3-15',1500,1500,'15'),
('06','����','����Ա','002','2002-1-12',3000,500,'05'),
('07','����','����','001','2007-10-24',4000,500,'15'),
('08','�Ϻ�','����','004','2005-8-5',2000,1500,'10'),
('09','����','����Ա','002','2007-1-5',2500,700,'30'),
('10','����','�ͷ�','002','2010-3-5',3000,800,'50'),
('11','½Ц��','�ͷ�','002','2010-3-6',3000,1000,'15'),
('12','������','����','001','2005-1-5',2000,1500,'10')
----------------------------------------------------------------------
--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp where Deptno =  
(SELECT Deptno from tb_Dept where Deptname = 'SALES')  
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * FROM tb_emp where sal = (SELECT MAX(sal) from tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT empno,ename from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * from tb_emp where sal > ANY
(SELECT AVG(sal) from tb_emp  
GROUP BY Deptno)
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Deptname ='SALES')
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * FROM tb_emp where mgr =(
SELECT mgr from tb_superior where mname ='BLAKE')
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * FROM tb_emp where job = (
SELECT job from tb_emp where ename = 'SMITH')
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
SELECT Deptno from tb_emp group BY Deptno HAVING avg(sal) < (
SELECT AVG(tb_emp.sal) from tb_emp,tb_Dept 
where tb_Dept.Deptno = '10'
AND tb_emp.Deptno = tb_Dept.Deptno) 
--10.��ѯ��NEW YORK����������Ա�� 
select ename  from tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Location = 'NEW YORK')
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������

--13���ҳ�нˮ��ߵ������ 
SELECT TOP 5 * from tb_emp ORDER BY sal DESC 
--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT * from tb_Dept where Deptno IN  
(SELECT Deptno from tb_emp group BY tb_emp.Deptno HAVING COUNT(ename)>=3)
--15����ѯ�����ְ��5��Ա��
SELECT TOP 5 * FROM tb_emp ORDER BY hiredate DESC
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
SELECT em.ename as ��Ա����,em.sal 
from tb_emp em
WHERE em.sal IN(
SELECT min(em.sal)
from tb_emp em
GROUP BY em.job)
--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
SELECT Deptname  from tb_Dept where Deptno = 
	(SELECT top 1 Deptno from tb_emp where job = '����' ORDER BY sal ) 
