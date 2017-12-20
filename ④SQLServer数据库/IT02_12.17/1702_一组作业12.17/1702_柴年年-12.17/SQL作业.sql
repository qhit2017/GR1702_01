--id,姓名,薪水,入职时间,部门,备注,是否推荐
create table tb_homework(
id tinyint primary key,
name nvarchar (32) not null,
salary money default 3000,
dateline date,
department nvarchar,
remarks ntext,
recommend bit,
)
