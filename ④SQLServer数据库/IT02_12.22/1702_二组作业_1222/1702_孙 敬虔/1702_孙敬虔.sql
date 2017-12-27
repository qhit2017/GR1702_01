CREATE database db_emp
USE db_emp
create table tb_emp(
empno nvarchar(32)primary key,
ename nvarchar(16)not null,
deptno nvarchar(16),
job nvarchar(16),
sal smallint,
comm money,
hiredate date,
Sex nvarchar(2)check(Sex='��'or Sex='Ů')
)
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,
Sex )
VALUES
('02','��һ','10','����',2000,300,'2017-05-12','Ů'),
('05','���','10','����',2000,300,'2010-05-12','��'),
('03','������','20','����Ա',2000,300,'2013-04-13','��'),
('04','������','20','����Ա',2000,300,'2007-10-22','��'),
('06','���','20','����',2000,300,'2014-07-19','Ů'),
('07','���','30','����Ա',2000,300,'2012-01-29','��'),
('08','����','30','����Ա',2000,300,'2011-05-15','Ů'),
('09','��С��','30','����',2000,300,'2010-08-12','Ů'),
('10','������','30','����',2000,300,'2012-03-19','��')
SELECT * FROM tb_emp
--ѡ����30�е�����Ա��
SELECT * FROM tb_emp where deptno ='30'
--�г����а���Ա����������Ա��źͲ��ű��
SELECT ename,empno,deptno from tb_emp where job='����Ա'
--�ҳ��������н���Ա��
SELECT * FROM tb_emp where sal<comm
--�ҳ��������н��60%��Ա��
--�ҳ�����10�����о���Ͳ���20�����а���Ա����ϸ����
SELECT * FROM tb_emp where deptno='10'
--�ҳ�����10�����о�������20�����а���Ա���Լ����в����м����Ǿ����ֲ��ǰ���Ա
--��н����ڻ����2000������Ա������ϸ���ϡ�
SELECT * FROM tb_emp where 
(deptno = '20'AND job = '����Ա') 
or job not IN ('����','����Ա')                                          
OR sal>=2000
--�ҳ��н����Ա���Ĳ�ͬ������
SELECT job from tb_emp where comm IS NOT null GROUP BY  job 
--�ҳ�û�н���򽱽����100��Ա����
SELECT * FROM tb_emp where comm<100 OR comm IS NULL  
--��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT deptno, avg(sal)as ƽ��нˮ from tb_emp GROUP BY deptno order by avg(sal) desc
--�ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT * FROM tb_emp where year(hiredate)<2012 
--��ѯ��˾Ա��нˮ������
select SUM(sal)as нˮ���� from tb_emp 
--��ʾ����Ϊ5���ַ���Ա����������
--��ʾ������'R'��Ա����������
SELECT ename from tb_emp where ename not LIKE '%R%'
--��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
SELECT deptno,COUNT(ename)as Ա������ from tb_emp group by deptno ORDER BY COUNT(ename)
--��ѯÿ������ŮԱ����������
SELECT deptno,COUNT(Sex)as ŮԱ������ from tb_emp  where Sex='Ů' GRoup by deptno
--��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ� 
SELECT ename , hiredate from tb_emp where YEAR(hiredate)>=2007 AND YEAR(hiredate)<=2017
--��ʾԱ������ϸ���ϣ�����������
SELECT * FROM tb_emp  ORDER by ename
--��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
SELECT ename,hiredate  from tb_emp ORDER by year(hiredate)
--��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н�����򡣲�ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
--��ѯÿ��Ա�������루��������������нˮ����
SELECT ename , sal+comm as ������ from tb_emp  
--��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
--��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT distinct(ename) from tb_emp 
 
