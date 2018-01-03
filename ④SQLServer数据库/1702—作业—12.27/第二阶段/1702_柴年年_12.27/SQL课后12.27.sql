--EMP��ṹ˵����
--emp���ǹ�Ա��Ϣ�� 
--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--job Ա���Ĺ�����ʲô��������Ա�������
--mgr �ϼ����     hiredate�ܹ�����   sal����
--comm����   deptno���ű��   Dept ���ű�
--Deptno ���ű��   Deptname ��������   Location ��ַ

DELETE from tb_emp
CREATE database db_emplyee
CREATE table tb_emp(
emono nvarchar(32)primary key,
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate date,
sal decimal(8,4),
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_dept(deptno),
foreign key(mgr) references tb_superior(mgr)
)
INSERT INTO tb_emp VALUES 
(10014,'hjkh','����','1001','2014-11-04',8800,2000,10),
(10002,'tom','����Ա','1002','2014-05-16',7000,3000,03),
(10003,'lucy','����Ա','1003','2012-03-17',6000,3500,02),
(10004,'�ֿ�','ǰ̨','1004','2016-10-05',8000,3600,05),
(10005,'³Ѹ','����','1003','2017-06-03',7000,2600,07),
(10006,'����˳','ǰ̨','1002','2010-11-15',6000,4100,05),
(10007,'��˧��','����','1004','2003-06-16',7000,3600,03),
(10008,'�ﾴ�','����Ա','1001','2009-12-25',9500,4100,08),
(10009,'����','����','1002','2015-10-19',5400,2900,06),
(10010,'jack','����','1003','2013-05-16',7500,3200,07),
(10011,'mike','����','1004','2008-10-25',8500,4100,01),
(10012,'murray','����','1002','2013-06-23',8800,5400,04),
(10013,'join','����','1003','2009-12-12',7600,2100,09)
create table tb_superior(
mgr nvarchar(32) primary key,
suname nvarchar(16) not null
)
insert into tb_superior values
(1001,'BLAKE'),
(1002,'11111'),
(1003,'22222'),
(1004,'33333')
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(16) not null,
Location nvarchar(32)
)
--Deptno ���ű��   Deptname ��������   Location ��ַ
INSERT INTO tb_dept VALUES
(01,'SALES','1��'),
(02,'SMITH','lenden'),
(03,'vwx','NEW YORK'),
(04,'abc','2��'),
(05,'def','3��'),
(06,'ghi','5��'),
(07,'jkl','6��'),
(08,'mno','4��'),
(09,'pqr','7��'),
(10,'stu','8��')
select * from tb_emp
--1.��ѯ���������ǡ�SALES����Ա����Ϣ
select * from tb_emp,tb_dept 
where tb_dept.deptname = 'SALES'
and tb_emp.deptno=tb_dept.deptno
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ
select * from tb_emp where sal=(
select max(sal) from tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ�������
select emono,ename,deptno from tb_emp where sal in (
select max(sal) from tb_emp group by deptno)
--4.��ѯ���������нˮ��Ա����Ϣ
select * from tb_emp where sal in(
select max(sal) from tb_emp group by deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ
select * from tb_emp where sal>any(
select avg(sal)from tb_emp group by deptno)
--6.��ѯ���������ǡ�SALES����Ա����Ϣ
select * from tb_emp,tb_dept 
where tb_dept.deptname='SALES'
and tb_emp.deptno=tb_dept.deptno
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ
select * from tb_emp,tb_superior where tb_superior.suname='BLAKE'
and tb_emp.mgr=tb_superior.mgr
--8.��ѯ��SMITH������ͬ��Ա����Ϣ
select * from tb_emp,tb_dept where tb_dept.deptname='SMITH'
and tb_emp.deptno=tb_dept.deptno
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű��
select e.deptno from tb_emp e group by e.deptno having avg(sal)<(
select sal from tb_emp where deptno='10')
--10.��ѯ��NEW YORK����������Ա��
select * from tb_emp where tb_emp.deptno in(
select deptno from tb_dept where Location='NEW YORK')
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı���
--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
--13���ҳ�нˮ��ߵ������
select top 5 * from tb_emp order by sal desc
--14���г�����������Ա�������в��źͲ�����Ϣ
--15����ѯ�����ְ��5��Ա��
select top 5*from tb_emp order by hiredate desc
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
select ename,sal from tb_emp where sal in(
select e.job,min(e.sal) from tb_emp e group by e.job)
--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
select deptname from tb_dept where deptno in(
select e.deptno from tb_emp e where e.sal =(
select min(sal) from tb_emp where job='����'))
