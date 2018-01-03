 CREATE database db_empty
USE db_empty

--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--job Ա���Ĺ�����ʲô��������Ա�������
--mgr �ϼ����
--hiredate�ܹ�����
--sal����
--comm����
--deptno���ű��

--������Ա��
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal money,
comm money,
deptno nvarchar(16)
foreign key (deptno) references tb_dept (deptno))  
-----
--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--job Ա���Ĺ�����ʲô��������Ա�������
--mgr �ϼ����
--hiredate�ܹ�����
--sal����
--comm����
--deptno���ű��
----
INSERT INTO tb_emp  VALUES
('1' ,'rose','����','01','2009-12-1',8978,1999    ,'10'),
('2' ,'BLACK','����','022','2005-12-1',9990,5999    ,'20')
SELECT *FROM  tb_emp
INSERT INTO tb_emp  VALUES
('3' ,'Kimi','����Ա','033','2015-08-11',5978,3000,'10'),
('4' ,'Vivian','����Ա','01','2006-08-21',5978,3000 ,'35'),
('5' ,'Jack','����','033','2012-08-19',4900,2000 ,'45'),
('6' ,'Tom','����Ա','022','2016-08-28',4500,2000,'35'),
('7' ,'Emma','����Ա','01','2009-12-1',8978,5000 ,'50'),
('8' ,'Sophia','����Ա','033','2009-12-21',6778,2999 ,'55'),
('9' ,'lvy','����','022','2016-06-27',5000,1999 ,'30'),
('10' ,'may','����','01','2016-12-11',5000,1999    ,'35')



 --�������ű�
--Dept ���ű�

--Deptno ���ű��
--Deptname ��������
--Location ��ַ 
--
SELECT *FROM tb_dept
--- 
CREATE table tb_dept(
deptno n_empvarchar(16) primary key,
deptname nvarchar(16) not null,
location nvarchar(10))
INSERT INTO tb_dept VALUES

('45','SALES','NEW YORK '),
('50','SALES','NEW YORK '),
('55','C','GUANGZHOU '),
('10','SALES',' BEIJING'),
('15','F','NEW YORK'),
('20','C','HONGKUNG'),
('25','A','NEW YORK'),
('30','B','SHANGHAI'),
('35','G','GUANGZHOU'),
('40','Y','BEIJING')
--------------------------------------------------------------------------------

--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT* FROM tb_dept WHERE deptname='SALES'

--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT* FROM tb_emp WHERE sal=
(
SELECT MAX(sal) FROM tb_emp)

--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT em.empno,em.ename FROM tb_emp  em WHERE sal in (
SELECT MAX(sal) FROM tb_emp
GROUP BY Deptno)


--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT em.empno FROM tb_emp  em WHERE sal in (
SELECT MAX(sal) FROM tb_emp
GROUP BY Deptno)

--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 

--6.��ѯ���������ǡ�SALES����Ա����Ϣ
SELECT* FROM tb_dept WHERE deptname='SALES' 

--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT* FROM tb_emp  em WHERE  em.ename='BLACK'
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 

--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 

--10.��ѯ��NEW YORK����������Ա�� 


--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 
--13���ҳ�нˮ��ߵ������ 
--14���г�����������Ա�������в��źͲ�����Ϣ
--15����ѯ�����ְ��5��Ա��
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����




