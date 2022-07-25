select a.*,sub_name from enrol a, subject b 
where a.sub_no=b.sub_no order by 1;

select a.*,sub_name from enrol a right outer join subject b
on a.sub_no=b.sub_no
order by 1;

--10, 20���μ� ����� �� �ְ� �޿��� �޴� ����� �����ȣ, ����̸�, �޿����˻��϶�. (������)
select empno,ename,sal,deptno from emp1 
where sal in --�޿���
(select max(sal) --�ְ�޿�
from emp1 
group by deptno --�μ���
having deptno in ('10','20')); --10,20�μ�����

--30�� �μ��ǻ�� �� ���� �޿��� �޴� ����� �����ȣ, ����̸�, �޿����˻��϶�. 
select empno,ename,sal,deptno from emp1 where sal in 
(select min(sal) from emp1 where deptno = 30);

--47. ��ü ������� �ְ� Ŀ�̼��� �޴� ����� �����ȣ, ����̸�, Ŀ�̼����˻��϶�.(������)
select empno,ename,comm from emp1 where comm = 
(select max(comm) from emp1);

--��ü ������� ���� Ŀ�̼��� �޴� ����� �����ȣ, ����̸�, Ŀ�̼����˻��϶�.(������)
select empno,ename,comm from emp1 where comm = 
(select min(comm) from emp1);

--11. FORD ����� ���� �޿��� �޴� ����� �����ȣ���˻��϶�. (������)
select empno,ename from emp1 where sal = 
(select sal from emp1 where ename = 'FORD')
and ename<>'FORD';
--12. �μ��̸��� ��SALES���̸鼭 ��������� ��MANAGER���� ����� �����ȣ, ����̸��� ����̸� ������ �˻��϶�. (natural join)
select empno,ename from emp1 natural join dept1 
where dname='SALES' and job='MANAGER'
order by ename; 
--13. SCOTT ������� ���� �޿��� �޴� ��� �������˻��϶�. (������)
select * from emp1 where sal > 
(select sal from emp1 where ename='SCOTT');
--14. ALLEN ������� ���� �޿��� �޴� ��� �������˻��϶�. (������)
select * from emp1 where sal < 
(select sal from emp1 where ename='ALLEN');
--15. ��ü ����� ��� �޿����� �޿��� ���� ��� ������ �˻��϶�. (������)
select * from emp1 where sal > 
(select avg(sal) from emp1);
--16. CHICAGO ������ ��ġ�ϴ� �μ��� �ٹ��ϴ»�� ������ �˻��϶�. (������)
select * from emp1 natural join dept1 where loc = 
(select loc from dept1 where loc in 'CHICAGO');

select * from emp1 natural join dept1 where loc in 'CHICAGO';

select * from emp1 
where deptno = (select deptno from dept1 where loc = 'CHICAGO')
order by empno;

select e.* 
from emp1 e inner join dept1 d 
on e.deptno = d.deptno 
and d.loc = 'CHICAGO'
order by e.empno; 

--�� �а��� ���Ű
select stu_dept,trunc(avg(stu_height))
from student group by stu_dept;

create table a_student as select * from student 
where stu_dept in ('���','��������');
--������ student ���̺��� ������
select * from a_student;

create table b_student as select * from student 
where stu_dept in ('��������','��ǻ������');
select * from b_student;

select * from a_student union select * from b_student;
-- student ���̺�� ���� ��� : �ߺ����� �Ǹ鼭 ������

select * from a_student union all select * from b_student;
-- �ߺ����� �ȵǸ鼭 ������ (�ܼ� ���̺� ������ �����)

select * from a_student intersect select * from b_student;
-- ������ �ߺ���(�����) �ڷḸ ������

select * from a_student minus select * from b_student;
-- ������ �������� ����� �κ��� ������ ���

--262 q1
select job,empno,ename,sal,deptno,dname 
from emp natural join dept 
where job = (select job from emp where ename='ALLEN');

--q2
select e.empno,e.ename,d.dname,e.hiredate,d.loc,e.sal,s.grade 
from emp e,dept d,salgrade s
where e.deptno = d.deptno 
and (e.sal between s.losal and s.hisal) 
and sal > (select avg(sal) from emp)
order by sal desc,e.empno;

select empno,ename,dname,hiredate,loc,sal,grade 
from emp natural join dept,salgrade 
where (sal between losal and hisal) 
and sal > (select avg(sal) from emp)
order by sal desc,empno;

--q3
select empno,ename,job,deptno,dname,loc 
from emp natural join dept
where deptno=10 and 
job not in (select job from emp where deptno = 30);

--q4 ������ �Լ� ��� max(sal)
select e.empno,e.ename,e.sal,s.grade from emp e,salgrade s
where e.sal between s.losal and s.hisal
and sal > (select max(sal) from emp 
            where job in 'SALESMAN')
order by empno;

select empno,ename,sal,grade from emp,salgrade
where sal between losal and hisal
and sal > (select max(sal) from emp 
            where job in 'SALESMAN')
order by empno;

--������ �Լ� ��� all
select empno,ename,sal,grade from emp,salgrade
where sal between losal and hisal
and sal > all(select sal from emp 
            where job in 'SALESMAN')
order by empno;

--��ǻ�Ͱ��� ������ �����ϴ� �л����� �й�,�̸�,�����̸�
select stu.stu_no,stu.stu_name,sub.sub_name 
from student stu, subject sub, enrol en
where en.sub_no = sub.sub_no
and stu.stu_no = en.stu_no
and sub_name in '��ǻ�Ͱ���';

select a.empno, a.ename, 
b.empno as ����ڹ�ȣ, b.ename as ����ڹ�ȣ 
from emp1 a left outer join emp b on a.mgr=b.empno;
--          �ܺ����ΰ�                   ���������� �����ִ� ����

select a.ename,a.empno,
b.empno as ���ӹ�ȣ,b.ename as �����̸�
from emp1 a right outer join emp1 b on a.empno=b.mgr;

--��ǻ������ �а��� ���� ���� �ٸ� �а��� �л� ����
select * from student where stu_dept not in '��ǻ������'
and stu_class in (select stu_class from student 
where stu_dept in '��ǻ������');

(select avg(stu_height) from student);--����а��� ���Ű 
select * from student where stu_height > 
(select avg(stu_height) from student);--���Ű���� ū �л�
select * from student where stu_height > all
(select avg(stu_height) from student group by stu_dept);
--(���Ű���� ū �л���):������ �� ���� ū �л� all���
select * from student where stu_height > 
(select max(avg(stu_height)) from student group by stu_dept);
--(���Ű���� ū �л��� �� ���� ū �л�):������ max���

--��ǻ�Ͱ��� �ּ�Ű�� ���ؼ� �ּ�Ű�� �� ū �а��� �а���� �ּ�Ű
select stu_dept,min(stu_height) 
from student group by stu_dept 
having min(stu_height) > 
(select min(stu_height) from student
where stu_dept in '��ǻ������');

--101������ ������ �л� ���� �˻�
select * from student where stu_no in 
(select stu_no from enrol where sub_no=101);

create table a_enrol as select * from enrol 
where stu_no < 20150000; 
--enrol���̺��� 2015�й����� ���� ���鸸 ����

select * from a_enrol;

insert into a_enrol(sub_no,stu_no,enr_grade)
values (108,20151062,92);
insert into a_enrol values (108,20151062,92);
--������θ� ������ �̸��� ���� ����
delete from a_enrol where sub_no=108; 
--sub_no �� 108�� ������ ����
insert into a_enrol values(109,20152088,85);

insert into a_enrol(sub_no,stu_no) values (110,20152088);

insert into a_enrol values (111,20153075,null);

insert into a_enrol --���̺� ��������� �ƴ϶� �߰� 
select * from enrol where stu_no like '2015%';

-- �л����̺�κ��� �г��� 1 �Ǵ� 2�г��� ���ǵ鸸 �����Ͽ� student1 ���̺��� �����Ѵ�.
create table student1 as select * 
from student where stu_grade in (1,2);
-- �������̺��� �����Ͽ� subject1 ���̺��� �����Ѵ�.
create table subject1 as select * from subject;
-- �������̺��� �����Ͽ� enrol1 ���̺��� �����Ѵ�.
create table enrol1 as select * from enrol;
-- �� �� �� ����� ���̺��� ������ Ȯ���Ѵ�.
select * from student1;
select * from subject1;
select * from enrol1;

--�й� 20101059, �̸� ������, �а� ��ǻ������, �г� 1, ��B, Ű 164, ������ 70�γ��л��� �߰��Ǿ���.
insert into student1 values (20101059,'������','��ǻ������',1,'b','m',164,70);
--�й� 20102038, �̸� ������, �а� ��������, �г� 1, ��C, ���л��� �߰��Ǿ���.
insert into student1 values (20102038,'������','��������',1,'c','f',null,null);
--Student1 ���̺� �л� ���̺��� 3�г� �л��� �����͸� �Է��϶�.
insert into student1 select * from student where stu_grade in 3;

select * from a_enrol;
update a_enrol set enr_grade = enr_grade+5;
-- enr_grade = enr_grade+5 �� ����
update a_enrol set enr_grade = enr_grade+5
where sub_no in 101;

update a_enrol set enr_grade = enr_grade+5
where sub_no = (select sub_no from subject
            where sub_name in '�ý��ۺм�����');
-- �ý��ۺм����� ������ ������ 5�� ���� (������)

--�й� 20131001���� B�� �ٲپ��.
update student1 set  stu_class = 'b'
where stu_no in 20131001;
--20152088 �л��� Ű�� 2cm�ڶ���.
update student1 set  stu_height = stu_height+2
where stu_no in 20152088;

rollback;
select * from student1;
select * from a_enrol;

delete from a_enrol where stu_no=20131001;

commit; --���� �ݿ�

insert into enrol values (105,20153075,56); 
--����Ҽ��� �����ȣ ����
delete from a_enrol where sub_no = 
(select sub_no from subject1 where sub_name in '����Ҽ���');

drop table a_enrol; --ddl ���Ǿ� rollback�� ���� �ȵ�
delete from a_enrol; --dml ���۾�
select *from a_enrol; --������ ���� ���̺� �״��

select *from student1;
select *from subject1;
select *from enrol1;

rollback;
commit;
--1
delete from student1 where stu_no in '20153088';
--2
insert into subject1 values(112,'�ڵ�ȭ�ý���','������',3,'���');
--3
update subject1 set sub_no = 501 where sub_no in 110;
--4
delete from subject1 where sub_no in 101;
--5
update enrol1 set sub_no = 999 
where sub_no 
not in (select sub_no from subject1);
--6
update enrol1 set stu_no = 99999999
where stu_no not in (select stu_no from student1);
--7
delete from enrol1 where sub_no in 999; 
--8
delete from enrol1 where stu_no in 99999999;

select * from enrol1;

select * from b_student; 
delete from b_student; --dml
rollback;

create table c_student( -- create table : ddl 
stu_no number,  --�ڵ������� delete�� Ŀ���̵� 
stu_name char(10)); -- ���� b_student rollback �Ұ�
rollback;