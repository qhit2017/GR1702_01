create table tb_student(
sno nvarchar(16) primary key,
sname nvarchar(32) not null,
ssex nvarchar(8) check(ssex='boy' or ssex='girl') default 'boy',
sage smallint ,
adept nvarchar(16),
grate smallint
)
insert into tb_student values(
'1','jack','boy',15,'IS',73),
('2','jack1','boy',16,'IS',73),
('3','Marry','girl',16,'MA',73),
('4','Marry1','girl',17,'MA',73),
('5','Mick','boy',16,'CS',50),
('6','Mick1','boy',16,'CS',73),
('09102040203','������','boy',16,'IS',73),
('09102040204','�','girl',16,'MA',45),
('09102040205','����','girl',17,'MA',73),
('09102040206','������','boy',16,'CS',69),
('09102040207','������','boy',16,'CS',73)
select * from tb_student
--1.��ѯȫ��ѧ����ѧ����������
select sno,sname from tb_student
--2.��ѯȫ��ѧ����������ѧ�š�רҵ��
select sname,sno,adept from tb_student
--3.��ȫ��ѧ�����������������ݡ�
select sname, year(getdate())-sage as ������� from tb_student
--4.��ѯ���������ѧ��רҵȫ��ѧ����������
select '����'=sname from tb_student where adept='cs'
--5.��ѯ����������20�����µ�ѧ�������������䡣
select sname,sage from tb_student where sage<20
--6.��ѯδ�����ѧ����������ƽ���ɼ���
select count(sage)asδ��������,avg(grate) asƽ���ɼ�
from tb_student where sage<18
--7.��ѯ�ɼ��в������ѧ����ѧ�š�
select sno as�������ѧ����ѧ�� from tb_student where grate<60
--8.��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
insert into tb_student(sno,sname ,adept,sage) values(
7,'jom','IS',19)
select sname,adept,sage from tb_student where sage between 18 and 22
--9.��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
insert into tb_student(sno,sname ,adept,sage) values(
8,'jom','IS',25)
select sname,adept,sage from tb_student where sage not between 20 and 23
--10.��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
insert into tb_student(sno,sname ,adept,sage) values(
10,'jem','IT',25)
select sname , ssex from tb_student where adept in('IS','MA','CS')
--11.��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select sname , ssex from tb_student where adept not in('IS','MA','CS')
--12.��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
select *  from tb_student where sno=09102040203
--13.��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
select sname , sno ,ssex from tb_student where sname like'��%'
--14.��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
select sname , sno ,ssex from tb_student where sname like'��%' and len(sname)=3
--15.��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
select sname , sno ,ssex from tb_student where sname like'_��'
--16.��ѯ���в��ա��¡���ѧ��������
select sname , sno ,ssex from tb_student where sname not like'��%'
--17.��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
select sname , sno from tb_student where grate is null
--18.��ѯÿ��רҵ��ѧ����ƽ���ɼ���
select adept,AVG(grate) from tb_student group by adept 
--19.�������гɼ���ѧ����ѧ�ź�������
select sname , sno from tb_student where grate is not null







