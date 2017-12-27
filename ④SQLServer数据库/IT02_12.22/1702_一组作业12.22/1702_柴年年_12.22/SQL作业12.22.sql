create database db_emp
create table tb_emp(
empno char(11) primary key ,--����
ename char(16),--����
deptno char(16),--����
job char(8),--ְλ
sal decimal (8,4), --нˮ
comm money,--����
diredate date,--�ܹ�����
sex char(4) check(sex='��' or sex='Ů') default '��'--�Ա�
)
insert into tb_emp 
values (1,'����','30','Ա��',1000,50,'2017-08-01','��'),
(2,'����','30','Ա��',1500,80,'2016-09-01','Ů'),
(3,'����','30','����Ա',2000,60,'2015-11-01','��'),
(4,'����','30','����Ա',2500,90,'2014-12-01','��'),
(5,'�Ŵ���','20','����Ա',5300,2500,'2013-01-13','Ů'),
(6,'����˳','20','����Ա',5400,3000,'2012-01-14','Ů'),
(7,'��˧��','30','����',5500,3500,'2011-01-15','��'),
(8,'�ﾴ�','30','����',6200,4000,'2010-01-16','��'),
(9,'��̹�','30','����',6300,4500,'2009-01-17','��'),
(10,'����','�з���','����',6400,5000,'2008-01-18','��'),
(11,'Tom','20','Ա��',6500,5500,'2007-01-19','��'),
(12,'jiory','20','Ա��',6600,6000,'2006-01-20','Ů'),
(13,'mory','20','����Ա',6700,6500,'2005-01-21','��'),
(14,'keke','20','����',6800,7000,'2004-01-22','Ů'),
(15,'ken','20','����',6900,7500,'2003-01-23','��'),
(16,'����','20','����',7000,8000,'2002-01-24','Ů'),
(17,'�����','10','Ա��',7100,8500,'2001-01-25','��'),
(18,'��׿','10','Ա��',7200,8600,'2000-01-26','��'),
(19,'����','10','����Ա',7300,8700,'2017-02-27','Ů'),
(20,'����','10','����Ա',7400,8800,'2017-03-28','��'),
(21,'�ŷ�','10','����Ա',7500,8900,'2017-04-29','Ů'),
(22,'����','10','����Ա',7600,9000,'2017-05-30','Ů'),
(23,'��','10','����',7700,9100,'2017-06-01','��'),
(24,'�ĺ','10','����',7800,9200,'2017-07-01','��')


--1  ѡ����30�е�����Ա����
select*from tb_emp where deptno='30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
select ename,empno,deptno from tb_emp where job='����Ա'
--3  �ҳ��������н���Ա����
select *from tb_emp where comm>sal
--4  �ҳ��������н��60%��Ա����
select top 60  percent * from tb_emp where comm>sal
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
select * from tb_emp where deptno='10' and job='����' or deptno='20' and job='����Ա'
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK����
--�Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
select * from tb_emp 
where deptno='10' and job='����' or deptno='20' and job='����Ա'
or deptno='10' and job!='����' and job!='����Ա'
or deptno='20' and job!='����' and job!='����Ա'
or deptno='30' and job!='����' and job!='����Ա'
and comm>=2000
--7  �ҳ��н����Ա���Ĳ�ͬ������
select ename,comm,job from tb_emp where not comm is null
--8  �ҳ�û�н���򽱽����100��Ա����
select * from tb_emp where comm is null or comm<100
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
select deptno,AVG(sal) from tb_emp group by deptno order by AVG(sal)desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
select * from tb_emp where year(diredate)<2012
--11 ��ѯ��˾Ա��нˮ������
select SUM(sal) as нˮ���� from tb_emp 
--12  ��ʾ����Ϊ5���ַ���Ա����������
select ename from tb_emp where ename='_____'
--13  ��ʾ������'R'��Ա����������
select ename from tb_emp where ename not like '%R%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
select deptno,COUNT(job) as ���� from tb_emp 
group by deptno order by COUNT(job) desc
--15  ��ѯÿ������ŮԱ����������
select deptno,COUNT(job) as ���� from tb_emp 
where sex='Ů' group by deptno 
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
select ename,diredate from tb_emp 
where YEAR(diredate)>2007 and YEAR(diredate)<2017  
--17  ��ʾԱ������ϸ���ϣ�����������
select * from tb_emp order by ename asc 
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
select ename,diredate from tb_emp order by diredate asc 
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
select ename,job,sal,comm from tb_emp order by job desc,sal,comm   
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select * from tb_emp where sal >(SELECT AVG(sal) FROM tb_emp )
--21 ��ѯÿ��Ա�������루��������������нˮ����
select ename,SUM(sal+comm) as ������ from tb_emp group by ename 
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
select deptno,job,AVG(comm) as ƽ������,AVG(sal) as ƽ��нˮ 
from tb_emp group by deptno,job 
--23 ��ѯԱ���������ظ�������ֻ����һ�Ρ�
select DISTINCT ename from tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
select ename from tb_emp where ename like '%A%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select ename,deptno from tb_emp where sal>900 AND sal<3000
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select job,MIN(sal) as ��͹��� from tb_emp 
group by job order by MIN(sal) asc