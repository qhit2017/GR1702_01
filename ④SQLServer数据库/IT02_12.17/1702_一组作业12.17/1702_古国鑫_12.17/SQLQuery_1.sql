create table tb_employees(
id tinyint primary key,
name nvarchar(32) not null,
salary money default 3500,
register date,
recommend bit,
department nvarchar(16),
remark ntext
 )