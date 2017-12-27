create database db_zhaowuyang
CREATE table tb_student(
sno char(11)primary key,
sname char(20)not null,
ssex char(8)check(ssex='man'or ssex='women')default 'man',
sage smallint,
sdept char(20))
CREATE table tb_course(
cno char(4)primary key,
cname char(20),
cpno char(4),
credit smallint)
CREATE table tb_sc(
sno char(11)primary key,
cno char(4),
grade smallint)
--�鿴��ǰ���ݿ������ļ��ű�
SELECT name from sys.objects where type='U'
--�鿴ѧ����ṹ
sp_help tb_student
--�鿴ѧ������ϸ��Ϣ
SELECT * from tb_student
--�鿴�γ̱�ṹ
sp_help tb_course
--�鿴�γ̱���ϸ��Ϣ
SELECT * from tb_course
--�鿴ѡ�α�ṹ
sp_help tb_sc
--�鿴ѡ�α���ϸ��Ϣ
select *from tb_sc
INSERT INTO tb_student VALUES('1','lucy','women',14,'CS'),
('2','��ĳ','man',17,'IS'),('3','��Сٻ','women',20,'IS'),
('4','�¿�','man',23,'IS'),('5','��ľ��','women',22,'MA'),
('6','��Ҷ','women',30,'CS'),('7','����','man',14,'IS'),
('8','����','women',18,'IS'),('9','Jack','man',16,'MA'),
('10','lucy','women',18,'CS')
INSERT INTO tb_course VALUES('1','CS','2',4),
('2','IS','5',5),('3','IS','6',2),('4','MA','1',6),
('5','MA','4',1),('6','MA','3',3)
INSERT INTO tb_sc VALUES('200215121','1',98),
('200215122','2',24),('200215123','3',36),
('200215124','4',52),('200215125','5',63),
('200215126','6',74),('200215127','6',91),
('200215128','5',83),('200215129','4',12),
('200215131','1',60)
--1����ѯȫ��ѧ����ѧ����������
SELECT sno as ѧ��,sname as ���� from tb_student
--2����ѯȫ��ѧ����������ѧ�š�����ϵ��
select sno ѧ��,sname ����,sdept ����ϵ FROM tb_student
--3����ѯȫ��ѧ������ϸ��¼��
select * FROM tb_student
--4����ȫ��ѧ�����������������ݡ�
select Sname ����,YEAR(GETDATE())-sage ������� FROM tb_student
--6����ѯѡ���˿γ̵�ѧ��ѧ�ţ�����ѡ�޼�¼����
select sno ѧ�� from tb_sc
--7����ѯ�������ѧϵȫ��ѧ����������
select sname �������ѧϵ from tb_student where Sdept='CS'
--8����ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname ����,sage ���� FROM tb_student where sage < 20
--9����ѯ���Գɼ��в������ѧ����ѧ�š�
SELECT sno ������ѧ��ѧ�� FROM tb_sc where grade<60
--10����ѯ������18~22�꣨����18���22�֮꣩���ѧ����������ϵ�������
SELECT sname ����,sdept ϵ��,sage ���� FROM tb_student where sage BETWEEN 18 AND 22
--11����ѯ���䲻��20~23��֮���ѧ��������ϵ�������
select sname ����,sdept ϵ��,sage ���� FROM tb_student where not sage BETWEEN 18 AND 23
--12����ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT sname ����,ssex �Ա� FROM tb_student where sdept in ('IS','MA','CS')
--13����ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT sname ����,ssex �Ա� FROM tb_student where sdept not in ('IS','MA','CS')
--14����ѯѧ��Ϊ1��ѧ������ϸ�����
SELECT * FROM tb_student where sno='1'
--15����ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT sname ����,sno ѧ��,ssex �Ա� FROM tb_student where sname LIKE '��%'
--16����ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT sname ���� FROM tb_student where sname LIKE '��%' and len(sname) = '3'
--17����ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname ����,sno ѧ�� FROM tb_student where sname like '_��_'
--18����ѯ���в��ա��¡���ѧ��������
SELECT sname ���� FROM tb_student where sname not LIKE '��%'
--19����ѯDB_Design�γ̵Ŀγ̺ź�ѧ�֡�
SELECT cno �γ̺�,credit ѧ�� FROM tb_course
--21��ĳЩѧ��ѡ�޿γ̺�û�вμӿ��ԣ�������ѡ�μ�¼��
--��û�п��Գɼ�����ѯȱ�ٳɼ���ѧ����ѧ�ź���Ӧ�Ŀγ̺š�

--22���������гɼ���ѧ��ѧ�źͿγ̺š�

--23����ѯѡ����3�ſγ̵�ѧ����ѧ�ż���ɼ�����ѯ����������������С�

--24����ѯȫ��ѧ���������ѯ���������ϵ���������У�ͬһϵ�е�ѧ�������併�����С�

--25����ѯѧ����������

--26����ѯѡ������ѧ�γ̵�ѧ��������

--27������1�ſγ̵�ѧ��ƽ���ɼ���

--28����ѯѡ��1�ſγ̵�ѧ����߷�����

--29����ѯѧ��Ϊ200215121��ѧ��ѡ�޿γ̵���ѧ������

--30��������γ̺ż���Ӧ��ѡ��������

--31����ѯѡ����3�����Ͽγ̵�ѧ��ѧ�š�