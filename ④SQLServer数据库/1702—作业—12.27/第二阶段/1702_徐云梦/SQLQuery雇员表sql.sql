--emp���ǹ�Ա��Ϣ�� 
--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--job Ա���Ĺ�����ʲô��������Ա�������
--mgr �ϼ����
--hiredate�ܹ�����
--sal����
--comm����
--deptno���ű��
CREATE table tb_emp(
eno int identity(1,1) primary key,
ename nvarchar(32) not null,
job nvarchar(32),
mgr int,
hiredate datetime,
sal money,
comm money,
deptno smallint,
foreign key(deptno) references tb_dept(deptno)
)
INSERT INTO tb_emp VALUES 
('������','����','01','20150712',7600,3000,005)
INSERT INTO tb_emp VALUES 
('������','����','01','20150712',7600,3000,005),
('ʢ����','����','02','20160319',5500,2000,008),
('���ڻ�','����Ա','03','20140707',8000,3200,004),
('����˳','Ա��','04','20170303',5000,1500,009),
('BLAKE','�ܾ���','05','20140712',8000,4500,007),
('����','����Ա','06','20161111',6666,2222,007),
('SMITH','Ա��','07','20170123',5000,2300,008),
('������','Ա��','08','20160912',4600,3000,005),
('������','����Ա','09','20160412',5600,2500,001),
('��˧��','����','11','20150705',5600,2000,002),
('С���','����','12','20160809',5600,2000,003),
('������','����','13','20170303',5600,2000,006)
INSERT INTO tb_emp VALUES
('����ȱ','����Ա','14','20150303',5600,2000,010)
INSERT INTO tb_emp VALUES
('����','����','15','20130303',8500,4000,010)
INSERT INTO tb_emp VALUES
('�³�','�쵼��','16','20130303',6000,6000,010)
SELECT * FROM tb_emp 
--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ
CREATE table tb_dept(
deptno smallint primary key,
dnmae nvarchar(32) not null,
location nvarchar(32)
)
SELECT *from tb_dept 
INSERT INTO tb_dept VALUES 
(001,'NEW YORK','�ܿ���'),
(002,'SALES','�ܿ���'),
(003,'���ڲ�','�ܿ���'),
(004,'�з���','�ܿ���'),
(005,'����','�ܿ���'),
(006,'���첿','�ܿ���'),
(007,'������','�ܿ���'),
(008,'���²�','�ܿ���'),
(009,'����','�ܿ���')
INSERT INTO tb_dept VALUES 
(010,'�ܲ�','NEW YORK')


SELECT * FROM tb_dept 
--1.��ѯ���������ǡ�SALES����Ա����Ϣ
----������ѯ 
select *from tb_dept d,tb_emp e
where d.dnmae ='SALES'
AND d.deptno =e.deptno 
----��һ�ַ���
SELECT *FROM tb_emp where deptno=(
SELECT deptno from tb_dept where dnmae ='SALES')
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
 SELECT *from tb_emp 
 WHERE sal=( select MAX(sal) from tb_emp )
 
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT e.eno,e.ename,e.deptno,e.sal FROM tb_emp e
  where sal=any(select MAX(sal) from tb_emp group by deptno )

--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * FROM tb_emp where sal in(
select max(sal) from tb_emp group BY deptno  
)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ
SELECT * FROM tb_emp  WHERE sal
>any(
SELECT avg(sal) from tb_emp group by deptno 
)
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
----������
SELECT * FROM tb_dept d INNER JOIN tb_emp e 
ON d.deptno =e.deptno  
WHERE d.dnmae ='SALES'

--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT *FROM tb_emp where ename = 'BLAKE'

--8.��ѯ��SMITH������ͬ��Ա����Ϣ
SELECT * FROM tb_emp where job=
(SELECT job FROM tb_emp where ename='SMITH')

--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű��
SELECT AVG(sal) from tb_emp group BY deptno HAVING AVG(sal)< (
select AVG(sal) from tb_emp e where deptno='10')

--10.��ѯ��NEW YORK����������Ա��
SELECT * FROM tb_emp e where e.deptno IN( 
SELECT de.deptno  FROM tb_dept de where de.location = 'NEW YORK')

--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı���
SELECT count(eno) from tb_emp where deptno='10'

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������

SELECT ename from tb_emp where ename='�쵼��' sal >( 
SELECT MAX(sal) from tb_emp)

--13���ҳ�нˮ��ߵ������
SELECT TOP 5 sal from tb_emp ORDER BY sal DESC 
--14���г�����������Ա�������в��źͲ�����Ϣ


--15����ѯ�����ְ��5��Ա��
SELECT TOP 5 hiredate from tb_emp ORDER by hiredate desc
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����

