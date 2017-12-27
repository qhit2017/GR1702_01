create database db_Student
create table tb_Student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check (Ssex='��' or Ssex='Ů') default '��' not null,
Sage smallint not null,
Sdept char(20),
Grade smallint
)

select Sno,Sname,Ssex,Sage,Sdept,Grade from tb_Student
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept,Grade)
values(200215001,'����','��',20,'CS',98),
      (200215002,'����','Ů',19,'CS',66),
      (200215003,'����','Ů',18,'MA',79),
      (200215004,'����','��',25,'IS',89),
      (200215005,'����ӱ','Ů',20,'IS',99),
      (200215006,'��С��','��',21,'CS',86),
      (200215007,'��С��','Ů',19,'CS',88),
      (200215008,'��С��','Ů',18,'MA',57),
      (200215009,'��С��','��',12,'IS',77),
      (200215010,'ӱ��','Ů',20,'IS',68),
      (200215011,'�����','��',20,'CS',79),
      (200215012,'����','Ů',19,'CS',97),
      (200215013,'������','Ů',18,'MA',78),
      (200215014,'�Ŵ��','��',19,'IS',94),
      (09102040203,'����','��',15,'CH',46)
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept,Grade)
values(09102040204,'����','Ů',24,'FAE',null)
--1.��ѯȫ��ѧ����ѧ��������
select Sno,Sname from tb_Student
--2.��ѯȫ��ѧ����������ѧ�š�רҵ��
select Sname,Sno,Sdept from tb_Student
--3.��ȫ��ѧ�����������������ݡ�
select Sname,YEAR(GETDATE())-Sage as ������� from tb_Student
--4.��ѯ���������ѧ��רҵȫ��ѧ����������
select Sname,Sdept from tb_Student where Sdept='CS'
--5.��ѯ����������20�����µ�ѧ�������������䡣
select Sname,Sage from tb_Student where Sage<20
--6.��ѯδ�����ѧ����������ƽ���ɼ���
select count(Sage) as δ��������,avg(Grade) as ƽ���ɼ� from tb_Student where Sage<18
--7.��ѯ�ɼ��в������ѧ����ѧ�š�
select Sno as �������ѧ����ѧ�� from tb_Student where Grade<60
--8.��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
select Sname,Sdept,Sage from tb_Student where Sage>=18 AND Sage<=23
select Sname,Sdept,Sage from tb_Student where Sage between 18 and 22
--9.��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
select Sname,Sdept,Sage from tb_Student where NOT Sage between 20 and 23
--10.��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
select Sname,Ssex from tb_Student where Sdept='IS' OR Sdept='MA' OR Sdept='CS'
select Sname,Ssex from tb_Student where Sdept IN('IS','MA','CS')
--11.��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select Sname,Ssex from tb_Student where not Sdept IN('IS','MA','CS')
--12.��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
select * from tb_Student where Sno=09102040203 
--13.��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
select Sname,Sno,Sage from tb_Student where Sname like ('��%')
--14.��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
select Sname,Sno,Sage from tb_Student where Sname like ('��%') AND LEN(Sname)=3                                  
--15.��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
select Sname,Sno,Sage from tb_Student where Sname like ('_��%')
--16.��ѯ���в��ա��¡���ѧ��������
select Sname,Sno,Sage from tb_Student where not Sname like ('��%')
--17.��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
select Sno,Sname from tb_Student where Grade is null
--18.��ѯÿ��רҵ��ѧ����ƽ���ɼ���
select Sdept, count(Sdept) AS ����,avg(Grade) as ƽ���ɼ� from tb_Student group by Sdept
--19.�������гɼ���ѧ����ѧ�ź�������
select Sno,Sname from tb_Student where not Grade is null
--20.��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
select * from tb_Student order by Sdept asc,Sage desc
--21.��ѯѧ����������
select count(Sname) as ѧ�������� from tb_Student 
--22.��ѯ������Ů����������
select Ssex , count(Ssex) as ���� from tb_Student group by Ssex
--23.��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
select Sdept, avg(Grade) as ƽ���ɼ� from tb_Student group by Sdept order by ƽ���ɼ� desc
--24.��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
select Sdept , max(Grade) as �ɼ���� from tb_Student group by Sdept
--25.��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
select Sdept , MIN(Grade) as �ɼ���� from tb_Student group by Sdept
--26.��ѯƽ���ɼ�����רҵ�����֡�
--27.��ѯ������Ů����ƽ���ɼ���
select Ssex,AVG(Grade) from tb_Student group by Ssex
--28.��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
--29.��ѯרҵѧ����������4�˵�רҵ����
select Sdept,count(Sdept) from tb_Student group by Sdept having count(Sdept)>4
--30.��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����