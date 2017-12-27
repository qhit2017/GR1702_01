--�л����ݿ�
use db_student1
--������
CREATE table tb_student1(
id char(16)   primary key,
name nvarchar(16) not null,
age smallint ,
sex char(8) check(sex='boy' or sex='gril' ) default 'boy',
dept nvarchar(16),
grade  smallint
)
--��Ӽ�¼
INSERT INTO tb_student1(id,name,age,sex,dept,grade) 
values('1','����',19,'boy','IS',96),
('2','��÷÷',18,'gril','IS',89),
('3','�³�',20,'boy','IS',77),
('4','����',17,'gril','ѧǰ����',68),
('5','����',21,'boy','IS',89),
('6','��÷÷',18,'gril','ѧǰ����',89),
('7','����',19,'boy','IS',96),
('8','����',20,'boy','IS',81),
('9','������',20,'boy','CS',86),
('10','����',19,'boy','MA',89),
('11','����Ӣ',18,'gril','ѧǰ����',89),
('12','�',19,'boy','IS',85),
('13','����ӱ',24,'gril','IS',79),
('14','�ź���',19,'boy','IS',72),
('15','������',22,'boy','MA',59),
('16','�ֺ�Ӣ',20,'gril','IS',84),
('22','Ǯǧ',18,'boy','IS',89),
('23','����',20,'boy','IS',55),
('24','��������',18,'gril','ѧǰ����',49),
('25','����',18,'gril','ѧǰ����',58),
('26','��ӱ',18,'gril','MA',76),
('27','����',18,'gril','CS',39),
('28','���ӻ�',16,'boy','IS',82),
('29','����',17,'boy','MA',70),
('30','����',19,'boy','CS',85),
('31','���Ӻ�',22,'boy','MA',98),
('34','���ۻ�',20,'boy','IS',54),
('35','�ｨ��',18,'boy','IS',46),
('36','������',16,'boy','MA',26),
('37','����',18,'boy','IS',84),
('38','����ī',19,'boy','CS',80),
('39','����',18,'boy','MA',73),
('40','Ҧ��',19,'boy','IS',66),
('41','�ﺣ��',18,'boy','MA',92),
('42','����',18,'boy','IS',48),
('43','����',18,'gril','ѧǰ����',36),
('44','���',17,'boy','MA',98),
('45','������',18,'boy','CS',52),
('46','������',18,'gril','IS',91),
('47','����',18,'gril','IS',59),
('48','����',15,'boy','MA',87),
('49','��С��',18,'gril','IS',36),
('50','����',22,'boy','IS',86),
('51','����',18,'boy','ѧǰ����',75),
('52','������',18,'gril','IS',44),
('53','����',18,'boy','IS',86),
('54','������',17,'gril','IS',55),
('55','��ѩ��',18,'gril','IS',84),
('60','����',18,'boy','IS',56)
INSERT INTO tb_student1(id,name,age,sex,dept,grade) VALUES('09102040203','����',19,'boy','IS',89)
INSERT INTO tb_student1(id,name,age,sex,dept,grade) VALUES('09108569856','������',19,'boy','IS',null)

--�鿴��ṹ
sp_help tb_student1

--�鿴���м�¼
select * from tb_student1

--1����ѯȫ��ѧ����ѧ��������
select id,name from tb_student1
--2����ѯȫ��ѧ����������ѧ�š�רҵ
select name,id,dept from tb_student1
--3����ȫ��ѧ������������������
select name,year(GETDATE())-age as ������� from tb_student1
--4����ѯ���������ѧ��רҵȫ��ѧ��������
select ����=name from tb_student1 where dept='CS'
--5����ѯ����������20�����µ�ѧ��������������
select name,age from tb_student1 where age < 20
--6����ѯδ�����ѧ����������ƽ���ɼ� 
select COUNT(age) as ����,AVG(grade) as ƽ���ɼ�  from tb_student1 where age<18
--7����ѯ�ɼ��в������ѧ����ѧ��
select id from tb_student1 where grade<60
--8����ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ������
select name,dept,age from tb_student1 where age BETWEEN 18 AND 22
--9����ѯ���䲻��20~23��֮���ѧ��������רҵ������
select name,dept,age from tb_student1 where age NOT BETWEEN 20 AND 23
--10����ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
select name,sex from tb_student1 where dept IN('IS','MA','CS')
--11����ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select name,sex from tb_student1 where dept NOT IN ('IS','MA','CS')
--12����ѯѧ��Ϊ09102040203��ѧ������ϸ���
select * from tb_student1 where id = '09102040203'
--13����ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
select name,id,sex from tb_student1 where name  like '��%'
--14����ѯ�ա����ȫ��Ϊ�������ֵ�ѧ��������
select name from tb_student1 where name  like '��__'
--15����ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ��
select name,id from tb_student1 where name like '_��%'
--16����ѯ���в��ա��¡���ѧ������
select name from tb_student1 where name not like '��%'
--17����ѯȱ�ٳɼ���ѧ����ѧ�ź�����
select id,name from tb_student1 where grade is null
--18����ѯÿ��רҵ��ѧ����ƽ���ɼ�
select  AVG(grade) as ƽ���ɼ�  from tb_student1 group by dept 
--19���������гɼ���ѧ����ѧ�ź�����
select id,name from tb_student1 where dept is not null
--20����ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併������
select * from tb_student1 order by dept asc,age desc
--21����ѯѧ��������
select count(id)as ������ from tb_student1
--22����ѯ������Ů��������
select count(*) from tb_student1 group by sex
--23����ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������� 
select dept ,avg(grade)as grade from tb_student1 group by dept order by grade desc
--24����ѯÿ��רҵ�гɼ���õ�ѧ���ɼ�
select max(grade) from tb_student1 group by dept 
--25����ѯÿ��רҵ�гɼ�����ѧ���ɼ�
select min(grade) from tb_student1 group by dept
--26����ѯƽ���ɼ�����רҵ������ (����)
select  avg(grade) from tb_student1  group BY dept
--27����ѯ������Ů����ƽ���ɼ�
select avg(grade) from tb_student1 group by sex
--28����ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ� (����)
--29����ѯרҵѧ����������50�˵�רҵ�� (����)
select COUNT(id) from tb_student1 where COUNT(dept) > 50
--30����ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ�� (����)
