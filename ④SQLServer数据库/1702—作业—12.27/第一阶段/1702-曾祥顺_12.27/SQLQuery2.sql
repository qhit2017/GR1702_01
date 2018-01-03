CREATE database db_emp1
 CREATE table tb_emp(
 empno nvarchar(32) primary key,
 ename nvarchar(32),
 job nvarchar(18),
 mgr nvarchar(18),
 hiredate datetime,
 sal money,
 comm money,
 deptno nvarchar(32)
 foreign key(deptno) references tb_dept(deptno)
 )
 INSERT INTO tb_emp
 VALUES ('001','BLAKE','�쵼��','0001','2017-6-20',7000,500,'01'),
 ('002','������','������','0002','2017-6-21',7000,500,'02'),
 ('003','���','������','0003','2017-6-20',7000,500,'03'),
 ('004','���ڻ�','��๤','0004','2017-6-20',7000,500,'04'),
 ('005','ʢ����','��ҹ��','0005','2017-6-25',7000,500,'05'),
 ('006','����˳','��ɶ�','0006','2017-6-20',7000,500,'06'),
 ('007','������','������','0007','2017-6-22',7000,500,'07'),
 ('008','������','��ҹ��','0008','2017-6-20',7000,500,'08'),
 ('009','������','������','0009','2017-6-20',7000,500,'09'),
 ('010','������','��๤','0010','2017-6-21',7000,500,'10'),
 ('011','�Ľ��','������','0011','2017-6-25',7000,500,'01'),
 ('012','BLAKE1','�쵼��','0001','2017-6-20',9000,600,'02')
 -----
 CREATE table tb_dept(
 deptno nvarchar(32) primary key,
 deptname nvarchar(32),
 location nvarchar(32)
 )
 --------
 INSERT INTO tb_dept 
 VALUES('01','sales','�ӱ�'),
 ('02','bbc','����'),
 ('03','abc','����'),
 ('04','fbi','�Ӷ�'),
 ('05','jjc','NEW YORK'),
 ('06','xjj','����'),
 ('07','jjx','����'),
 ('08','ccb','����'),
 ('09','ssb','����'),
 ('10','cbc','����')
 
--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * from tb_emp em LEFT JOIN tb_dept de
on de.deptno=em.deptno 
WHERE de.deptname='SALES'
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * from tb_emp where sal =(
	SELECT MAX(sal) from tb_emp
)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT em.empno,em.ename from tb_emp em 
WHERE  em.sal in(
SELECT max(eem.sal) from tb_emp eem
GROUP BY eem.deptno
)
--4.��ѯ���������нˮ��Ա����Ϣ 

--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ
SELECT *FROM tb_emp where empno =(
SELECT em.empno from tb_emp em group by em.deptno,em.empno,em.sal having sal >any(
select AVG(sal) from tb_emp eem GROUP BY eem.deptno,eem.sal ))
----

SELECT *
from
(SELECT deptno,AVG(sal) b from tb_emp group BY deptno)a,tb_emp em
WHERE a.deptno=em.deptno
AND a.b<em.sal


--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * from tb_emp em,tb_dept de WHERE de.deptname='SALES'AND em.deptno=de.deptno 
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT *FROM tb_emp EM WHERE EM.ename='BLAKE' AND EM.job='�쵼��'
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT *
FROM tb_emp EM
WHERE EM.deptno in(SELECT DEP.deptno FROM tb_dept DEP , tb_emp EMP WHERE EM.ename='BLAKE'
AND DEP.deptno= EM.deptno
 )
 ---
 SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where em.ename ='BLAKE' 
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű��
SELECT em.deptno from tb_emp em group BY em.deptno having AVG(em.sal)<any
(select sal from tb_emp eem where eem.deptno='10'
)
--10.��ѯ��NEW YORK����������Ա�� 
SELECT* from tb_dept de, tb_emp em
WHERE de.deptno= em.deptno
AND de.location='NEW YORK'

--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
 SELECT em.ename from tb_emp em where em.sal>(
	SELECT max(ee.sal) from tb_emp ee WHERE ee.job='������'
 )AND em.job='�쵼��'
--13���ҳ�нˮ��ߵ������

SELECT TOP 6 em.sal from tb_emp em   ORDER BY em.sal desc 

--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT * FROM tb_dept where deptno IN(
SELECT em.deptno from tb_emp em group BY em.deptno 
HAVING count(em.deptno)>=2
)
--15����ѯ�����ְ��5��Ա��
SELECT top 5 * from tb_emp em ORDER BY em.hiredate ASC 
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
SELECT COUNT(em.deptno),em.job from tb_emp em LEFT join tb_dept de 
ON de.deptno= em.deptno
 GROUP BY em.job having min(em.sal)>1500
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
SELECT em.ename,em.sal from tb_emp em WHERE em.sal IN(
select min(sal) from tb_emp group BY job)
-----
SELECT em.ename,em.sal
from (select min(sal),job from tb_emp group BY job)a right join
tb_emp em
WHERE cd.job=em.job
----
SELECT job as ְλ,MIN(sal)as ���нˮ from tb_emp e GROUP BY e.job 
--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
SELECT de.deptname as нˮ��;��������� from tb_dept de where de.deptno IN 
(select em.deptno from tb_emp em where em.job='�쵼��' and sal=
(select min(sal)from tb_emp where job='�쵼��' ))

 