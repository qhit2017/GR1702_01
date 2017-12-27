use bd_test
create table tb_emp(
empno int primary key,
ename nvarchar(16) not null,
deptno nvarchar(32),
job nvarchar(12),
sal money,
comm money,
hiredate date,
Sex char(2) check(Sex='��' or Sex='Ů') default '��'
) 
insert INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,Sex)
values (001,'С��','50','����',6500,4500,'2005-08-15','��'),
(002,'���','50','����Ա',4500,4000,'2006-10-23','��'),
(003,'��','50','��Ա',3000,5500,'2013-05-24','��'),
(004,'ΰ��','10','����',8500,4500,'2004-02-13','��'),
(005,'�Ļ�','10','����Ա',4500,2500,'2007-05-05','��'),
(006,'������','40','����',9500,6500,'2010-04-12','Ů'),
(007,'���','40','����Ա',6500,3000,'2010-08-17','Ů'),
(008,'��ѩ��','40','��Ա',4500,2500,'2017-06-16','Ů'),
(009,'����','30','����',7500,3500,'2005-08-11','��'),
(010,'�Ͽ�','30','����Ա',4000,4500,'2012-09-25','��'),
(011,'�Ľ�','30','��Ա',2000,1500,'2006-10-05','��'),
(012,'����˳','20','����',4000,8000,'2014-09-23','��'),
(013,'С��','20','����Ա',2500,3500,'2015-07-25','��'),
(014,'С��','20','����Ա',2300,3000,'2015-08-15','��'),
(015,'С��','20','��Ա',2200,50,'2015-08-15','��')
insert into tb_emp(empno,ename,deptno,job,sal,hiredate,Sex)
values(016,'С��','20','��Ա',1200,'2015-08-15','��')

---------------------------------------------------------
sp_help tb_emp
select * from tb_emp
--1  ѡ����30�е�����Ա�� ��
select ename as Ա�� from tb_emp where deptno='30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
select ename as ����,empno as ��Ա���,deptno as ���ű��
from tb_emp where job='����Ա'
--3  �ҳ��������н���Ա����
select ename as ���� from tb_emp where comm>sal
--4  �ҳ��������н��60%��Ա����
select ename as ���� from tb_emp 
where comm > (1+0.6)*sal
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
select * from tb_emp where (deptno='10' and job='����' ) or (deptno= '20' and job='����Ա')
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK����
--�Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
select * from tb_emp where (deptno='10' and job='����' ) or (deptno= '20' and job='����Ա')
or (job NOT IN('����','����Ա') and sal>=2000)
--7  �ҳ��н����Ա���Ĳ�ͬ������
select job as ���� from tb_emp where job IS not null group by job
--8  �ҳ�û�н���򽱽����100��Ա����
select ename as ���� from tb_emp where (comm IS  NULL) OR (comm<100)
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
select AVG (sal) as ƽ��нˮ,deptno as ������ 
from tb_emp group by deptno order by avg(sal) desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
select ename AS ����,hiredate as �ܹ����� from tb_emp where hiredate < '2012'
   
--11  ��ѯ��˾Ա��нˮ������
select  sum(sal) as нˮ����  from tb_emp
--12  ��ʾ����Ϊ5���ַ���Ա����������
 SELECT ename from tb_emp where ename like '%' and len(ename) = 5
--13  ��ʾ������'R'��Ա����������
 select  ename  as ���� from tb_emp where ename NOT LIKE'%R%'

--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
select COUNT (deptno)as Ա������,deptno as ���� from tb_emp group  by  deptno order by count (deptno) desc
 
--15  ��ѯÿ������ŮԱ����������
SELECT deptno as ���� ,count(ename) as ���� from tb_emp where sex='Ů' group by deptno

--16  ��ʾ2007�굽2017��֮����ְ��Ա�����������ܹ����ڡ�
 select ename as ����,hiredate as �ܹ����� from tb_emp 
 where hiredate between '2007' and '2017' 
--17  ��ʾԱ������ϸ���ϣ�����������
 select * from tb_emp order by ename asc 
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
 select ename as ���� ,hiredate  as �ܹ����� from  tb_emp order by  hiredate asc
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
 select ename as ����,job as ����,sal as н�� 
 from tb_emp order by job ,sal desc
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select * from tb_emp where sal > (select AVG (sal) from tb_emp )
--21  ��ѯÿ��Ա�������루��������������нˮ����
select sum(sal+comm) as ������ ,ename as ���� from tb_emp group by ename 
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
select avg(comm) as ƽ������,AVG (sal) as ƽ��нˮ,deptno as ����,job as ְλ 
from tb_emp group by job ,deptno 
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
select distinct(ename) AS ���ظ����� from tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT * FROM tb_emp where ename in(
select distinct( ename )from tb_emp )
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
select  ename as ���� from tb_emp where ename LIKE'%A%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
select ename as ����,COUNT(ename) as �ظ�����
from tb_emp group by ename
having  COUNT(ename)>1
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select ename as ����,sal as ���� from tb_emp  where sal between 900 and 3000

--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����������
select  job as ְλ ,min(sal)as  ��͹��� from tb_emp group by job order by MIN (sal)asc

