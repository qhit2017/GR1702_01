CREATE database db_system
USE db_system
--�û���
--�û����	����	����
--����	�ַ���	
--���֤��	�ַ���	Ψһ������Ϊ18
CREATE table tb_clientele(
cid int primary key,
cname nvarchar(16) not null,
cnum nvarchar(18) unique)

--����û�������
INSERT INTO tb_clientele
 VALUES ('1','Jack','0010588'),
 ('2','Tom','0011588'),
 ('3','Jenny','0012588'),
 ('4','Lily','0013588'),
 ('5','Jason','0014588'),
 ('6','HanMeimei','0014586'),
 ('7','Lady','0065888')
 --�鿴�û����м�¼
 SELECT * FROM tb_clientele
 
 

--����� 
--������	����	����
--�ֻ�����	�ַ���	Ψһ������Ϊ11
--����״̬	����	0(δע��)1(��ע��)2(��ע��)

create table tb_num(
nid int primary key,
number nvarchar(11) unique,
state int check(state='0' or state='1' or state='2'))


--��Ӻ��������
INSERT INTO tb_num
VALUES ('1','15856894758','0'),
('2','13523634758','1'),
('3','17613284758','0'),
('4','15923465893','1'),
('5','18725817587','0'),
('6','15756894758','2'),
('7','15585964763','0')

--�鿴������м�¼
SELECT * FROM tb_num





--�ѹ������
--������	����	������ú����
--�û����	����	��������û���
--ע��ʱ��	������	
--ע��ʱ��	������	
--����ֵʱ��	������	
--���	������	Ĭ��Ϊ0

CREATE table tb_bought(
nid int ,
cid int ,
foreign key (nid) references tb_num (nid),
foreign key (cid) references tb_clientele (cid),
registertime date,
canceltime date,
turtime date,
balance float default '0'
)

--����ѹ���������
INSERT INTO tb_bought
VALUES ('1','1',null,NULL,NULL,0),
('2','2','2011-09-03',NULL,'2017-12-12',52.6),
('3','3',null,NULL,NULL,0),
('4','4','2008-03-25',NULL,'2017-11-23',9.2),
('5','5',null,NULL,NULL,0),
('6','6','2005-08-26','2017-01-03','2014-08-03',-135.9),
('7','7',null,NULL,NULL,0)
 
 --�鿴�ѹ������м�¼
 SELECT * FROM tb_bought
 


--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�  (����)
--����	�������ݣ�ÿ�ű�������������(10��)  (����)
--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_bought SET balance=balance+'100' WHERE cid='1' AND nid = '1'
--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE  tb_bought WHERE nid IN(
SELECT nid from tb_num where state='2')
--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT  *  from tb_clientele where cid IN(
SELECT cid from tb_bought where nid in(
SELECT nid from tb_num where state='1'))
--����	��ѯ������δע����ֻ���(10��)
SELECT number FROM tb_num where state='0'
--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
SELECT cl.cid,cl.cname,cl.cnum,nu.number
from tb_clientele cl,tb_num nu,tb_bought bo
WHERE bo.nid=nu.nid AND bo.cid=cl.cid
and nu.state='2' AND bo.balance<'10'
