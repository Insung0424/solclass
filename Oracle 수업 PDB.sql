select * from student; -- studnet �� ��� ����
select * from subject;
select * from enrol;

select stu_name,stu_dept from student 
where stu_dept = '��ǻ������';  
--�л����̺��� ��ǻ�� ���� �а� �л��� �̸�,�а�

select * from student
where stu_weight between 60 and 70; 
--�л����̺��� �����԰� 60~70�� �л��� ��� ����

select stu_name from student
where stu_name like '��%';
--�л����̺��� �达���� ���� �л��� �̸�

select enr_grade,enr_grade+10 from enrol;
--���ĵ� �����ϸ� ��Ī�� ���鶧�� as '��Ī'�� �ƴ� as ��Ī �̴� 
             
select stu_name as name from student;
--�л����̺��� �л��� �̸��� name�̶�� ����̸� ����� ���

select stu_height from student 
where stu_height is null; -- �л����̺��� Ű�� null �� �л�

select stu_height from student 
where stu_height is not null; -- ���� �ݴ�

select stu_height/100 as m from student;
--�л����̺��� Ű�� 100���� ������ ���

select stu_no,stu_name,stu_dept from student
where stu_dept in('���','��ǻ������');
--in() ������ ������ ���ϴ� ������ ���� (OR �� ���)
--������ ���� �� �� �ϳ��� �����ϴ� �� ó���� ��� ���


--16. �л����� �а�, �г� �ߺ��� �����ϰ� �˻��϶�.
select DISTINCT
stu_dept, stu_grade from student;

--17. �л����� �а�, �� �ߺ��� �����ϰ� �˻��϶�.
select DISTINCT stu_dept,stu_class from student;

--18. �л����� ü���� 5��ŭ ������Ų ���� �˻��϶�.
select stu_weight+5 as �������÷��� from student;

--19. �л����� ü���� 5��ŭ ���ҽ�Ų ���� �˻��϶�.
select stu_weight-5 from student;

--20. �л����� �й��� �̸��� ��Ī "�й�", "�̸�"���� �ο��Ͽ� �˻��϶�.
select stu_no as �й� ,stu_name as �̸� from student;

--21. ����(enrol)���̺��� ��� ������ �˻��϶�.
select * from enrol;

--22. �л� ���̺��� �а���� �̸��� ���ļ� �˻��϶�.(||)
select stu_dept || stu_name from student;

--23. �л��� �̸��� �а��� '��ǻ�������� ���Ѻ��Դϴ�'������ �˻��϶�.
select stu_dept ||'�� ' || stu_name|| '�Դϴ�' 
from student;

--24. ��ǻ������ �л����� �˻��϶�.
select * from student 
where stu_dept = '��ǻ������';

--25. ���� �л����� �˻��϶�.
select * from student 
where stu_dept = '���';
select stu_name from student where stu_dept in('���');

select * from student where stu_dept not in'���';--�������
select * from student where stu_dept<>'���';
--������ ������ �л����� ��� ����


--26. �������ڰ� �л����� �˻��϶�.
select * from student where stu_dept in'��������';

--27. ������ 170�̻��� �л����� �˻��϶�.
select stu_name,stu_height from student
where stu_height>=170;

--28. ü���� 65�̻��� �л����� �˻��϶�.
select stu_name,stu_weight from student
where stu_weight>=65;

--29. ��� �л����� �й�, �̸��� �˻��϶�.
select stu_no,stu_name from student
where stu_dept in '���';

--30. ��ǻ������ �л����� �й�, �̸��� �˻��϶�.
select stu_no,stu_name from student
where stu_dept in '��ǻ������';

--31. ���л��� �̸��� �˻��϶�.
select stu_name,stu_gender from student 
where stu_gender in 'm';

--32. �������ڰ� �̿� �л����� ��� ������ �˻��϶�.
select * from student where stu_dept<>'��������';

--33. ������ 80�� �̻��� �л����� �й��� �˻��϶�.
select stu_no,enr_grade from enrol where enr_grade>=80;

--34. '������'�л��� ��� ������ �˻��϶�.
select * from student where stu_name='������';

--35. '���'�� �̰� 2�г��� �л����� ��� ������ �˻��϶�. 
select * from student where stu_grade=2 and stu_dept in '���';

--36. ������ ���л��̸�, ü���� 60������ �л��� ��� �˻��϶�.
select * from student where stu_gender = 'f' 
and stu_weight<=60;

--37.'��ǻ������'�ܿ� 1�г� �л����� �̸��� �˻��϶�.
select stu_name,stu_dept,stu_grade from student 
where stu_dept not in '��ǻ������' and stu_grade = 1;

--38. �а� �� '���'�̿��� �а��� �˻��϶�.
select * from subject where sub_dept not in '���';

--39. ��ǻ�������� 2�г� A�� �л��� �̸��� �˻��϶�.
select stu_name from student 
where stu_dept='��ǻ������' and stu_grade = 2 and stu_class in 'a';

--40. ������ 160�̻��̸� 170������ �л��� �й��� �̸��� �˻��϶�
select stu_no,stu_name,stu_height from student
where stu_height between 160 and 170;

select stu_no,stu_name from student order by stu_no; --����
select stu_no,stu_name from student order by stu_no desc;
--�������� ū���� ���� ��µ�

select stu_no,stu_name,stu_dept,stu_weight*1 as wei
from student order by wei;
--from student order by 4; ���� ��� (���� ������ȣ �̿밡��)

select stu_no,stu_name,stu_dept,stu_weight*1 as wei
from student order by stu_dept,wei;
-- stu_dept �� �������� ���ĵǸ� �� �ȿ��� wei�� �ٽ�����

select stu_no,stu_name,stu_dept,stu_weight*1 as wei
from student order by stu_dept, wei desc;
-- stu_dept �� �������� ���ĵǸ� �� �ȿ��� wei�� �ٽó�����������

select round(345.678,1)
from dual;--(dual) �̶�� ���̺��� ����Ŭ�� �����ϸ� 
--round�Լ�(�ݿø�)�̴� (n, m) m:�Ҽ��� ��Ÿ�� ��ġ

select round(345.678,-1)
from dual; -- 350�� ���� 1�� �ڸ����� �ݿø��� ����Ǳ⶧��

select trunc(123.456,2) from dual;
-- 123.45 (n,m) n�� �Ҽ��� m�ڸ������� ������ ����

select mod(10,4) from dual; -- 2 ������ ���ϱ�

select upper('korea') from dual; -- �빮�ڷ� ��ȯ

select initcap('korea') from dual; -- ù���ڸ� �빮�ں�ȯ

select concat('ja','va') from dual; -- concat

select substr('java',2,3) from dual;
-- 2��° ���ں��� 3���ڸ� ��ȯ
--select substr('something',n,m) from dual;
--something �� n ��° ���ں��� m ���ڱ��� ��ŭ ��ȯ

select stu_no,stu_name,stu_dept from student
where stu_no like '___3%'; --2013�й��� �й�,�̸�,�а�

select * from student where stu_grade<>2;
select * from student where stu_grade not in 2;
-- 1,3�г��� ������� �˻�

select stu_no,stu_name from student
where stu_name like '��__';
-- �达 ���� ���� �л��� �й��� �̸�

select stu_name from student
where stu_name like '%��%';
--�̸��� ���ڰ� ���� �л�

select stu_name,stu_height from student
where stu_height is null; --������ null ���� �л�

select stu_no,stu_name,stu_dept from student
where stu_dept not in '��������';
--�а��� ��ǻ�� ���� or ��谡 �ƴ� �л�

select stu_no,stu_name,stu_dept,stu_gender,stu_grade from student
where stu_gender = 'm' OR stu_grade = '1';
--������ �����̰ų� 1�г��� �л��� ����

select stu_no,stu_name from student
order by stu_no; --�л����� �й��� �̸��� �й� ������ ����

select stu_no,stu_name,stu_dept from student
order by stu_dept; --�л����� �й�,�̸�,�а��� �а� �̸�������

select * from student
order by stu_dept desc,stu_grade;
--�л����� ������ �а��������� �г� �������� ����

select sysdate from dual; -- ���ó�¥ ��ȯ
select next_day(sysdate,2) from dual;
-- ���� �������� ��¥ ��ȯ

select stu_name, length(stu_name) from student;
--�л��̸��� ���� 

select stu_dept,length(stu_dept) from student;
--�л����� �а��� �а����� ����

select stu_name,instr(stu_name,'��') from student;
--�л����� �̸��� ���� ���°�� �ִ��� �˻�

select rpad(stu_name,15,'&') from student;
--�л��� �̸��� 15�ڸ��� �ϰ� �����ʰ����� & �� ä���
--���¿�&&&&&&&&& �� ��� �ѱ��� 2����Ʈ�̹Ƿ�  & 9�� 

select lpad(stu_name,20,'%') from student;
--%%%%%%%%%%%%%%������ lpad �������� ä��


CREATE TABLE EMP
       (EMPNO NUMBER(4) NOT NULL,
        ENAME VARCHAR2(10),
        JOB VARCHAR2(9),
        MGR NUMBER(4),
        HIREDATE DATE,
        SAL NUMBER(7, 2),
        COMM NUMBER(7, 2),
        DEPTNO NUMBER(2));

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'81-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'81-05-01',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'81-05-09',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'81-04-01',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'81-09-10',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'81-02-11',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'81-08-21',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'81-12-11',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'81-02-23',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'81-12-11',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'80-12-09',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'82-12-22',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'83-01-15',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'82-01-11',1300,NULL,10);

CREATE TABLE DEPT
       (DEPTNO NUMBER(2),
        DNAME VARCHAR2(14),
        LOC VARCHAR2(13) );

INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');

CREATE TABLE SALGRADE
        (GRADE NUMBER,
         LOSAL NUMBER,
         HISAL NUMBER);

INSERT INTO SALGRADE VALUES (1,  700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

desc emp;
desc dept;
desc SALGRADE;

select * from emp;
select * from dept;
select * from SALGRADE;

select distinct deptno from emp;

--p73
desc emp; --emp���̺��� ����

--p74
desc dept; --dept ����

--p75
desc salgrade; --salgrade ����

--p80
select * from emp; --emp���̺��� ��� ����

--p81
select empno,ename,deptno from emp; 
--emp���̺��� empno,ename,deptno ����

--p82
select distinct deptno from emp;
--emp���̺��� �ߺ��� �μ���ȣ ����

--p83
select distinct job,deptno from emp;
-- �ߺ��� ��������,�μ���ȣ 
select all job,deptno from emp;
-- �ߺ����� ���� ���ް� �μ���ȣ

--p84
select ename,sal,sal*12+comm,comm from emp;
--�̸��� �޿�,�޿�*12+�߰�����,�߰����� 

--p85
select ename,sal,sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm,comm
from emp;
--���� 84�������� ����� ���� �� 

--p86
select ename,sal,sal*12+comm as annsal,comm from emp;
-- �̸�, �޿�, �޿�*12+���� -> ��Ī annsal , ���� 

--p88
select * from emp order by sal;
--emp ���̺��� ��� ������ �������� sal(�޿�)�� ������������

--p89
select * from emp order by sal desc;
--emp ���̺��� ��� ������ �������� sal(�޿�)�� ������������

--p91
select * from emp order by deptno asc,sal desc;
--emp ���̺��� ��� ������ �������� �켱 �μ���ȣ�� �������������ϰ�
--�׸��� ���� �μ���ȣ�� ������ sal(�޿�)�� �������������Ѵ�

 
--p81
select empno,deptno from emp;

--p90
select * from emp
order by empno desc;

--p92 q2
select distinct job from emp;
--p92 q3-1
select * from emp;
--p92 q3-2
select empno as EMPLOYEE_NO,ename as EMPLOYEE_NAME,
mgr as MANAGER, sal as SALARY, comm as COMMISSION,
deptno as DEPARTMENT_NO from emp;
--p92 q3-3
select empno as EMPLOYEE_NO,ename as EMPLOYEE_NAME,
mgr as MANAGER, sal as SALARY, comm as COMMISSION,
deptno as DEPARTMENT_NO from emp order by 6 desc,2;

--p125 q1
select * from emp where ename like '%S';
--p125 q2
select empno,ename,job,sal,deptno from emp
where deptno=30 and job='SALESMAN';
--p125 q3 not use union 
select empno,ename,job,sal,deptno from emp
where deptno not in 10 and sal>2000;
-- use union

--p126 q4
select * from emp where sal<2000 or sal>3000;

--p126 q5 
select ename,empno,sal,deptno from emp
where deptno in 30 and ename like'%E%' and 
sal not between 1000 and 2000;

--p126 q6
select * from emp 
where comm is null -- �߰������� ����
and job in('MANAGER','CLERK') -- ��å�� 'MANAGER','CLERK'�̸�
and mgr is not null -- ����ڰ� ����
and ename not like '_L%'; --�̸��� �ι�° ���ڰ� L�� �ƴ� ��� 

select empno,ename,
to_char(hiredate,'yyyy-mm-dd') as �Ի��� from emp;

select to_char(to_number(1234.5678),'9999.999')
from dual;

select empno,ename,
to_char(to_number(sal),'$999')sal
from emp;

select empno,ename,hiredate from emp 
where hiredate=to_date('1981-12-11','yy-mm--dd');

select empno,ename,
empno+'500' -- �ڵ� ����ȯ���� ���ؼ� ������ �̷������
from emp where ename = 'SCOTT';

select empno,to_char(to_number(empno+'100'))empno from emp;

select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') as ����ð�
from dual;

--p157 6-31
select empno,ename,empno+'500'
from emp where ename='SCOTT';
-- 6-32
select 'abcd' + empno,empno
from emp where ename='SCOTT';
--��ġ�� �������մϴ� 'abcd'�� �ڵ�����ȯ�Ҽ�����

--p159 6-33
select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') as ���糯¥�ð�
from dual;

-- 6-34
select sysdate,
to_char(sysdate, 'MM')as MM,
to_char(sysdate, 'MON')as MON,
to_char(sysdate, 'MONTH')as MONTH,
to_char(sysdate, 'DD')as DD,
to_char(sysdate, 'DY')as DY,
to_char(sysdate, 'DAY')as DAY
from dual;

--p160 6-35
select sysdate,
to_char(sysdate, 'MM') as MM,
to_char(sysdate, 'MON', 'nls_date_language = korean')as MON_KOR,
to_char(sysdate, 'MON', 'nls_date_language = japanese')as MON_JPN,
to_char(sysdate, 'MON', 'nls_date_language = english')as MON_ENG,
to_char(sysdate, 'MONTH', 'nls_date_language = korean')as MONTH_KOR,
to_char(sysdate, 'MONTH', 'nls_date_language = japanese')as MONTH_JPN,
to_char(sysdate, 'MONTH', 'nls_date_language = english')as MONTH_ENG
from dual;

-- 6-36
select sysdate,
to_char(sysdate, 'MM') as MM,
to_char(sysdate, 'DD') as DD,
to_char(sysdate, 'DY', 'nls_date_language = korean')as DY_KOR,
to_char(sysdate, 'DY', 'nls_date_language = japanese')as DY_JPN,
to_char(sysdate, 'DY', 'nls_date_language = english')as DY_ENG,
to_char(sysdate, 'DAY', 'nls_date_language = korean')as DAY_KOR,
to_char(sysdate, 'DAY', 'nls_date_language = japanese')as DAY_JPN,
to_char(sysdate, 'DAY', 'nls_date_language = english')as DAY_ENG
from dual;

-- p161 6-37
select sysdate,
to_char(sysdate, 'HH24:MI:SS') as HH24MISS,
to_char(sysdate, 'HH12:MI:SS AM') as HHMISS_AM,
to_char(sysdate, 'HH:MI:SS PM') as HHMISS_PM
from dual;

--p162 6-38
select sal, 
to_char(sal, '$999,999') as sal_$,
to_char(sal, 'L999,999') as sal_L,
to_char(sal, '999,999.00') as sal_1,
to_char(sal, '000,999,999.00') as sal_2,
to_char(sal, '000999999.99') as sal_3,
to_char(sal, '999,999,00') as sal_4 
from emp;

--p163 6-39
select 1300 - '1500','1300' + 1500
from dual;

-- 6-40
select '1,300' - '1,500' from dual; --��ġ�� �������մϴ�

--p164 6-41
select to_number('1,300','999,999')
- to_number('1,500','999,999') from dual;

-- 6-42
select to_date('2018-07-14', 'YYYY-MM-DD')as TODATE1,
to_date('20180714', 'YYYY-MM-DD')as TODATE2
from dual;

--p165 6-43
select * from emp
where hiredate > to_date('1981/06/01','YYYY/MM/DD');

-- 6-44
select to_date('49/12/10', 'YY/MM/DD')as YY_YEAR_49,
to_date('49/12/10', 'RR/MM/DD')as RR_YEAR_49,
to_date('50/12/10', 'YY/MM/DD')as YY_YEAR_50,
to_date('50/12/10', 'RR/MM/DD')as RR_YEAR_50,
to_date('51/12/10', 'YY/MM/DD')as YY_YEAR_51,
to_date('51/12/10', 'RR/MM/DD')as RR_YEAR_51
from dual;

