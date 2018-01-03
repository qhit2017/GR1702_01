CREATE database db_staffs
GO
USE db_staffs 
GO 
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(32),
location nvarchar(32))
GO 
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(32),
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal money,
comm money,
deptno nvarchar(32) foreign key references tb_dept(deptno))
GO 
INSERT INTO tb_dept VALUES 
('10','personnel','beijing'),
('20','planning','shanghai'),
('30','SALES','newyork')
UPDATE tb_dept SET deptname ='personnel' WHERE deptno ='10'
UPDATE tb_dept SET deptname ='planning' WHERE deptno ='20'
SELECT * FROM tb_dept 
GO 
DELETE tb_emp 
INSERT INTO tb_emp VALUES 
('001','Lily','�ܲ�',null,'2001-12-04',15000,6300,'10'),
('002','Tom','����','004','2006-10-13',8500,4500,'20'),
('003','Jason','����','001','2014-06-26',9500,2300,'30'),
('004','Mary','�ܾ���','001','2012-08-16',12000,3000,'10'),
('005','blake','����','004','2015-10-22',8600,5200,'20'),
('006','lacy','CLERK','002','2008-09-10',4100,2300,'30'),
('007','King','MANAGER','005','2016-12-12',5500,2000,'10'),
('008','Johnson','smith','005','2017-01-16',3500,2000,'20'),
('009','Stewart','CLERK','005','2004-07-26',4600,3000,'30'),
('010','Powell','smith','002','2009-04-12',4400,2100,'10'),
('011','perry','CLERK','005','2003-05-17',2500,3000,'20'),
('012','Marshall','MANAGER','002','2012-08-14',8600,4200,'30'),
('013','James','CLERK','005','2014-05-19',3500,2000,'10'),
('014','Long','MANAGER','002','2015-06-13',4500,3000,'20'),
('015','Rose','CLERK','005','2016-07-18',2800,NULL,'30')
GO 
--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where de.deptname ='SALES'
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * FROM tb_emp where sal=(SELECT MAX(sal) FROM tb_emp) 
----3.��ѯ�����������нˮ��Ա����ţ�������覴ã� 
SELECT e.empno as ���,e.ename as ���� FROM tb_emp e where e.empno IN 
(select empno from tb_emp emp where emp.sal IN 
(SELECT MAX(sal) FROM tb_emp em RIGHT JOIN tb_dept de ON em.deptno =de.deptno group by de.deptno))
----4.��ѯ���������нˮ��Ա����Ϣ ��覴ã�
SELECT * FROM tb_emp e where e.empno IN 
(select empno from tb_emp emp where emp.sal IN 
(SELECT MAX(sal) FROM tb_emp em RIGHT JOIN tb_dept de ON em.deptno =de.deptno group by de.deptno))
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * FROM tb_emp e where e.empno IN 
(select emp.empno from tb_emp emp where emp.sal IN 
(SELECT em.empno FROM tb_emp em RIGHT JOIN tb_dept de ON em.deptno =de.deptno group by de.deptno,em.sal,em.empno HAVING em.sal>AVG(em.sal)))
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where de.deptname ='SALES'
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where em.ename ='BLAKE'
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where em.job ='SMITH' 
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
SELECT de.deptno as 'ƽ������<10���ŵĲ��ű��' from tb_dept de WHERE de.deptno IN
(select em.deptno from tb_emp em group by em.deptno having avg(em.sal)<
(select avg(emp.sal) from tb_emp emp group by emp.deptno having emp.deptno='10'))
--10.��ѯ��NEW YORK����������Ա�� 
SELECT * FROM tb_emp em INNER JOIN tb_dept de on de.deptno =em.deptno where de.location ='newyork' 
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 
select (replace(CONVERT(decimal(18,2),
(SELECT count(em.empno) from tb_emp em where em.deptno ='10')*100/(SELECT count(emm.empno) from tb_emp emm)),
' ','') + '%') as '10�Ų���Ա����ռ����'
--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
SELECT e.ename as ���� from tb_emp e where e.sal> 
 (SELECT MAX(em.sal)from tb_emp em WHERE em.mgr IN 
 (select emp.empno from tb_emp emp where emp.job='����'))
--13���ҳ�нˮ��ߵ������
SELECT top 5 em.ename as ����,em.sal as нˮ from tb_emp em ORDER BY em.sal DESC  
--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT * FROM tb_dept where deptno IN 
(select em.deptno from tb_emp em group by em.deptno having count(em.empno)>3)
--15����ѯ�����ְ��5��Ա��
SELECT top 5 em.ename as ����,em.hiredate as ��ְʱ�� from tb_emp em ORDER BY em.hiredate DESC  
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
SELECT job,COUNT(empno) from tb_emp GROUP BY job HAVING min(sal+comm)>1500  
----17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����(ȱ��������)
SELECT job as ְλ,MIN(sal)as ���нˮ from tb_emp e GROUP BY e.job 
--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
SELECT de.deptname as нˮ��;��������� from tb_dept de where de.deptno IN 
(select em.deptno from tb_emp em where em.job='����' and sal=
(select min(sal)from tb_emp where job='����' ))
