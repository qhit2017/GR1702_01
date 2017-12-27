
create database db_student
use db_student
---------------------------
create table tb_student(
sno char(5) primary key,
sname char(20) not null,
ssex char(4) check(ssex='��' or ssex='Ů') default '��' not null,
sage smallint not null,
sdept char(20),
grade smallint)
---------------------------
select * from tb_student
drop table tb_student
---------------------------
insert into tb_student
select  '01','����˳','��',20,'�廪IT',99 union
select  '02','������','��',21,'�廪IT',11 union
select  '03','�ﾴ�','��',18,'�廪IT',66 union
select  '04','��˧��','��',20,'�廪IT',88 union
select  '05','����','��',20,'�廪IT',55 union
select  '06','���','Ů',19,'�廪IT',88 union
select  '07','�Ľ�','��',20,'�廪IT',55 
---------------------------
--1'��ѯȫ��ѧ����ѧ����������
select sno,sname from tb_student

--2'��ѯȫ��ѧ����������ѧ�š�רҵ��
select sno,sname,sdept from tb_student

--3'��ȫ��ѧ�����������������ݡ�
select sname as ����,YEAR(GETDATE())-sage as ������ from tb_student

--4'��ѯ���廪IT��רҵȫ��ѧ����������
select * from tb_student where sdept='�廪IT'

--5'��ѯ����������20�����µ�ѧ�������������䡣
select sname,sage from tb_student where sage<20

--6'��ѯδ�����ѧ����������ƽ���ɼ���
select  avg(grade)as ƽ���ɼ�,count(sage) as ���� from tb_student where sage<20 

--7'��ѯ�ɼ��в������ѧ����ѧ�š�
select sno from tb_student where grade<60 

--8'��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
select sname,sage,sdept from tb_student where sage between 18 and 22

--9'��ѯ���䲻��20~23��֮���ѧ��������רҵ������
select sname,sage,sdept from tb_student where sage>23 and sage<20

--10'��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
select sname,ssex from tb_student where sdept in ('��Ϣϵ','��ѧϵ')

--11'��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select sname,ssex from tb_student where sdept not in ('��Ϣϵ','��ѧϵ')

--12'
select * from tb_student where sno='05'
--13'
select sname,ssex,sno from tb_student where sname like '��_'
--14'
select sname,ssex,sno from tb_student where sname like '��__'
--15'
select sname,sno from tb_student where sname like '_��_'
--16'
select sname from tb_student where sname not like '��%'
--17'
select sname,sno from tb_student where grade=null
--18'
select sdept,AVG(grade) from tb_student group by sdept
--19'
select sname,sno from tb_student where grade is not null
--20'
select * from tb_student order by sdept asc,sage desc
--21'
select COUNT(*)as ���� from tb_student 
--22'
select ssex,COUNT(*) from tb_student group by ssex 
--23'
select  sdept,AVG(grade)as grade from tb_student  group by sdept order by grade desc    
--24'
select sdept,max(grade) from tb_student group by sdept
--25'
select sdept,min(grade) from tb_student group by sdept
--26'
     
--27'
select ssex,AVG(grade) from tb_student  group by ssex
--28'

--29'
select sdept,COUNT(*) from tb_student group by sdept
--30'
