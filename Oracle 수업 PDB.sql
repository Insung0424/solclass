create table student(
stu_no char(9),
stu_name varchar2(12),
stu_dept varchar2(20),
stu_grade number(1),
stu_class char(1),
stu_gender char(1),
stu_height number(5,2),
stu_weight number(5,2),
constraint p_stu_no primary key(stu_no));

create table subject(
sub_no char(3),
sub_name varchar2(30),
sub_prof varchar2(12),
sub_grade number(1),
sub_dept varchar2(20),
constraint p_sub_no primary key(sub_no));

create table enrol(
sub_no char(3),
stu_no char(9),
enr_grade number(3),
constraint p_course primary key(sub_no,stu_no));

--desc student;
--desc subject;
--desc enrol;
select *from student;
--(student���̺����� *������ �˻��ؼ� �����´�)
insert into student values(20153075,'������','���',1,'c','m',177,80);
insert into student values(20153088,'���¿�','���',1,'c','f',162,50);
insert into student values(20143054,'������','���',2,'c','f',154,47);
insert into student values(20152088,'���ο�','��������',1,'c','m',188,90);
insert into student values(20142021,'�ɼ���','��������',2,'a','f',167,45);
insert into student values(20132003,'����ö','��������',3,'b','m',null,63);
insert into student values(20151062,'������','��ǻ������',1,'b','m',166,67);
insert into student values(20141007,'������','��ǻ������',2,'a','m',174,64);
insert into student values(20131001,'������','��ǻ������',3,'c','m',null,72);
insert into student values(20131025,'������','��ǻ������',3,'a','f',172,63);

--select * from student order by stu_height;

insert into subject values('111','�����ͺ��̽�','���翵',2,'��ǻ������');
insert into subject values('110','�ڵ�����','������',2,'��������');
insert into subject values('109','�ڵ�ȭ����','�ڹο�',3,'���');
insert into subject values('101','��ǻ�Ͱ���','������',3,'��ǻ������');
insert into subject values('102','�����۹�','���¿�',1,'���');
insert into subject values('103','�������ڽ���','������',1,'��������');
insert into subject values('104','�ý��ۺм�����','������',3,'��ǻ������');
insert into subject values('105','����Ҽ���','���',1,'���');
insert into subject values('106','����ȸ�ν���','�ֿ���',3,'��������');
insert into subject values('107','CAD����ǽ�','������',2,'���');
insert into subject values('108','����Ʈ�������','�ǹμ�',1,'��ǻ������');

insert into enrol values('101','20131001',80);
insert into enrol values('104','20131001',56);
insert into enrol values('106','20132003',72);
insert into enrol values('103','20152088',45);
insert into enrol values('101','20131025',65);
insert into enrol values('104','20131025',65);
insert into enrol values('108','20151062',81);
insert into enrol values('107','20143054',41);
insert into enrol values('102','20153075',66);
insert into enrol values('105','20153075',56);
insert into enrol values('102','20153088',61);
insert into enrol values('105','20153088',78);

drop table enrol; -- �ش����̺� ���� ���� ���� ����
delete from enrol; -- �ش����̺� ���� ����(�����͸� ����)

desc student; --���̺� ���� ���

select * from student;
-- ���ϴ� ���̺��� �ش����̺��� �������( * )�˻� 
select * from subject;
select * from enrol;

select stu_no,stu_name from student;
-- ���ϴ� ���̺����� �˻��� ,�� ���ϴ� �ʵ�鸸 �˻��ؼ� �� �� �ִ� 

select stu_dept from student; --�а��� �˻�

desc enrol;

select stu_name,stu_no,stu_grade
from student
order by stu_height;

select distinct stu_dept from student; 
--�ش� ���� �ߺ�����(distinct)
select all stu_dept from student; 
--�ߺ����� ���� ���




--6. ������� �����ȣ�� �����̸��� �˻��϶�.
select sub_no,sub_name from subject;
--7. �л����� �й��� �̸�, ������ �˻��϶�.
select stu_no,stu_name,stu_gender from student;
--8. �л����� ��� ������ �˻��϶�.
select * from student;
--9. �л����� �й��� �̸�, �г�, ���� �˻��϶�.
select stu_no,stu_name,stu_grade,stu_class
from student;
--10. ������� �����̸��� �����̸��� �˻��϶�.
select sub_name,sub_prof
from subject;
--11. �����ȣ, �й�, ������ �˻��϶�.
--SELECT * FROM enrol;
SELECT sub_no,stu_no,enr_grade FROM enrol;
--12. �л����� ü�߰� ������ �й�, �̸��� �Բ� �˻��϶�.
select stu_weight,stu_height,stu_name 
from student;
--13. �л����� �а� �ߺ��� �����ϰ� �˻��϶�.
select distinct stu_dept from student;
--14. �л����� ���� �ߺ��� �����ϰ� �˻��϶�.
select distinct stu_gender from student;
--15. �л����� �г� �ߺ��� �����ϰ� �˻��϶�.
select distinct stu_grade from student;

select stu_no as ID, stu_name as name
from student; 
-- ��� ���� ���� �ο��ϱ�(�ҹ��ڷ� ���� �빮�ڷ� ���)

select stu_no,stu_name
from student    --�л����̺���
where stu_grade = 3; --�г��� 3�г��� 

select stu_name ||','|| stu_dept||'�а��Դϴ�' as �а����� from student;
--student���̺��� �а��� �̸��� �̾Ƽ� ��Ī�� �ο�
-- || : or��ȣ�� �ƴ϶� concat�� ���� ��ħ (���Ῥ����)

select stu_name,stu_dept,stu_class,stu_grade 
from student
where stu_dept = '��ǻ������' AND stu_grade = 3;
-- �а��� ��ǻ�� �����̰� �г��� 3�г��� �л��� �̸�,�а�,��,�г�


select *
from student
where stu_weight between 60 and 70;
        --�������� between a and b
        
select *
from student
where stu_no between 20140001 and 20149999;
--20140001 ���� 20149999 �� �й��� �����л��� ����

select *
from student
where stu_name like '_��%';
-- ������ �� ������ ��µ�

select stu_no,stu_name,stu_dept
from student
where stu_name like '��%';
--where stu_name like '��_'; �达�� �����ϴ� �� ���� ��� ��)�� ��
-- �� �й�,�̸�,�а��� ���

select stu_no,stu_name,stu_dept
from student
where stu_name like '_��%';
-- �̸��� ù���ڴ� �ƹ��ų� ����� �� �� ����� �й�,�̸�,�а�

select *
from student
where stu_no like '2014%';
-- �й��� 2014�� �����ϴ� �л��� ��� ����

select * from student;
