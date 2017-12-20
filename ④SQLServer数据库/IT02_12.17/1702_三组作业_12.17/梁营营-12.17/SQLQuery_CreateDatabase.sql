--创建数据库


create table tb_employee(
id tinyint primary key,
name nvarchar(32) not null,
salary money default 4500,
dateline date,
recommend bit,
department nvarchar(16),
remarks ntext,
)