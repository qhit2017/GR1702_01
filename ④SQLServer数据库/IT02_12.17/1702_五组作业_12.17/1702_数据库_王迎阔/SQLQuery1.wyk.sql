-----关键字会自动变色
--创建数据库命令
--create databasedb_自己创建的数据库名称要见名知意
--点击上面的对号分析
--点击执行观察下面的消息是否成功
-- 刷新数据库查看
--create database db_worker
--通过drop database db_worker删除数据库（慎重使用）
--可以通过可视化窗口创建（删除）数据库
--你要清楚你自己操作的数据库
--通过use命令可以切换你要操作的数据库
--use db_你要操作的数据库
--通过sp_helpdb db_worker查询
--use db_student
--字段  字段名  字段类型 约束条件
--id int primary key,
--name nvarchar(32) not null,
--age int default 18)
--数据类型：来描述现实世界就是这样的
--bit 0 1 true false on off
--tinyint 0~255  8位
--smallint 16位  -32768~32767
--int 32位
--use db_employee
--ID pk 姓名 薪水 入职时间 部门 备注 是否内部推荐
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
