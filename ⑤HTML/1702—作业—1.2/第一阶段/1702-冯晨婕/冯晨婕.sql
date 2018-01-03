CREATE DATABASE db_phonenum
USE db_phonenum
-----------------------------------------------
--�û���
--�û����	����	����
--����	�ַ���	
--���֤��	�ַ���	Ψһ������Ϊ18
CREATE table tb_user(
uid  int primary key,
uname nvarchar(32) not null,
unum  nvarchar(18) unique
)
INSERT INTO tb_user VALUES 
(1,'TOM','416945523689845781'),
(1701,'����','410265874569512364'),
(1702,'����','410265523684562464'),
(1703,'tamlls','416945523689845631')
SELECT * FROM tb_user 

--�����
--������	����	����
--�ֻ�����	�ַ���	Ψһ������Ϊ11
--����״̬	����	0(δע��)1(��ע��)2(��ע��)
CREATE table tb_number(
nid int primary key,
nip nvarchar(11) unique ,
nstate  int  check (nstate='0' or nstate='1' or nstate='2')
)
INSERT INTO tb_number VALUES 
(1,'15039963043',0),
(2,'13526138237',1),
(3,'15037254123',2)

--�ѹ������
--������	����	������ú����
--�û����	����	��������û���
--ע��ʱ��	������	
--ע��ʱ��	������	
--����ֵʱ��	������	
--���	������	Ĭ��Ϊ0
CREATE TABLE tb_listnumber(
nid int ,
uid  int,
foreign key (nid) references tb_number,
foreign key (uid) references tb_user,
register date,
cancel date,
lasttop date,
 balance  decimal (8,4) default 0
)

INSERT INTO tb_listnumber VALUES 
(1,1701,'2003-01-02','2007-12-21','2007-12-10',3),
(2,1702,'2005-03-12','2011-10-11','2011-09-10',5),
(3,1703,'2016-04-25','2017-12-01','2017-10-29',10)
SELECT * FROM tb_listnumber


INSERT INTO tb_number VALUES 
(1,'15039963043',0),
(2,'13526138237',1),
(3,'15037254123',2)

--����Ҫ������������⣺
--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�
--����	�������ݣ�ÿ�ű�������������(10��)
--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_listnumber  SET balance=balance+100WHERE  nid  = '1'

SELECT*FROM tb_listnumber
--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE  FROM tb_listnumber 
WHERE  nid = (SELECT nid FROM tb_number  WHERE nstate='2')

--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * from tb_user  WHERE uid IN (
SELECT NU.nid
 from tb_number NU WHERE nu.nstate = '1')
--------
SELECT * FROM tb_user where uid=(
	SELECT n.nid from tb_number n,tb_listnumber l
	WHERE l.nstate='1' 
	AND l.nid= l.nid
) 
--����	��ѯ������δע����ֻ���(10��)
SELECT nu.nip as δע����ֻ��� from tb_number nu WHERE nu.nstate = '0'
--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
SELECT * FROM tb_user where uid=(
 SELECT L.uid from tb_number n, tb_listnumber L
  WHERE  balance<10
  AND L.nid= n.nid)