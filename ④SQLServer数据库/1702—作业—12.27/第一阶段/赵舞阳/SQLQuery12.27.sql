CREATE database db_emp
USE db_emp
CREATE table tb_employee(
empno nvarchar(32)primary key,
ename nvarchar(16)not null,
job nvarchar(32),
mgr char(32),
hiredate date,
sal money,
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_dept(deptno)
)
CREATE table tb_dept(
deptno nvarchar(32)primary key,
deptname nvarchar(16),
location nvarchar(50)
)
INSERT INTO tb_employee VALUES
('20170101','����','����Ա','01','2011-1-4',2000,500,'10'),
('20170102','����','����','02','2002-11-14',5000,1000,'20'),
('20170103','���㻻','����Ա','01','2015-3-27',800,1000,'10'),
('20170104','���ෲ','����Ա','02','2016-5-1',950,100,'20'),
('20170105','����','����Ա','02','2012-12-4',2150,350,'20'),
('20170106','BLAKE','����','01','2018-1-2',8000,2000,'30'),
('20170107','SMITH','����Ա','01','2017-7-1',1800,100,'10'),
('20170108','���Ȼ�','����Ա','02','2013-6-30',3600,400,'20'),
('20170109','������','����Ա','01','2010-4-4',4200,200,'10'),
('20170110','������','����Ա','02','2011-1-6',7800,0,'20')
INSERT INTO tb_dept VALUES
('10','SALES','�Ϻ�'),
('20','RD','����'),
('30','RDB','����')
--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * from tb_employee em 
where em.deptno IN(
	SELECT de.deptno
	from tb_dept de
	where deptname ='SALES'
	AND em.deptno=de.deptno)
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * from tb_employee where sal IN(
SELECT max(sal) from tb_employee)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT empno Ա�����,ename ����,deptno ���� from tb_employee where sal IN(
SELECT max(sal) from tb_employee
group BY deptno)
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * from tb_employee where sal IN(
SELECT max(sal) from tb_employee
group BY deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT sal,deptno from tb_employee group by deptno, sal HAVING sal>any(
SELECT avg(sal) from tb_employee group BY deptno)
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 

--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 

--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
--10.��ѯ��NEW YORK����������Ա�� 
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 
--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 
--13���ҳ�нˮ��ߵ������ 
select TOP 5 sal нˮ from tb_employee order BY sal desc
--14���г�����������Ա�������в��źͲ�����Ϣ
--15����ѯ�����ְ��5��Ա��
select TOP 5 hiredate ��ְʱ�� from tb_employee order BY hiredate desc
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
SELECT deptno from tb_dept where deptno in(
SELECT min(sal) from tb_employee where job='����')