CREATE database db_emp
CREATE table tb_emp(
empno nvarchar(10) primary key,
ename nvarchar(32) not null,
deptno nvarchar(10),
job nvarchar(16),
sal money,
comm money,
hiredate date,
Sex nvarchar(2) check(Sex='��'or Sex='Ů'))
INSERT INTO tb_emp (empno ,ename,deptno,job ,sal ,comm ,hiredate ,Sex) 
VALUES('12','�ܺ���','10','����',2000,1500,'2010-10-20','��'), 
('02','������','10','���۾���',2500,2000,'1998-5-24','��'),
('03','������','01','�ܾ���',10000,9600,'1998-10-20','Ů'),
('04','������','10','����',7000,1500,'1995-10-20','Ů'),
('05','������','20','����',5000,1500,'1995-10-20','��'),
('06','��ٻ','20','����Ա',3000,1500,'1995-10-20','Ů'),
('07','����','15','�Ƴ�',4000,1500,'1995-10-20','��'),
('08','�ı�Ȩ','10','����',2000,1500,'1995-10-20','��'),
('09','�ں��','10','����Ա',2000,1500,'1995-10-20','��'),
('10','ʱ����','01','������',8000,7500,'1998-6-23','Ů'),
('11','½Ц��','30','����Ա',8000,7500,'1998-6-23','Ů')
SELECT * FROM tb_emp 
--1  ѡ����30�е�����Ա����
SELECT * FROM tb_emp where  deptno = '30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT ename ,  empno,deptno from tb_emp where job= '����Ա'
--3  �ҳ��������н���Ա����
SELECT * FROM tb_emp where  comm>sal 
--4  �ҳ��������н��60%��Ա��.
SELECT * FROM tb_emp where comm>(1+0.6)*sal
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ� 
SELECT * FROM tb_emp where (deptno ='10'AND job ='����')or(deptno ='20' AND job = '����Ա') 
--6  �ҳ�����10�����о���MANAGER����
--   ����20�����а���Ա��CLERK����
--   �Լ����в����м����Ǿ����ֲ��ǰ���Ա
--   ��н����ڻ����2000������Ա������ϸ���ϡ�
SELECT * FROM tb_emp where 
(deptno = '20'AND job = '����Ա') 
or job not IN ('����','����Ա')                                          
OR sal>=2000
--7  �ҳ��н����Ա���Ĳ�ͬ������
SELECT job from tb_emp where comm IS NOT null GROUP BY  job 
--8  �ҳ�û�н���򽱽����100��Ա����
SELECT * FROM tb_emp where comm<100 OR comm IS NULL  
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT deptno, avg(sal)as ƽ��нˮ from tb_emp GROUP BY deptno order by avg(sal) desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT * FROM tb_emp where year(hiredate)<2012 
--11  ��ѯ��˾Ա��нˮ������
select SUM(sal)as нˮ���� from tb_emp 
--12  ��ʾ����Ϊ5���ַ���Ա����������

--13  ��ʾ������'R'��Ա����������
SELECT ename from tb_emp where ename not LIKE '%R%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
SELECT deptno,COUNT(ename)as Ա������ from tb_emp group by deptno ORDER BY COUNT(ename)
--15  ��ѯÿ������ŮԱ����������
SELECT deptno,COUNT(Sex)as ŮԱ������ from tb_emp  where Sex='Ů' GRoup by deptno
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ� 
SELECT ename , hiredate from tb_emp where YEAR(hiredate)>=2007 AND YEAR(hiredate)<=2017
--17  ��ʾԱ������ϸ���ϣ�����������
SELECT * FROM tb_emp  ORDER by ename
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
SELECT ename,hiredate  from tb_emp ORDER by year(hiredate)
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������

--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ�� 
SELECT * FROM tb_emp where sal>(SELECT AVG(sal) from tb_emp )
--21  ��ѯÿ��Ա�������루��������������нˮ����
SELECT ename , sal+comm as ������ from tb_emp  
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
 
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT distinct(ename) from tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��


--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
SELECT ename from tb_emp where ename LIKE '%A%' 
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������

--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT deptno from tb_emp where sal>=900 AND sal <=3000 GROUP by deptno
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT job ,MIN(sal) as ��͹��� FROM tb_emp group BY job ORDER BY MIN(sal) 
 