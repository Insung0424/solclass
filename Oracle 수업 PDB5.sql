desc student;

create table t_student as
select * from student where stu_dept in '���';

select * from t_student;

create table EMP_HW(
empno number(4),
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2));

alter table EMP_HW add BIGO varchar2(20);

desc EMP_HW;

alter table EMP_HW modify BIGO varchar2(30);

alter table EMP_HW rename column BIGO to REMARK;

insert into EMP_HW select empno,ename,job,mgr,hiredate,sal,comm,deptno,null
from emp;

select * from emp_hw;

drop table emp_hw;

alter table t_student add army char(1);
desc t_student;
alter table t_student modify army number; --����������
alter table t_student drop (army); --������
rename t_student to test_student;
desc test_student;
TRUNCATE table test_student; -- �����͸� ����,�ѹ�,Ŀ�� �� �ȵ�
rollback;
select * from test_student;
drop table test_student; --���̺���ü ����

create table t_student(
stu_no char(9),
stu_name varchar2(12) constraint n_stu_name unique,
-- n_stu_name �� �����ϴ� �ߺ��Ұ�
stu_dept varchar2(20) constraint n_stu_dept not null);
-- ���� ���� �̸� n_stu_dept 
drop table t_student;
select * from SYS.user_constraints where table_name like 't_%';

create table t_enrol(
sub_no char(3),
stu_no number(9),
enr_grade number(3),
constraint enr_sub_no_fk1 foreign key(sub_no) 
references subject(sub_no),
constraint enr_stu_no_fk1 foreign key(stu_no) 
references student(stu_no),
constraint enr_pk1 primary key(sub_no,stu_no));

--p394 q1-1
create table dept_const(
deptno number(2) constraint deptconst_deptno_pk primary key,
dname varchar2(14) constraint deptconst_dname_unq unique,
loc varchar2(13) constraint deptconst_loc_nn not null);

--p394 q1-2
create table emp_const(
empno number(4) constraint empconst_empno_pk primary key,
ename varchar2(10) constraint empconst_ename_nn not null,
job varchar2(9),
tel varchar2(20) constraint empconst_tel_unq unique,
hiredate date,
sal number(7,2) constraint empconst_sal_chk 
check(sal between 1000 and 9999),
comm number(7,2),
deptno number(2) constraint empconst_deptno_fk 
references dept_const(deptno));

alter table dept_const 
drop constraint deptconst_dname_unq; -- ���� ���� ����

select empno,ename,job,sal,
decode(job,
'MANAGER',sal*1.1,
'SALESMAN',sal*1.05,
'ANALIST',sal,
sal*1.03) as upsal from emp;

select empno,ename,mgr,
 case
 when mgr is null then '0000'
 when substr(mgr,1,2)=75 then '5555'
 when substr(mgr,1,2)=76 then '6666'
 when substr(mgr,1,2)=77 then '7777'
 when substr(mgr,1,2)=78 then '8888'
 else to_char(mgr) end as chg_mgr
from emp;

desc emp1;
desc dept1;

--1.	20 �Ǵ� 30�� �μ���ȣ�� ���(emp)���̺��� �����Ͽ� emp1���̺��� �����ض�.
create table emp2 as select * from emp1 where deptno in (20,30);
--2.	dept ���̺��� �����Ͽ� dept1���̺��� �����ض�.
create table dept2 as select * from dept1;
--3.	salgrade���̺��� �����Ͽ� salgrade1���̺��� �����ض�.
create table salgrade2 as select * from salgrade1;
--4.	������ ���̺��� Ȯ���Ѵ�.
select *from emp2;
select * from dept2;
select * from salgrade2;
--5.	�����ȣ 7401, ����̸� HOMER, �޿� 1300, �μ���ȣ 10�� ����� ���� �Ի��Ͽ���.
insert into emp2 values(7401,'HOMER',null,null,'2022-06-20',1300,null,10);
--6.	�����ȣ 7323, ����̸� BRANDA, �μ���ȣ 30, �����ȣ 7499�� ������ �޿��� �޴� ����� �Ի��Ͽ���. (������)
insert into emp2 values (7323,'BRANDA',null,null,null,
(select sal from emp1 where empno=7499),null,30);
--7.	���(emp)���̺��� �μ���ȣ�� 10�� �����͸� emp1���̺� �����ض�.
insert into emp2 select * from emp1 where deptno = 10;
insert into emp2(empno,ename,job,mgr,hiredate,sal,comm,deptno)
(select EMPNO ,ENAME ,JOB ,MGR ,HIREDATE ,SAL ,COMM ,DEPTNO from emp1 where deptno = 10);
--8.	�����ȣ 7369�� ��������� ANALYST�� �ٲپ��.
update emp2 set job = 'ANALYST' where empno=7369;
--9.	�μ���ȣ 20�� �������� �޿��� 10% ���϶�.
update emp2 set sal=sal*0.9 where deptno=20;
--10.	��� ����� �޿��� +100 �������Ѷ�
update emp2 set sal=sal+100;
--11.	������ DALLAS�� ������� �޿��� 10���϶�. (������)
update emp2 set sal=sal-10 where deptno = (select deptno from dept2 where loc in 'DALLAS');
--12.	�����ȣ 7499�� ����Ͽ���.
delete from emp2 where empno in 7499;
--13.	�μ���ȣ 50, �μ��̸� ��PLANNING��, ���� ��MIAMI���� �߰��Ǿ���.
insert into dept2 values(50,'PLANNING','MIAMI');
--14.	�μ���ȣ�� 40�� �μ��� 60���� ����Ǿ���.
update dept2 set deptno=60 where deptno=40;
update emp2 set deptno=60 where deptno=40;
--15.	Dept1 ���̺� ���� �μ���ȣ���� ���� �ִ� ������� �μ���ȣ�� 99�� �����϶�. (������)
update emp2 set deptno=99 where deptno not in (select deptno from dept2);
--16.	JONES, JOSH, CLARK�� 30�� �μ��� �ٲ����.
update emp2 set deptno=30 where ename in ('JONES','JOSH','CLARK');
--17.	Ŀ�̼��� null�� �����͸� 0���� �ٲپ��.
update emp2 set comm=0 where comm is null;
--18.	Emp1 ��ü ���̺��� �����͸� �����϶�.
delete from emp2;

rollback;
drop table emp2;
drop table dept2;
drop table salgrade2;

select * from emp1;

select * from emp3;
drop table emp3;

create or replace view v_student
as select * from student where stu_dept in '��ǻ������';
select * from v_student;

create or replace view v_enrol
as select sub_name,a.sub_no,stu_no,enr_grade
from enrol a , subject b
where a.sub_no = b.sub_no;
select * from v_enrol;

select rownum,e.* from emp e;

select stu_name from (select stu_name from student
where stu_height is not null order by stu_height desc)
where rownum<=5;

create sequence seq1 increment by 2 start with 1
maxvalue 1000;
select seq1.nextval from dual;
drop sequence seq1;

--p358 q3
create table deptseq as select * from dept;
create sequence seq_deptdeq increment by 1 start with 1
maxvalue 99 minvalue 1 nocycle nocache;
insert into deptseq values(seq_deptdeq.nextval,'DATABASE','SEOUL');
insert into deptseq values(seq_deptdeq.nextval,'WEB','BUSAN');
insert into deptseq values(seq_deptdeq.nextval,'MOBILE','ILSAN');
select * from deptseq;

