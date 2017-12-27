CREATE table tb_emp(
empno int identity(1,1) primary key,
ename nvarchar(16) not null,
daptno nvarchar(16),
job nvarchar(8),
sal money,
comm money,
hiredate date,
Sex nvarchar(2) check(Sex='��'or Sex='Ů'))
INSERT INTO tb_emp (ename,daptno,job,sal,comm,hiredate,Sex) VALUES
('����','5','Ա��',5000,2000,'20140102','��'),
 ('����','30','Ա��',8000,9000,'20120102','��'),
 ('����','5','�ܳ�',5000,7000,'20110102','��'),
 ('����','7','Ա��',6000,2000,'20140102','��'),
 ('��ѩ','9','����',5000,2000,'20140102','Ů'),
 ('��ѩ','2','����',6000,1000,'20130102','Ů'),
 ('��ѩ','9','����',6000,1000,'20130102','Ů'),
 ('����','3','����',6000,1000,'20130102','��'),
 ('ʢ����','30','����',5500,1500,'20080907','��'),
 ('���ڻ�','20','����',5500,2000,'20080608','��'),
 ('��ӭ��','30','����Ա',2500,1500,'20080504','��'),
 ('����','20','����',5500,1500,'20080203','Ů'),
 ('�ﺭ','30','����',3500,1000,'20080705','��'),
 ('�Ľ�','10','����',5500,1500,'20080604','��')
-- 1  ѡ����30�е�����Ա��
 SELECT * FROM tb_emp WHERE daptno ='30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
 SELECT ename as ����,empno as ��Ա���,daptno AS ���ű��
  FROM tb_emp
 WHERE job ='����Ա'
--3  �ҳ��������н���Ա����
 SELECT * FROM tb_emp WHERE comm > sal 
--4  �ҳ��������н��60%��Ա����
 SELECT * FROM tb_emp WHERE comm >(1+0.6)*sal
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
 SELECT * FROM tb_emp 
 WHERE  daptno ='10'AND job ='����' OR daptno ='20'AND job ='����Ա'
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
 SELECT * FROM tb_emp 
 WHERE  daptno ='10'AND job ='����' or daptno ='20'AND job ='����Ա'
 or (job not IN('����','����Ա') AND  sal>='2000')  
--7  �ҳ��н����Ա���Ĳ�ͬ������
 SELECT ename as Ա�� ,job as ���� FROM tb_emp WHERE comm IS not NULL 
--8  �ҳ�û�н���򽱽����100��Ա����
 SELECT ename,comm FROM tb_emp WHERE comm IS  NULL  OR comm<100
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT AVG(sal)as ƽ��нˮ,daptno as ������  FROM tb_emp group BY daptno
ORDER BY AVG(sal) desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա���� 
SELECT ename as Ա��  FROM tb_emp WHERE hiredate <'2012'
--11  ��ѯ��˾Ա��нˮ������
 SELECT SUM(sal) as ��˾Ա��нˮ���� FROM tb_emp
--12  ��ʾ����Ϊ5���ַ���Ա���������� 
SELECT ename as Ա�������� FROM tb_emp where ename LIKE'_____'
--13  ��ʾ������'R'��Ա����������
 SELECT ename as Ա�������� FROM tb_emp where ename NOT  LIKE'%r%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
SELECT COUNT(daptno) as Ա������,daptno as ������ 
 FROM tb_emp group BY daptno 
ORDER BY COUNT(daptno)desc
--15  ��ѯÿ������ŮԱ����������
SELECT COUNT(daptno) as ŮԱ������,daptno as ������
  FROM tb_emp where sex='Ů' group BY daptno 
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
 SELECT ename as Ա��������,hiredate as �ܹ����� 
 FROM tb_emp
  where hiredate not  BETWEEN '2007'AND '2017'AND hiredate <'2007'
--17  ��ʾԱ������ϸ���ϣ�����������
 SELECT *FROM tb_emp ORDER BY ename ASC
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档 
SELECT ename as Ա��������,hiredate as �ܹ�����
 FROM tb_emp ORDER BY hiredate asc
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
 SELECT ename as Ա��������,job as ����, sal as н��
  FROM tb_emp ORDER BY job DESC ,sal      
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ�� 
SELECT * FROM tb_emp  where sal>all(SELECT AVG(sal)from tb_emp ) 
--21  ��ѯÿ��Ա�������루��������������нˮ���� 
SELECT ename as Ա��������,SUM(sal+comm) FROM tb_emp GROUP BY ename  
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
 SELECT AVG(comm) as ƽ������,AVG(sal) as ƽ��нˮ,daptno as ����,job as ְλ 
 FROM tb_emp GROUP BY daptno,job
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT distinct ename as Ա�������� FROM tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT *FROM tb_emp where ename IN(SELECT ename 
FROM tb_emp group by ename
 HAVING  COUNT(*)<2 )
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա���������� 
SELECT  ename as Ա�������� FROM tb_emp where ename='%A%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT  ename as Ա�������� , COUNT( ename ) as �ظ����� 
FROM tb_emp GROUP BY ename HAVING  COUNT( ename )>1
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT daptno as ����, ename as Ա��������
 FROM tb_emp
  where sal  BETWEEN 900 AND 3000
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT job as ְλ,MIN(sal) as ��͹���
  FROM tb_emp GROUP BY job ORDER BY MIN(sal) ASC
