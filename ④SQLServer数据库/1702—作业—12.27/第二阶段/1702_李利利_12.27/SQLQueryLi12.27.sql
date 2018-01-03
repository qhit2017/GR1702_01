create database db_Emp
--emp���ǹ�Ա��Ϣ�� 
--empno ���ǹ�Ա��Ա����ţ� employee number
--ename Ա�������� emlployee name
--job Ա���Ĺ�����ʲô��������Ա�������
--mgr �ϼ����
--hiredate�ܹ�����
--sal����
--comm����
--deptno���ű��
create table tb_emp(
empno nvarchar(32) primary key, ---Ա�����
ename nvarchar(16) not null,    ---Ա������
job nvarchar(32), ---Ա���Ĺ���
mgr nvarchar(32), ---�ϼ����
hiredate nvarchar(32),---�ܹ�����
sal decimal(10,4), ---����
comm money,   ---����
deptno nvarchar(32), ---���ű��
foreign key(deptno) references tb_dept(deptno),
foreign key(mgr) references tb_superior(mgr)
)
--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ
create table tb_dept(
deptno nvarchar(32) primary key,---���ű��
deptname nvarchar(32),   ---��������
location nvarchar(32)   ---��ַ
)
---�ϼ���
create table tb_superior(
mgr nvarchar(32) primary key,
supname nvarchar(16) not null,
salary money
)

insert into tb_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
values(001,'SMITH','����',1,'2014-2-1',1500,340,01),
      (002,'toto','SMITH',1,'2013-2-1',4500,1040,01),
      (003,'koko','Ա��',1,'2012-2-1',5500,1500,01),
      (004,'jojo','����',2,'2011-2-1',6500,100,02),
      (005,'��','����Ա',2,'2010-2-1',1000,150,02),
      (006,'ӱ��','����',2,'2017-2-1',3500,300,02),
      (007,'��ë','Ա��',3,'2001-2-1',3500,340,03),
      (008,'Сë','����Ա',3,'2007-2-1',5500,140,03),
      (009,'��','����',4,'2008-2-1',1000,150,04),
      (010,'ë��','����Ա',4,'2010-10-1',4600,1500,04),
      (011,'СС','����',5,'2009-2-1',2500,340,05),
      (012,'����','Ա��',5,'2015-2-1',2500,250,05),
      (013,'coco','����Ա',6,'2017-10-11',1500,1000,06),
      (014,'BoBo','����',6,'2015-4-1',4500,140,06),
      (015,'QQ','����Ա',6,'2014-10-10',5500,300,06)

insert into tb_dept(deptno,deptname,location)
values(01,'10','�Ϻ�'),
      (02,'SALES','����'),
      (03,'NEW YORK','����'),
      (04,'20','����'),
      (05,'30','����'),
      (06,'40','����')

insert into tb_superior(mgr,supname,salary)
values(1,'�Ŵ��',7500),
      (2,'BLAKE',6000),
      (3,'����ӱ',5000),
      (4,'����ΰ',4500),
      (5,'baby',7000),
      (6,'kimm',5500)
-----------------------------------------------------      
--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
select * from tb_dept de,tb_emp em
 where de.deptname ='SALES' 
    and de.deptno = em.deptno 
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
select * from tb_emp where sal=(select MAX(sal) from tb_emp )  
--3.��ѯ�����������нˮ��Ա����ţ������� 
select em.empno,em.ename,em.sal from tb_emp em where em.sal  in(
 SELECT MAX(em.sal) from tb_emp em group by em.deptno
 )                            
--4.��ѯ���������нˮ��Ա����Ϣ 
select * from tb_emp em where em.sal  in(
 SELECT MAX(em.sal) from tb_emp em group by em.deptno
 ) 
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ  
select * from tb_emp em
 WHERE em.sal>ANY(select AVG(em.sal) from tb_emp em group by em.deptno 
 )
--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
select * from tb_dept de INNER JOIN  tb_emp EM
 ON DE.deptno=EM.deptno
  where de.deptname ='SALES'
--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ
SELECT * FROM tb_emp em where em.mgr IN(
 SELECT su.mgr from tb_superior su WHERE su.supname='BLAKE'
 )
--8.��ѯ��SMITH������ͬ��Ա����Ϣ 
SELECT * FROM tb_emp WHERE job='SMITH'
--9.��ѯƽ�����ʱ�10���ŵ͵Ĳ��ű�� 
select em.deptno from tb_emp em
 group by em.deptno
  HAVING AVG(em.sal)  < any(select AVG(em.sal)
   from tb_emp em INNER JOIN tb_dept de ON em.deptno=de.deptno
    WHERE de.deptname='10')
--10.��ѯ��NEW YORK����������Ա�� 
SELECT * from  tb_emp em WHERE EM.deptno IN(
 select de.deptno from tb_dept de WHERE de.deptname='NEW YORK'
 )
--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������
SELECT SU.supname FROM tb_superior SU
 WHERE SU.salary >any (SELECT MAX(EM.sal) FROM tb_emp EM )
--13���ҳ�нˮ��ߵ������ 
SELECT TOP 5 sal,ename FROM tb_emp order BY sal desc 
--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT * from tb_dept de
 WHERE de.deptno IN(
 SELECT em.deptno FROM  tb_emp em  GROUP BY em.deptno HAVING COUNT(em.empno)>=3
 )
--15����ѯ�����ְ��5��Ա��
SELECT TOP 5 EM.hiredate,EM.ename FROM tb_emp EM ORDER BY EM.hiredate DESC
--16���г����н�����1500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
SELECT EEN.job ,COUNT(EEN.empno) AS ���� FROM tb_emp EEN GROUP BY job HAVING EEN.job IN(
SELECT EM.job FROM tb_emp EM GROUP BY EM.job HAVING MIN(EM.sal) > 1500)
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����

--18����нˮ��͵Ĳ��ž������ڲ��ŵ�����
 SELECT DE.deptname FROM tb_dept DE WHERE DE.deptno IN(
  SELECT EeM.deptno FROM tb_emp EeM  WHERE EeM.job='����' and EeM.sal =(
    SELECT MIN(EM.sal) FROM tb_emp EM WHERE EM.job='����' ) )
