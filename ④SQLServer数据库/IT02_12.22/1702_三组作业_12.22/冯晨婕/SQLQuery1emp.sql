USE db_staff
CREATE table tb_emp(
empno char(32)primary key,
ename nvarchar (16),
deptno nvarchar(16),
job nvarchar(16),
sal money,
comm money,
hiredate date,
sex char(8)check(sex='man'or sex='women'))
---
SELECT*from tb_emp
---
select empno,ename,deptno,job,sal,comm,hiredate,sex from tb_emp
insert INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)
VALUES('1','Tom',10,'����',18000,9000,'2004-09-09','man'),
('2','Jack',10,'������',6000,4000,'2010-10-07','man'),
('3','Lucy',20,'����Ա',4800,5800,'2013-08-06','women'),
('4','Alina',30,'����',7700,5000,'2012-09-01','women'),
('5','MIKE',30,'����',3500,1000,'2014-08-06','man'),
('6','Marry',20,'����Ա',4800,5200,'2012-05-23','women'),
('7','Rose',20,'����Ա',4500,1800,'2011-01-01','women'),
('8','Jerry',30,'����',2000,1000,'2013-03-30','man'),
('9','Candies',30,'��๤',3800,2000,'2015-09-29','women'),
('10','CC',30,'ʵϰ��',2000,1000,'2017-02-22','women')
---1.ѡ����30������Ա��
SELECT* from tb_emp where deptno=30
---2.�г����а���Ա(CLERK)����������Ա��źͲ��ű��
SELECT ename as ����,empno as ��Ա���,deptno as ���ű�� from tb_emp
---3.�ҳ��������н���Ա��
select*FROM tb_emp where comm>sal
---4.�ҳ��������н��60%��Ա��
SELECT*FROM tb_emp where comm>sal*(1+0.6)
---5.�ҳ�����10�����о���Ͳ���20�����а���Ա����ϸ����
SELECT*FROM tb_emp where deptno BETWEEN 10 AND 20
---6.�ҳ�����10�����о�������20�����а���Ա��
---�Լ����в����мȲ��Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ����
SELECT*FROM tb_emp where deptno BETWEEN 10 AND 20 
---7.�ҳ��н����Ա���Ĳ�ͬ����
SELECT*FROM tb_emp where comm IS NOT NULL
---8.�ҳ�û�н���򽱽����100��Ա��
SELECT*FROM tb_emp where comm IS NULL OR comm<100
---9.��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��ͽ�������
SELECT avg(sal) FROM tb_emp where AVG(sal) ORDER BY sal DESC!!!!
---10.�ҳ�����2012��ǰ�ܹ͵�Ա��
SELECT*FROM tb_emp where hiredate<'2012'
---11.��ѯ��˾Ա��нˮ����
SELECT sum(sal)as нˮ���� from tb_emp
---12.��ʾ����Ϊ5���ַ���Ա��������
select ename as ���� from tb_emp where ename LIKE'%'AND LEN(ename)=5
---13.��ʾ������'R'��Ա��������
SELECT ename as ���� FROM tb_emp where ename not LIKE'%R%'
---14.��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
SELECT SUM(deptno) from tb_emp xs
---15.��ѯÿ������ŮԱ��������
SELECT COUNT(sex)  AS ŮԱ��������  from tb_emp WHERE sex ='women'
