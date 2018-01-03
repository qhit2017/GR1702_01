CREATE database db_emp
USE db_emp

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

 --�������ű�
CREATE table tb_dept(
deptno nvarchar(16) primary key,
deptname nvarchar(16) not null,
location nvarchar(10))


INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES ('001','Lily','CLERK','01','2001-12-04',5000,6300,'10'),
('002','Tom','BLAKE','02','2006-10-13',5500,4500,'11'),
('003','Jason','CLERK','03','2014-06-26',3500,2300,'12'),
('004','Mary','CLERK','04','2012-08-16',4000,3000,'13'),
('005','Walker','MANAGER','05','2015-10-22',4600,5200,'14'),
('006','Wilson','CLERK','06','2008-09-10',4100,2300,'15'),
('007','SMITH','MANAGER','07','2016-12-12',5500,2000,'16'),
('008','Johnson','CLERK','08','2017-01-16',3500,2000,'17'),
('009','Stewart','CLERK','09','2004-07-26',4600,3000,'18'),
('010','Powell','MANAGER','10','2009-04-12',4400,2100,'19'),
('011','perry','CLERK','11','2003-05-17',2500,3000,'20'),
('012','Marshall','MANAGER','12','2012-08-14',8600,4200,'30'),
('013','James','CLERK','13','2014-05-19',3500,2000,'35'),
('014','Long','MANAGER','14','2015-06-13',4500,3000,'36'),
('015','Rose','CLERK','15','2016-07-18',2800,NULL,'37')
INSERT INTO tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES ('016','HanMeimei','CLERK','16','2006-12-04',5000,6300,'40')

INSERT INTO tb_dept(deptno,deptname,location)
VALUES('10','SALES','�Ϻ�'),
('11','SALES','�Ϻ�'),
('12','SE','���'),
('13','SE','���'),
('14','SALES','�Ϻ�'),
('15','AS','����'),
('16','SALES','�Ϻ�'),
('17','SE','���'),
('18','SALES','�Ϻ�'),
('19','SE','���'),
('20','SALES','�Ϻ�'),
('30','AS','����'),
('35','SALES','�Ϻ�'),
('36','AS','����'),
('37','SE','���')
INSERT INTO tb_dept(deptno,deptname,location)
VALUES('40','SALES','NEW YORK')


--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_dept where deptname = 'SALES'
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * FROM tb_emp where sal = 
(SELECT MAX(sal) from tb_emp)
--3.��ѯ�����������нˮ��Ա����ţ������� 
--4.��ѯ���������нˮ��Ա����Ϣ 
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * FROM tb_emp where sal>
(SELECT AVG(sal) from tb_emp)
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * FROM tb_emp where job = 'BLAKE'
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * FROM tb_emp where ename = 'SMITH'
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

