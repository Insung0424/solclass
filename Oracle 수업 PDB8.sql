set SERVEROUTPUT on;

declare
    v_no emp.empno%type;
    v_ename emp.ename%type;
    v_deptno emp.deptno%type;
    v_dname varchar(20);
begin
    select empno,ename,deptno
    into v_no,v_ename,v_deptno
    from emp1 
    where empno=7698;
    
    if(v_deptno=10) then v_dname:='������';
    elsif (v_deptno=20) then v_dname:='�����ú�';
    elsif (v_deptno=30) then v_dname:='IT���ߺ�';
    end if;
    
    dbms_output.put_line(v_no||' '||v_dname);
end;
/

declare
    v_empno emp1.empno%type;
    v_ename emp.ename%type;
begin
    select empno,ename
    into v_empno,v_ename
    from emp1
    where ename like '%B%'; --7698 BLAKE
--    where ename like '%Z%'; --����
    
    dbms_output.put_line(v_empno||' '||v_ename);
exception
    when no_data_found then dbms_output.put_line('����');
end;
/


--1.	emp1 ���̺��� �����Ͽ� emp01 �̶�� ���̺��� �����ض�.
create table emp01 as select * from emp1;
--2.	emp01 ���̺��� ��� �����͸� ������Ű�� ���ν����� �����ض�. (���ν���: all_del)
create or replace procedure all_del
is
begin
    delete from emp01;
end;
/

drop procedure all_del;

execute all_del();

select * from emp01;
    
--3.	2������ ������ �����͵��� �ٽ� 1��ó�� �����ض�.
rollback;
--4.	emp01 ���̺��� ����̸��� ���� Ÿ���� v_ename�� 
--�����Ͽ� �̸��� ��M���� �� ������� �� �����ϴ� ���ν����� �����϶�.(���ν���: del_name)
create or replace procedure del_name
is
begin
    delete from emp01 where ename like '%M%';
end;
/
execute del_name();
select * from emp01;
--5.	emp01 ���̺� �ִ� �����ȣ(empno)�� �Է��� 
--�����ȣ���� ���� ����̸�(ename)�� ����(sal), ����(job)�� 
--�˻��ϴ� ���ν����� �����϶�.(���ν���: search_pro)
--��, �޴� ������ ���ε� ������ �����Ͽ� ���ν����� ������Ѷ�.
--�����ȣ�� 7844�� �Է��ض�.
create or replace procedure search_pro
(v_empno emp01.empno%type)
is
    v_ename emp01.ename%type;
    v_sal emp01.sal%type;
    v_job emp01.job%type;
begin
    select ename,sal,job
    into v_ename,v_sal,v_job
    from emp01
    where empno=v_empno;
    
    DBMS_OUTPUT.PUT_LINE(v_empno ||' '||v_ename||' '||
                        v_sal||' '||v_job);
end;
/
create or replace procedure search_pro_c
(v_empno emp01.empno%type,
v_ename out emp01.ename%type,
v_sal out emp01.sal%type,
v_job out emp01.job%type)
is
begin
    select ename,sal,job
    into v_ename,v_sal,v_job
    from emp01
    where empno=v_empno;
end;
/
var v_no number;
exec :v_no := 7844;
var v_name varchar2(20);
var v_sal number;
var v_job varchar2(20);
execute search_pro_c(:v_no,:v_name,:v_sal,:v_job);
print v_name;
print v_sal;
print v_job;

create or replace procedure test7
is
    v_stu_no enrol.stu_no%type;
    v_sub_no enrol.sub_no%type;
    v_enr_grade enrol.enr_grade%type;
    
    cursor t_cursor is
    select stu_no,sub_no,enr_grade from enrol
    where sub_no = 101;
begin
    open t_cursor;
    loop
        fetch t_cursor into v_stu_no,v_sub_no,v_enr_grade;
        
        exit when t_cursor%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE(v_stu_no ||' '|| v_sub_no
                            ||' '||v_enr_grade);
    end loop;
    close t_cursor;
end;
/

exec test7;


create or replace procedure test8
is
    v_enrol enrol%rowtype;
    
    cursor test_c is
    select * from enrol
    where sub_no = 105;
begin
    for v_enrol in test_c loop
    exit when test_c%notfound;
    DBMS_OUTPUT.PUT_LINE(v_enrol.stu_no ||' '|| v_enrol.sub_no
                            ||' '||v_enrol.enr_grade);
    end loop;
end;
/

exec test8;

-- p478 q1-1
declare
    v_emp1 emp1%rowtype; 
    
    cursor q_c is 
    select empno,ename,job,sal,deptno from emp1;
begin
    open q_c;
    loop
        fetch q_c into v_emp1.empno,v_emp1.ename,v_emp1.job,v_emp1.sal,v_emp1.deptno;  
        exit when q_c%notfound;
        
        DBMS_OUTPUT.PUT_LINE('empno : '||v_emp1.empno
        ||' ename : '||v_emp1.ename
        ||' job : '||v_emp1.job
        ||' sal : '||v_emp1.sal
        ||' deptno : '||v_emp1.deptno);
    end loop;
    close q_c;
end;
/

-- p478 q1-2
declare
    v_emp1 emp1%rowtype; 
    
    cursor q_c is 
    select empno,ename,job,sal,deptno from emp1;
begin
    for v_emp1 in q_c loop
        
        DBMS_OUTPUT.PUT_LINE('empno : '||v_emp1.empno
        ||' ename : '||v_emp1.ename
        ||' job : '||v_emp1.job
        ||' sal : '||v_emp1.sal
        ||' deptno : '||v_emp1.deptno);
    end loop;
end;
/

--p478 ���ܿ���
declare
    v_row emp1%rowtype; --Ŀ�������Ͱ� �Էµ� ���� ����
    cursor t_cursor is
    select * from emp1; --����� Ŀ�� ����
begin
    open t_cursor; --Ŀ�� ����
    loop
        --Ŀ���κ��� �о�� ������ ������
        fetch t_cursor into v_row;
        exit when t_cursor%notfound;
        dbms_output.put_line(v_row.empno ||' '|| v_row.ename);
    end loop;
    close t_cursor; --Ŀ�� �ݱ�
end;
/
--���ܿ��� 2��° for-loop
declare
    cursor t_cursor is
    select * from emp1; --����� Ŀ�� ����
begin
    for v_row in t_cursor loop --���� ������ϰ� ��밡��
        dbms_output.put_line(v_row.empno ||' '|| v_row.ename);
    end loop;
end;
/


create procedure p_insert
(v_sub_no in enrol.sub_no%type,
v_stu_no in enrol.stu_no%type,
v_enr_grade in enrol.enr_grade%type)
is
begin
    insert into copy_enrol values(v_sub_no,v_stu_no,v_enr_grade);
end;
/

create table tmp
(userid varchar2(10),
workdate date,
msg char(1));

select * from tmp;
--student ���̺� �����۾��� �Ͼ�� �� �����ϴ� Ʈ����
create or replace trigger tri1
after
update on student
begin
insert into tmp values('INSUNG',sysdate,'a');
end tri1;
/
update student set stu_weight=stu_weight-10;
rollback;
delete from tmp;

create trigger tri2
after
update on student
for each row
begin
    insert into tmp values('INSUNG',sysdate,'a');
    -- student ���̺��� ���� 10�� �̹Ƿ� for each row�� ����
    --  10�� ���Եȴ�   
end tir2;
/
drop trigger tri2;
drop trigger tri1;
drop trigger tri3;

update student set stu_weight=stu_weight-10;
select * from tmp;
rollback;
select * from student;

create trigger tri3
after
update on student
for each row
when(old.stu_weight>70)
begin
    insert into tmp values('insung',sysdate,'b');
end;
/
update student set stu_weight=stu_weight-10;
rollback;

--�μ����̺� ������ ������ dept_delete���̺� ����

create table dept_delete
(userid varchar2(10),
workdate date,
deptno number(2),
dname varchar2(14),
loc varchar2(15));
select * from dept_delete;

create trigger tri4
after
delete on dept
for each row
begin
    insert into dept_delete values('hyumnin',sysdate,:old.deptno,
    :old.dname,:old.loc);
end tri4;
/

delete from dept where deptno=10;
rollback;


--������̺� ����� �߰����Եɶ�
--������ 5000���� ũ�� emp500���̺� �����ȣ,����̸�,��¥ Ʈ����

create table emp500
(empno number(4),
ename varchar2(10),
workdate date);

create or replace trigger tri5
after
insert on emp1
for each row
begin 
    if :new.sal > 5000 then
        insert into emp500 values(:new.empno, :new.ename, sysdate);
    end if;
end;
/
insert into emp1 values(1111,'SP1','vegitable',7839,sysdate,6000,null,10);
insert into emp1 values(2222,'SP2','vegitable',7839,sysdate,4500,null,10);
select * from emp1;
select * from emp500;
rollback;


drop package pack1;
create package pack1 
is
procedure test2
(v_stu_no in student.stu_no%type,
v_stu_grade in student.stu_grade%type);

function test6
(v_enr_grade in number)
return char;

end;
/
drop package body pack1;
create package body pack1
is
    procedure test2
    (v_stu_no in student.stu_no%type,
    v_stu_grade in student.stu_grade%type)
     is
     begin
        update student set stu_grade=v_stu_grade
        where stu_no=v_stu_no;
    end test2;
    
    function test6
    (v_enr_grade in number)
    return char
    is
        enr_score char;
    begin
        if v_enr_grade >= 90 then enr_score:='A';
        elsif v_enr_grade >= 80 then enr_score:='B';
        else enr_score:='F';
        end if;
        return enr_score;
    end test6;
end;
/
        
exec test2(20153075,3);
select * from student;

variable d_score char;
exec :d_score := test6(95);
print d_score;