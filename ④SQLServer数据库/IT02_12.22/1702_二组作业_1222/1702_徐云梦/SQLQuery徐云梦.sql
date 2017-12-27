CREATE table tb_emp(
empno int identity  primary key,
ename nvarchar(16) not null,
deptno nvarchar(16),
job nvarchar(8),
sal money,
comm money,
hiredate date,
sex nvarchar
)
INSERT into tb_emp VALUES
('����','10','Ա��',4000,2000,'20150201','��'),
('����','10','Ա��',5000,2500,'20140201','��'),
('����','10','����Ա',6000,2800,'20150201','Ů'),
('ʢ����','10','����Ա',5500,2000,'20160725','��'),
('������','10','����',7000,3000,'20151020','Ů'),
('����','20','Ա��',5000,2000,'20161201','��'),
('����','20','Ա��',4000,2000,'20170201','��'),
('����','20','����',7000,3000,'20150809','Ů'),
('�³�','20','����',7000,2900,'20150315','��'),
('��ƽ','20','Ա��',4000,2000,'20170412','��'),
('����','20','����Ա',4000,2000,'20160201','Ů'),
('���','20','Ա��',4000,2000,'20150201','��'),
('����','30','����',6500,3200,'20150201','��'),
('����','30','����Ա',6100,2000,'20170501','��'),
('���','30','����Ա',6000,2000,'20161201','Ů'),
('����','30','Ա��',3500,2000,'20170501','Ů'),
('֣��','30','Ա��',3000,3100,'20170201','��')
SELECT * FROM tb_emp
---1.ѡ����30�е�����Ա��
select * FROM tb_emp where deptno='30'
---2.�г����а���Ա��CLERK������������Ա��źͲ��ű��
SELECT ename,empno,deptno from tb_emp where job='����Ա'
---3.�ҳ��������н���Ա��
SELECT * FROM tb_emp where sal<comm
---4.�ҳ��������н��60%��Ա��
SELECT * FROM tb_emp where COMM>sal*0.6
---5.�ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ����
SELECT * FROM tb_emp where deptno='10' AND job='����' or deptno='20' AND job='����Ա'
---6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в�
---   ���м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ����
SELECT * FROM tb_emp 
where deptno='10' AND job='����' or deptno='20' AND job='����Ա' 
OR job='Ա��' AND sal>='2000'
---7  �ҳ��н����Ա���Ĳ�ͬ����
SELECT empno,ename,job from tb_emp where comm IS  NOT NULL 
---8.�ҳ�û�н���򽱽����100��Ա��
SELECT ename from tb_emp where comm<100
---9.��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT AVG(sal) as ƽ��нˮ,deptno as ���� from tb_emp 
GROUP BY deptno order BY AVG(sal) desc
---10.�ҳ�����2012��ǰ�ܹ͵�Ա��
INSERT INTO tb_emp VALUES('֣��','30','Ա��',3000,3100,'20101111','��')
INSERT INTO tb_emp VALUES('Mikol','20','Ա��',4000,2100,'20121111','��')
INSERT INTO tb_emp VALUES('Rose','20','Ա��',3000,2100,'20161111','Ů')
INSERT INTO tb_emp VALUES('Anm','30','Ա��',3500,2100,'20161111','Ů')
INSERT INTO tb_emp VALUES('Hany','30','Ա��',2500,3000,'20170321','��')

SELECT ename from tb_emp where hiredate<'2012'
---11.��ѯ��˾Ա��нˮ����
SELECT SUM(sal) as нˮ���� FROM tb_emp 
---12.��ʾ����Ϊ5���ַ���Ա��������
SELECT * FROM tb_emp where ename LIKE '_____'
---13.��ʾ������'R'��Ա��������
SELECT ename FROM tb_emp where ename not LIKE  '%R%'
---14.��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
SELECT COUNT(deptno) as Ա������,deptno from tb_emp
group BY deptno ORDER BY COUNT(deptno) desc
---15.��ѯÿ������ŮԱ��������
SELECT COUNT(*) as ŮԱ��������,deptno FROM tb_emp 
where sex='Ů'
group BY deptno 
---16.��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ�����
SELECT ename,hiredate from tb_emp 
where hiredate>'2007' OR hiredate<'2017'
---17.��ʾԱ������ϸ���ϣ�����������
SELECT * FROM tb_emp order BY ename ASC  
---18.��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ��
select ename,hiredate FROM tb_emp order BY hiredate ASC 
---19.��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
SELECT ename,job,comm from tb_emp order BY job DESC,sal,comm
---20.��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ
SELECT * from tb_emp where sal > (select AVG(sal) from tb_emp )
---21.��ѯÿ��Ա�������루��������������нˮ��
SELECT ename,SUM(sal+comm) as ������ from  tb_emp group BY ename
---22.��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ��
select deptno,job,AVG(comm) as ƽ������,AVG(sal) as ƽ��нˮ
 from tb_emp group BY deptno,job
---23  ��ѯԱ���������ظ�������ֻ����һ��
SELECT distinct(ename) from tb_emp
---24  ��ѯԱ���������ظ���Ա����Ϣ

SELECT * from tb_emp where ename 
IN (SELECT ename from tb_emp 
group BY ename HAVING  COUNT(*) <2 )


---25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա��������
SELECT ename FROM tb_emp where ename LIKE  '%A%'
---26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�����

SELECT ename as ����,COUNT(ename)as �ظ����� 
from tb_emp group BY ename HAVING  COUNT(ename) >1

---27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ
SELECT deptno,ename from tb_emp where sal>900 AND sal<3000
---28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT job,Min(sal) as ��͹��� from tb_emp
group BY job order BY Min(sal) ASC








 