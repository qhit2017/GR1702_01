--id,����,нˮ,��ְʱ��,����,��ע,�Ƿ��Ƽ�
create table tb_homework(
id tinyint primary key,
name nvarchar (32) not null,
salary money default 3000,
dateline date,
department nvarchar,
remarks ntext,
recommend bit,
)
