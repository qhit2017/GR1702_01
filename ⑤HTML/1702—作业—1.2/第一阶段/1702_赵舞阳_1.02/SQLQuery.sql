CREATE database db_phone
USE db_phone
--�û����,����,���֤��
CREATE table tb_user(
id int primary key,
uname nvarchar(32)not null,
number nvarchar(18) unique)
--������,�ֻ�����,����״̬
CREATE table tb_number(
idnum int primary key,
number nvarchar(11) unique,
statenum int check(statenum=0 or statenum=1 or statenum=2))
--������,�û����,ע��ʱ��,ע��ʱ��,����ֵʱ��,���
CREATE table tb_buynunber(
iid int identity(1,1)primary key,
idnum int,
foreign key (idnum) references tb_number(idnum),
id int,
foreign key (id) references tb_user(id),
dateline date,
logout date,
Pay date,
balance float default 0)
--����Ҫ������������⣺
--һ�����ݱ�ṹ������Ӧ�ı�30�֣�
--�����������ݣ�ÿ�ű�������������(10��)
INSERT INTO tb_user
SELECT 1,'����',410125197203025011 union
SELECT 2,'����',410125197211241234 union
SELECT 3,'����',410185199705015016 union
SELECT 4,'����',410125199905135024 union
SELECT 5,'����',410125199202040506
SELECT * FROM tb_user
insert INTO tb_number
SELECT 001,13608677777,0 union
SELECT 002,13838384388,1 union
SELECT 003,12478965563,2 union
SELECT 004,12478555554,1 union
SELECT 005,15003840612,2
SELECT * from tb_number
insert INTO tb_buynunber
SELECT 001,5,'20140507','20180101','20170328',100 union
SELECT 002,4,'20110102','20190312','20160513',5 union
SELECT 003,3,'20140507','20170101','20170511',11 union
SELECT 004,2,'20140507','20160101','20170718',50 union
SELECT 005,1,'20140507','20150101','20170912',1000
SELECT * FROM tb_buynunber
--�����޸ĺ�����Ϊ001���û����Ϊ5���������100��10�֣�
update tb_buynunber SET balance=balance+100 where id=5 AND idnum=1
--�ġ����ѹ��������ɾ������״̬Ϊ��ע��(2)�����ݣ�10�֣�
DELETE 
FROM tb_buynunber where idnum IN(  
SELECT nu.idnum
from tb_number nu
WHERE nu.statenum=2)
--�塢д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT us.id,us.uname,us.number
from tb_user us,tb_number nu,tb_buynunber bu
where nu.statenum=1
AND nu.idnum=bu.idnum
AND bu.id=us.id
--������ѯ������δע����ֻ���(10��)
SELECT number as δע���ֻ��� from tb_number where statenum=0
--�ߡ���ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
SELECT us.id,us.uname,us.number
from tb_user us,tb_number nu,tb_buynunber bu
WHERE nu.statenum=1 AND bu.balance<10
AND nu.idnum= bu.idnum
AND bu.id= us.id