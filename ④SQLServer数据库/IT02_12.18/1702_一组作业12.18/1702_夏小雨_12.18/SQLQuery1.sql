--create database db_student

create table tb_student(
sno char(11)primary key not null,
sname char(20)not null,
ssex char check(ssex='��' or ssex='Ů') not null,
sage smallint not null,
sdept char(20),
)
--��ѯ���ݿ�
sp_help tb_student
select sno,sname,ssex,sage,sdept from tb_student

--��������
insert into tb_student(sno,sname,ssex,sage,sdept)
values('200215121','����','��',20,'cs')