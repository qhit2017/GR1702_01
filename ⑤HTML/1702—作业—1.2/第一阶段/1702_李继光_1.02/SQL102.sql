CREATE database db_phone
USE db_phone
--�û���
--�û����	����	����
--����	�ַ���	
--���֤��	�ַ���	Ψһ������Ϊ18
CREATE table tb_user(
No int primary key,
name nvarchar(32),
id nvarchar(18) unique)
--�����
--������	����	����
--�ֻ�����	�ַ���	Ψһ������Ϊ11
--����״̬	����	0(δע��)1(��ע��)2(��ע��)
CREATE table tb_number(
numberNo int primary key,
Pnumber nvarchar(11) unique,
status int check(status = 0 or status = 1 or status = 2)
)
--�ѹ������
--������	����	������ú����
--�û����	����	��������û���
--ע��ʱ��	������
--ע��ʱ��	������
--����ֵʱ��	������
--���	������	Ĭ��Ϊ0
CREATE table tb_buy(
numberNo int,
No int,
foreign key(numberNo) references tb_number(numberNo),
foreign key(No) references tb_user(No),
regdate date,
logout date,
topup date,
balance decimal(8,4) default 0)
--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�
--����	�������ݣ�ÿ�ű�������������(10��)
INSERT INTO tb_user values
('01','lifei','411481199710245116'),
('02','lele','411481199811075114'),
('03','xinx','411481199810205115')
-----------------------------
INSERT INTO tb_number VALUES
('106','13555655666','1'),
('101','18203709505','1'),
('102','17637420573','1'),
('103','13565656666','1'),
('104','13665659966','0'),
('105','13555658666','2')
------------------------------
INSERT INTO tb_buy VALUES
('106','01','2015-10-24','2025-10-24','2018-1-02',9.55),
('101','01','2015-10-24','2025-10-24','2018-1-02',29.55),
('102','01','2016-11-02','2025-10-24','2018-1-02',30),
('103','03','2017-8-24','2025-10-24','2018-1-02',50),
('105','02','2014-10-24','2018-1-1','2017-12-31',0)

--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_buy SET balance= balance+100 
where numberNo = '101'AND No= '01' 
--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE tb_buy  FROM tb_number,tb_buy 
where tb_buy.numberNo = tb_number.numberNo 
AND status = '2' 
--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * FROM tb_user where No in(
	SELECT No from tb_buy ,tb_number 
	where tb_buy.numberNo = tb_number.numberNo 
	AND status = 1)
--����	��ѯ������δע����ֻ���(10��)
SELECT Pnumber from tb_number where status = 0
--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ
SELECT tb_user.No,name,id,Pnumber as �ֻ���  
from tb_number, tb_buy, tb_user  where status = 1 
AND balance <10 
AND tb_buy.numberNo = tb_number.numberNo 
AND tb_buy.No = tb_user.No 