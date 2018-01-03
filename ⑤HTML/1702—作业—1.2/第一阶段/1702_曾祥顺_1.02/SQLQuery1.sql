CREATE database db_login
USE db_login
-----
CREATE table tb_user(
uid int primary key,
uname nvarchar(32),
number nvarchar(18)Unique,
)
INSERT INTO tb_user VALUES
(1,'���','411522199810109617'),
(2,'ʢ����','411558199905019672'),
(3,'������','411666199708088888'),
(5,'���ڻ�','411502747474646464'),
(6,'������','411502799951828258')

-----
CREATE table tb_tnumber(
tid int primary key,
pnumber nvarchar(11),
statenumber int check(statenumber=0 or statenumber=1 or statenumber=2 )
)
INSERT INTO tb_tnumber VALUES
(1,'15564874844',2),
(2,'16672828145',0),
(3,'16666666666',1),
(4,'18885546455',2)
-----
CREATE table tb_cnumber(
uid int,
tid int,
foreign key(uid) references tb_user(uid),
foreign key(tid) references tb_tnumber(tid),
cdate datetime,
cadate datetime,
cpay datetime,
cbalance decimal(20,2) default 0
)
INSERT INTO tb_cnumber VALUES
(1,1,'2017-8-6','2020-9-5','2020-4-6','741.2'),
(2,2,'2017-5-6','2020-8-5','2020-7-4','74.2'),
(3,3,'2017-5-6','2020-6-5','2020-4-6','1.5'),
(6,4,'2017-4-6','2020-5-5','2020-3-6','4.2')
--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�
--����	�������ݣ�ÿ�ű�������������(10��)
--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_cnumber SET cbalance=cbalance+100 WHERE uid=1
--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE FROM tb_cnumber WHERE tid in(
	SELECT tn.tid from tb_tnumber tn where statenumber=2
)
--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * FROM tb_user where uid=(
	SELECT cn.uid from tb_tnumber tn,tb_cnumber cn
	WHERE tn.statenumber=1
	AND tn.tid= cn.tid
)
--����	��ѯ������δע����ֻ���(10��)
SELECT tn.pnumber from tb_tnumber tn
WHERE tn.statenumber=0
--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
SELECT * FROM tb_user where uid=(
 SELECT cn.uid from tb_tnumber tn, tb_cnumber cn
  WHERE cn.cbalance<10
  AND tn.tid= cn.tid
)
