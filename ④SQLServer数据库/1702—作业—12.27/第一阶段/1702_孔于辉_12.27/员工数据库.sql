CREATE database db_emp111

--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ

CREATE table tb_dert(
deptho nvarchar(32) primary key,
deptnname nvarchar(32)not null,
location nvarchar(32))
----- �쵼��
---���
----����
CREATE table tb_leader(
lno nvarchar(16)primary key,
lname nvarchar(16) not null,
lsal money)
---------emp���ǹ�Ա��Ϣ�� 
--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--mgr �ϼ����
--hiredate�ܹ�����
--sal����
--comm����
--deptno���ű��
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
lno nvarchar(16),
hiredate datetime,
sal money,
com money,
deptno nvarchar(32),
foreign key(deptno) references tb_dert(deptho),
foreign key(lno) references tb_leader(lno))
INSERT INTO tb_dert VALUES 
('1','NEWYORK','�Ϻ�'),
('2','BGHRD','����'),
('3','NHRTS','����'),
('4','LOKJD','�Ͼ�'),
('5','CUHDJ','����'),
('6','HHYSD','����'),
('7','HKIDB','���'),
('8','KSYDH','���'),
('9','VDSHV','֣��'),
('10','NEWYORK','�ܿ�')
INSERT INTO tb_leader VALUES
('13','NEWYORK',55896),
('1','SALES',36596),
('2','JSDGU',25896),
('3','VMVHC',25896),
('4','CASIO',25896),
('5','VSISN',258276),
('6','CISUC',29896),
('7','BLHHH',25896),
('8','FDUSS',649896),
('9','FIDID',62696),
('10','CVIVK',28496)
SELECT *FROM tb_emp 
INSERT INTO tb_emp VALUES 
('0036','SALES','1','2012-05-04',444600,600,'2'),
('0032','SALES','1','2012-05-04',444600,600,'2'),
('0033','SALES','1','2012-05-04',444600,600,'2'),
('0034','SALES','1','2012-05-04',444600,600,'2'),
('0035','SALES','1','2012-05-04',444600,600,'2'),
('0037','SALES','1','2012-05-04',444600,600,'2'),
('0012','BG','2','2017-05-04',43600,600,'2'),
('0013','NH','3','2015-05-04',152600,600,'3'),
('0014','LO','4','2017-05-04',25600,600,'4'),
('0015','CU','5','2014-05-04',167700,600,'5'),
('0016','HH','6','2017-05-04',132660,600,'6'),
('0017','HK','7','2017-05-04',130200,600,'7'),
('0018','KS','8','2016-05-04',1340,600,'8'),
('0019','VD','9','2014-05-04',15000,600,'9'),
('0020','NE','10','2013-05-04',1500,1000,'10'),
('001','SMITH','1','2012-05-04',4600,600,'1'),
('002','BGHRD','2','2017-05-04',3600,600,'2'),
('003','NHRTS','3','2015-05-04',52600,600,'3'),
('004','LOKJD','4','2017-05-04',5600,600,'4'),
('005','CUHDJ','5','2014-05-04',67700,600,'5'),
('006','HHYSD','6','2017-05-04',32660,600,'6'),
('007','HKIDB','7','2017-05-04',30200,600,'7'),
('008','KSYDH','8','2016-05-04',340,600,'8'),
('009','VDSHV','9','2014-05-04',5000,600,'9'),
('010','NEWYORK','10','2013-05-04',500,1000,'10')

-----------------------------------------------------

--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * from tb_emp em WHERE  em.deptno =( 
	SELECT de.deptho from tb_dert de where de.deptnname ='SALES')

--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * FROM tb_emp em WHERE em.sal = (
	SELECT MAX(eem.sal)from tb_emp eem)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT em.empno ,em.ename  FROM tb_emp em WHERE em.sal IN (
	SELECT MAX(eem.sal)from tb_emp eem GROUP BY eem.deptno )
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * FROM tb_emp em WHERE em.sal IN (
	SELECT MAX(eem.sal)from tb_emp eem GROUP BY eem.deptno )
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ
SELECT * FROM tb_emp WHERE  sal > ANY (
	SELECT AVG(em.sal)from tb_emp em GROUP BY em.deptno )
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * from tb_emp WHERE lno = (
	SELECT le.lno  from tb_leader le where le.lname ='SALES')
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * from tb_emp em WHERE em.lno IN (
	SELECT le.lno  from tb_leader le WHERE le.lname ='BLAKE')
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * from tb_emp em WHERE em.deptno =(
	SELECT em.deptno from tb_emp em WHERE em.ename ='SMITH')
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
SELECT eem.deptno from tb_emp eem GROUP BY deptno HAVING  AVG(eem.sal)<( 
	SELECT AVG(em.sal ) from tb_emp em where deptno ='10')
--10.��ѯ��NEWYORK����������Ա�� 
SELECT * FROM tb_emp WHERE deptno in (
	SELECT de.deptho  from tb_dert de WHERE de.deptnname ='NEWYORK')
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 
--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 
SELECT em.ename from tb_emp em GROUP BY em.ename  HAVING  MAX(em.sal)> ANY(
	SELECT le.lsal  from tb_leader le )
--13���ҳ�нˮ��ߵ������ 
SELECT TOP 5 em.sal,em.empno  from tb_emp em ORDER BY em.sal DESC  
--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT * from tb_dert de WHERE de.deptho IN(  
	SELECT em.deptno  from tb_emp em GROUP BY em.deptno HAVING COUNT(em.empno)>3)
--15����ѯ�����ְ��5��Ա��
SELECT  TOP 5 * from tb_emp eem WHERE eem.hiredate IN  (
	SELECT TOP 5 em.hiredate  from tb_emp em ORDER BY  em.hiredate DESC )
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
SELECT DISTINCT  MIN(em.sal), em.ename from tb_emp em GROUP BY em.deptno,em.ename 
--18����нˮ��͵Ĺ�Ա���ڲ��ŵ�����
SELECT deptnname  from tb_dert where deptho IN(
	SELECT eem.deptno from tb_emp eem WHERE eem.sal =(
		SELECT MIN(em.sal)from tb_emp em ))
--19����нˮ��͵Ĳ��ž������ڲ��ŵ�����
SELECT lee.lname from tb_leader lee WHERE lee.lsal =(
	SELECT MIN(le.lsal)from tb_leader le)