
create table tb_employee(
id tinyint primary key,
name varcher(16),
salary money default 5000,
department nvarchar(16),
dateline date,
recommend bit,
remarks ntext)