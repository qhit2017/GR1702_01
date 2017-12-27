USE db_employee
CREATE table tb_company(
empno char(16)primary key,
ename nvarchar(20)not null,
deptno nvarchar(50),
job nvarchar(16),
sal smallint,
comm smallint,
hiredate datetime,
sex nvarchar(5) check (sex='boy'or sex='girl')  )0
sp_help tb_company
SELECT * from tb_company
ALTER table tb_company drop PK__tb_compa__AF4C318A31EC6D26
INSERT INTO tb_company VALUES 
							  (001,'��С��','���²�','����Ա',6000,500,'2014-11-20','boy'),
							  (002,'�ں��','�з���','����',9000,9500,'2013-1-19','boy'),
                              (003,'�ﺮ','���²�','����Ա',6000,500,'2014-5-21','boy'),
                              (004,'��ӭ��','���۲�','����',7000,1500,'2007-6-27','boy'),
                              (005,'֣���','�з���','����Ա',8000,600,'2017-12-25','boy'),
                              (006,'Arry','30','����Ա',6000,500,'2005-11-24','girl'),
                              (007,'����˳','����','���',6000,900,'2006-8-20','boy'),
                              (008,'���','10','����Ա',6000,1500,'2014-11-22','girl'),
                              (009,'������','20','����Ա',2200,800,'2014-8-20','boy'),
                              (010,'rose','30','����Ա',3300,900,'2014-5-20','girl'),
                              (011,'��ѩ��','���۲�','����Ա',6000,700,'2004-11-2','girl'),
                              (012,'lily','���۲�','����Ա',6000,800,'2014-11-20','girl'),
                              (013,'���ڻ�','�з���','ίԱ',3300,300,'2004-5-21','boy'),
                              (014,'��˧��','�з���','����Ա',6000,500,'2014-11-20','boy'),
                              (015,'mike','�з���','����Ա',6600,600,'2014-11-20','boy'),
                              (016,'ʢ����','����������','����Ա',8800,500,'2014-11-20','boy'),
                              (017,'�Ź���','10','����',4400,500,'2012-11-20','boy'),
                              (019,'John','���²�','����Ա',5500,500,'2014-11-20','boy'),
                              (019,'John','����������','����Ա',7000,500,'2014-11-20','boy'),
                              (018,'�����','���²�','����Ա',6000,500,'2014-11-20','boy'),
                              (019,'John','���²�','����Ա',9000,100,'2014-11-20','boy'),
                              (019,'��ӪӪ','20','����Ա',8000,300,'2015-11-20','girl'),
                              (020,'������','���²�','����Ա',4000,700,'2017-11-20','boy'),
                              (021,'Johnaon ','��ȫ��첿','ίԱ',3000,500,'2014-11-20','boy'),
                              (022,'������','���²�','����Ա',6000,500,'2014-11-20','boy'),
                              (023,'Maria','��ȫ��첿','����Ա',7000,500,'2014-11-20','girl'),
                              (024,'����ΰ','���²�','ίԱ',6000,500,'2014-11-20','boy'),
                              (025,'�Ľ�','��ȫ��첿','����Ա',6000,500,'2013-11-20','boy'),
                              (026,'mary','��ȫ��첿','����Ա',7000,1100,'2012-11-20','girl'),
                              (027,'Jason','����������','����Ա',7000,0,'2014-11-20','boy'),
                              (028,'����','���²�','����Ա',9000,500,'2015-11-20','girl'),
                              (029,'������','����������','����Ա',8000,700,'2016-11-20','girl'),
                              (030,'������','���²�','����Ա',6000,500,'2017-11-21','boy'),
                              (031,'guo','���²�','����Ա',3000,6000,'2017-11-11','boy'),
                              (001,'��С��','���²�','����Ա',6000,500,'2014-11-20','boy')
                             select * FROM  tb_company
----1  ѡ����30�е�����Ա����
SELECT ename AS Ա�� FROM tb_company where deptno='30'
----2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT ename ,empno, deptno FROM tb_company  WHERE job='����Ա'
----3  �ҳ��������н���Ա����
SELECT ename as ����  from tb_company where comm >sal 
----4  �ҳ��������н��60%��Ա����
 SELECT ename as���� from  tb_company where comm >sal*(1+0.6)
----5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
select * from tb_company where (deptno='10'and job='����') or (deptno='20'and job='����Ա')
----6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK����
----�Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
select * from tb_company 
where (deptno='10'and job='����') or (deptno='20'and job='����Ա')
or (job NOT IN ('����','����Ա')and sal>=2000)
----7  �ҳ��н����Ա���Ĳ�ͬ������ 
select job as ���� from tb_company where comm is not null group BY job
----8  �ҳ�û�н���򽱽����100��Ա����
select ename as ���� from tb_company where comm is null or comm <100
----9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
 select AVG (sal) as ƽ��нˮ,deptno as ������ from tb_company group by deptno order by avg(sal) desc
----10  �ҳ�����2012��ǰ�ܹ͵�Ա����
select ename as���� ,hiredate as�ܹ͵�Ա�� from tb_company where hiredate < '2012'
----11 ��ѯ��˾Ա��нˮ����
select  sum(sal) from tb_company  
----12  ��ʾ����Ϊ5���ַ���Ա����������   
SELECT ename as���� from tb_company where ename like '_____%' and len(ename) = 5
---- 13  ��ʾ������'R'��Ա����������
select  ename as���� from tb_company where ename NOT LIKE'%R%'
----14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
select COUNT (deptno)as Ա������,deptno as ���� from tb_company group  by  deptno order by count (deptno) desc
----15  ��ѯÿ������ŮԱ����������  
SELECT deptno ,count(ename) from tb_company where sex='girl' group by deptno
----16  ��ʾ2007�굽2017��֮����ְ��Ա�����������ܹ����ڡ�
 select ename as ����,hiredate as �ܹ����� from tb_company 
 where hiredate between 2007 and 2017 
----17  ��ʾԱ������ϸ���ϣ�����������
 select * from tb_company order by ename 
----18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
 select ename ,hiredate from   tb_company order by  hiredate
----19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������ 
 select*FROM  tb_company ORDER BY job DESC ,sal 
----20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select * from tb_company where sal > (select AVG (sal) from tb_company )
----21  ��ѯÿ��Ա�������루��������������нˮ����
 select sum(sal+comm) as ������ ,ename as ���� from tb_company group by ename 
----22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
 select avg(comm) as ƽ������,AVG (sal) as ƽ��нˮ,deptno as ����,job as ְλ from tb_company group by job ,deptno order by avg(comm) , AVG (sal),deptno
----23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
select distinct(ename)from tb_company 
----24  ��ѯԱ���������ظ���Ա����Ϣ��           
select  distinct( ename )from tb_company  where ename is not null
----25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա���������� 
select  ename from tb_company where ename LIKE'A%'OR ename ='_A%'OR ename ='___A%'
----26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ������� 
SELECT ename ,COUNT(ename) from  tb_company group BY ename 
HAVING COUNT(ename)>1 
ORDER BY COUNT(ename) desc
----27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select ename ,sal from tb_company  where sal between 900 and 3000
----28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select  job,min(sal) from tb_company group by job order by MIN (sal)asc

