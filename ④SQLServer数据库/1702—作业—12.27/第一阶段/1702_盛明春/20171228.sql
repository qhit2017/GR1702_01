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

CREATE table tb_emp(
no int identity(1,1) primary key,
name nvarchar(32) not null,
job nvarchar(16),
mar nvarchar(16),
hiredate datetime,
sal money,
comm money,
deptno nvarchar(16),
foreign key(deptno) references tb_dept(deptno) 
)
INSERT INTO tb_emp VALUES
('������','����Ա','001','20171227',3500,2000,'10'),
('SMITH','����','001','20171227',4500,2000,'10'),
('������','����','001','20171227',4500,2000,'10'),
('������','����','002','20171227',4500,2000,'20'),
('����˳','����Ա','003','20171227',3500,2000,'30'),
('ʢ����','����','004','20171227',4500,2000,'10'),
('������','����','005','20171227',4500,2000,'20'),
('�ں��','����Ա','006','20171227',3500,2000,'30'),
('�ﺭ','����Ա','007','20171227',3500,2000,'40'),
('֣���','����Ա','008','20171227',3500,2000,'30'),
('BLAKE','����','008','20171227',3500,2000,'40')

CREATE table tb_dept(
deptno nvarchar(16) primary key,
deptname nvarchar(16),
location nvarchar(16)
)
INSERT INTO tb_dept VALUES
('10','rd','����'),
('20','fae','����'),
('30','rd','�Ͼ�'),
('40','SALES','NEW YORK')
--1.��ѯ���������ǡ�SALES����Ա����Ϣ
SELECT * FROM tb_emp e where e.deptno in (  
SELECT d.deptno FROM  tb_dept d where deptname='SALES')
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT *  from tb_emp where sal=(SELECT MAX(sal) from tb_emp )
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT no,name from tb_emp WHERE
 sal =any(
SELECT MAX(sal) from tb_emp )   
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * from tb_emp WHERE
sal =any(
SELECT MAX(sal) from tb_emp )
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT*from tb_emp where   sal
> ANY (SELECT avg(sal) from tb_emp group BY deptno )
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp e where e.deptno in (  
SELECT d.deptno FROM  tb_dept d where deptname='SALES')
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * FROM tb_emp e WHERE e.job ='����' and e.name ='BLAKE'
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * from tb_emp where job =(SELECT job from tb_emp where name='SMITH')
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű��(����) 
SELECT DISTINCT deptno  from tb_emp where
(SELECT AVG(sal)  from tb_emp where deptno='10')> 

(SELECT AVG(sal) from tb_emp GROUP BY deptno  
 ) 
--10.��ѯ��NEW YORK����������Ա��
 SELECT e.name from tb_emp e WHERE e.deptno IN(
 SELECT d.deptno from tb_dept d WHERE d.location ='NEW YORK' 
  )

--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
 
--13���ҳ�нˮ��ߵ������
 
--14���г�����������Ա�������в��źͲ�����Ϣ

--15����ѯ�����ְ��5��Ա��

--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
