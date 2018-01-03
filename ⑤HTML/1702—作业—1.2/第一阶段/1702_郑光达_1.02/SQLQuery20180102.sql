CREATE database db_Prepaidphonesystem

USE db_Prepaidphonesystem

--�û���
--�û����	����	����
--����	�ַ���	
--���֤��	�ַ���	Ψһ������Ϊ18
create table tb_user(
userid int primary key,
name nvarchar(32),
idc nvarchar(18) unique not null )

--�����
--������	����	����
--�ֻ�����	�ַ���	Ψһ������Ϊ11
--����״̬	����	0(δע��)1(��ע��)2(��ע��)
create table tb_number(
Num int primary key,
tnumber nvarchar(11),
Stn int check(stn = 0 or stn = 1 or stn = 2))

--������	����	������ú����
--�û����	����	��������û���
--ע��ʱ��	������	
--ע��ʱ��	������	
--����ֵʱ��	������	
--cccccc	������	Ĭ��Ϊ0

CREATE table tb_Lopn(
id int identity(1,1)primary key,
userid int ,
foreign key (userid) references tb_user(userid),
Num int,
foreign key (Num) references tb_number(Num),
rdate datetime,
LTime datetime,
Lrtime datetime,
balance float default 0)

--����Ҫ������������⣺
--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�
--����	�������ݣ�ÿ�ű�������������(10��)

INSERT INTO tb_user
SELECT 1,'��Ӣ��' ,'371481199311109835'	UNION
SELECT 2,'᯺���' ,'360725197802188287'	UNION
SELECT 3,'������' ,'140400199403046825'

INSERT INTO tb_number 
SELECT 001,'15225327957',0 UNION
SELECT 002,'15625565958',1 UNION
SELECT 003,'18825432959',2 

INSERT INTO tb_Lopn
SELECT 001,1,'2017-1-16','2018-1-1','2017-10-1',37.5 UNION 
SELECT 002,2,'2016-2-16','2017-6-1','2017-3-1',15.5 UNION 
SELECT 003,3,'2015-3-16','2016-8-1','2016-5-1',18.5 

SELECT * FROM tb_Lopn
--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_Lopn  SET balance = balance+100
WHERE userid =001 
AND Num =1

--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
		
DELETE FROM  tb_number where Stn = 2

--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT *
from tb_Lopn lo
where lo.userid = (
	SELECT nu.Num
	from tb_number nu
	WHERE nu.Stn = 1)
--����	��ѯ������δע����ֻ���(10��)
SELECT nu.tnumber
from tb_number nu
where Stn = 0
--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ��20�֣�
SELECT *
from tb_Lopn lo,tb_number nu
where lo.userid =(
	SELECT nu.Num
	from tb_number nu
	where nu.Stn = 1)
	AND lo.balance <10
	AND lo.Num = nu.Num
	