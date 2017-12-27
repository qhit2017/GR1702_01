CREATE database db_emp
USE db_emp
CREATE table tb_emp(
empno nvarchar(16) primary key ,
ename nvarchar(32) not null ,
deptno nvarchar(32) ,
job nvarchar(16),
sal money ,
comm money,
hiredate date ,
sex char(6) check(sex='man' or sex= 'woman'))
sp_help tb_emp
INSERT into tb_emp 
values(67,'jeckd','30','��Ա',1100,3200,'2014-10-11','man'),
 (3,'jeck','20','����',4500,3200,'2014-11-11','man'),
 (4,'jeck','10','����',4500,3200,'2015-01-11','woman'),
 (5,'jeck','10','�鳤',2500,200,'2012-02-11','man'),
 (6,'jeck','20','����',4500,3200,'2016-10-11','woman'),
 (7,'jeck','10','�鳤',2500,3200,'2011-02-08','man'),
 (8,'jeck','20','����',4500,3200,'2011-10-15','man'),
 (9,'jeck','20','�鳤',3500,1200,'2000-10-20','woman'),
  (10,'jeck','20','����',4500,3200,'2014-10-11','man')
 SELECT *FROM  tb_emp 
 
-- 1  ѡ����30�е�����Ա���� 
SELECT *FROM tb_emp where deptno='30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT  ename , empno ,deptno from tb_emp where job = '����Ա'
--3  �ҳ��������н���Ա����
SELECT ename from  tb_emp  where sal <comm
--4  �ҳ��������н��60%��Ա���� 
SELECT ename from tb_emp where sal<comm*6/10
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
SELECT *FROM tb_emp where deptno ='10' and job ='����'or deptno ='20'and job ='���²�'
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK����
--�Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
SELECT *FROM tb_emp where deptno='10'AND job='����' or deptno ='20'and job ='���²�' 
OR  deptno NOT BETWEEN '����' AND '����Ա'AND  sal>=2000
--7  �ҳ��н����Ա���Ĳ�ͬ������ 
SELECT DISTINCT (job) from tb_emp where comm IS not null
--8  �ҳ�û�н���򽱽����100��Ա����
SELECT ename,comm from tb_emp where comm IS  null OR comm<100 
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
select AVG(sal)as ƽ��нˮ, deptno from tb_emp  GROUP BY deptno ORDER BY AVG(sal)
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT ename,hiredate from tb_emp where year(hiredate )<2012

--11  ��ѯ��˾Ա��нˮ������
SELECT sum(sal+comm) from tb_emp 
--12  ��ʾ����Ϊ5���ַ���Ա����������
select ename from tb_emp where  len(ename)=5
--13  ��ʾ������'R'��Ա����������
SELECT ename from tb_emp  where ename  not like '%r%' 
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
SELECT  COUNT(deptno)as ���� , deptno from tb_emp GROUP BY deptno ORDER BY COUNT(deptno) desc
--15  ��ѯÿ������ŮԱ����������
SELECT COUNT(empno) as ����,deptno  from tb_emp where sex ='woman' group BY deptno 
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
SELECT ename ,year(hiredate)  from tb_emp where year(hiredate) between 2007 AND 2017
--17  ��ʾԱ������ϸ���ϣ����������� 
SELECT *FROM tb_emp order BY ename 
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
SELECT ename ,year(hiredate) from tb_emp order BY year(hiredate)
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������ 
SELECT ename ,job, sal from tb_emp order BY job desc,sal
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
SELECT * from tb_emp where  sal >
(SELECT AVG(sal) from tb_emp ) 
--21  ��ѯÿ��Ա�������루��������������нˮ����
SELECT ename, SUM(sal+comm)  from tb_emp group BY ename
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
SELECT avg(comm),avg(sal) ,deptno ,job from tb_emp group BY deptno ,job
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT distinct (ename) from tb_emp
--24  ��ѯԱ���������ظ���Ա����Ϣ��
select ename FROM tb_emp group by ename HAVING COUNT(*)=1 

--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
SELECT ename from tb_emp where ename LIKE '%a%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT COUNT(ename),ename from tb_emp group BY ename HAVING COUNT(ename)>1
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT DISTINCT (deptno) from tb_emp where sal BETWEEN 900 AND 3000 
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT min(sal) from tb_emp group BY job ORDER  BY min(sal) 
