CREATE database tb_emp
CREATE table tb_emp(
empno char(11)primary key,--����
ename char(20),--����
deptno char(16),--����
job char(8),--ְλ
sal money,--нˮ
comm char(8),--����
hiredate date, --�ܹ�����
Sex char(2)check(Sex='��' or Sex='Ů')default '��',--�Ա�
)
insert into tb_emp (empno,ename,deptno,job,sal,comm,hiredate,Sex) 
values(1,'����','10','Ա��',5000,500,'2017-5-21','Ů'),
(2,'�ﾴ�','01','����Ա',6000,800,'2017-4-21','��'),
(3,'ʢ����','01','����Ա',7000,600,'2017-3-21','Ů'),
(4,'������','10','����',1000,100,'2017-3-22','Ů'), 
(5,'��һ��','20','����',10000,1000,'2010-5-29','��'),
(6,'�Ŵ���','20','����Ա',4000,500,'2017-5-21','��'),
(7,'��̹�','15','�Ƴ�',9000,1000,'2017-10-24','��'),
(8,'��ɺ','10','����',8000,500,'2017-5-21','Ů'),
(9,'��֪��','10','����Ա',6000,500,'2015-8-27','Ů'),
(10,'����','01','������',9000,900,'2015-5-11','Ů'),
(11,'������','30','����Ա',8000,500,'2017-5-21','Ů')
insert into tb_emp (empno,ename,deptno,job,sal,comm,hiredate,Sex)
VALUES(16,'RDRY','13','����Ա',8000,67,'2006-04-24','��')--�������
SELECT * FROM tb_emp
DELETE tb_emp WHERE empno='16'--ɾ��
UPDATE  tb_emp SET ename ='����'WHERE ename='����'--�������  

--1  ѡ����30�е�����Ա����
SELECT * FROM tb_emp where  deptno = '30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT ename ,  empno,deptno from tb_emp where job= '����Ա'
--3  �ҳ��������н���Ա����
SELECT * FROM tb_emp where  comm>sal 
--4  �ҳ��������н��60%��Ա��.
SELECT * FROM tb_emp where comm>(1+0.6)*sal
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ� 
SELECT *FROM tb_emp WHERE deptno ='10'AND job='����'OR
deptno ='20'AND job ='����Ա' 
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
SELECT *FROM tb_emp  WHERE deptno='10'AND job ='����'OR deptno='20'AND job='����Ա'
OR (job NOT IN ('����Ա','����'))AND sal>=2000
--7  �ҳ��н����Ա���Ĳ�ͬ������
SELECT job from tb_emp where comm IS NOT null GROUP BY  job 
--8  �ҳ�û�н���򽱽����100��Ա����
SELECT * FROM tb_emp where comm<100 OR comm IS NULL  
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT job as '����' , avg(sal)as'ƽ��нˮ'
FROM tb_emp 
GROUP BY job
ORDER BY avg(sal)
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT *FrOM tb_emp WHERE hiredate<'2012-1-1'
--11  ��ѯ��˾Ա��нˮ������
SELECT sum(sal)as'����'FROM tb_emp
--12  ��ʾ����Ϊ5���ַ���Ա����������
SELECT ename FROM tb_emp WHERE ename LIKE'_____'--�����ַ���like
--13  ��ʾ������'R'��Ա����������
SELECT ename
FROM tb_emp 
WHERE  ename NOT like'R%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
SELECT  deptno as'������',count(job)as'Ա������'
FROM tb_emp 
GROUP BY deptno
ORDER BY  count(job) DESC--�������� asc
--15  ��ѯÿ������ŮԱ����������
SELECT deptno as'����' ,count(sex)as'ŮԱ��'
FROM tb_emp WHERE Sex='Ů'GROUP BY deptno
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
SELECT ename,hiredate
FROM tb_emp
WHERE hiredate NOT BETWEEN '2007' and '2017'AND hiredate<'2007'
--BETWEEN   AND  ��ʲô----֮�� 
--17  ��ʾԱ������ϸ���ϣ�����������
SELECT * FROM tb_emp  ORDER by ename
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
SELECT ename,hiredate  from tb_emp ORDER by year(hiredate)
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
 
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ�� 
SELECT * FROM tb_emp where sal >(SELECT AVG(sal) FROM tb_emp )  
--21  ��ѯÿ��Ա�������루��������������нˮ����
SELECT ename , sal+comm as ������ from tb_emp  
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
 SELECT distinct ename as Ա�������� FROM tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT *FROM tb_emp where ename IN(SELECT ename FROM tb_emp group by ename HAVING  COUNT(*)<2 )
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
 SELECT  ename as Ա�������� FROM tb_emp where ename='%A%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������

--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT deptno as ����, ename as Ա�������� 
FROM tb_emp where sal  BETWEEN 900 AND 3000
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT job as ְλ,MIN(sal) as ��͹���  FROM tb_emp GROUP BY job ORDER BY MIN(sal) ASC
 