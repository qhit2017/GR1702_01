create table db_employee(
id int primary key,
name nvarchar(32) not null,
salary money default 5000,
register date,
recommend bit,
department nvarchar,
remark ntext)
