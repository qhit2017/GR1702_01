CREATE database db_phones
use db_phones

--�û���
--�û����	����	����
--����	�ַ���	
--���֤��	�ַ���	Ψһ������Ϊ18

CREATE table tb_user(
sid int primary key,
sname nvarchar(16) not null,
ID nvarchar(18) unique
)
--��������
INSERT INTO tb_user(sid,sname,ID)
VALUES(001,'����','686852113146688'),
(002,'���','125468795123215'),
(003,'��','755646515643515'),
(004,'����','412781514534616'),
(005,'С��','561654561657415'),
(006,'�Ͽ�','451564641455468'),
(007,'С��','765165746515641')
INSERT INTO tb_user(sid,sname,ID)
VALUES(008,'�̹�','456165765146555')
SELECT * from tb_user
--�����
--������	����	����
--�ֻ�����	�ַ���	Ψһ������Ϊ11
--����״̬	����	0(δע��)1(��ע��)2(��ע��)
create table tb_number(
cid int primary key,
cnumber nvarchar(11) unique,
status int  check(status = 0 or status = 1 or status =2)
)
INSERT INTO tb_number(cid,cnumber,status)
VALUES(1,'13145216688',1),
(2,'15153485135',0),
(3,'12154531654',2),
(4,'15895415687',1),
(5,'12137652186',0),
(6,'15156461657',1),
(7,'13651567545',2)
INSERT INTO tb_number(cid,cnumber,status)
VALUES(8,'54153541655',1)
SELECT * from tb_number

--�ѹ������
--������	����	������ú����
--�û����	����	��������û���
--ע��ʱ��	������	
--ע��ʱ��	������	
--����ֵʱ��	������	
--���	������	Ĭ��Ϊ0
CREATE table tb_buy(
a int identity(1,1) primary key,
sid int,
cid int,
foreign key(cid) references tb_number(cid),
foreign key(sid) references tb_user(sid),
register date,
logout date,
topup date,
balance decimal(8,2) default '0'
)
INSERT INTO tb_buy(sid,cid,register,logout,topup,balance)
VALUES(001,1,'2017-01-01',null,'2018-01-01',52.1),
(002,2,null,null,null,null),
(003,3,'2017-05-01','2017-12-27','2017-07-01',23.1),
(004,4,'2017-03-11',null,'2017-07-23',32.5),
(005,5,null,null,null,null),
(006,6,'2017-04-20',null,'2017-12-17',16.5),
(007,7,'2017-02-21','2017-12-29','2017-10-21',32.1)
INSERT INTO tb_buy(sid,cid,register,logout,topup,balance)
VALUES(008,8,'2017-07-21',null,'2017-12-29',9.5)

SELECT * from tb_buy 
--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�

--������ʾ


--����	�������ݣ�ÿ�ű�������������(10��)

--������ʾ


--����	�޸ĺ�����Ϊ1���û����Ϊ001���������100��10�֣�
UPDATE tb_buy SET balance=(balance+100)
WHERE sid=001 AND cid=1

--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE tb_buy 
WHERE logout IS not null
--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * FROM  tb_user
where sid IN(  
SELECT bu.sid
from tb_buy bu
where bu.register IS NOT null)


--����	��ѯ������δע����ֻ���(10��)
SELECT nu.cnumber as �ֻ�����      
from tb_number  nu
WHERE nu.status=0

--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
SELECT us.sid as �û���� ,us.sname as ����,us.ID as ���֤��, nu.cnumber as �ֻ�����
from tb_number nu,tb_user us,tb_buy bu   
where bu.register IS NOT NULL
AND bu.balance<10
and us.sid = bu.sid
and bu.cid = nu.cid 