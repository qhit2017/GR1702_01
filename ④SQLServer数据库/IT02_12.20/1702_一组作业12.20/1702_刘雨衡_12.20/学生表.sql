CREATE database db_lyh
CREATE table tb_lyh(
Sno char(20) primary key,
Sname char(16) not null,
Ssex char(2) check(Ssex='��'or Ssex='Ů'),
Sage smallint,
sdep char(32),
Grade smallint)

INSERT INTO tb_lyh 
VALUES('001','ϺЦ��','��',6,'CS',86),
('002','��ս��','��',76,'ma',72),
('003','�״�־','Ů',56,'is',38),
('004','�Ľ��','Ů',36,'is',21),
('005','�߽ܽ�','��',16,'ma',33),
('006','������','��',21,'cs',99)
SELECT*FROM tb_lyh
--��ѯȫ��ѧ����ѧ�ź�����
SELECT SNO,SNAME FROM tb_lyh
--��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT SNAME,SNO,Sdep from tb_lyh
--��ȫ��ѧ������������������
SELECT Sname as ����,YEAR(GETDATE())-Sage as ������� from tb_lyh
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT Sname from tb_lyh WHERE sdep='cs'
--5.	��ѯ����������20�����µ�ѧ��������������
SELECT Sname,sage from tb_lyh WHERE sage<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ�
SELECT Count(Sage)δ����������,AVG (Grade)ƽ���ɼ� FROM tb_lyh
--7.	��ѯ�ɼ��в������ѧ����ѧ��
SELECT Sname,Grade from tb_lyh WHERE Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT Sname,sdep,Sage from tb_lyh WHERE Sage BETWEEN 18 AND 22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sname,Sdep,sage from tb_lyh where Sage NOT  BETWEEN 20 AND 23
