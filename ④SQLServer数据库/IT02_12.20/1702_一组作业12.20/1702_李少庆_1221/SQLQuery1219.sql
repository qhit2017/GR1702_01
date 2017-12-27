create database lishaoqing_1219
use lishaoqing_1219

create table tb_student(
Sno char(16) primary key,
Sname nvarchar(32),
Ssex char(8) check(Ssex='man' or Ssex='women') default'man',
Sage smallint,
Sdept char(16),
grade smallint)
select * from tb_student
sp_help tb_student
--alter table tb_student add Ssex char(8) check(Ssex='man' or Ssex='women') default'man'

insert into tb_student (Sno,Sname,Sage,Sdept,grade,Ssex)
values('021004','�����',25,'IS',70,'man'),
('091020','Ԭ����',23,'MA',80,'man'),
('021006','�',22,'CS',65,'man'),
('021007','������',19,'MA',50,'women'),
('021009','������',21,'CS',22,'women'),
('021000','������',20,'IS',43,'man')
insert into tb_student (Sno,Sname,Sage,Sdept,grade,Ssex)
values('021013','�¸�',15,'�ӳ�',43,'man'),
('021012','����',18,'����',43,'man')

insert into tb_student (Sno,Sname,Sage,Sdept,Ssex)
values('0210135','�͸�',15,'�ӳ�','man'),
('0210124','����',18,'����','man')


--(1)
select Sno,Sname from tb_student
--(2)
select Sno,Sname,Sdept from tb_student
--(3)
select Sname,Sage from tb_student
--(4)
select Sname from tb_student where Sdept='CS'
--(5)
select Sname,Sage from tb_student where Sage<20
--��6����ѯδ�����ѧ��������ƽ���ɼ�
SELECT δ��������=COUNT(Sname),ƽ���ɼ�=AVG(grade) from tb_student where Sage<18
--(7) 
select Sno from tb_student where grade<60
--(8)
select Sname,Sdept,Sage from tb_student where Sage BETWEEN 18 AND 22
--(9)
select Sname,Sdept,Sage from tb_student where Sage<20 or Sage>=23
--(10)
select Sname,Ssex from tb_student where Sdept='IS' or Sdept='MA' or Sdept='CS'
select Sname,Ssex from tb_student where Sdept IN ('IS','MA','CS')
--(11)       ���д�
select Sname,Ssex from tb_student where Sdept<>'IS' and Sdept<>'MA' and Sdept<>'CS'
select Sname,Ssex from tb_student where Sdept NOT IN ('IS','MA','CS')
--(12)
select * from tb_student where Sno='091020'
--(13)
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT Sname,Sno,Ssex from tb_student where Sname LIKE '��%'
--(14)
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname from tb_student where Sname LIKE '��__'
--(15)
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname,Sno from tb_student where Sname LIKE '_��%'
--(16)
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT Sname from tb_student where Sname not LIKE '��%' 
--(17)���д�
SELECT Sno,Sname FROM tb_student WHERE grade=null
--(18)
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���

--(19)			���д�
SELECT Sno,Sname FROM tb_student WHERE grade is not NULL
--(20)
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�

--21.	��ѯѧ����������
SELECT ѧ��������=COUNT(Sno) from tb_student  
--22.	��ѯ������Ů��������������
select ����������=COUNT(Sname) from tb_student where Ssex='man' 
select Ů��������=COUNT(Sname) from tb_student where Ssex='women'
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT AVG(grade) from tb_student order BY AVG(grade) desc where Sdept='IS'
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���

--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���

--26.	��ѯƽ���ɼ�����רҵ�����֡�

--27.	��ѯ������Ů����ƽ���ɼ���

--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ�

--29.	��ѯרҵѧ����������50�˵�רҵ��������
SELECT Sdept from tb_student where COUNT(Sname )>3 
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����


