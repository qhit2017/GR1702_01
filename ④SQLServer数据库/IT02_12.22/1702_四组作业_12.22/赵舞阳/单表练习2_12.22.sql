CREATE database db_wy
CREATE table tb_emp(
empno nvarchar(32)primary key,
ename char(16)not null,
deptno char(16)not null,
job char(16),
sal money,
comm money,
hiredate date,
sex char(16)check (sex='boy' or sex='girl')
)
--�鿴��ṹ
sp_help tb_emp
--���������
INSERT INTO tb_emp VALUES
('201701','�ž�','10','CLERK',1000,100,'2007-5-13','girl'),
('201702','����ٻ','30','CLERK',900,50,'2017-5-3','girl'),
('201703','������','20','MANAGER',4000,500,'2009-1-13','boy'),
('201704','�����','10','CLERK',1100,150,'2012-12-28','boy'),
('201705','����','10','CLERK',1500,50,'2014-3-19','boy'),
('201706','��ʿ��','20','CLERK',1250,250,'2011-9-30','boy'),
('201707','����','30','CLERK',800,50,'2015-12-31','girl'),
('201708','���ϵ�','30','MANAGER',5000,500,'2007-1-1','boy'),
('201709','�����','30','CLERK',1950,650,'2016-5-23','boy'),
('201710','�Ǵ�','20','CLERK',1000,150,'2015-5-4','girl'),
('201711','������','20','CLERK',1050,150,'2014-1-13','girl'),
('201712','����','10','CLERK',2000,650,'2013-7-28','girl'),
('201713','������','10','MANAGER',9000,1000,'2007-7-13','boy'),
('201714','����','20','CLERK',700,100,'2017-1-13','girl'),
('201715','mary','10','CLERK',1850,350,'2016-4-24','girl'),
('201716','Jack','30','CLERK',2000,600,'2011-5-13','boy')
INSERT INTO tb_emp (empno,ename,deptno,sal,comm,hiredate,sex) VALUES
('201718','tom','10',2000,1000,'2017-12-24','boy')
INSERT INTO tb_emp VALUES
('201717','mark','10','CLERK',800,1000,'2017-12-24','boy')
--��ѯ��������
SELECT * from tb_emp
--1ѡ����30�е�����Ա����
select * FROM tb_emp where deptno='30'
--2�г����а���Ա��CLERK������������Ա��źͲ��ű�š� 
SELECT ename ����,empno ��Ա���,deptno ���ű�� from tb_emp where job='CLERK'
--3�ҳ��������н���Ա����
SELECT ename ���� FROM tb_emp where comm>sal
--4�ҳ��������н��60%��Ա����
SELECT top 60 percent sal,ename ���� FROM tb_emp where comm>sal 
--5�ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
SELECT * FROM tb_emp where job='MANAGER' AND deptno='10' OR job='CLERK' AND deptno='20'
--6�ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ� 
SELECT * FROM tb_emp where job='MANAGER' AND deptno='10' OR job='CLERK' AND deptno='20' OR deptno='10' and job NOT IN ('MANAGER','CLERK') AND sal>=2000
--7�ҳ��н����Ա���Ĳ�ͬ������
SELECT ename Ա��,deptno ���� FROM tb_emp where comm is NOT null
--8�ҳ�û�н���򽱽����100��Ա����
SELECT ename Ա��,comm ���� FROM tb_emp where comm is NOT null and comm<100
--9��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT avg(sal) ƽ��нˮ,deptno ������ FROM tb_emp
group BY deptno
ORDER BY avg(sal)
desc
--10�ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT ename Ա��,hiredate ���� FROM tb_emp where hiredate<'2012-1-1'
--11��ѯ��˾Ա��нˮ������ 
SELECT SUM(sal) нˮ���� from tb_emp
--12��ʾ����Ϊ5���ַ���Ա����������
select ename ���� FROM tb_emp where ename LIKE'_____' and LEN(ename)=5
--13��ʾ������'R'��Ա���������� 
SELECT ename ���� from tb_emp where ename NOT like'%R%'
--14��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
SELECT avg(ename) Ա������,deptno ������ FROM tb_emp
group BY deptno
ORDER BY AVG(ename)
desc
--15��ѯÿ������ŮԱ����������
SELECT count(sex) ���� FROM tb_emp where sex = 'girl'
--16��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ� 
select ename,hiredate from tb_emp where year(hiredate)>2007 and YEAR(hiredate)<2017
--17��ʾԱ������ϸ���ϣ����������� 
SELECT * FROM tb_emp order BY ename asc
--18��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档 
SELECT ename ����,hiredate �ܹ����� FROM tb_emp order BY hiredate asc
--19��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������ 
select ename ����,job ����,sal н�� from tb_emp order by job desc,sal
--20��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select*from tb_emp
where comm>(select AVG(comm)from tb_emp) 
--21��ѯÿ��Ա�������루��������������нˮ����
 select ename,SUM(sal+comm)as ������ from tb_emp group by ename  
--22��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
select AVG(comm)as ƽ������,AVG(sal)as ƽ��нˮ,deptno as ����,job as ְλ from tb_emp group by deptno,job 
--23��ѯԱ���������ظ�������ֻ����һ�Ρ�
select distinct ename from  tb_emp 
--24��ѯԱ���������ظ���Ա����Ϣ��
SELECT * from tb_emp where ename LIKE tb_emp.ename
select * from tb_emp where ename in(
select ename from  tb_emp group by ename having COUNT(*)<2)
--25��ʾ�����ֶε��κ�λ�ð���'A'������Ա���������� 
select*from tb_emp where ename like'%a%' 
--26��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
select ename ,count(1)as �ظ����� from tb_emp group by ename having COUNT(1)>=2
--27��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select*from tb_emp where sal>900 and sal<3000
--28��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select job as ְλ,min(sal)as ��͹��� from tb_emp group by job order by min(sal) 