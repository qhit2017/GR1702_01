 use db_staff
create table tb_student(
sno char(11) primary key,
sname char(20),
ssex char(2) check(ssex='��'or ssex='Ů')default'��',
sage smallint,
sdept char(20),
grade  smallint  )
select sno,sname,ssex,sage,sdept,grade from tb_student
--
select *FROM tb_student
insert into tb_student(sno,sname,ssex,sage,sdept,grade)
values ('200215121','��һ','��',20,'cs',98),
('200215122','bill','��',18,'cs',78),
('200215123','cici','Ů',16,'ma',87),
('200215124','eall','��',20,'cs',67),
('200215125','�','��',20,'ma',56),
('200215126','jack','Ů',18,'is',98),
('200215127','hello','��',23,'cs',46),
('200215128','������','��',20,'is',45),
('200215129','��С��','Ů',21,'is',76),
('200215130','kill','Ů',19,'cs',87),
('200215131','lily','��',21,'ma',58),
('200215132','max','��',22,'cs',98),
('200215133','null','��',20,'ma',76),
('200215134','ŷҮ','��',20,'is',56),
('200215135','push','��',20,'cs',76),
('200215136','��÷÷','Ů',16,'ma',87),
('200215137','roes','Ů',22,'cs',88),
('200215138','stiven','��',20,'ma',99),
('200215139','tall','Ů',21,'is',66),
('200215140','��С��','��',18,'cs',36),
('200215141','������','Ů',18,'cs',98),
('200215142','wow','��',17,'cs',56),
('200215143','cc','Ů',19,'cs',67),
('200215144','����','��',20,'ma',87),
 ('200215145','֣�ɹ�','��',20,'cs',88) 
--1.	��ѯȫ��ѧ����ѧ��������
SELECT *FROM tb_student
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
 SELECT sname,sno,sdept FROM tb_student
--3.	��ȫ��ѧ�����������������ݡ� 
SELECT sname  ,year(GETdate())-sage as �������  from tb_student
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT ����=sname FROM tb_student WHERE sdept='cs'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT sname,sage FROM tb_student WHERE sage<20
 --6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT count (sage) asδ��������,AVG(grade) asƽ���ɼ� FROM tb_student WHERE sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT ����=grade FROM tb_student WHERE grade<60
 --8.	��ѯ������18~22�꣨����18���22�꣩
-- ֮���ѧ����������רҵ�����䡣
SELECT sname  ,sdept,sage FROM tb_student  WHERE sage between  18 and 22
SELECT sname  ,sdept,sage FROM tb_student WHERE (SAGE>=18)AND(SAGE<=22)
 

--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT sname  ,sdept,sage FROM tb_student  WHERE sage NOT  between  20 and 23
SELECT sname  ,sdept,sage FROM tb_student WHERE (SAGE>=18)AND(SAGE<=22)
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
INSERT INTO tb_student(sno,sname,sdept)VALUES(250,'����˿','DANCE'),(251,'��ñ','DANCE')
SELECT sname  ,sdept,ssex FROM tb_student WHERE  sdept= 'cs' or sdept= 'is'  OR sdept= 'ma'
SELECT sname  ,sdept,ssex FROM tb_student WHERE  sdept IN( 'cs','is','ma')
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��
--Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT sname  ,sdept,ssex FROM tb_student WHERE  sdept NOT IN( 'cs','is','ma')
--12.	��ѯѧ��Ϊ200215145��ѧ������ϸ�����
select *FROM tb_student WHERE sno='200215145'
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT sname  ,sno,ssex FROM tb_student  WHERE sname LIKE'��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT sname   FROM tb_student  WHERE sname LIKE '���'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT sname  ,sno FROM tb_student  WHERE sname LIKE'_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT sname   FROM tb_student  WHERE sname  not LIKE '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT sname   sno  FROM tb_student  WHERE grade=NULL
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ�
SELECT AVG(grade) as csƽ���ɼ� FROM tb_student  WHERE sdept ='cs'
SELECT AVG(grade) as isƽ���ɼ� FROM tb_student  WHERE sdept ='is'
SELECT AVG(grade) as maƽ���ɼ� FROM tb_student  WHERE sdept ='ma'
SELECT AVG(grade) as ����ƽ���ɼ�   FROM tb_student  WHERE sdept IN('ma','is','cs')
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT sname  ,sno FROM tb_student  WHERE grade BETWEEN 1 AND 100



--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
--21.	��ѯѧ����������
--22.	��ѯ������Ů����������
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
--26.	��ѯƽ���ɼ�����רҵ�����֡�
--27.	��ѯ������Ů����ƽ���ɼ���
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
--29.	��ѯרҵѧ����������50�˵�רҵ����
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����

