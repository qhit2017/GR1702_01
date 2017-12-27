USE wyk
CREATE table tb_emp(
empno char(16) primary key,
ename char(8),
deptno char(8),
job char(8),
sal money,
comm money,
hiredate char(20),
Ssex char(8) check(Ssex = 'man' or Ssex = 'women')
)
sp_help tb_emp
select empno,ename,deptno,job,sal,COMM,hiredate,Ssex from tb_emp
INSERT  into tb_emp(empno,ename,deptno,job,sal,COMM,hiredate,Ssex)
values(1,'����','10','����Ա',2000,100,20151202,'man'),
(2,'tom','20','����Ա',2000,200,20100822,'man'),
(3,'Roes','30','����',5000,2000,20080222,'women'),
(4,'Lili','40','����',8000,9000,20041015,'women'),
(5,'baobo','20','����Ա',2000,200,20040915,'man'),
(6,'����','10','����Ա',2000,200,20100521,'man'),
(7,'������','20','����',10000,20000,20110122,'women'),
(8,'˹����','20','����Ա',2000,300,20130621,'women')

--1��ѡ����30�е�����Ա����
SELECT ����=ename FROM tb_emp WHERE deptno='30'
--2���г����а���Ա(CLERK)����������Ա��źͲ��ű�š�
SELECT ename,empno,deptno FROM tb_emp WHERE job='����Ա'
--3���ҳ��������н���Ա����
SELECT ename FROM tb_emp WHERE comm > sal
--4���ҳ��������н��60%��Ա����
SELECT ename  FROM  tb_emp WHERE comm >sal*(1+0.6)
--5���ҳ�����10�����о���(MANAGER)�Ͳ���20�����а���Ա(CLERK)����ϸ���ϡ�
SELECT * FROM tb_emp WHERE (deptno='10'and job='����') or (deptno='20'and job='����Ա')
--6���ҳ�����10�����о���(MANAGER)������20�����а���Ա(CLERK)���Լ����в����мȲ��Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
SELECT * FROM tb_emp 
WHERE (deptno='10'and job='����') or (deptno='20'and job='����Ա')
or (job NOT IN ('����','����Ա')and sal>=2000)
--7���ҳ��н����Ա���Ĳ�ͬ������
SELECT job as ���� FROM tb_emp WHERE comm is not null group BY job
--8���ҳ�û����򽱽����100��Ա����
SELECT ename FROM tb_emp WHERE comm is null or comm <100
--9����ѯÿ�����ŵ�ƽ��нˮ�Ͳ�����������нˮ�ɸߵ��ͽ�������
SELECT AVG (sal) as ƽ��нˮ,deptno as ������ FROM tb_emp group by deptno order by avg(sal) desc
--10���ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT ename ,hiredate FROM tb_emp WHERE hiredate < '2012'
--11����ѯ��˾Ա��нˮ������
SELECT  sum(sal) FROM tb_emp
--12����ʾ����Ϊ5���ַ���Ա����������
SELECT ename FROM tb_emp WHERE ename like '%%'AND LEN(ename)=5
--13����ʾ�����С�R����Ա����������
SELECT ename FROM tb_emp WHERE ename NOT LIKE'%R%'
--14����ѯÿ������Ա�������Ͳ�������������Ա���������н������С�
SELECT count(deptno) as Ա������ ,deptno AS ������ FROM tb_emp group  BY deptno order by count (deptno) desc
--15����ѯÿ������ŮԱ����������
SELECT deptno ,count(ename) FROM tb_emp WHERE Ssex='girl' group by deptno
--16����ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
SELECT ename as ����,hiredate as �ܹ����� FROM tb_emp 
WHERE hiredate between 2007 and 2017 
--17����ʾԱ������ϸ���ϣ�������������
SELECT * FROM tb_emp order by ename 
--18����ʾ����Ա�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档��
SELECT ename ,hiredate FROM   tb_emp order by  hiredate
--19����ʾ����Ա����������������н�𣬰������Ľ������У���������ͬ��н������
SELECT*FROM  tb_emp ORDER BY job DESC ,sal
--20����ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
SELECT * FROM tb_emp WHERE sal > (select AVG (sal) from tb_emp )
--21����ѯÿ��Ա��������(��������������нˮ)��
SELECT sum(sal+comm) as ������ ,ename as ���� FROM tb_emp group by ename
--22����ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
SELECT avg(comm) as ƽ������,AVG (sal) as ƽ��нˮ,deptno as ����,job as ְλ FROM 
tb_emp group by job ,deptno order by avg(comm) , AVG (sal),deptno
--23����ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT distinct(ename)FROM tb_emp
--24����ѯԱ���������ظ���Ա����Ϣ��
SELECT  distinct( ename )FROM tb_emp  WHERE ename is not null
--25����ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
SELECT  ename FROM tb_emp WHERE ename LIKE'A%'OR ename ='_A%'OR ename ='___A%'
--26����ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT ename ,COUNT(ename) FROM tb_emp group BY ename 
HAVING COUNT(ename)>1 ORDER BY COUNT(ename) desc
--27����ѯ����Ա�����ʶ���900-3000֮��Ĳ�����Ϣ��
SELECT ename ,sal FROM tb_emp  WHERE sal between 900 and 3000
--28����ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT  job,min(sal) FROM tb_emp group by job order by MIN (sal)asc