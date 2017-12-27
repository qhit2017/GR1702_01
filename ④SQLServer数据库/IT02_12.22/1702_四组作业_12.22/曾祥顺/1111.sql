CREATE table tb_emp(
empno char(16)primary key,
ename nvarchar(20)not null,
deptno nvarchar(50),
job nvarchar(16),
sal smallint,
comm smallint,
hiredate datetime,
sex nvarchar(5) check (sex='boy'or sex='girl')  )

SELECT * from tb_emp

INSERT INTO tb_emp VALUES 
(001,'Arry','30','����Ա',6000,500,'2005-11-24','girl'),
(002,'���','10','����Ա',6000,1500,'2014-11-22','girl'),
(003,'�Ľ�','20','����Ա',2200,800,'2014-8-20','boy'),
(004,'rose','30','����Ա',3300,900,'2014-5-20','girl'),
(005,'������','20','����Ա',8000,300,'2015-11-20','boy'),
(006,'��С��','���²�','����Ա',6000,500,'2014-11-20','boy')     
                             
----1  ѡ����30�е�����Ա����
SELECT ename AS Ա�� FROM tb_emp where deptno='30'
----2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT ename as ���� ,empno as ����, deptno as ���� FROM tb_emp  WHERE job='����Ա'
----3  �ҳ��������н���Ա����
SELECT ename as ����  from tb_emp where comm  >sal
----4  �ҳ��������н��60%��Ա����
 SELECT ename as ����  from  tb_emp where comm >sal*(1+0.6)
----5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
select * from tb_emp where (deptno='10'and job='����') or (deptno='20'and job='����Ա')
----6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK����
----�Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
select * from tb_emp 
where (deptno='10'and job='����') or (deptno='20'and job='����Ա')
or (job NOT IN ('����','����Ա')and sal>=2000)
----7  �ҳ��н����Ա���Ĳ�ͬ������ 
select job as ���� from tb_emp where comm is not null group BY job
----8  �ҳ�û�н���򽱽����100��Ա����
select ename as ���� from tb_emp where comm is null or comm <100
----9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
 select AVG (sal) as ƽ��нˮ,deptno as ������ from tb_emp group by deptno order by avg(sal) desc
----10  �ҳ�����2012��ǰ�ܹ͵�Ա����
select ename as ���� ,hiredate as�ܹ����� from tb_emp where hiredate < '2012'
----11 ��ѯ��˾Ա��нˮ����
select  sum(sal)as��нˮ from tb_emp 
----12  ��ʾ����Ϊ5���ַ���Ա����������   
SELECT ename as ���� from tb_emp where ename like '_____%' and len(ename) = 5
---- 13  ��ʾ������'R'��Ա����������
select  ename as ���� from tb_emp where ename NOT LIKE'%R%'
----14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
select COUNT (deptno)as Ա������,deptno as���� from tb_emp group  by  deptno order by count (deptno) desc
----15  ��ѯÿ������ŮԱ����������  
SELECT deptno as ����,count(ename)as������ from tb_emp where sex='girl' group by deptno
----16  ��ʾ2007�굽2017��֮����ְ��Ա�����������ܹ����ڡ�
 select ename as ����,hiredate as �ܹ����� from tb_emp 
 where hiredate between 2007 and 2017 
----17  ��ʾԱ������ϸ���ϣ�����������
 select * from tb_emp order by ename 
----18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
 select ename as���� ,hiredate as�ܹ����� from   tb_emp order by  hiredate
----19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������ 
select *from tb_emp   order by job  desc,sal 
----20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select * from tb_emp where sal > (select AVG (sal) from tb_emp )
----21  ��ѯÿ��Ա�������루��������������нˮ����
 select sum(sal+comm) as ������ ,ename as ���� from tb_emp group by ename 
----22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
 select avg(comm) as ƽ������,AVG (sal) as ƽ��нˮ,deptno as ����,job as ְλ from tb_emp group by job ,deptno order by avg(comm) , AVG (sal),deptno
----23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
select distinct(ename) as�ظ����� from tb_emp 
----24  ��ѯԱ���������ظ���Ա����Ϣ��
select  distinct( ename )as���ظ����� from tb_emp  where ename is not null
----25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա���������� 
select  ename from tb_emp where ename LIKE'A%'OR ename ='_A%'OR ename ='___A%'
----26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ������� 
select ename as ����,COUNT(ename)as �ظ����� from tb_emp group by ename 
having COUNT(ename)>1
order by COUNT (ename) desc
----27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select ename as ����,sal as нˮ from tb_emp  where sal between 900 and 3000
----28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select  job asְλ,min(sal) as��͹��� from tb_emp group by job order by MIN (sal)asc

