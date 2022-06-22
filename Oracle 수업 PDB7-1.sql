create table t_tbl(
t_empno number(4) NOT NULL,
t_ename varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_deptno number(2),
constraint t_tbl_pk primary key(t_empno));
desc t_tbl;

--t_tbl �� �����ڷ� ����
insert into t_tbl 
values('7369','SMITH','CLERK',7902,
to_date('1980-12-17','yyyy-mm-dd'),800,null,20);
delete from t_tbl where t_empno=7369;

--t_tbl �� �μ���ȣ20�� �ڷ� ����
insert into t_tbl (select * from emp1 where deptno = 20);
select * from t_tbl;

create table t_tbl10(
t_empno number(4) NOT NULL,
t_ename varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_deptno number(2),
constraint t_tbl10_pk primary key(t_empno));

--t_tbl10 �� �μ���ȣ10 �� ������ ����
insert into t_tbl10 (select * from emp1 where deptno=10);
select * from t_tbl10;

-- t_tbl �� gender �� char(1) �� ����
alter table t_tbl add gender char(1);

-- t_tbl �� gender �ڷ��� varchar2(10)�� ����
alter table t_tbl modify gender varchar2(10);

-- gender �� ����
alter table t_tbl drop (gender);

-- t_tbl ��� ������ ����
delete from t_tbl;

--emp1 ������ ���� t_emp2
create table t_emp2 as select * from emp1;
drop table t_emp2;

create table t_emp2(
t_empno number(4),
t_ename varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_deptno number(2) constraint t_emp2_fk references dept1(deptno),
constraint t_emp2_pk primary key (t_empno));

--t_emp2 �� �ܷ�Ű�������� ��Ȱ��ȭ,Ȱ��ȭ
alter table t_emp2 disable constraint t_emp2_fk;
alter table t_emp2 enable constraint t_emp2_fk;

--�ܷ�Ű ���� ���� ����
alter table t_emp2 drop constraint t_emp2_fk;

--���̺� ����
drop table t_emp2;

--20�� �μ� ������� �̷���� v_emp20 
create or replace view v_emp20 
as select * from emp1 where deptno in 20;
select * from v_emp20;

--empno,ename,dname ������ v_emp_dept
create or replace view v_emp_dept
as (select empno,ename,dname from emp1,dept1
where emp1.deptno=dept1.deptno);
select * from v_emp_dept;

--���� �ֱ��� �Ի��� 5���� empno,ename,hiredate
select empno,ename,hiredate 
from (select * from emp1 order by hiredate desc)
-- ���Ĺ���� �ٲ� ���̺��� ���� 
where rownum<=5;
-- ���ε����ͷθ� �����ϴ� rownum ���߿��� 5�� ���ϸ� �˻�


--�޿��� Ŀ�̼��� ���� �ݾ����� ���� 7�� empno,enmae
select empno,ename,sal+nvl(comm,0)
from (select * from emp1 order by nvl(sal+comm,sal) desc)
where rownum<=7;

--�μ��� ��� �޿��� ���� ���� �μ� 2�� �̸�
select dname 
from (select dname,avg(sal) from emp1 natural join dept1 
group by dname order by avg(sal) desc ) where rownum <= 2;


--���Ի���� ä���Ͽ���.
--�����ȣ, ����̸�, �������, ����ڻ����ȣ, �޿�, �μ���ȣ�� �Է¹޾�
--��� ���̺� �����ϴ� ���ν����� �ۼ��ض�.
create or replace procedure input_emp1
(i_empno emp1.empno%type,
i_ename emp1.ename%type,
i_job emp1.job%type,
i_mgr emp1.mgr%type,
i_sal emp1.sal%type,
i_deptno emp1.deptno%type)
is
begin
    insert into emp1(empno,ename,job,mgr,sal,deptno)
    values(i_empno,i_ename,i_job,
    i_mgr,i_sal,i_deptno);
--    commit;
end;
/
desc emp1;
execute input_emp1(8000,'�����','��',7839,4444,30);
select * from emp1;
delete from emp1 where empno in 8000;


--�μ���ȣ�� �����ϴ� ���ν����� �ۼ��ض�.
--(emp ���̺���) - update~set~where
--(�Էµ� �����ȣ�� ������ �μ���ȣ 
--�����ض�)
create or replace procedure up_emp1
(i_empno emp1.empno%type,
i_deptno emp1.deptno%type)
is
begin
    update emp1 set deptno=i_deptno
    where empno=i_empno;
end;
/
execute up_emp1(8000,60);

/*
create or replace procedure out_emp1
(i_empno out emp1.empno%type,
i_deptno out emp1.deptno%type)
is
begin
    select empno,deptno into i_empno,i_deptno
    from emp1;
end;
/
drop procedure out_emp1;

declare 
    d_empno emp1.empno%type;
    d_deptno emp1.deptno%type;
begin
    for i in 0..20 loop
        out_emp1(d_empno,d_deptno);
        dbms_output.put_line(d_empno || ' ' || d_deptno);
    end loop; 
end;
/*/

create or replace procedure in_en1
(i_sub_no enrol.sub_no%type,
i_stu_no enrol.stu_no%type,
i_enr_grade enrol.enr_grade%type)
is
begin
    insert into enrol values(i_sub_no,i_stu_no,i_enr_grade);
end;
/

execute in_en1(106,20151062,90);
execute in_en1(101,20131001,90);
select * from enrol;
execute in_en1(201,20193075,50);
delete from enrol where sub_no in 201;

create or replace procedure up_sub1
(old_sub_no subject.sub_no%type,
new_sub_no subject.sub_no%type)
is
begin
    update subject set sub_no=new_sub_no
    where sub_no=old_sub_no;
end;
/


create or replace procedure f_prof
(f_sub_no subject.sub_no%type,
f_sub_prof out subject.sub_prof%type)
is
begin
    select sub_prof
    into f_sub_prof
    from subject
    where sub_no=f_sub_no;
end;
/

declare
    fsubprof subject.sub_prof%type;
begin
    f_prof(101,fsubprof);
    dbms_output.put_line(fsubprof);
end;
/


create or replace function func_aftertext
(sal in number)
return number
is
    tax number := 0.05;
begin
    return (round(sal-(sal*tax)));
end;
/
declare
    aftertax number;
begin
    aftertax := func_aftertext(3000);
    dbms_output.put_line(aftertax);
end;
/

select ename,sal,func_aftertext(sal) from emp1;



select * from user_constraints
where table_name = 'copy_enrol';