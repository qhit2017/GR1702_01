CREATE database db_WX
CREATE table tb_student(
sno char(11)primary key,
sname char(20)not null,
ssex char(8)check(ssex='man'or ssex='women')default'man',
sage smallint,
sdept char(20))
CREATE table tb_course(
cno char(4)primary key,
cname char(20)not null,
cpno char(4),
ccredit smallint)
CREATE table tb_sc(
sno char(11)primary key,
cno char(4),
grade smallint)
---�鿴��ǰ���ݿ��µ����б�
SELECT name from sys.objects where type='u'
---�鿴ѧ����ṹ
sp_help tb_student
---�鿴ѧ������ϸ��Ϣ
SELECT*FROM tb_student
---�鿴�γ̱�ṹ
sp_help tb_course
---�鿴�γ̱���ϸ�ṹ
SELECT*FROM tb_course
---�鿴ѡ�α�ṹ
sp_help tb_sc
---�鿴ѡ�α���ϸ�ṹ
SELECT*FROM tb_sc
INSERT INTO tb_student VALUES('1','jackie','man',18,'IS'),
('2','������','women',19,'CS'),
('3','��Ư��','man',23,'MA'),
('4','���','women',21,'CS'),
('5','������','man',16,'IS'),
('6','�����','women',13,'MA'),
('7','��ɰ�','man',20,'IS'),
('8','������','women',17,'CS'),
('9','������','man',22,'IS'),
('200215121','������','women',42,'MA')
INSERT INTO tb_course VALUES('1','lili',5,7),
('2','miacel',0,8),
('3','jerry',1,9),
('4','tom',2,5),
('5','vivi',3,3)
INSERT INTO tb_sc VALUES('200215121','1',24),
('200215122','2',99),
('200215123','3',67),
('200215124','2',43),
('200215125','5',84),
('200215126','4',79),
('200215127','3',75),
('200215128','5',87),
('200215129','4',83),
('200215120','1',95)
---��ѯȫ��ѧ����ѧ��������
SELECT sno ѧ��,sname ���� from tb_student
---��ѯȫ��ѧ������ѧ������ϵ
select sname ����,sno ѧ��,sdept ����ϵ from tb_student
---��ѯȫ��ѧ������ϸ��¼
select*FROM tb_student
---��ѯȫ��ѧ������������������
select sname ����,YEAR(GETDATE())-sage ������� from tb_student
---��ѯѡ���˿γ̵�ѧ��ѧ�ţ�����ѡ�޼�¼��
select sno from tb_sc 
---��ѯ�������ѧϵȫ��ѧ������
select Sname �������ѧϵ from tb_student where sdept='CS'
---��ѯ����������20�����µ�ѧ��������������
SELECT SNAME ����,sage ���� from tb_student where sage<20
---��ѯ���Գɼ��в������ѧ����ѧ��
SELECT sno ѧ�� from tb_sc where grade<60
---��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������ϵ�������
SELECT Sname ����,sdept ϵ��,sage ���� from tb_student where sage between 18 AND 22
---��ѯ���䲻��20~23��֮���ѧ��������ϵ�������
SELECT sname ����,sdept ϵ��,sage ���� from tb_student where sage NOT BETWEEN 20 AND 23
---��ѯ��Ϣϵ��IS����ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT sname ����,ssex �Ա� from tb_student where sdept IN ('IS','CS','MA')
---��ѯѧ��Ϊ1��ѧ������ϸ���
SELECT sno from tb_student where sno= 1
---��ѯ��������ѧ��������ѧ�ź��Ա�
SELECT sname,sno,ssex from tb_student where sname LIKE '��%'
---��ѯ������ȫ��Ϊ�������ֵ�ѧ��������
SELECT sname from tb_student where sname LIKE '��__'
---��ѯ�����е�2����Ϊ���ֵ�ѧ����������ѧ��
SELECT sname,sno from tb_student where sname LIKE '_��%'
---��ѯ���в��ճµ�ѧ������
SELECT sname from tb_student where sname NOT LIKE '��%'



