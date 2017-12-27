USE db_staff
create table tb_student(
Sno char(32) primary key,
Sname char(32) not null,
Ssex char(16) check(Ssex='��' or Ssex='Ů')default '��',
Sage smallint not null,
Sdept char(20),
Grade smallint)
insert into tb_student(Sno,Sname,Ssex,Sage,Sdept,Grade) values
(201701,'����','��',19,'cs',85),
(201702,'����','��',20,'is',85),
(201703,'����','Ů',18,'ma',95),
(201704,'����','Ů',22,'ma',65),
(201705,'����','Ů',21,'cs',75),
(201706,'�Ž�','��',15,'is',55),
(201707,'����','��',16,'ma',25),
(201708,'����','��',19,'ma',65),
(09102040203,'�ſ�','��',23,'ma',65),
(09102040204,'�½�','��',17,'ma',75),
(09102040205,'��','��',15,'ma',55)
--1.��ѯȫ��ѧ����ѧ����������
select Sno,Sname from tb_Student
--2.��ѯȫ��ѧ����������ѧ�š�רҵ��
select Sname,Sno,Sdept from tb_Student
--3.��ȫ��ѧ�����������������ݡ�
select Sname as ����,year(GETDATE())-Sage as ������ from tb_Student
--4.��ѯ���������ѧ��רҵȫ��ѧ����������
select Sname,Sdept from tb_Student where Sdept='cs'
--5.��ѯ����������20�����µ�ѧ�������������䡣
select Sname,Sage from tb_Student where Sage <20
--6.��ѯδ�����ѧ����������ƽ���ɼ���
select δ�����ѧ��������=count(Sage),ƽ���ɼ�=avg(Grade) from tb_Student where Sage < 18
--7.��ѯ�ɼ��в������ѧ����ѧ�š�
select Sno,Grade from tb_Student where Grade <60
--8.��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
select Sname as ����,Sdept as ѧ��,Sage as ���� from tb_Student where Sage >=18 and Sage<=22
SELECT Sname as ����,Sdept as ѧ��,Sage as ���� from tb_Student where Sage BETWEEN 18 AND 22
--9.��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
select Sname as ����,Sdept as ѧ��,Sage as ���� from tb_Student where not Sage >=20 and Sage<=23
--10.��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
insert into tb_student(Sno,Sname,Sage,Sdept)VALUES(21101,'������',18,'dance'),
(21102,'������',25,'dance')
select Sname,Ssex from tb_Student where Sdept='is' or Sdept='cs'or Sdept='ma'
select Sname,Ssex from tb_Student where Sdept IN('is','cs','ma')
--11.��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select Sname,Ssex from tb_Student  where not Sdept='is' and not Sdept='cs'and not Sdept='ma'
select Sname,Ssex from tb_Student where Sdept not IN('is','cs','ma')
--12.��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_student WHERE Sno=09102040203
--13.��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
select Sname,Sno,Ssex from tb_Student where Sname like'��%' 
--14.��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ��������
SELECT Sname from tb_student where Sname LIKE '��%' AND LEN(Sname) =3                                                                               
--15.��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
select Sname,Sno,Ssex from tb_Student where Sname like'%��' 
--16.��ѯ���в��ա��¡���ѧ��������
select Sname,Sno,Ssex from tb_Student where not Sname like'��%'  
--17.��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname FROM tb_student where Grade IS  NULL 
--18.��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT Sdept AS רҵ����,AVG(Grade)as ƽ���ɼ� FROM tb_student GROUP BY Sdept 
--19.�������гɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname FROM tb_student where Grade  IS not NULL
--20.��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
 SELECT * FROM tb_student ORDER BY Sdept ASC,Sage DESC
--21.��ѯѧ����������
SELECT COUNT(Sname) as ѧ�������� FROM tb_student
--22.��ѯ������Ů����������
SELECT  Ssex as �Ա�,COUNT(Ssex)as ���� FROM tb_student GROUP BY Ssex 
--23.��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT Sdept as רҵ ,AVG(Grade)AS ƽ���ɼ� FROM tb_student group BY Sdept ORDER BY ƽ���ɼ� DESC 
--24.��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT Sdept as רҵ ,MAX(Grade)as ��߷� from tb_student GROUP BY Sdept
--25.��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT Sdept as רҵ ,MIN(Grade)as ��ͷ� from tb_student GROUP BY Sdept
--26.��ѯƽ���ɼ�����רҵ�����֡�
--27.��ѯ������Ů����ƽ���ɼ���
SELECT Ssex AS �Ա�,AVG(Grade)as ƽ���ɼ� FROM tb_student GROUP BY Ssex 
--28.��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
--29.��ѯרҵѧ����������5�˵�רҵ����
SELECT Sdept as רҵ, COUNT(Sdept) as ���� FROM tb_student GROUP BY Sdept HAVING COUNT(Sdept)>5 
--30.��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
