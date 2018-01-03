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

--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ

--������Ա��
CREATE table tb_emp(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
job nvarchar(16),
mgr nvarchar(16),
hiredate date,
sal decimal(8,4),
comm money,
deptno nvarchar(16)
foreign key (deptno) references tb_dept (deptno))  
----
INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) VALUES
('1' ,'rose','����','01','2002-12-1',8978,1999    ,'10')

 --�������ű�
CREATE table tb_dept(
deptno nvarchar(16) primary key,
deptname nvarchar(16) not null,
location nvarchar(10))
INSERT INTO tb_dept VALUES
('10','SALES',' BEIJING'),
('15','F','NEW YORK'),
('20','C','HONGKUNG'),
('25','A','NEW YORK'),
('30','B','SHANGHAI'),
('35','G','GUANGZHOU'),
('40','Y','BEIJING')



