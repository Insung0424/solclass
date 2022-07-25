alter table copy_student add constraint cp_stu_no_pk
primary key(stu_no);
alter table copy_subject add constraint cp_sub_no_pk
primary key(sub_no);
alter table copy_enrol add constraint cp_enrol_pk
primary key(stu_no,sub_no);

alter table copy_enrol add constraint cp_enrol_fk
foreign key (stu_no) references copy_student(stu_no);
alter table copy_enrol add constraint cp_enrol_sub_fk
foreign key (sub_no) references copy_subject(sub_no);


--���� ���� �˻�
select * from user_constraints where table_name = 'ENROL';
-- ���̺� �̸� ��ҹ��� ��Ȯ�� ������

--���� ���� ����
alter table enrol drop constraint p_course;
--���� ���� ����

execute in_en1(201,20193075,50);

create or replace procedure in_c_enrol
(i_sub_no in out copy_enrol.sub_no%type,
i_stu_no in out copy_enrol.stu_no%type,
i_enr_grade in copy_enrol.enr_grade%type)
is
begin
    select sub_no,stu_no
    into i_sub_no,i_stu_no,i_enr_grade
    from copy_enrol
    where sub_no=i_sub_no or stu_no=i_stu_no;
end;
/
drop procedure in_c_enrol;
select * from user_constraints where table_name = 'COPY_ENROL';
execute in_c_enrol(106,20151062,90);
execute in_c_enrol(201,20151062,90);
select * from copy_enrol;
delete from copy_enrol where sub_no in 201 and stu_no in (20151062);


create procedure test111
(v_stu_no in student.stu_no%type)
is
    v_stu_name student.stu_name%type;
begin 
    select stu_name into v_stu_name
    from student
    where stu_no = v_stu_no;
    dbms_output.put_line(v_stu_name);
    
exception
    when no_data_found then dbms_output.put_line('no data');
end;
/
drop procedure test111;

execute test111(20153088); --���¿�
execute test111(12345678); --no data


declare
    v_wrong date;
begin
    select ename into v_wrong
    from emp
    where empno = 7369;
    dbms_output.put_line('no start');
exception
    when others then dbms_output.put_line('ERROR '||
    to_char(sysdate,'[yyyy"��"mm"��"dd"��"hh24"��"mm"��"ss"��"]'));
end;
/
--ERROR [2022��06��22��14��06��30��]

drop procedure test222;
create procedure test222
(v_sub_no in enrol.sub_no%type)
is
v_cnt number;
cnt_error exception;
begin 
    select count(stu_no) into v_cnt
    from enrol
    where sub_no=v_sub_no;
    dbms_output.put_line(v_sub_no || ' �� �����ڴ� ��' || v_cnt ||  '��');
    if v_cnt=0 then
        raise cnt_error;
    end if;
exception
    when cnt_error then
        dbms_output.put_line('�ƹ��� ����');
end;
/
execute test222(101); -- 2��
execute test222(201); -- �ƹ��� ����
        
drop procedure in_c_enrol;

create or replace procedure in_c_enrol
(i_sub_no in enrol.sub_no%type,
i_stu_no in enrol.stu_no%type,
i_enr_grade in enrol.enr_grade%type)
is
    v_cnt number;
    cnt_error exception;
begin
    select count(sub_no) into v_cnt
    from enrol
    where sub_no=i_sub_no;
    
    if v_cnt>=1 then
        raise cnt_error;
        
    else insert into enrol values(i_sub_no,i_stu_no,i_enr_grade);
    end if;
exception
    when cnt_error then dbms_output.put_line('���Ἲ�� �����');
end;
/

execute in_c_enrol(101,20131001,40);
execute in_c_enrol('106','20153077',40);
execute in_c_enrol(301,20135404,99);
select * from enrol;

select sub_no from enrol group by sub_no;

drop procedure p_sub_no_update;













---------------------------------------------------------
create or replace procedure p_sub_no_update
(old_sub_no in subject.sub_no%type,
new_sub_no in subject.sub_no%type)
is

v_cnt number;
b_cnt number;

cnt_error exception;
cnt2_error exception;

begin
select count(sub_no) into v_cnt from subject 
where sub_no=new_sub_no;

select count(sub_no) into b_cnt from subject 
where sub_no=old_sub_no;

if v_cnt ^=0 then 
raise cnt_error;

elsif
b_cnt=0 then
raise cnt2_error;

else

update subject
set sub_no=new_sub_no 
where sub_no=old_sub_no;
dbms_output.put_line('����');
end if;
exception
when cnt_error then
dbms_output.put_line('��ü �� �����ȣ �̹�����');
when cnt2_error then
dbms_output.put_line('��ü �� �����ȣ ����');
end p_sub_no_update;
/

execute p_sub_no_update('501','201');
execute p_sub_no_update('101','102');

drop procedure p_sub_no_update;

drop table enrol;
create table enrol as select * from enrol1;
select * from enrol;

select * from subject;
drop table subject;
create table subject as select * from subject1;
delete from subject where sub_no=501;

-------------------------------------------------
create procedure p_insert_enrol
(v_sub_no in enrol.sub_no%type,
v_stu_no in enrol.stu_no%type,
v_enr_grade in enrol.enr_grade%type)
is
    v_cnt number;
    c_error exception;
begin
    select count(*) into v_cnt
    from enrol where sub_no=v_sub_no;
    
    if v_cnt=0 then raise c_error;
    end if;
    
    select count(*) into v_cont 
    from student where stu_no = v_stu_no;
    
    if v_cnt = 0 then raise c_error;
    end if;
    
    insert into enrol values(v_sub_no,v_stu_no,v_enr_grade);
    dbms_output.put_line('����');
exception
    when c_error then dbms_output.put_line('���Ἲ�� �����');
end;
/

execute p_insert_enrol(102,20141001,40);

select count(*) from subject where sub_no=102;


create procedure p_sub_no_update
(old_sub_no in subject.sub_no%type,
new_sub_no in subject.sub_no%type)
is
v_cnt number;
cnt_error exception;
cnt2_error exception;
begin
    select count(*) into v_cnt from subject where sub_no=old_sub_no;
    
    if v_cnt=0 then raise cnt_error;
    end if;
    
    select count(*) into v_cnt from subject where sub_no=new_sub_no;
    
    if v_cnt>0 then raise cnt2_error;
    end if;
    
    update subject set sub_no = new_sub_no 
    where sub_no=old_sub_no;
    update enrol set sub_no = new_sub_no 
    where sub_no=old_sub_no;
    dbms_output.put_line('����');
    
exception 
    when cnt_error then dbms_output.put_line('��ü�� �����ȣ�� ����');
    when cnt2_error then dbms_output.put_line('��ü�� �����ȣ�� �̹� �ִ�');
end;
/

select * from subject;
select * from student;
select * from enrol;

