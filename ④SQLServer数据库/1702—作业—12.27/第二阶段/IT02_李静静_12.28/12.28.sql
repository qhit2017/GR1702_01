CREATE database db_employee
USE db_employee
--EMP��ṹ˵����
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
ename nvarchar(32),
job nvarchar(32),
mgr nvarchar(32),
hiredate datetime,
sal money,
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_Dept(deptno)
)
INSERT INTO tb_emp VALUES
('01','LOMO','SALES','001','2017-12-12',2000,100,'1'),
('02','BLAKE','�쵼��','002','2017-12-12',4000,100,'2'),
('03','����','�쵼��','003','2017-12-12',3000,100,'3'),
('04','����','SMITH','004','2017-12-12',1000,100,'4'),
('05','����','SMITH','005','2017-12-12',3000,100,'5'),
('06','����','NEW YORK','006','2017-12-12',3000,100,'6'),
('07','С͵','NEW YORK','007','2017-12-12',3000,100,'7'),
('08','�й�','SALES','008','2017-12-12',3000,100,'8'),
('09','june','���ž���','009','2017-12-12',3000,100,'9'),
('010','mick','���ž���','0010','2017-12-12',3000,100,'10')

--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ
CREATE table tb_Dept(
deptno nvarchar(32) primary key,
deptname nvarchar(32),
location nvarchar(32)
)
INSERT INTO tb_Dept VALUES
('1','SALES','�Ϻ�'),
('2','�쵼��','�Ϻ�'),
('3','�쵼��','�Ϻ�'),
('4','SMITH','�Ϻ�'),
('5','SMITH','�Ϻ�'),
('6','NEW YORK','�Ϻ�'),
('7','NEW YORK','�Ϻ�'),
('8','SALES','�Ϻ�'),
('9','���ž���','�Ϻ�'),
('10','���ž���','�Ϻ�')
--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp em,tb_Dept de
WHERE em.deptno IN
(

	SELECT de.deptno
	from tb_Dept de
	WHERE de.deptname = 'SALES')
	
and em.deptno = de.deptno
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * FROM tb_emp
where sal=(select MAX(sal) from tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ�������  
SELECT em.empno,em.ename
from tb_emp em,tb_Dept de
where em.sal IN (

		SELECT max(em.sal)
		from tb_Dept de,tb_emp em
		where de.deptno = em.deptno
		GROUP BY em.deptno
		)
		
AND de.deptno = em.deptno
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT *
from tb_emp em,tb_Dept de
where em.sal IN (

		SELECT max(em.sal)
		from tb_Dept de,tb_emp em
		where de.deptno = em.deptno
		GROUP BY em.deptno
		)
		
AND de.deptno = em.deptno
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 

--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp em,tb_Dept de
WHERE em.deptno IN
(

	SELECT de.deptno
	from tb_Dept de
	WHERE de.deptname = 'SALES')
	
and em.deptno = de.deptno
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 

--8.��ѯ��SMITH������ͬ��Ա����Ϣ 

--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 

--10.��ѯ��NEW YORK����������Ա�� 
SELECT * FROM tb_emp em,tb_Dept de
WHERE em.deptno IN
(
   SELECT de.deptno
	from tb_Dept de
	WHERE de.deptname = 'NEW YORK')
	
and em.deptno = de.deptno
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 

--13���ҳ�нˮ��ߵ������
 SELECT TOP 5 sal from tb_emp order BY sal desc
--14���г�����������Ա�������в��źͲ�����Ϣ

--15����ѯ�����ְ��5��Ա��
SELECT TOP 5 hiredate from tb_emp order BY hiredate desc
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����



