create  table tb_xxy(
Sno nvarchar(16) primary key,
Sname nvarchar(10) not null,
Ssex nvarchar(8) check(Ssex='boy' or Ssex='gril'),
Sage smallint ,
Sdept nvarchar(16),
Grade smallint)

sp_help tb_xxy

INSERT into tb_xxy values(
'1','jackie','boy',15,'IS',88),
('2','tom','boy',20,'IS',66),
('3','������','boy',22,'IS',90),
('4','mary','gril',22,'CS',92),
('5','lucy','boy',22,'MA',96),
('6','����','boy',16,'MA',78),
('7','����','gril',24,'CS',88)

SELECT * from tb_xxy

INSERT INTO tb_xxy (Sno,Sname,Ssex,Sage,Sdept)
VALUES('9','����','boy',22,'IT')

--1.	��ѯȫ��ѧ����ѧ����������
SELECT Sno,Sname from tb_xxy

--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT Sname,Sno,Sdept from tb_xxy

--3.	��ȫ��ѧ�����������������ݡ�
SELECT SNAME,YEAR(GETDATE())-Sage as ������� from tb_xxy

--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT Sname from tb_xxy WHERE Sdept='CS'

--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname,Sage from tb_xxy WHERE Sage<20

--6.��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(Sage)as δ��������,AVG(Grade)as ƽ���� FROM tb_xxy where Sage<18

--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT Sname,Sno from tb_xxy where Grade<60

--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT SNAME,Sdept,Sage from tb_xxy where Sage BETWEEN 18 AND 22

--9.��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT SNAME,Sdept,Sage from tb_xxy where Sage NOT BETWEEN 20 AND 23

--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT Sname,Ssex from tb_xxy where Sdept IN ('IS','MA','CS')

--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT Sname,Ssex from tb_xxy where Sdept NOT IN ('IS','MA','CS')

--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT*FROM tb_xxy where Sno=09102040203

--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT sname,sno,ssex from tb_xxy WHERE Sname LIKE '��%'

--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT sname from tb_xxy WHERE Sname LIKE '��__'

--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT sname,sno from tb_xxy WHERE Sname LIKE '_��%'

--16.	��ѯ���в��ա��¡���ѧ��������
SELECT sname from tb_xxy WHERE Sname NOT LIKE '��%'

--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT sname,sno from tb_xxy WHERE   Grade IS null

--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT AVG(Grade) as CSרҵƽ���ɼ� FROM tb_xxy where Sdept='CS'
SELECT AVG(Grade) as ITרҵƽ���ɼ� FROM tb_xxy where Sdept='IT'
SELECT AVG(Grade) as ISרҵƽ���ɼ� FROM tb_xxy where Sdept='IS'
SELECT AVG(Grade) as MAרҵƽ���ɼ� FROM tb_xxy where Sdept='MA'

--19.	�������гɼ���ѧ����ѧ�ź�������
