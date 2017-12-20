create table tb_info(
id int primary key,
name nvarchar(32) not null,
age int default(18),
salary money default 300,
dateline date,
recommend bit,
department nvarchar(16),
remarks ntext)