select * from emp;
select * from dept;
select * from salgrade;

select * from student;
select * from subject;
select * from enrol;

select upper(stu_gender),stu_gender from student;

select stu_dept || stu_name from student;
select concat(stu_dept,stu_name) from student;

select stu_dept || '�� ' || stu_grade || '�г� '
|| stu_name || '�Դϴ�' from student;

select substr(stu_name,1,2),stu_name from student;

select stu_name,stu_dept,substr(stu_dept,2,1) from student;

select to_char(to_number(1234.5678),'9999.999') from dual;

select NVL(stu_height,0),stu_name from student;
select NULLIF('A', 'A') from dual; -- null��ȯ 
select NULLIF('A', 'B') from dual; -- A��ȯ

select nvl(NULLIF('A', 'A'),'B') from dual; -- B��ȯ

select substr('���μ�ȫ����',2,3) from dual; -- �μ�ȫ ��ȯ

select stu_no,stu_name,stu_height,
round(stu_height,-1) from student;

select stu_no,stu_name,stu_height,
trunc(stu_height,-2) from student;

select stu_weight,mod(stu_weight,30) from student;
-- ü���� 30���� ���� ������

select nvl(to_char(stu_height),'�̱��')height from student;
--stu_height �� ���ڷ� �ٲ�� 'null'���� ���ڸ� ������ �� �ִ�

select stu_no,stu_name,
nvl(stu_height,0)+stu_weight as ������null�̸�0�̵�
from student;

select stu_no,stu_name,nvl(to_char(stu_height),'�Է¿��') from student;

select stu_gender,nvl2(nullif(stu_gender,'m'),'����','����') as ���� from student;

select stu_name,stu_no from student 
union select sub_no,sub_name 
from subject; 

--p125 q3 ���տ����ڸ� ����� ���
select empno,ename,job,sal,deptno from emp
where deptno=20 and sal>2000 
union
select empno,ename,job,sal,deptno from emp
where deptno=30 and sal>2000;
select empno,ename,job,sal,deptno from emp
where deptno<>10 and sal>2000;

select max(enr_grade),min(enr_grade) from enrol;
        --�ִ�        --�ּ�
        
select max(stu_weight),min(stu_weight) from student
where stu_dept in '���';

select count(*) ,count(stu_height) from student;
-- ��ü �л��� �� ���尪�� ���� �л� ��

select count(distinct stu_dept) from student;

select count(*) as �л���,
sum(stu_height) as ��ü�л���Ű��,
count(stu_height) as Ű���������л���,
avg(stu_height)���Ű from student;


--68. �л� �� Ű�� ���� ū �л��� ������ �˻��϶�.
select max(stu_height) from student;
--69. �л��� �̸� �� MAX�� MIN���� �˻��϶�.
select max(stu_name),min(stu_name) from student;
        --������ �Ǵ� ����
--70. �л����̺��� ���ڵ�(Ʃ��)���� �˻��϶�.
select count(*) from student;

update student set stu_name='���Ѻ�' where stu_name='������';
-- Ư�� ���̺��� Ư�� ������ ���� �ϴ� ���
select * from student; --Ȯ�ΰ�� ����� ������

select sum(sal) from emp; --sal �� ��

select stu_dept,avg(stu_weight) from student
group by stu_dept; --�׷��Լ��� ���Ϸ� ����ϰų� 
--�ٸ� ���� ���� ����� ��� �ٸ����� �׷�ȭ�ؼ� ����Ѵ�

select stu_dept,count(*)�ش��а��л� from student
where stu_weight>=50
group by stu_dept;

select stu_dept,stu_grade as �г�,count(*)�ش��а��ǰ����г��л���
from student group by stu_dept,stu_grade;

--71. �а��� �л����� �ο����� �˻��϶�.
select stu_dept,count(*) from student group by stu_dept;

--72. �а��� �л����� �ο����� �ο����� ���� ������ �˻��϶�.
select stu_dept,count(*) from student group by stu_dept
order by count(*) desc;

--73. �г⺰ �л����� �ο����� �˻��϶�.
select stu_grade,count(*) from student group by stu_grade;

--74. �а��� �г⺰ �л����� ��� ü���� �˻��϶�.
select stu_dept,stu_grade,avg(stu_weight)
from student group by stu_dept,stu_grade;

--75. �а��� �г⺰ �л����� �й��� MAX�� MIN���� �˻��϶�.
select stu_dept,stu_grade,max(stu_no),min(stu_no)
from student group by stu_dept,stu_grade;

--p167 6-45
select empno,ename,sal,comm,sal+comm,
nvl(comm,0),sal+nvl(comm,0) from emp;

--p168 6-46
select empno,ename,comm,
nvl2(comm,'0','X'),
nvl2(comm,sal*12+comm,sal*12) as annsal
from emp;

--p170 6-47
select empno,ename,job,sal,
decode(job,
'MANAGER',sal*1.1,
'SALESMAN',sal*1.05,
'ANALYST',sal,
sal*1.03) as upsal
from emp;

--p172 6-48
select empno,ename,job,sal,
case job
when 'MANAGER' then sal*1.1
when 'SALESMAN' then sal*1.05
when 'ANALYST' then sal
else sal*1.03
end as upsal
from emp;

--p173 6-49
select empno,ename,comm,
case
when comm is null then '�ش���׾���'
when comm = 0 then '�������'
when comm > 0 then '���� : '||comm
end as comm_text
from emp;

--p177 7-1
select sum(sal) from emp;
--p178 7-2
select ename,sum(sal) from emp; --�������°Ը���
--p179 7-3
select sum(comm) from emp;
--p179 7-4
select sum(distinct sal),sum(all sal),sum(sal) from emp;
--��δ� ���� �� �� �����̹Ƿ� ��°���
--p181 7-5
select count(*) from emp;
--p181 7-6 
select count(*) from emp where deptno=30;
--p181 7-7
select count(distinct sal),count(all sal),count(sal)
from emp;
--p182 7-8
select count(comm) from emp;
--p182 7-9
select count(comm) from emp where comm is not null;
--p183 7-10
select max(sal) from emp where deptno=10;
--p183 7-11
select min(sal) from emp where deptno=10;
--p183 7-12
select max(hiredate) from emp where deptno=20;
--p184 7-13
select min(hiredate) from emp where deptno=30;
--p184 7-14
select avg(sal) from emp where deptno=30;
--p185 7-15
select avg(distinct sal) from emp where deptno=30;

select empno,rpad(substr(empno,1,2),length(empno),'*')as masking_empno,
ename,rpad(substr(ename,1,1),length(ename),'*') from emp;

select empno,ename,sal,
trunc(sal/21.5,2) as day_pay,
round(sal/21.5/8,1) as time_pay 
from emp;
-- ��Ī�� ������ ����� �ȵǴ� �� ��

select empno,ename,hiredate,
to_char(next_day(add_months(hiredate,3),1),'YYYY-MM-DD') as r_job,
--hiredate�� 90�� ���ϴ� �� �������� 3���� ��ĥ������ �� �� ����
NVL(to_char(comm),'N/A') from emp;

select stu_grade, avg(stu_height) from student
where stu_dept='���'
group by stu_grade having avg(stu_height)>=160;
--���� �л����� �г⺰ ���Ű�� ���� �� ���Ű�� 160�̻� ���
--having�� �׷쿡 ���� ����

select stu_dept,max(stu_height) from student
group by stu_dept having max(stu_height)>=175;
--�ִ�Ű�� 175�̻��� �а�,�а��� Ű ���ϱ�

select to_char(max(avg(stu_height)),'999.99') from student
group by stu_dept;
--�а��� ���Ű �� ���� ���� Ű
--avg(stu_height) �а��� ���Ű 3���� ��µ�
--max()�� ���μ� �� �� ���� ū ���� ����
--to_char()�� �Ҽ��� ��°�ڸ����� ��µ�


create table dept1(
deptno number(2)
constraint pk_dept primary key,
dname varchar2(14),
loc varchar2(13));




insert into dept1 values
(10,'ACCOUNTING','NEW YORK');
insert into dept1 values
(20,'RESEARCH','DALLAS');
insert into dept1 values
(30,'SALES','CHICAGO');
insert into dept1 values
(40,'OPERATIONS','BOSTON');




create table emp1(
empno number(4)
constraint pk_emp primary key,
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2));




insert into emp1 values(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
insert into emp1 values(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
insert into emp1 values(7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);
insert into emp1 values(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
insert into emp1 values(7788,'SCOTT','ANALYST',7566,to_date('13-07-1987','dd-mm-yyyy'),3000,NULL,20);
insert into emp1 values(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
insert into emp1 values(7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);
insert into emp1 values(7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);
insert into emp1 values(7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);
insert into emp1 values(7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);
insert into emp1 values(7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);
insert into emp1 values(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);
insert into emp1 values(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
insert into emp1 values(7876,'ADAMS','CLERK',7788,to_date('13-07-1987','dd-mm-yyyy'),1100,NULL,20);




create table salgrade1(
grade number(7,2),
losal number(7,2),
hisal number(7,2));




insert into salgrade1 values(1,700,1200);
insert into salgrade1 values(2,1201,1400);
insert into salgrade1 values(3,1401,2000);
insert into salgrade1 values(4,2001,3000);
insert into salgrade1 values(5,3001,9999);

desc emp1;
desc salgrade1;
desc dept1;
select * from emp1;
select * from salgrade1;
select * from dept1;

--1.	��� ���̺��� ������ �˻��϶�.
desc emp1;
--2.	�μ� ���̺��� ������ �˻��϶�.
desc dept1;
--3.	�޿� ���̺��� ������ �˻��϶�.
desc salgrade1;
--4.	������� �����ȣ, ����̸�, ��������� �˻��϶�.
select empno,ename,job from emp1;
--5.	�μ��� �μ���ȣ�� �μ��̸��� �˻��϶�.
select deptno,dname from dept1;
--6.	�μ��� �μ��̸��� ������ �˻��϶�.
select dname,loc from dept1;
--7.	������� �޿��� Ŀ�̼��� �˻��϶�.
select sal,comm from emp1;
--8.	������� �Ի��� �ߺ��� �����ϰ� �˻��϶�.
select distinct hiredate from emp1;
--9.	������� ����ڻ����ȣ(mgr)�ߺ��� �����ϰ� �˻��϶�.
select distinct mgr from emp1;
--10.	������� �μ���ȣ �ߺ��� �����ϰ� �˻��϶�.
select distinct deptno from emp1;
--11.	������� �̸��� 6���� �޿��� ���� �˻��϶�.
select ename,sum(sal*6) as mon6 from emp1 group by ename;
--12.	������� 6���� Ŀ�̼�(comm)�� ���� �˻��϶�.
select nvl(comm*6,0) from emp1;
--13.	����̸��� ��name������ ����� �޿��� ��salary���� ���� �̸��� �ο��Ͽ� �˻��϶�.
select ename as name, sal as salary from emp1;
--14.	����� �����ȣ, ����̸�, �Ի���, �μ���ȣ�� �ѱ۷� �ٲپ� �˻��϶�.
select empno as �����ȣ,ename as ����̸�,
hiredate as �Ի���,deptno as �μ���ȣ from emp1;
--15.	�μ���ȣ, �μ��̸�, ������ �ѱ� �������� �˻��϶�.
select deptno as �μ���ȣ,dname as �μ��̸�,loc as ���� from dept1;
--16.	����� ��������� ����̸��� ���ļ� �˻��϶�.
select job||ename from emp1;
--17.	�Ի���(hiredate) ����̸��� ��80-12-17�� �Ի��� SMITH�Դϴ١� ������ �˻��϶�.
select to_char(hiredate,'YY-MM-DD')||'�� �Ի��� '||ename||'�Դϴ�'
from emp1;
--18.	10�� �μ��� �ٹ��ϴ� ����̸��� �˻��϶�.
select ename from emp1 where deptno=10;
--19.	�޿��� 2000 �̻��� ������� �����ȣ, ����̸��� �˻��϶�.
select empno,ename from emp1 where sal>=2000;
--20.	��������� ��CLERK���� ������� �����ȣ, ����̸��� �˻��϶�.
select empno,ename from emp1 where job='CLERK';
--21.	1980�� 12�� 17�Ͽ� �Ի��� ����̸��� �˻��϶�.
select ename from emp1 where to_char(hiredate,'YYMMDD') like '801217';
--22.	�μ���ȣ 30�̿��� �μ��̸��� ������ �˻��϶�.
select dname,loc from dept1 where deptno not in '30';
--23.	�޿������ 5�� �޿��� �����޿��� �����޿��� �˻��϶�.
select hisal,losal from salgrade1 where grade=5;
--24.	��WARD������� ��� ������ �˻��϶�.
select * from emp1 where ename='WARD';
--25.	10�� �μ��� �ٹ��ϴ� MANAGER�� ����̸��� �˻��϶�.
select ename from emp1 where deptno=10 and job='MANAGER';
--26.	�޿��� 2000�̻��̸�, 30�� �μ��� �ٹ��ϴ� ������� �����ȣ�� ����̸��� �˻��϶�.
select empno,ename from emp1 where sal>=2000 and deptno=30;
--27.	��������� ��CLERK���̸�, 81�� ���Ŀ� �Ի��� ������� �����ȣ�� ����̸��� �˻��϶�.
select empno,ename from emp1 where job='CLERK' and to_number(to_char(hiredate,'YYMMDD'))>810000;
select empno,ename from emp1 where job='CLERK' 
and hiredate>='1981-01-01';
--28.	20���� �ܿ� �ٹ��ϴ� MANAGER�� ����̸��� �˻��϶�.
select ename from emp1 where deptno<>20 and job='MANAGER';
--29.	BOSTON�̿� ������ �ִ� �μ��̸��� �˻��϶�.
select dname from dept1 where loc<>'BOSTON';
--30.	SALEMAN�̸� �޿��� 1500�̻��� ����̸��� �˻��϶�.
select ename from emp1 where job='SALESMAN' and sal>=1500;
--31.	�޿��� 1000�̻��̸�, 2500������ ����� �����ȣ, ����̸�, �޿��� �˻��϶�.
select empno,ename,sal from emp1 where sal between 1000 and 2500;
--32.	�����ȣ�� 75XX�� ����� �����ȣ, ����̸�, �μ���ȣ�� �˻��϶�.
select empno,ename,deptno from emp1 where empno like '75%';
--33.	�μ���ȣ�� 10 �Ǵ� 30�� �ٹ��ϴ� ������� ����̸��� �޿��� �˻��϶�.
select ename,sal from emp1 where deptno<>20;
--34.	����ڻ����ȣ�� 76���� �����ϴ� ������� ����̸��� �˻��϶�.
select ename from emp1 where mgr like '76%';
--35.	�����ȣ�� 79�� �����ϴ� ������� ����̸�, �޿�, Ŀ�̼��� �˻��϶�.
select ename,sal,comm from emp1 where empno like '79%';
--36.	1981�� 2���� �Ի��� ����� �����ȣ, ����̸�, �μ���ȣ�� �˻��϶�.
select empno,ename,deptno from emp1 
--where to_char(hiredate,'YYMMDD') like '8102%';
--where hiredate between '1981/02/01' and '1981/02/28';
--where hiredate like '1981/02/%';--�̰Ŵ� �۵������ʴ´�
-- �� sysdate ������ yyyy/mm/dd �� �������־
where hiredate like '1981-02-%';

--37.	����̸� �߰��� ��A���� ����ִ� ����� �����ȣ�� ����̸��� �˻��϶�.
select empno,ename from emp1 where ename like '%A%';
--38.	����ڻ����ȣ�� NULL�� ����� �����ȣ�� ����̸��� �˻��϶�.
select empno,ename from emp1 where mgr is null;
--39.	����ڻ����ȣ�� NULL�� �ƴ� ����� �����ȣ, �̸�, ����ڻ����ȣ�� �˻��϶�.
select empno,ename,mgr from emp1 where mgr is not null;
--40.	�����ȣ�� 7902 �Ǵ� 7781�� ����̸��� �˻��϶�.
select ename from emp1 where empno=7902 OR empno=7781;
select ename from emp1 where empno in (7902,7781);


--1.	����ڻ����ȣ�� 7698 �Ǵ� 7839�� ����� �����ȣ�� ����̸��� �˻��϶�.
select empno,ename from emp1 where mgr=7698 or mgr=7839;
--2.	��������� ��MANAGER�� �Ǵ� ��SALESMAN���� ����� �����ȣ, ����̸�, �μ���ȣ�� �˻��϶�.
select empno,ename,deptno from emp1 
where job in('MANAGER','SALESMAN');
--3.	������� �����ȣ�� ����̸��� �����ȣ ������ �˻��϶�.
select empno,ename from emp1 order by empno;
--4.	������� �����ȣ�� ����̸��� �μ���ȣ�� �̸������� �˻��϶�.
select empno,ename from emp1 order by deptno,ename;
--5.	������� ������ �μ��� �޿��� ���� ������ �˻��϶�.
select * from emp1 order by deptno,sal desc;
--6.	������� ������ ��������� �޿� ������ �˻��϶�.
select * from emp1 order by job,sal;
--7.	������� ������ �μ���ȣ��, ���������, �޿� ������ �˻��϶�.
select * from emp1 order by deptno,job,sal;
--8.	������� ����̸��� �ҹ��ڷ� �˻��϶�.
select lower(ename) from emp1;
--9.	������� ����̸�, ��������� �ҹ��ڷ� �˻��϶�.
select lower(ename),lower(job) from emp1;
--10.	������� ����̸��� �빮�ڷ� �˻��϶�.
select upper(ename) from emp1;
--11.	������� ����̸�, ��������� �빮�ڷ� �˻��϶�.
select upper(ename),upper(job) from emp1;
--12.	������� ����̸��� ù�ڸ� �빮�ڷ� �˻��϶�.
select initcap(ename) from emp1;
--13.	������� ����̸��� ��������� ù �ڸ� �빮�ڷ� �˻��϶�.
select INITCAP(ename),initcap(job) from emp1;
--14.	������� ����̸��� ��������� �����Ͽ� �˻��϶�.(concat�̿�)
select concat(ename,job) from emp1;
--15.	������� ����̸��� ����̸��� ù �α��ڸ� �˻��϶�.
select ename,substr(ename,1,2) from emp1;
--16.	������� ����̸�, ������� �׸��� ��������� �ι�°���� �����ڸ� �˻��϶�.
select ename,job,substr(job,2,2) from emp1;
--17.	������� ����̸��� ����̸��� ���̸� �˻��϶�.
select ename,length(ename)�̸����� from emp1;
--18.	������� ����̸��� ��������� �ڸ����� �˻��϶�.
select ename,length(job)�������� from emp1;
--19.	������� ����̸��� ��A���� ��� ° ��ġ�� �ִ��� �˻��϶�.
select ename,instr(ename,'A')A���°��ġ from emp1;
--20.	��������� ��A���� ��� ° ��ġ�� �ִ��� �˻��϶�.
select job,instr(job,'A')A���°��ġ from emp1;


--q1
select empno,rpad(substr(empno,1,2),length(empno),'*')as masking_empno,
ename,rpad(substr(ename,1,1),length(ename),'*') from emp;
--q2
select empno,ename,sal,
trunc(sal/21.5,2) as day_pay,
round(sal/21.5/8,1) as time_pay 
from emp;
-- ��Ī�� ������ ����� �ȵǴ� �� ��

--q3
select empno,ename,hiredate,
to_char(next_day(add_months(hiredate,3),2),'YYYY-MM-DD') as r_job,
--hiredate�� 90�� ���ϴ� �� �������� 3���� ��ĥ������ �� �� ����
NVL(to_char(comm),'N/A') from emp;
--q4
select empno,ename,mgr,
case
when mgr is null then 0000
when mgr between 7500 and 7599 then 5555
when mgr between 7600 and 7699 then 6666
when mgr between 7700 and 7799 then 7777
when mgr between 7800 and 7899 then 8888
else mgr
end as CHG_MGR
from emp1;

--p94 5-1
select * from emp;
--p94 5-2
select * from emp where deptno=30;
--p97 5-3
select * from emp where deptno=30 and job='SALESMAN';
--p98 5-4
select * from emp where deptno=30 or job='CLERK';
--p101 5-5
select * from emp where sal*12=36000;
--p102 5-6
select * from emp where sal>= 3000;
--p102 5-7 
select * from emp where ename>='F';
--p103 5-8
select * from emp where ename<= 'FORZ';
--p104 5-9
select * from emp where sal != 3000;
--p104 5-10
select * from emp where sal<>3000;
--p104 5-11
select * from emp where sal^=3000;
--p105 5-12
select * from emp where not sal = 3000;
--p106 5-13
select * from emp where job ='MANAGER'or
job='SALESMAN' or job='CLERK';

