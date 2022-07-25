SET SERVEROUTPUT ON; -- �������� ȭ�鿡 ���
set serveroutput off;

declare
    v_con NUMBER := 1;
begin
    IF v_con > 1 then
    DBMS_OUTPUT.PUT_LINE('v_con�� 1���� ũ��');
    elsif v_con < 1 then
    DBMS_OUTPUT.PUT_LINE('v_con�� 1���� �۴�');
    else
    DBMS_OUTPUT.PUT_LINE('v_con�� 1�� ����');
    END IF;
end;
/

declare
    v_score NUMBER := 87;
begin
    case
        when v_score >= 90 then dbms_output.put_line('A');
        when v_score >= 80 then dbms_output.put_line('B');
        when v_score >= 70 then dbms_output.put_line('C');
    end case;
end;
/

--loop
declare 
    v_num number := 0;
    v_sum number := 0;
begin
    loop
        v_num := v_num +1;
        v_sum := v_sum+v_num;
        dbms_output.put_line('���� v_num,v_sum :' || v_num || ' ' || v_sum);
        exit when v_num = 10;
    end loop;
end;
/

-- for loop
DECLARE
    v_num number;
    v_sum number := 0;
begin
    for v_num in 0 .. 10 loop
        v_sum := v_sum+v_num;
        dbms_output.put_line('���� v_num,v_sum :' || v_num || ' ' || v_sum);
    end loop;
end;
/

--while
declare 
    v_num number := 0;
    v_sum number := 0;
begin
    while v_num < 10 loop
        v_num := v_num+1;
        v_sum := v_sum+v_num;
        dbms_output.put_line('���� v_num,v_sum :' || v_num || ' ' || v_sum);
    end loop;
end;
/


--p444 q1
begin
    for i in 0..10 loop
    continue when mod(i,2) = 0;
    dbms_output.put_line('���� i�� �� : ' || i);
    end loop;
end;
/

create or replace procedure pro_noparam
is
    v_empno number(4) := 7788;
    v_ename varchar2(10);
begin
    v_ename := 'SCOTT';
    dbms_output.put_line('v_empno : ' || v_empno);
    dbms_output.put_line('v_ename : ' || v_ename);
end;
/
execute pro_noparam;

create or replace procedure test2
--���ν��� ���� �̸��� test2
(v_stu_no in student.stu_no%type,
-- in�� ����� ���� �Է� v_stu_no�� student.stu_no�� Ÿ���� ����
v_stu_grade in student.stu_grade%type)
is
begin
    update student
    set stu_grade = v_stu_grade
    where stu_no=v_stu_no;
end test2;
/
execute test2(20153075,3);
--execute : �Լ� test2(����̵Ǵ��й�, ������ �г�) ����


create or replace procedure test3
(v_stu_no in student.stu_no%type,
v_stu_name out student.stu_name%type)
is
begin
    select stu_name
    into v_stu_name
    from student
    where stu_no=v_stu_no;
    --stu_name�� �����ͼ� v_stu_name�� �����Ѵ�
end test3;
/
variable d_stu_name varchar2(10); --���� ����
execute test3(20153075,:d_stu_name);
-- 20153075 ���� ������ stu_name�� :d_stu_name ���� ����
print d_stu_name; --������ �� ����Ǿ����� Ȯ��


create or replace procedure test4
(v_sub_no in enrol.sub_no%type,
v_stu_no in enrol.stu_no%type,
v_enr_grade in out enrol.enr_grade%type)
--in out �Է°� ���ÿ� ��ȯ
is
begin
    update enrol
        set enr_grade=enr_grade+v_enr_grade
        where stu_no=v_stu_no and sub_no=v_sub_no;
        --�й��� �����ȣ�� ���� �� ������ �����
    select enr_grade
        into v_enr_grade
        from enrol
        where stu_no=v_stu_no and sub_no=v_sub_no;
end test4;
/
variable d_enr_grade number
begin :d_enr_grade := 10;
end;
/ -- d_enr_grade �� 10���� ����
execute test4(101,20131001,:d_enr_grade);
--20131001�й�,101������ ������ d_enr_grade�� test4�Լ�����
print d_enr_grade;



--p444 q2
DECLARE
    v_deptno number(2);
begin
    v_deptno := 15;
    case
        when v_deptno = 10 then dbms_output.put_line('DNAME : ACCOUNTING');
        when v_deptno = 20 then dbms_output.put_line('DNAME : RESEARCH');
        when v_deptno = 30 then dbms_output.put_line('DNAME : SALES');
        when v_deptno = 40 then dbms_output.put_line('DNAME : OPERATIONS');
        else dbms_output.put_line('DNAME : N/A');
    end case;
end;
/
    

--p518 q1
create or replace procedure pro_dept_in
(d_deptno in out dept1.deptno%type,
d_dname out dept1.dname%type,
d_loc out dept1.loc%type)
is
begin
    select deptno,dname,loc
    into d_deptno,d_dname,d_loc
    from dept1
    where deptno=d_deptno;
    dbms_output.put_line(d_deptno ||' '|| d_dname ||' '|| d_loc);
end pro_dept_in;
/
DECLARE
    d_deptno  dept1.deptno%type;
    d_dname  dept1.dname%type;
    d_loc  dept1.loc%type;
begin
    d_deptno := 10;
    pro_dept_in(d_deptno,d_dname,d_loc);
end;
/


create table cust(
c_no number(3) not null,
c_name varchar2(10),
c_flag number(1),
c_addr varchar2(20),
c_phone varchar2(20),
constraint c_no_pk primary key(c_no));


create table video(
V_NO NUMBER(1) not null,
constraint pk_v_no primary key(V_NO),
V_NAME varchar2(20),
V_ACTOR varchar2(10),
V_GROUP varchar2(10));



create table rent(
r_no number(1) constraint pk_rent primary key,
r_date date,
c_no number(3) constraint c_no_fk references cust(c_no),
r_rentfee number(5),
v_no number(1) constraint v_no_fk references video(v_no));

insert into cust values(101,'������',1,'���� ���ϱ�','02-455-5544');
insert into cust values(102,'�迵��',2,'���� ������','02-299-2565');
insert into cust values(103,'�̿���',3,'���� ���ʱ�','02-555-5555');
insert into cust values(104,'������',1,'���� ���빮��','02-444-4444');

insert into video values(1,'��������','���·� ���ϴ�','�ڹ̵�');
insert into video values(2,'�����','�۰�ȣ','���');
insert into video values(3,'����Ʈ','������ ����','�ڹ̵�');
insert into video values(4,'����������','������','�׼�');
insert into video values(5,'���۳༮��','������','�׼�');
insert into video values(6,'82���������','������ ����','���');

alter table video modify v_actor varchar2(20);

insert into rent values(1,'2020-07-30',101,1000,1);
insert into rent values(2,'2020-07-30',101,500,2);
insert into rent values(3,'2020-08-2',103,500,5);
insert into rent values(4,'2020-08-2',102,1000,6);
insert into rent values(5,'2020-08-2',102,1000,3);
insert into rent values(6,'2020-08-3',104,2000,2);

select * from video;
select * from cust;
select * from rent;

create sequence seq1
increment by 1
START WITH 201
maxvalue 999;

create procedure test5
(v_sub_name in subject.sub_name%type,
v_sub_prof in subject.sub_prof%type,
v_sub_grade in subject.sub_grade%type,
v_sub_dept in subject.sub_dept%type)
is
begin
    insert into subject values(seq1.nextval,v_sub_name,
    v_sub_prof,v_sub_grade,v_sub_dept);
    commit;
end test5;
/
execute test5('PL/SQL','ȫ�浿',3,'��ǻ������');
select * from subject;

desc cust;
--�� ���̺��� ���̸�, ���, �ּҸ� �˻��ض�. (3��)
select c_name,c_flag,c_addr from cust;
--�����̸��� ����ȣ, �ݳ����� equi join, natural join, join~using�� �� �Ἥ �˻��ض�. (10��)
select v_name,c_no,r_date from video,rent where video.v_no=rent.v_no;
--�̿��� ���� �뿩�� �����̸��� �ֿ���츦 �˻��ض�. (equi join) (3��)
select v_name,v_actor from video,rent,cust 
where cust.c_no=rent.c_no and video.v_no=rent.v_no
and c_name in '�̿���';
--������� �뿩�� ������ ����ȣ�� �̸��� �˻��ض�. (3��)
select cust.c_no,c_name from video,rent,cust 
where cust.c_no=rent.c_no and video.v_no=rent.v_no
and v_name in '�����';
--����� 1����� ���� �뿩�� ���� �̸��� ��� �˻��ض�. (3��)
select v_name from video where v_no in 
(select v_no from rent natural join cust where c_flag in 1);
--�뿩�ᰡ 2000�� �̻��� ���� ���� �˻��ض�. (3��)
select c_no, sum(r_rentfee) as total_fee
from rent
group by c_no
having sum(r_rentfee) >= 2000;

--����ȣ�� 103���� ���� ���� �������� �뿩���̺��� �����Ͽ� 
--a_rent ���̺��� �����. (5��)
create table a_rent as select * from rent 
where c_no<103;
--������ ���� a_rent���̺� (9, 2020-08-01, 101, 1000, 3)
--�� �����Ѵ�. (3��)
insert into a_rent values (9,'2020-08-01',101,1000,3);
--�뿩���̺��� ��10�� ���� �����ϴ� �� �����͸� a_rent 
--���̺� ��������, ������ Ȯ���ض�. (5��)
insert into a_rent select * from rent where c_no like '10%';



--����ȣ�� �Է����� ���̸��� �˻��ϴ� ���ν����� ������. 
create or replace procedure find
(f_cus_no in cust.c_no%type) -- ���
is
    f_cus_name cust.c_name%type; -- �����
begin -- �����
    select c_name into f_cus_name from cust where c_no = f_cus_no;
    dbms_output.put_line(f_cus_name);
    end find;
/
drop procedure find;
execute find(101);


create or replace function test6
(v_enr_grade in number)
return char --��ȯ���� �ڷ���
is
    enr_score char;
begin
    if v_enr_grade>=90 then enr_score:='A';
    elsif v_enr_grade>=80 then enr_score:='B';
    elsif v_enr_grade>=70 then enr_score:='C';  
    else enr_score:='F';
    end if;
    return (enr_score);
end test6;
/
variable d_score char; 
--�Լ��� ��ȯ���� �ִ� �̸� ���� ��������
execute :d_score := test6(95);
print d_score;

select enr_grade,test6(enr_grade) as ���� from enrol
where stu_no = 20131001;


--p519 q2
create or replace function func_date
(v_hiredate in date)
return varchar2
is
begin 
    return (to_char(v_hiredate,'yyyy"�� "mm"��" dd"��"'));
end func_date;
/

select ename,hiredate,func_date(hiredate) as ����� from emp1;