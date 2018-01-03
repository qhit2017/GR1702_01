--EMP��ṹ˵����
--emp���ǹ�Ա��Ϣ�� 
--empno ���ǹ�Ա��Ա�����,employee number
--ename Ա�������� emlployee name
--job Ա���Ĺ�����ʲô��������Ա�������
--mgr �ϼ����
--hiredate�ܹ�����
--sal����
--comm����
--deptno���ű��
CREATE database db_EMPSH
USE db_EMPSH

CREATE table tb_empSH(
employeenumber nvarchar(32) primary key,
emlployeename nvarchar(32) not null ,
job nvarchar(16),
mgr nvarchar(32),
hiredate nvarchar(32),
sal money,
comm money,
deptno nvarchar(32)
)

INSERT INTO tb_empSH(employeenumber,emlployeename,job,mgr,hiredate,sal,comm,deptno)
VALUES (1,'С��','����',01,'20030516',36000,13000,001),
          (11,'����','����Ա',1,'20131016',3000,800,001),
          (12,'����','����Ա',1,'20090724',4500,1200,001),
          (13,'����','����Ա',1,'20120924',3500,1200,001),
       (2,'����','����',02,'19950625',53000,37000,002),
          (21,'����','����Ա',2,'20091016',13000,6800,002),
          (22,'���Ѿ�','����Ա',2,'20130324',15000,7200,002),
          (23,'���','����Ա',2,'20110924',12500,5200,001),
       (3,'BLAKE','����',03,'20011125',22000,10000,10),
          (31,'������','����',3,'20051016',8000,4800,10),
          (32,'jake','����',3,'20090724',5500,2200,10),
          (33,'mary','����',3,'20110924',6500,4200,10)
       
        
--Dept ���ű�
--Deptno ���ű��
--Deptname ��������
--Location ��ַ
CREATE table tb_Dept(
Deptno nvarchar(32) primary key,
Deptname nvarchar(32),
Location nvarchar(32))

INSERT INTO tb_Dept(Deptno,Deptname,Location) VALUES
 (001,'���۲�','����'),
 (002,'�з���','����'),
 (10,'SALES','NEW YORK')
 
--1.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_empSH em WHERE em.deptno IN(
SELECT de.Deptno from tb_Dept de WHERE de.Deptname = 'SALES' )
--2.��ѯ��˾��нˮ��ߵ�Ա����Ϣ 
SELECT * FROM tb_empSH where sal=(SELECT MAX(sal)from tb_empSH)
--3.��ѯ�����������нˮ��Ա����ţ������� 
SELECT * FROM tb_empSH where sal=(SELECT MAX(sal)from tb_empSH)
 --GROUP BY Deptno
--4.��ѯ���������нˮ��Ա����Ϣ 
SELECT * FROM tb_empSH  where sal IN(SELECT MAX(sal)from tb_empSH group BY deptno)
--5.��ѯнˮ���ڸò���ƽ��нˮ��Ա����Ϣ 
SELECT * from tb_empSH 
where sal >ANY(SELECT AVG(sal) from tb_empSH group BY deptno)

--6.��ѯ���������ǡ�SALES����Ա����Ϣ 
SELECT * FROM tb_empSH em WHERE em.deptno IN(
SELECT de.deptno from tb_Dept de WHERE de.Deptname = 'SALES' )

--7.��ѯ�쵼���ǡ�BLAKE����Ա����Ϣ 
SELECT * FROM tb_empSH em WHERE em.deptno IN(
SELECT eem.deptno from tb_empSH eem WHERE eem.emlployeename ='BLAKE')
--8.��ѯ��jake������ͬ��Ա����Ϣ 
SELECT * FROM tb_empSH em WHERE em.job IN(
SELECT eem.job from tb_empSH eem WHERE eem.emlployeename='jake')
--9.��ѯƽ�����ʱ�10���ŸߵĲ��ű�� 
SELECT Deptno from tb_empSH GROUP BY Deptno 
HAVING  AVG(sal)>(SELECT AVG(sal) from tb_empSH WHERE Deptno=10)
--10.��ѯ��NEW YORK����������Ա�� 
SELECT * FROM tb_empSH em WHERE em.deptno IN(
SELECT de.deptno from tb_Dept de WHERE de.Location ='NEW YORK' )

--11.��ѯ10�Ų��ŵ�Ա����������˾����ռ�ı����� 

--12����ѯ����ͨԱ�������нˮ��Ҫ�ߵ��쵼������ 
SELECT emlployeename from tb_empSH GROUP BY emlployeename
HAVING max(sal)>(SELECT MAX(sal) as ��ͨԱ�������нˮ
 from tb_empSH where job !='����' )
--13���ҳ�нˮ��ߵ������ 
SELECT top 5 * from tb_empSH 
ORDER BY sal desc 

--14���г�����������Ա�������в��źͲ�����Ϣ
SELECT* FROM tb_Dept de where de.Deptno IN(
SELECT em.deptno from tb_empSH em
GROUP BY em.deptno
HAVING count(em.deptno)>=3)


--15����ѯ�����ְ��5��Ա��
 SELECT top 5 * from tb_empSH 
ORDER BY hiredate asc
--16���г����н�����7500�ĸ��ֹ����Լ����´˹�����ȫ����Ա����
SELECT em.job,COUNT(em.deptno)as �˹�����ȫ����Ա���� 
from tb_empSH em 
GROUP BY em.job 
having em.job IN(
SELECT eem.job
from tb_empsh eem
GROUP BY eem.job
HAVING min(eem.sal)>7500)
--17���г����ֹ�������͹����Լ����¸ù����Ĺ�Ա����
SELECT em.emlployeename from tb_empSH em
 WHERE em.sal IN(
 SELECT MIN(sal) as ��͹��� from tb_empSH em GROUP BY em.job)
--18����нˮ��͵Ĳ��ž������ڲ��ŵ����� 
 SELECT De.Deptname as ��������
 from tb_Dept De
 WHERE De.Deptno IN(
 SELECT SH.deptno
 from tb_empSH SH
 WHERE SH.sal  IN(
 select MIN(sal)
 from tb_empSH SH
 WHERE SH.job = '����')
)
 
