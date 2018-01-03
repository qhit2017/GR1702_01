CREATE table tb_user(
no  int primary key,
name nvarchar(16) not null,
id  nvarchar(18)unique  
)
--�û���
INSERT INTO tb_user VALUES
(4,'����˳','412722199504294512'), 
(1,'������','410241998050445623'),
(2,'������','410241997050445623'),
(3,'ʢ����','412722199704294912')
 SELECT *FROM tb_user
  
CREATE table tb_number(
nno int primary key,
pno  nvarchar(11)unique,
state int check(state='0'or state='1'or state='2')
)
--�����
INSERT INTO tb_number values
(4,'15658457908','1'),
(1,'15513457908','1'),
(2,'18413457908','0'),
(3,'15657457908','2')

SELECT* FROM  tb_number 
CREATE table tb_bought(
no  int,
nno int,
etime datetime,
foreign key(no) references tb_user(no),
foreign key(nno) references tb_number(nno),
ntime datetime,
endtime datetime,
balance decimal(5,2) default'0' 
)
--�ѹ������
INSERT INTO tb_bought(no, nno,etime,endtime,balance) VALUES
(4,4,'20170102','20171230','5')
INSERT INTO tb_bought(no,nno) VALUES 
(2,2)
INSERT INTO tb_bought(no,nno,etime,ntime,endtime,balance) VALUES 
(3,3,'20170402','20180102 ','20171230','0')
SELECT *FROM tb_bought 
-- һ��	���ݱ�ṹ������Ӧ�ı�30�֣�
--����	�������ݣ�ÿ�ű�������������(10��)
--����	�޸ĺ�����Ϊ1���û����Ϊ1���������100��10�֣�
UPDATE tb_bought SET balance +='100' WHERE no =1 AND nno =1 
--�ġ�	���ѹ��������ɾ������״̬Ϊ��ע�������ݣ�10�֣�
DELETE FROM  tb_bought WHERE nno IN (
SELECT nno from tb_number where state ='2' )  
--�塢	д����ѯ��ע���ֻ��ŵ��û���Ϣ�Ĳ�ѯ���(10��)
SELECT * FROM tb_user where no IN(
SELECT no from tb_bought where nno IN(
SELECT nno from tb_number where state ='1'
)  
)
--����	��ѯ������δע����ֻ���(10��)
SELECT pno  from tb_number where state ='0'
--�ߡ�	��ѯ��������ע�Ტ�����С��10���ֻ������Լ��û���Ϣ
SELECT u.no,u.name,u.id,n.pno from tb_bought b, tb_number n, tb_user u
WHERE b.balance <10  
AND n.state ='1'
AND b.no = u.no 
AND b.nno = n.nno  
