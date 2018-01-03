--�û���
--�û����	����	����
--����	�ַ���	
--���֤��	�ַ���	Ψһ������Ϊ18

CREATE table tb_user(
uno int primary key ,
uname nvarchar(16),
cer nvarchar(18)unique not null check (len(cer)=18) ,
)

--�����
--������	����	����
--�ֻ�����	�ַ���	Ψһ������Ϊ11
--����״̬	����	0(δע��)1(��ע��)2(��ע��)

CREATE table tb_number(
nid tinyint primary key,
nphone nvarchar(11) check(len(nphone)=11) unique  not null,
nstate tinyint check(nstate=0 or nstate=1 or nstate=2),
)

--�ѹ������
--������	����	������ú����
--�û����	����	��������û���
--ע��ʱ��	������	
--ע��ʱ��	������	
--����ֵʱ��	������	
--���	������	Ĭ��Ϊ0

CREATE table tb_bought(
uno int ,
nid tinyint,
foreign key(uno) references tb_user(uno),
foreign key(nid) references tb_number(nid),
beginline date ,
endline date ,
addline date,
balance decimal(16,2) default 0                                                                                         
)


INSERT INTO tb_user (uno,uname,cer)
VALUES 
(1,'�����','123456789987456711'),
(2,'�߽�','123456789987654322'),
(3,'�Ľ�','123456789123456733'),
(4,'�ų�','123456789123456744'),
(5,'���ڻ�','123456789123456755')


INSERT INTO tb_number(nid,nphone,nstate)VALUES
(1,'12345678911',0),
(2,'12345678912',1),
(3,'12345678913',2),
(4,'12345678914',1)


INSERT INTO tb_bought(uno,nid,beginline,endline,addline,balance) VALUES
(1,1,'2015-08-26','2020-08-26','2016-05-20',25.2),
(2,2,'2013-04-26','2029-08-26','2017-05-07',30.2),
(3,3,'2014-07-20','2020-08-20','2016-05-12',50),
(4,4,'2015-03-04','2020-03-04','2016-09-20',66)


--һ��	���ݱ�ṹ������Ӧ�ı�30�֣�

--����	�������ݣ�ÿ�ű�������������(10��)

--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_bought SET balance=100 WHERE uno=1 AND  nid=1

--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE FROM tb_bought WHERE nid IN(
SELECT nid from tb_number WHERE nstate=2 )

--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * FROM tb_user WHERE uno IN (
SELECT uno from tb_bought)



