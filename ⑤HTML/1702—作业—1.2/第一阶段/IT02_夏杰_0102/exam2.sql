CREATE database db_Recharge
USE db_Recharge
CREATE table tb_user(
uid tinyint primary key,
uname nvarchar(32) not null,
ucard nvarchar(18) unique check(len(ucard)=18) not null)

INSERT INTO tb_user(uid,uname,ucard)VALUES
(1,'С��','123456789123456781'),
(2,'���','123456789123456782'),
(3,'С��','123456789123456783'),
(4,'С��','123456789123456784')


CREATE table tb_number(
nid tinyint primary key,
nphone nvarchar(11) check(len(nphone)=11) unique  not null,
nstate tinyint check(nstate=0 or nstate=1 or nstate=2),
)
INSERT INTO tb_number(nid,nphone,nstate)VALUES
(1,'12345678911',0),
(2,'12345678912',1),
(3,'12345678913',2),
(4,'12345678914',1)



SELECT * FROM tb_number

CREATE table tb_bought(
uid tinyint ,
nid tinyint,
foreign key(uid) references tb_user(uid),
foreign key(nid) references tb_number(nid),
beginline date ,
endline date ,
addline date,
balance decimal(16,2) default 0                                                                                         
)
INSERT INTO tb_bought(uid,nid,beginline,endline,addline,balance) VALUES
(1,1,'2015-08-26','2020-08-26','2016-05-20',25.2),
(2,2,'2013-04-26','2029-08-26','2017-05-07',30.2),
(3,3,'2014-07-20','2020-08-20','2016-05-12',50),
(4,4,'2015-03-04','2020-03-04','2016-09-20',66)

--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�
--����	�������ݣ�ÿ�ű�������������(10��)
--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_bought SET balance=100 WHERE uid=1 AND  nid=1
--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE FROM tb_bought WHERE nid IN(
SELECT nid from tb_number WHERE nstate=2 )
--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * FROM tb_user WHERE uid IN (
SELECT uid from tb_bought)

--����	��ѯ������δע����ֻ���(10��)
SELECT nphone from tb_number WHERE nid NOT in (
SELECT nid from tb_bought)
 --�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
 SELECT * FROM tb_user WHERE uid in(
 SELECT uid  from tb_bought WHERE balance<10 )

