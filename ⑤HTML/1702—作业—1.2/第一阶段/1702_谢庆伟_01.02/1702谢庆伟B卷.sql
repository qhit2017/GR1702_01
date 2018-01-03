--�������ݿ�
CREATE database db_sqltest
GO 
--�л����ݿ�
USE db_practice 
GO 
-- һ����дSQL���ʵ�ִ�����ṹ
  --�����û���idΪ����
CREATE table tb_user(
id int primary key,
name nvarchar(16) not null,
nameid nvarchar(18) check(len(nameid)=18) unique)
GO  
  --���������numid Ϊ����
CREATE table tb_number(
numid int primary key,
phonenum nvarchar(11) check(len(phonenum)=11) unique,
status smallint check(status in (0,1,2)))
GO 
  --�����ѹ��������ӱ�ʶ��������
  --numid���ú����numid,id�����û���id
CREATE table tb_yetnum(
number int identity(1,1) primary key,
numid int foreign key references tb_number(numid),
id int foreign key references tb_user(id),
startdate date,
backdate date,
intoend date,
surplus decimal(6,2) default 0)
GO 
--����	��дSQL����������
INSERT INTO tb_user VALUES
(1,'����','412723200012110651'),
(2,'����','412723199912120654'),
(3,'����','412723199805150655'),
(4,'����','412723199706266026'),
(5,'����','412723199607275730'),
(6,'����','412723199802186455'),
(7,'�¾�','412723200009196555'),
(8,'����','412723200012106530'),
(9,'����','412723199912106530'),
(10,'����','412723199812106530'),
(11,'����','412723199712106530'),
(12,'�ŷ�','412723199612106530'),
(13,'�����','412723200012126530')
go 
INSERT INTO tb_number VALUES
(1,'13673989941',0),
(2,'13673989241',1),	
(3,'15238718872',2),	
(4,'15936937759',2),	
(5,'15212356464',1),	
(6,'13662595965',2),
(7,'13673941899',0),
(8,'13673941892',1),
(9,'15238772188',2),
(10,'15936959377',2),
(11,'15212364564',1),
(12,'13662565959',2),
(13,'15965432589',0)
GO 
INSERT INTO tb_yetnum VALUES 
(1,1,NULL,NULL,NULL,0),	
(2,2,'1904-02-19',NULL,'1999-01-29',1.76),		
(3,3,'2001-02-02','2009-06-15','2009-05-02',-5.17),	
(4,4,'2003-01-29','2010-10-30','2010-10-01',-30.56),		
(5,5,'2005-06-24',null,'2017-12-02',66.72),
(6,6,'1904-01-29','1906-01-29','1905-01-29',-0.56),
(7,7,null,null,null,0),
(8,8,'2003-01-29',null,'2017-11-29',8.56),
(9,9,'2005-01-29','2008-02-27','2008-01-02',-20.65),
(10,10,'2007-01-01','2015-03-29','2014-12-02',-10.96),
(11,11,'2009-01-02',NULL,'2017-12-31',56.87),
(12,12,'2013-05-06','2017-09-05','2017-07-15',-6.87),
(13,13,null,NULL,null,0)
--SELECT * FROM tb_yetnum 
GO 
--�����޸ĺ�����Ϊ1���û����Ϊ1���������100
UPDATE tb_yetnum SET surplus=surplus+100 WHERE numid =1 AND id =1
GO 
PRINT '�޸ĳɹ�,���+100'

--�ġ����ѹ��������ɾ������״̬Ϊ��ע��������
DELETE tb_yetnum WHERE numid IN 
(SELECT numid from tb_number where status =2)
GO 
PRINT 'ɾ���ɹ�'

--�塢д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���
SELECT * FROM tb_user where id IN 
(SELECT id from tb_yetnum where numid IN 
(SELECT numid from tb_number where status =1))

--������ѯ������δע����ֻ���
SELECT phonenum δע���ֻ��� from tb_number where status =0

--�ߡ���ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ
SELECT num.phonenum �ֻ�����,us.id �û����,us.name �û�����,us.nameid ���֤�� 
FROM tb_user us inner JOIN tb_yetnum yet on us.id =yet.id 
INNER JOIN tb_number num ON num.numid =yet.numid
WHERE num.status =1 AND yet.surplus <10 

--���ߡ�
SELECT a.phonenum �ֻ�����,us.id �û����,us.name �û�����,us.nameid ���֤�� 
FROM tb_user us,
(SELECT yet.id,num.phonenum from tb_yetnum yet RIGHT JOIN tb_number num on yet.numid =num.numid 
WHERE num.status =1 AND yet.surplus <10) a 
WHERE a.id =us.id 

--���ߡ�
SELECT num.phonenum �ֻ�����,us.id �û����,us.name �û�����,us.nameid ���֤�� 
FROM tb_user us,tb_number num,tb_yetnum yet
WHERE us.id =yet.id AND yet.numid =num.numid
and num.status =1 AND yet.surplus <10