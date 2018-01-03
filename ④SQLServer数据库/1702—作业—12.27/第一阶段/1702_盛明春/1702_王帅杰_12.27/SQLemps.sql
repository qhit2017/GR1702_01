CREATE database tb_EMPs
---��Ա��Ϣ�� 
CREATE table tb_emp(
emono nvarchar(32)primary key,
ename nvarchar(32) not null,
job nvarchar(16),
mgr nvarchar(32),
hiredate date,
sal money,
comm money,
deptno nvarchar(32),
foreign key(deptno) references tb_dept(deptno),
foreign key(mgr) references tb_superior(mgr)
)
------���ű�
CREATE table tb_dept(
deptno nvarchar(32) primary key,
deptname nvarchar(16) not null,
Location nvarchar(32)
)
----- �ϼ���
CREATE table tb_superior(
mgr nvarchar(32)primary key,
mname nvarchar(32))
---�ϼ������
INSERT INTO tb_superior (mgr,mname)
VALUES ('002','����'),
('003','����'),
('004','mary'),
('005','jike')
---���ű�
INSERT INTO tb_dept(deptno,deptname,Location)VALUES 
('05','SALES','�Ϻ�'),
('10','rd','����'),
('20','asd','����'),
('30','bnu','����'),
('45','lan','NEW YORK'),
('50','fei','�Ͼ�')
---��Ա��Ϣ��
INSERT INTO tb_emp(emono,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES('01','����','����Ա','004','2017-5-21',1000,500,'05'),
('02','�ﾴ�','����Ա','002','2017-4-21',6000,800,'20'),
('03','ʢ����','����Ա','005','2017-3-21',7000,600,'30'),
('04','������','����','003','2017-3-22',1000,100,'10'), 
('05','��һ��','����','003','2010-5-29',10000,1000,'20'),
('06','�Ŵ���','����Ա','005','2017-5-21',4000,500,'45'),
('07','��̹�','�Ƴ�','003','2017-10-24',9000,1000,'20'),
('08','��ɺ','����','002','2017-5-21',8000,500,'10'),
('09','��֪��','����Ա','004','2015-8-27',6000,500,'50'),
('10','����','������','005','2015-5-11',9000,900,'05'),
('11','������','����Ա','003','2017-5-21',8000,500,'10')

--1.��ѯ���������ǡ�SALES����Ա����Ϣ
 SELECT *FROM tb_emp where deptno=
 (SELECT deptno from tb_dept where deptname='SALES')
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT *FROM tb_emp where sal=(select MAX(sal)from tb_emp) 
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT emono,ename from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * from tb_emp where sal in  
(SELECT MAX(sal) from tb_emp  
GROUP BY Deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * from tb_emp where sal > ANY
(SELECT AVG(sal) from tb_emp  
GROUP BY Deptno)
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Deptname ='SALES')
--7.��ѯ�쵼���ǡ�jike����Ա����Ϣ 
SELECT * FROM tb_emp where mgr =(
SELECT mgr from tb_superior where mname ='jike')
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * FROM tb_emp where job = (
SELECT job from tb_emp where ename = 'SMITH')
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
SELECT Deptno from tb_emp group BY Deptno HAVING avg(sal) < (
SELECT AVG(tb_emp.sal) from tb_emp,tb_Dept 
where tb_Dept.Deptno = '10'
AND tb_emp.Deptno = tb_Dept.Deptno)
--10.��ѯ��NEW YORK����������Ա�� 
select ename  from tb_emp where Deptno =(
SELECT Deptno from tb_Dept where Location = 'NEW YORK')

--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
 
--13���ҳ�нˮ��ߵ������ 
SELECT TOP 5 * from tb_emp ORDER BY sal DESC 
--14���г�����������Ա�������в��źͲ�����Ϣ

--15����ѯ�����ְ��5��Ա��
SELECT TOP 5* FROM tb_emp order by hiredate desc
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����

--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
SELECT Deptname  from tb_Dept where Deptno = 
	(SELECT top 1 Deptno from tb_emp where job = '����' ORDER BY sal ) 
