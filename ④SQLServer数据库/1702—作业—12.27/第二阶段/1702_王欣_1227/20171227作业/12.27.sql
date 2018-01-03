CREATE database db_emp
---��Ա��Ϣ��
CREATE table tb_emp(
empno nvarchar(32)primary key,
ename nvarchar(16)not null,
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal decimal(8,4),
COMM money,
deptno nvarchar(16),
foreign key (deptno)references tb_dept(deptno))
INSERT INTO tb_emp VALUES
('20170101','����','����Ա','01','2011-1-4',2000,500,'10'),
('20170102','����','����','02','2002-11-14',5000,1000,'20'),
('20170103','���㻻','����Ա','01','2015-3-27',800,1000,'30'),
('20170104','���ෲ','����Ա','02','2016-5-1',950,100,'20'),
('20170105','����','����Ա','02','2012-12-4',2150,350,'20'),
('20170106','BLAKE','����','01','2018-1-2',8000,2000,'30'),
('20170107','SMITH','����Ա','01','2017-7-1',1800,100,'10'),
('20170108','���Ȼ�','����Ա','02','2013-6-30',3600,400,'20'),
('20170109','������','����Ա','01','2010-4-4',4200,200,'30'),
('20170110','������','����Ա','02','2011-1-6',7800,0,'30')
---���ű�
CREATE table tb_dept(
deptno nvarchar(16)primary key,
deptname  nvarchar(16),
location nvarchar(16))
INSERT INTO tb_dept VALUES
('10','SALES','�Ϻ�'),
('20','RD','NEW YORK'),
('30','MD','����')
--1.��ѯ���������ǡ�SALES����Ա����Ϣ
SELECT*FROM tb_dept where deptname='SALES'
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ
SELECT*FROM tb_emp where sal =(SELECT MAX(sal)from tb_emp) 
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT deptno,ename FROM tb_emp where sal =(SELECT MAX(sal)from tb_emp) 
--4.��ѯ���������нˮ��Ա����Ϣ
  SELECT*FROM tb_emp where sal in(SELECT MAX(sal)from tb_emp group BY deptno) 
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ
SELECT*FROM tb_emp where sal>(SELECT AVG(sal)from tb_emp ) 
--6.��ѯ���������ǡ�SALES����Ա����Ϣ
SELECT*FROM tb_dept where deptname='SALES'
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ
SELECT*FROM tb_emp where ename='BLAKE' 
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT ename from tb_emp where job =(
SELECT job from tb_emp where ename='SMITH')
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű��
SELECT em.deptno as ���ű��,avg(em.sal) 
FROM tb_emp em 
group BY em.deptno 
HAVING AVG(em.sal)<'10'
--10.��ѯ��NEW YORK����������Ա��
SELECT*FROM tb_dept where location='NEW YORK'
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı�����
 
--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
 SELECT em.ename from tb_emp em where em.sal>(
 SELECT MAX(em.sal) from tb_emp em where deptno=MAX(em.sal))
--13���ҳ�нˮ��ߵ������ 
--14���г�����������Ա�������в��źͲ�����Ϣ
--15����ѯ�����ְ��5��Ա��
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
