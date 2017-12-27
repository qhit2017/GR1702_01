--�л����ݿ�
USE db_employee
--�������ݿ�
CREATE database db_employee
--������ṹ
CREATE table tb_employee(
empno char(16) primary key,
ename nvarchar(10) not null,
deptno nvarchar(16),
job nvarchar(16) ,
sal money ,
comm decimal(8,4),
hiredate date,
sex char(10) check(sex='man' or sex='woman')
)
--�鿴��ṹ
sp_help tb_employee

--���������¼
INSERT INTO tb_employee(empno,ename,deptno,job,sal,comm,hiredate,sex) 
VALUES ('001','Lily','10','CLERK',5000,6300,'2001-12-04','woman'),
('002','Tom','20','MANAGER',5500,4500,'2006-10-13','man'),
('003','Jason','30','CLERK',3500,2300,'2014-06-26','man'),
('004','Mary','40','CLERK',4000,3000,'2012-08-16','woman'),
('005','Walker','50','MANAGER',4600,5200,'2015-10-22','man'),
('006','Wilson','60','CLERK',4100,2300,'2008-09-10','man'),
('007','King','70','MANAGER',5500,2000,'2016-12-12','man'),
('008','Johnson','80','CLERK',3500,2000,'2017-01-16','man'),
('009','Stewart','90','CLERK',4600,3000,'2004-07-26','man'),
('010','Powell','10','MANAGER',4400,2100,'2009-04-12','man'),
('011','perry','10','CLERK',2500,3000,'2003-05-17','man'),
('012','Marshall','20','MANAGER',8600,4200,'2012-08-14','man'),
('013','James','30','CLERK',3500,2000,'2014-05-19','man'),
('014','Long','40','MANAGER',4500,3000,'2015-06-13','man'),
('015','Rose','50','CLERK',2800,NULL,'2016-07-18','woman'),
('016','Rose','60','MANAGER',6800,2000,'2005-02-16','woman'),
('017','Vera','70','CLERK',3600,NULL,'2003-09-28','woman'),
('018','Starr','80','CLERK',2500,3000,'2015-06-27','woman'),
('019','Penny','90','MANAGER',5000,3200,'2014-09-15','woman'),
('020','Lacy','20','MANAGER',6400,3200,'2003-01-19','woman'),
('021','Ivy','10','CLERK',2300,85,'2002-05-21','woman'),
('022','Crace','20','MANAGER',5500,2500,'2016-03-25','woman'),
('023','Bess','30','CLERK',3600,NULL,'2017-06-23','woman'),
('024','Robinson','40','MANAGER',5600,3400,'2014-08-10','man'),
('025','Martinez','50','CLERK',4800,2400,'2004-10-23','man'),
('026','Sims','60','MANAGER',5900,2600,'2016-12-08','man'),
('027','Rogers','70','CLERK',4200,3000,'2009-07-06','man'),
('028','Peters','80','CLERK',1500,NULL,'2012-08-22','man'),
('029','Lawson','90','CLERK',3500,3600,'2013-09-01','man'),
('030','Kelly','30','CLERK',4000,3000,'2014-04-26','man')


--�鿴���ж�����¼
SELECT * FROM tb_employee

--1��ѡ����30�е�����Ա��
select * from tb_employee where deptno = '30'
--2���г����а���Ա��CLERK������������Ա��źͲ��ű��
select ename,empno,deptno from tb_employee where job = 'CLERK'
--3���ҳ��������н���Ա��
select ename from tb_employee where sal < comm
--4���ҳ��������н��60%��Ա��
--5���ҳ�����10�����о���(MANAGER)�Ͳ���20�����а���Ա(CLERK)����ϸ����
select * from tb_employee where deptno = '10' or deptno = '20' 
--6���ҳ�����10�����о���(MANAGER),����20�����а���Ա(CLERK)����ϸ����,�Լ�����
--   �����мȲ��Ǿ����ֲ��ǰ���Ա,��н����ڻ����2000������Ա������ϸ���� 
--7���ҳ��н����Ա���Ĳ�ͬ����
select ename,job from tb_employee where comm is not null
--8���ҳ�û�н���򽱽����100��Ա��
select ename from tb_employee where comm is null or comm < 100
--9����ѯÿ�����ŵ�ƽ��нˮ�Ͳ�����,������нˮ�ɸߵ��ͽ�������
select deptno,AVG(sal) as ƽ��нˮ from tb_employee group by deptno order by AVG(sal) desc
--10���ҳ�����2012��ǰ�ܹ͵�Ա��
select ename from tb_employee where hiredate < '2012'
--11����ѯ��˾Ա��нˮ����
select sum(sal)  as нˮ���� from tb_employee
--12����ʾ����Ϊ5���ַ���Ա��������
select ename from tb_employee where LEN (ename) = '5'
--13����ʾ�����С�R����Ա��������
select ename from tb_employee where ename not like '%R%'
--14����ѯÿ������Ա�������Ͳ�����,������Ա���������н�������
select deptno,COUNT(ename) as Ա������ from tb_employee group by deptno order by COUNT(ename) desc
--15����ѯÿ������ŮԱ��������
select  deptno, COUNT (ename) as ���� from tb_employee where sex='woman' group by  deptno
--16����ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ�����
select ename,hiredate from tb_employee where hiredate between '2007' and '2017'
--17����ʾԱ������ϸ����,����������
select * from tb_employee order by ename 
--18����ʾԱ�����������ܹ�����,�������������,�����ϵ�Ա��������ǰ��
select ename,hiredate from tb_employee order by hiredate 
--19����ʾ����Ա����������������н��,�������Ľ�������,��������ͬ��н������
select ename,job,sal from tb_employee group by ename,job,sal order by job,sal desc
--20����ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ
select * from tb_employee where sal>(select AVG(sal) from tb_employee)
--select AVG(sal) from tb_employee (��ѯнˮƽ��ֵ)
--21����ѯÿ��Ա�������루��������������нˮ�� ����
select ename,SUM(sal+comm) from tb_employee group by ename
--22����ѯÿ�����Ų�ְͬλ��ƽ������,ƽ��нˮ,���ź�ְλ��
select deptno,job,AVG(comm) as ����ƽ��ֵ, AVG(sal) as нˮƽ��ֵ from tb_employee group by deptno,job
--23����ѯԱ������,�ظ�������ֻ����һ��
select distinct(ename) from tb_employee 
--24����ѯԱ���������ظ���Ա����Ϣ
select * from tb_employee where ename 
--25����ʾ�����ֶε��κ�λ�ð�����A��������Ա��������
select ename from tb_employee where ename like '%A%'
--26����ѯԱ�������ظ���Ա��,��ʾ��Ա�������ظ�����
--27����ѯ����Ա�����ʶ���900~3000֮��Ĳ�����Ϣ
select * from tb_employee where sal between 900 and 3000
--28����ѯÿ��ְλ����͹���,�����չ��ʽ�����������
select job,MIN(sal) as ��͹��� from tb_employee  group by job order by job asc

