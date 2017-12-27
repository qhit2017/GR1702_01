CREATE database db_emp
CREATE table tb_emp(
---����
empno tinyint primary key,
---����
ename nvarchar(10),
---����
deptno nvarchar(20),
---ְλ
job nvarchar(20),
---нˮ
sal decimal(10,4),
---����
comm money,
---�ܹ�����
hiredate date,
---�Ա�
Sex nvarchar(4) check(Sex='��' or Sex='Ů')
)
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,Sex)
VALUES (001,'tom',10,'����Ա',2500,3000,'2014-10-1','��'),
      (002,'Arry',10,'����Ա',500,3000,'2011-8-1','Ů'),
      (003,'����ӱ',20,'����Ա',4500,3000,'2008-9-1','Ů'),
      (004,'ToTo',10,'����',2500,5000,'2017-11-1','��'),
      (005,'coco',10,'����Ա',2500,1000,'2012-8-1','Ů'),
      (006,'����',20,'����Ա',2000,3000,'2006-8-1','��'),
      (007,'¹��',10,'����',2000,3000,'2005-11-11','��'),
      (008,'coco',20,'����Ա',2500,2000,'2004-7-1','Ů'),
      (009,'�Ŵ��',10,'����',2500,50,'2007-8-1','��'),
      (010,'����ΰ',30,'����Ա',2000,NULL,'2016-8-1','��'),
      (011,'��һɽ',30,'����Ա',3500,3000,'2014-8-1','��'),
      (012,'����',30,'����',3000,1000,'2015-6-1','��'),
      (013,'Mary',10,'����Ա',2600,700,'2013-8-1','Ů'),
      (014,'���',30,'����',2500,6000,'2012-10-10','Ů'),
      (015,'���»�',10,'����Ա',2000,5000,'2010-8-1','��'),
      (016,'�Ǳ�',20,'����',800,1000,'2011-8-11','Ů'),
      (017,'��',10,'Ա��',2000,2000,'2011-8-11','��'),
      (018,'baby',30,'Ա��',2500,3000,'2011-8-11','Ů'),
      (019,'������',20,'Ա��',2000,2500,'2011-8-11','��'),
      (020,'����',10,'Ա��',2000,2000,'2011-8-11','Ů')
---1.ѡ����30�е�����Ա��
SELECT * FROM tb_emp where deptno='30' 
---2.�г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT  ename,empno,deptno from tb_emp where job='����Ա'
---3.�ҳ��������н���Ա����
SELECT * FROM tb_emp WHERE sal<comm
---4.�ҳ��������н��60%��Ա����
SELECT TOP 60 percent * from tb_emp where sal<comm
---5.�ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
SELECT *  FROM tb_emp WHERE deptno='10' AND job='����' or deptno='20' and job='����Ա'
---6.�ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
SELECT * FROM tb_emp where deptno='10' AND job='����' or deptno='20' and job='����Ա' OR  job!='����'AND job!='����Ա'  AND sal>=2000 AND comm>=2000
---7.�ҳ��н����Ա���Ĳ�ͬ������
SELECT job,ename,comm  FROM tb_emp where not comm is null 
---8.�ҳ�û�н���򽱽����100��Ա����
SELECT * FROM tb_emp WHERE comm is null OR comm < 100
---9.��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT deptno,AVG(sal) as ƽ��нˮ FROM tb_emp group by deptno order by avg(sal) DESC 
---10.�ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT * FROM tb_emp WHERE YEAR(hiredate)<2012  
---11.��ѯ��˾Ա��нˮ������
SELECT SUM(sal) as нˮ���� FROM tb_emp   
---12.��ʾ����Ϊ5���ַ���Ա����������
select ename from tb_emp where ename='_____'
---13.��ʾ������'R'��Ա����������
select ename from tb_emp where ename not like '%R%'
---14.��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
select deptno,COUNT(job) as ���� from tb_emp group by deptno order by COUNT(job) desc
---15.��ѯÿ������ŮԱ����������
select deptno,COUNT(job) as ���� from tb_emp where sex='Ů' group by deptno 
---16.��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
select ename,hiredate from tb_emp where YEAR(hiredate)>2007 and YEAR(hiredate)<2017  
---17.��ʾԱ������ϸ���ϣ�����������
select * from tb_emp order by ename asc 
---18.��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
select ename,hiredate from tb_emp order by hiredate asc 
---19.��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
select ename,job,sal,comm from tb_emp order by job desc,sal,comm   
---20.��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select * from tb_emp where sal >(SELECT AVG(sal) FROM tb_emp )
---21.��ѯÿ��Ա�������루��������������нˮ����
select ename,SUM(sal+comm) as ������ from tb_emp group by ename 
---22.��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
select deptno,job,AVG(comm) as ƽ������,AVG(sal) as ƽ��нˮ from tb_emp group by deptno,job 
---23.��ѯԱ���������ظ�������ֻ����һ�Ρ�
select DISTINCT ename from tb_emp 
---24.��ѯԱ���������ظ���Ա����Ϣ��
---25.��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
select ename from tb_emp where ename like '%A%'
---26.��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
---27.��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select ename,deptno from tb_emp where sal>900 AND sal<3000
---28.��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select job,MIN(sal) as ��͹��� from tb_emp group by job order by MIN(sal) asc