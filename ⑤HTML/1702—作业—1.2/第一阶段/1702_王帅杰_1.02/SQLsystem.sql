 CREATE  database db_system
--�û���
CREATE table tb_users(
id int  primary key,
name  nvarchar(32) not null,
number nvarchar(18)unique)

--�����û�����
INSERT INTO tb_users VALUES
('1','�ﾴ�','411024199708146231'),
('2','������','411024194507146431'),
('3','��һ��','411024194405146241'),
('4','�����','411024198502176241')
SELECT*from tb_users
--�����
CREATE table tb_directory(
did int  primary key,
dphone nvarchar(11)unique, 
dstate int check(dstate=0 or dstate=1 or dstate=2))

--�����������
INSERT INTO tb_directory VALUES 
('106','13555655666','1'),
('101','18203709505','1'),
('102','17637420573','1'),
('103','13565656666','1'),
('104','13665659966','0'),
('105','13555658666','2')
SELECT*FROM tb_directory


--�ѹ������
CREATE table tb_buy(
did int,
id int,
foreign key(did) references tb_directory(did),
foreign key(id) references tb_users(id),
regdate date,
logout date,
topup date,
balance decimal(8,4) default 0)--���
-- �����ѹ�������Ϣ
INSERT INTO tb_buy values
('106','01','2015-10-24','2025-10-24','2018-1-02',9.55),
('101','01','2015-10-24','2025-10-24','2018-1-02',29.55),
('102','01','2016-11-02','2025-10-24','2018-1-02',30),
('103','03','2017-8-24','2025-10-24','2018-1-02',50),
('105','02','2014-10-24','2018-1-1','2017-12-31',0)
SELECT*FROM tb_buy
--����Ҫ������������⣺
--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�
--����	�������ݣ�ÿ�ű�������������(10��)
--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
 UPDATE tb_buy SET balance= balance+100 
where did = '101'AND id= '01'
--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE tb_buy  FROM tb_directory,tb_buy 
where tb_buy.did = tb_directory.did 
AND dstate = '2' 
--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * FROM tb_users where id in(
	SELECT id from tb_buy ,tb_directory
	where tb_buy.did = tb_directory.did 
	AND dstate = 1)
--����	��ѯ������δע����ֻ���(10��)
SELECT dphone from tb_directory where dstate = 0 
--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
SELECT tb_users.id,name,number,dphone as �ֻ���  
from tb_directory, tb_buy, tb_users  where dstate = 1 
AND balance <10 
AND tb_buy.did = tb_directory.did 
AND tb_buy.id = tb_users.id 

