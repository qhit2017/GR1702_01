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

--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ

CREATE database db_emp
USE db_emp
----
CREATE table tb_mgr(
mgr nvarchar(32) primary key,
mname nvarchar(32) not null)
----
CREATE table tb_Dept(
Deptno nvarchar(32) primary key,
Deptname nvarchar(32) not null,
Location nvarchar(32) not null)
----
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(32) not null,
job nvarchar(32) not null,
mgr nvarchar(32) ,
foreign key(mgr) references tb_mgr(mgr),
hiredate date not null,
sal money not null,
comm money not null,
deptno nvarchar(32) ,
foreign key(deptno) references tb_Dept(deptno))

INSERT INTO tb_mgr(mgr,mname)VALUES
('001','BLAKE'),('002','������'),('003','������'),('004','ʱ����'),('005','����')INSERT INTO tb_Dept(Deptno,Deptname,Location)VALUES('05','SALES','�Ϻ�'),('10','rd','����'),('15','fae','����'),('20','asd','����'),('30','bnu','����'),('45','lan','NEW YORK'),('50','fei','�Ͼ�')INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)VALUES('01','tom','����Ա','004','2005-7-5',2000,1900,'05'),('02','mary','����','001','2004-10-15',4000,1500,'45'),('03','����','����','003','2003-7-7',4000,1500,'30'),('04','SMITH','����Ա','005','2005-10-5',2500,1500,'05'),('05','����','��๤','003','2005-3-15',1500,1500,'15'),('06','����','����Ա','002','2002-1-12',3000,500,'05'),('07','����','����','001','2007-10-24',4000,500,'15'),('08','�Ϻ�','����','004','2005-8-5',2000,1500,'10'),('09','����','����Ա','002','2007-1-5',2500,700,'30'),('10','����','�ͷ�','002','2010-3-5',3000,800,'50'),('11','½Ц��','�ͷ�','002','2010-3-6',3000,1000,'15'),('12','������','����','001','2005-1-5',2000,1500,'10')--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp WHERE deptno=(
SELECT tb_Dept.Deptno from tb_Dept where Deptname='SALES' )
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT *  from tb_emp where sal = (
	SELECT max(sal) from tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT * FROM tb_emp where empno in
(SELECT empno FROM tb_emp GROUP BY deptno,empno,sal HAVING sal in(
SELECT MAX(sal) from tb_emp GROUP BY deptno))
	
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * FROM tb_emp where empno in
(SELECT empno FROM tb_emp WHERE sal =any (
SELECT MAX(sal) from tb_emp GROUP BY deptno))

SELECT TOP 1 ename FROM
tb_emp  GROUP BY deptno,ename  ORDER BY sal desc

--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * from tb_emp WHERE empno in(
SELECT empno FROM tb_emp GROUP BY deptno,empno,sal HAVING sal > ANY (
SELECT AVG(sal) from tb_emp GROUP BY deptno))

--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT*FROM tb_emp WHERE
deptno=(SELECT tb_Dept.Deptno from tb_Dept WHERE Deptname='SALES')

--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT*FROM tb_emp WHERE
mgr=(SELECT mgr from tb_mgr where mname='BLAKE' )

--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT* FROM tb_emp where job=(
SELECT job from tb_emp where ename='SMITH')

--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
SELECT deptno from tb_emp GROUP BY deptno HAVING AVG(sal)<(
SELECT AVG(sal) from tb_emp GROUP BY deptno HAVING deptno='10')

--10.��ѯ��NEW YORK����������Ա�� 
SELECT ename from tb_emp where deptno=(
SELECT tb_Dept.Deptno from tb_Dept WHERE Location='NEW YORK')


--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 
--13���ҳ�нˮ��ߵ������ 
SELECT TOP 5 em.ename 
from tb_emp em 
order BY sal DESC

--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT de.Location,de.Deptno,de.Deptname from tb_Dept de
WHERE de.Deptno IN (
SELECT em.deptno 
from tb_emp em 
group BY em.deptno
HAVING COUNT(em.empno)>=3 )
--15����ѯ�����ְ��5��Ա��
SELECT TOP 5 em.ename from tb_emp em ORDER BY em.hiredate asc
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
select COUNT(empno),job from tb_emp group BY job HAVING job in(SELECT em.job from tb_emp em GROUP BY em.job HAVING MIN(em.sal)>1500)
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
SELECT MIN(sal),job,ename from tb_emp GROUP BY job,ename

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����

