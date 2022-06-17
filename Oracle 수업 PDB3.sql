select * from emp1,dept1 
where emp1.deptno = dept1.deptno 
order by empno; 

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

select * from student,enrol 
where student.stu_no = enrol.stu_no;

select student.stu_no,
--join���� ����� �����͸� ������ ���� ��ġ�� Ȯ���� �����ؾ���
stu_name,stu_dept,enr_grade 
from student,enrol 
where student.stu_no = enrol.stu_no;

select stu_no,stu_name,stu_dept,enr_grade
from student natural join enrol;

select empno,ename,job,mgr,hiredate,sal,comm,
deptno,dname,loc from emp natural join dept
order by deptno,empno;

select stu_no,stu_name,stu_dept,enr_grade
from student join enrol using(stu_no);
--����� �κ��� using()�� ���ʿ� �ۼ��ϸ� �ȴ�.2�� �̻� ����

select student.stu_no,stu_name,stu_dept,enr_grade
from student join enrol on student.stu_no=enrol.stu_no;
--����where���� �ۼ��ϴ� ���ǽ��� on �ڿ� �ۼ��ϴ� ���

select * from student natural join enrol;

select sub_name,stu_no,enr_grade 
from subject natural join enrol;

select sub_name,stu_no,enr_grade from subject
join enrol using(sub_no);

--���������� 70�̻��� �л��� �̸� equi join
select stu_name,enr_grade from student,enrol 
where student.stu_no=enrol.stu_no and enr_grade>=70;

--���������� 60�̻��� �л��� �̸� join using
select stu_name,enr_grade from student 
join enrol using(stu_no) where enr_grade>=60;

--���������� 70������ �л��� �̸� natural join
select stu_name,enr_grade from student natural join enrol
where enr_grade<=70;

--������ �������� ������ ��� �л��� �̸� equi join
select stu_name from subject,student,enrol
where sub_prof='������' and 
subject.sub_no=enrol.sub_no and
enrol.stu_no=student.stu_no;

--��ǻ�Ͱ��� �����ϴ� �л��� �й�, �̸� equi join
select student.stu_no,stu_name from subject,student,enrol
where sub_name='��ǻ�Ͱ���' and 
subject.sub_no=enrol.sub_no and
enrol.stu_no=student.stu_no;
--stu_no �� �ߺ��ǹǷ� �������� �Ѵ�

--21. ����̸��� 15�ڸ��� �ϰ�, �ڿ� ��&����ä�� �˻��϶�.
select rpad(ename,15,'&') from emp1; 
--22. ��������� 20�ڸ��� �ϰ�, �տ� ��%����ä�� �˻��϶�.
select lpad(job,20,'%') from emp1;
--23. ����� �����ȣ, ����̸�, �޿��� �˻��϶�.(�޿��µι�° �ڸ����� �ݿø���)
select empno,ename,round(sal,-2) from emp1;
--24. ����� �����ȣ, ����̸�, �޿��� �˻��϶�.(�޿��µι�° �ڸ����� ������)
select empno,ename,trunc(sal,-2) from emp1;
--25. �����ȣ�ͱ޿��� 100���� ���� �������� �˻��϶�.
select empno,mod(sal/100) from emp1;
--26. �����ȣ, ����̸�, �Ի���, �Ի��� 100���� ��¥�� �˻��϶�.
select empno,ename,hiredate,
hiredate+100 from emp1;
--27. �����ȣ,  ����̸�, �Ի���, �ٹ� ���ڸ� ����Ͽ� �˻��϶�.
select empno,ename,hiredate,trunc(sysdate - hiredate,0)
from emp1;
--28. ������� �Ի��Ͽ��� 3��° �Ǵ� ��¥�� �˻��϶�.
select hiredate,add_months(hiredate,3) from emp1;
--29. ������� �Ի��ϴ��� ������� ��¥�� �˻��϶�.
select hiredate,next_day(hiredate,7) from emp1;
select hiredate,next_day(hiredate,'��') from emp1;
--30. ������� �Ի���Ǹ����� ��¥�� �˻��϶�. 
select hiredate,last_day(hiredate) from emp1;
--31 �μ��� ��� �޿� 
select deptno,avg(sal) from emp1 group by deptno;
--32 �μ��� ����� �޿��� ǥ������
select deptno,stddev(sal) from emp1 group by deptno;
--33 �μ��� ������ ��� �޿��� ��
select deptno,job,count(*),sum(sal) from emp1 group by deptno,job;
--34 �μ��� ������ ��ձ޿�
select deptno,job,count(*),avg(sal) from emp1 group by deptno,job;
--35 �μ��� ������ �Ի����� max,min 
select deptno,job,max(hiredate),
min(hiredate) from emp1 group by deptno,job;

--36. �μ��� ������� �ο����� �ο����� ���� ������ �˻��϶�.
select deptno,count(*) from emp1 
group by deptno
order by count(*) desc;
--37. �μ��� ����������  �޿��� ��� �޿� ������ �˻��϶�.
select deptno,avg(sal) from emp1
group by deptno 
order by avg(sal);
--38. �μ���, ��������� ����� �޿� ���� ���� ������ �˻��϶�.
select deptno,job,count(*)as �ش�μ����������ο�,sum(sal) as �޿��հ� from emp1 
group by deptno,job
order by �޿��հ� desc;
--39. �μ���, ��������� ������� ��� �޿��� ��� �޿��� ���� ������ �˻��϶�.
select deptno,job,avg(sal) from emp1
group by deptno,job
order by avg(sal) desc;
--40. ������� �Ի����� ���� �������� �ݿø��Ͽ� �˻��϶�.
select round(hiredate,'year') from emp1;
--41. ������� �Ի����� ���� �������� �����Ͽ� �˻��϶�.
select trunc(hiredate,'year') from emp1;
select ename, to_char(trunc(hiredate, 'y'), 'yyyy') 
from emp1 order by 2;
--42. ����ڻ����ȣ(mgr)�� ���� ����� ��� ������� �������� ��Ÿ������ �ϴ� ���ǹ��� �ۼ��ض�.
select nvl(to_char(mgr),'����ھ���')as ��������� from emp1;
--43 ����� �޿��� �հ� ���,�̸� 
select empno,ename,sal+nvl(comm,0) from emp1;
--44 ������ ������ ������ ���,�̸�
select empno,ename,
nvl(comm+sal*12,sal*12) as ����������out from emp1;
--101�� ������ �����ϴ� �л��� �й�
select student.stu_no,stu_name from student,enrol
where student.stu_no = enrol.stu_no and
sub_no=101;

--101�� �Ǵ� 102�� ������ �����ϴ� �л��� �й�
select student.stu_no,stu_name from student,enrol
where student.stu_no = enrol.stu_no and
sub_no = 101 or sub_no = 102;
-- and �����ڰ� or�����ں��� �켱������ ���Ƽ� ����� �߸����´�
-- ��ȣ�� ����ؼ� ����ϰų�
-- sub_no in (101,102);�� �������
-- �߰������� �������� ��� ���������� �ٸ� ��� ���
select stu_no,stu_name 
from student natural join enrol
where sub_no = 101 or sub_no = 102;
select stu_no,stu_name 
from student join enrol using(stu_no)
where sub_no = 101 or sub_no = 102;

select enr_grade,stu_name 
from student,enrol
where enr_grade between 80 and 90;

select * from emp1 natural join dept1;

--51. ��� ���̺�� �μ� ���̺��� natural join�ض�.
select * from emp1 natural join dept1; 
--52. �����ȣ, ����̸�, �μ��̸��� �˻��϶�.(equi)
select empno,ename,dname from emp1,dept1
where emp1.deptno = dept1.deptno;
--53. �����ȣ, ����̸�, �μ��̸��� �˻��϶�.(natural)
select empno,ename,dname from emp1 natural join dept1;
--54. �����ȣ, ����̸�, �μ��̸��� �˻��϶�.(join~using)
select empno,ename,dname from emp1 join dept1 using(deptno);
--55. ������ NEW YORK�� ����̸��� �˻��϶�.(equi)
select ename,loc from emp1,dept1 
where emp1.deptno = dept1.deptno and loc='NEW YORK';

--1. ADAMS����� �ٹ� ���� �μ��̸��� �������˻��϶�.(equi join)
select ename,dname,loc from dept1,emp1 
where dept1.deptno = emp1.deptno and ename='ADAMS';
--2. �޿��� 2000�̻��� ������� ������ �������˻��϶�. (natural join)
select ename,loc,sal from emp1 natural join dept1
where sal>=2000;
--3. 2����equi join���� �ٲ��.
select ename,loc,sal from emp1,dept1
where emp1.deptno = dept1.deptno and sal>=2000;
--4. �޿��� 1000 �̻� 2000 ������ ������� �����ȣ, ����̸�, 
--�μ��̸��� �����ȣ������ �˻��϶�. (join using)
select empno,ename,dname,sal 
from emp1 join dept1 using (deptno)
where sal between 1000 and 2000
order by empno;
--5. ��������� SALESMAN�̸鼭 CHICAGO ������ �ٹ� ���� 
--������� �˻��϶�.
select ename,job,loc from emp1 natural join dept1
where job in('SALESMAN') and loc like 'C%';
--6. NEW YORK�̳� DALLAS ������ �ٹ��ϴ� ������� �����ȣ�� 
--����̸��� �����ȣ ������ �˻��϶�. (equi join)
select empno,ename,loc from emp1,dept1
where emp1.deptno = dept1.deptno and
loc in('NEW YORK','DALLAS')
order by empno;
--7. �μ��̸��� ACCOUNTING�̰ų�, ������ CHICAGO�� ����� 
--�����ȣ�� ����̸��� �˻��϶�. (equi join)
select empno,ename,dname,loc from emp1,dept1
where emp1.deptno = dept1.deptno and
(dname = 'ACCOUNTING' or loc = 'CHICAGO');
--8. NEW YORK�̳� DALLAS ������ �ٹ��ϴ� ������� �����ȣ�� 
--����̸��� �����ȣ ������ �˻��϶�. (natural join)
select empno,ename,dname,loc 
from emp1 natural join dept1
where loc in('NEW YORK','DALLAS')
order by empno;

select e1.empno as �����ȣ,e1.ename as ����̸�,
e2.empno as ����ڻ����ȣ,e2.ename as ������̸�
from emp1 e1,emp1 e2
where e1.mgr = e2.empno;

select a.*,sub_name from enrol a,subject b
where a.sub_no=b.sub_no order by 1;

--�������̺� ����� (�ܺ�����)
select a.*,sub_name from enrol a 
right outer join subject b
on a.sub_no = b.sub_no
order by 1; -- a �� * �� 1�� �ʵ��̹Ƿ� enrol�� 1���� �����̵�

select a.*,sub_name from enrol a 
left outer join subject b
on a.sub_no = b.sub_no
order by 1; 
--null���� �ȶߴ� ����:������ b�� �ǹǷ� ��� ������ ������

--������ ���� Ű�� ū �л����� �й� , Ű ,�̸�
select stu_no,stu_name,stu_height from student
where stu_height > 172;
select stu_no,stu_name,stu_height from student where stu_height 
> (select stu_height from student where stu_name = '������');

--����ö�̶� ���� �����Ը� ������ �ִ� �л��� ��� ����
select * from student where stu_weight = 
(select stu_weight from student where stu_name = '����ö')
--����ö�̶� ���� �����Ը� ������ �ִ� �л�
and stu_name<> '����ö';
--����ö�� ����

--Ű�� ��ü �л����� ���Ű���� ū �л�
select * from student where stu_height > 
(select avg(stu_height) from student); 

select * from student where stu_class 
in(select stu_class from student where stu_dept='��ǻ������')
--��ǻ�������� ���� �л����� ��
and stu_dept<> '��ǻ������'; 
--��ǻ���������� ������

--9. BLAKE ������� ���� �޿��� �޴� ����̸����˻��϶�. (������)
select ename,sal from emp1
where sal > (select sal from emp1 where ename='BLAKE');
--10. FORD ����� ���� �μ��� �ٹ��ϴ� ����̸��� �˻��϶�. (������)
select ename,deptno from emp1 where deptno = 
(select deptno from emp1 where ename in 'FORD')
and ename<>'FORD';

select empno,rpad(substr(ename,1,2),length(ename),'*')
from emp;


--239 q1 sql99before,after
select deptno,dname,empno,ename,sal 
from emp, dept
where emp.deptno = dept.deptno;

select deptno,dname,empno,ename,sal 
from emp natural join dept;

--q2 sql99before,after
select dept.deptno,dept.dname,avg(sal),max(sal),min(sal),count(*)
from emp,dept
where emp.deptno = dept.deptno
group by dept.deptno,dept.dname;

select deptno,dname,trunc(avg(sal)),max(sal),min(sal),count(*)
from emp natural join dept
group by deptno,dname;
--q3 sql99before,after
select dept.deptno,dept.dname,
emp.empno,emp.ename,emp.job,emp.sal from emp,dept
where emp.deptno=dept.deptno
order by emp.deptno,emp.ename;

select deptno,dname,
empno,ename,job,sal 
from emp join dept using(deptno)
order by deptno,ename;

--q4 sql99before,after
select d.deptno,d.dname,
e.empno,e.ename,e.mgr,e.sal,e.deptno,
s.losal,s.hisal,s.grade,
e1.empno as mgr_empno,e1.ename as mgr_ename 
from emp e,dept d,salgrade s,emp e1
where e.deptno(+) = d.deptno and
(e.sal between s.losal(+) and s.hisal(+))
and e.mgr = e1.empno(+)
order by e.deptno,e.empno; 

select d.deptno,d.dname,
e.empno,e.ename,e.mgr,e.sal,e.deptno,
s.losal,s.hisal,s.grade,
e1.empno as mgr_empno,e1.ename as mgr_ename 
from emp e right outer join dept d
on(e.deptno = d.deptno)
left outer join salgrade s
on(e.sal between s.losal and s.hisal)
left outer join emp e1
on(e.mgr = e1.empno)
order by e.deptno,e.empno;
