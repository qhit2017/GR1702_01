-----�ؼ��ֻ��Զ���ɫ
--�������ݿ�����
--create databasedb_�Լ����������ݿ�����Ҫ����֪��
--�������ĶԺŷ���
--���ִ�й۲��������Ϣ�Ƿ�ɹ�
-- ˢ�����ݿ�鿴
--create database db_worker
--ͨ��drop database db_workerɾ�����ݿ⣨����ʹ�ã�
--����ͨ�����ӻ����ڴ�����ɾ�������ݿ�
--��Ҫ������Լ����������ݿ�
--ͨ��use��������л���Ҫ���������ݿ�
--use db_��Ҫ���������ݿ�
--ͨ��sp_helpdb db_worker��ѯ
--use db_student
--�ֶ�  �ֶ���  �ֶ����� Լ������
--id int primary key,
--name nvarchar(32) not null,
--age int default 18)
--�������ͣ���������ʵ�������������
--bit 0 1 true false on off
--tinyint 0~255  8λ
--smallint 16λ  -32768~32767
--int 32λ
--use db_employee
--ID pk ���� нˮ ��ְʱ�� ���� ��ע �Ƿ��ڲ��Ƽ�
create table tb_employee(
id tinyint primary key,
name nvarchar(32) not null,
salary money default 3000,
dateline date,
recommend bit,
department nvarchar(16),
remarks ntext,
age tinyint default 25 
)
