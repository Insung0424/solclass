package SolDesk;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

//class Parent{
//	void a() {
//		pa();
//	}
//	void pa() {
//		pa();
//		System.out.println("Parent");
//	}
//}
//class Child extends Parent{
//	void a() {
//		super.a();
//	}
//	void pa() {
//		System.out.println("Child");
//	}
//}
//class Food{
//	void eat() {
//		System.out.println("eat");
//	}
//}
//class Noodle extends Food{
//	void eat() {
//		System.out.println("Noodle");
//	}
//}
//class friedRice extends Food{
//	void eat() {
//		System.out.println("friedRice");
//	}
//}
//class Egg extends Food{
//	void eat() {
//		System.out.println("egg");
//	}
//}
//class Parent{
//	int n;
//	void a() {
//		pa();
//	}
//	void pa() {
//		System.out.println(n);
//	}
//}
//class Child extends Parent{
//	int n;
//	
//	void pa() {
//		n=20;
//		super.n=39;	  //�������ε�
//		super.pa();   //�������ε�
//		System.out.println(n);
//	}
//}
//abstract class A{
//	abstract public void show();
//	void pr() {
//		show();
//	}
//}
//class B extends A{
//	int r;
//	B(int r){
//		this.r=r;
//	}
//	int get() {
//		return r;
//	}
//	public void show() {
//		System.out.println(r);
//	}
//}

//class St implements Serializable{
//	private String name;
//	private String major;
//	private int age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getMajor() {
//		return major;
//	}
//	public void setMajor(String major) {
//		this.major = major;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//		
//}

//abstract class Circle{
//	protected double r;
//	Circle(double r){
//		this.r = r;
//	}
//	abstract double get();
//}
//class Cir extends Circle{
//	Cir(double r){
//		super(r);
//	}
//	double get() {
//		return r;
//	}
//}
public class Classfourteen {
	
//	static void pr(Food f) {
//		f.eat();
//	}
	
//	static void show(Person p) {
//	if(p instanceof Person) {
//		System.out.println("person");
//	}
//	if(p instanceof Student) {
//		System.out.println("Student");
//	}
//	if(p instanceof Worker) {
//		System.out.println("Worker");
//	}
//	if(p instanceof ITWorker) {
//		System.out.println("ITWorker");
//	}
//}

	public static void main(String[] args) throws IOException {
//		Parent c=new Child();
//		c.a(); //Child 
////		��ĳ���õ��Ŀ��� �����ǵȸ޼ҵ尡�ִٸ� �ش�޼ҵ尡 ����
		
//		Noodle N=new Noodle();
//		pr(N); // Food f = new Noodel(); upcasting
		//�������ε�(dynamic binding)
		/* ������ �޼ҵ带 �������� �� �������� �ʰ�
		 * �����(run time) �����ϴ� ��
		 * �ڹٿ����� ���� ���ε��� ���� 
		 * �������̵��� �޼ҵ尡 �׻� ����ǵ��� ������
		 * 
		 * �������ε��� ���� ��� �ڽ� Ŭ������ �������̵���
		 * �޼ҵ尡 ȣ���
		 * 
		 * �θ�Ŭ������ �޼ҵ带 �� �̻� ����� �� ���°��� �ƴ�
		 * superŰ���带 �̿� �������ε��� �Ͽ� 
		 * �θ�Ŭ������ ����� ������ �����ϴ�
		 */
		
		/*
		 * �޼ҵ� �����ε�
		 * ���� Ŭ������ ��Ӱ��迡�� ������ �̸��� �޼ҵ带
		 * �ߺ� �ۼ�
		 * �̸��� ���� �������� �޼ҵ带 �ߺ� �����Ͽ�
		 * ��� ���� ���
		 * �޼ҵ� �̸��� �ݵ�� �����ؾ��ϸ�
		 * �޼ҵ��� �Ű������� ����,Ÿ���� �޶�� �����ȴ�
		 * �������ε��̸�, ������ �ÿ� �ߺ��� �޼ҵ� ��
		 * ȣ��Ǵ� �޼ҵ带 �����Ѵ�
		 * 
		 * �޼ҵ� �������̵�
		 * ����Ŭ������ ����Ŭ������ �̷���� ��Ӱ��迩����
		 * ����Ŭ�������� ����Ŭ������ �ִ� �޼ҵ��
		 * ������ �̸��� �޼ҵ带 ���ۼ��ϴ°�
		 * ����Ŭ������ ������ �޼ҵ带 �����ϰ� ����Ŭ��������
		 * ���ο� ����� �޼ҵ带 �������Ѵ�
		 * �޼ҵ��̸�,�Ű�����Ÿ��,����,����Ÿ���� ��� �����ؾ���
		 * �������ε��̸�,����ð��� �������̵��ȸ޼ҵ带 ã�� ȣ��
		 * program run - method call - get method address
		 * - method run
		 */
		
//		Parent c=new Child(); //up
//		c.a();
		
//		B b=new B(5);
//		b.pr();
		
//		ObjectOutputStream os = null;
//		try {
//			os = new ObjectOutputStream(new FileOutputStream("ob.txt"));
//			St s = new St();
//			s.setName("Bob");
//			s.setMajor("math");
//			s.setAge(50);
//			os.writeObject(s);
//		}catch(Exception e) {}
//		os.close();
//		ObjectInputStream oin = null;
//		try {
//			oin = new ObjectInputStream(new FileInputStream("ob.txt"));
//			St s = (St) oin.readObject();
//			System.out.println(s.getName());
//			System.out.println(s.getMajor());
//			System.out.println(s.getAge());
//		}catch(Exception e) {}
//		oin.close();
		
//		Circle c[] = new Circle[5];//��ü�迭����
//		Scanner sc =new Scanner(System.in);
//		for(int i=0;i<c.length;i++) {
//			double r =sc.nextDouble();
//			c[i] = new Cir(r);//��ü���� upcasting
//			System.out.println(c[i].get());
//		}
		
//		int arr1[] = {1,2,3,4};
//		int arr2[] = {5,6,7,8};
//		int arr3[] = Arr.con(arr1,arr2);
//		Arr.pr(arr3);
		
//		show(new Student());
//		System.out.println();
//		show(new Worker());
//		System.out.println();
//		show(new ITWorker());
		
//		1
//		Tv t = new Tv("samsung",2022,20);
//		t.show();
//		2
//		int math=0,eng=0,com=0;
//		Score s = new Score(math,eng,com);
//		System.out.println("����� "+s.avg());
		
//		3
//		Scanner sc = new Scanner(System.in);
//		Circle c[] =new Circle[5];
//		for(int i=0;i<c.length;i++) {
//			System.out.println((i+1)+"�� ���� ������ũ�� �Է�");
//			double r=sc.nextDouble();
//			c[i] = new Circle(r);
//		}
//		double sum=0;
//		for(int i=0;i<c.length;i++) {
//			sum += c[i].area();
//		}
//		System.out.println("5�� ���� ���� ���� " + sum);
		
//		4
//		XY x = new XY();
//		x.set(1, 2);
//		x.show(); // 1,2 ���
//		XYZ xy = new XYZ();
//		xy.set(4, 5);
//		xy.color("blue");
//		xy.show(); // 4,5,blue ��� 
		
//		5
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�޼�");
//		String I = sc.next();
//		System.out.println("������");
//		String You = sc.next();
//		System.out.println("�޼��� ����: "+I);
//		System.out.println("�������� ����: "+You);
//		if(I.equals("����")) {
//			if(You.equals("����")) {
//				System.out.println("����");
//			}
//			else if(You.equals("����")) {
//				System.out.println("�������� �̰��");
//			}
//			else if(You.equals("��")) {
//				System.out.println("�޼��� �̰��");
//			}
//			else {
//				System.out.println("�߸��Ȱ��� �Է��߽��ϴ�");
//			}
//		}
//		else if(I.equals("����")) {
//			if(You.equals("����")) {
//				System.out.println("����");
//			}
//			else if(You.equals("����")) {
//				System.out.println("�޼��� �̰��");
//			}
//			else if(You.equals("��")) {
//				System.out.println("�������� �̰��");
//			}
//			else {
//				System.out.println("�߸��Ȱ��� �Է��߽��ϴ�");
//			}		
//		}
//		else if(I.equals("��")) {
//			if(You.equals("��")) {
//				System.out.println("����");
//			}
//			else if(You.equals("����")) {
//				System.out.println("�������� �̰��");
//			}
//			else if(You.equals("����")) {
//				System.out.println("�޼��� �̰��");
//			}
//			else {
//				System.out.println("�߸��Ȱ��� �Է��߽��ϴ�");
//			}		
//		}
//		else {
//			System.out.println("�߸��Ȱ��� �Է��߽��ϴ�");
//		}
		
//		6
//		Scanner sc = new Scanner(System.in);
//		int a[] = new int [10];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		int bin;
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					bin = a[j];
//					a[j] = a[i];
//					a[i] = bin;
//				}
//			}
//		}
//		for(int i : a) {
//			System.out.print(i + " ");
//		}
		/*
		 * �ڹٴ� ���߻���� �Ұ����ϴ�
		 * �������̽��� ���� ���߻���� ����
		 * 
		 * �������̽� - �ٸ� Ŭ������ �ۼ��� �� �⺻�� �Ǵ� Ʋ�� ����
		 * �ٸ�Ŭ���� ������ �߰��Ű����� ����ϴ� �߻�Ŭ����
		 */
		
//		Add a=new Add();
//		System.out.println(a.add(1, 4));
//		System.out.println(a.add(10));

//		A a=new A();
//		a.bear();
//		a.swim();
	}
}

//interface Animal {
//	void bear();
//}
//interface Fish {
//	public void swim();
//}
//class A implements Animal,Fish{ //���߻��
//	public void bear() {
//		System.out.println("���´�");
//	}
//	public void swim() {
//		System.out.println("�����Ѵ�");
//	}
//}
//interface Addin{
//	public int add(int a,int b);
//	public int add(int a);
//	
//	default void pr() { //java8�� �߰��� ����Ʈ�޼ҵ�
//		System.out.println("hehe");
//	}
////	default��� ���� ���������� �߻�޼ҵ�� �ν��Ѵ�
//}
//class Add implements Addin{
//	public int add (int a,int b) {
//		return a+b;
//	}
//	public int add(int a) {
//		int sum=0;
//		for(int i=1;i<=a;i++) {
//			sum+=i;
//		}
//		return sum;
//	}
//}
//interface Food{
//	int price=30000;
//	void eat();
//}
//class Pizza implements Food{
//	public void eat() {
//		System.out.println("pizza");
//	}
//}

//class XY {
//	int x, y;
//	void set(int i, int j) {
//		this.x = i;
//		this.y = j;
//	}
//	void show() {
//		System.out.println(x + "," + y);
//	}
//}
//class XYZ extends XY {
//	String color;
//	void color(String color) {
//		this.color = color;
//	}
//	void show() {
//		System.out.println(x + "," + y + "," + color);
//	}
//}
//class Circle {
//	private double r;
//	Circle(double r) {
//		this.r = r;
//	}
//	double area(){
//	return 3.14*r*r;
//	}
//}
//class Tv{
//	private String made;
//	private int year;
//	private int inch;
//	Tv(String made,int year,int inch){
//		this.made=made;
//		this.year=year;
//		this.inch=inch;
//	}
//	void show() {
//		System.out.println(year+"�⿡ "+made+"���� ���� "+inch+"��ġ Tv");
//	}
//}

//class Score{
//	private int math;
//	private int eng;
//	private int com;
//	Score(int math,int eng,int com){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����Է�");
//		math = sc.nextInt();
//		this.math = math;
//		System.out.println("�����Է�");
//		eng = sc.nextInt();
//		this.eng = eng;
//		System.out.println("�����Է�");
//		com = sc.nextInt();
//		this.com = com;
//	}
//	double avg() {
//		int sum = math+eng+com;
//		return sum/3.0;
//	}
//}
//class Person{}
//class Student extends Person{}
//class Worker extends Person{}
//class ITWorker extends Worker{}

//class Arr{
//	static int[] con(int a[],int b[]){
//		int c[]=new int [a.length+b.length];
//		for(int i=0;i<a.length;i++) {
//			c[i] = a[i]; // 1,2,3,4
//			for(int j=a.length;j<a.length+b.length;j++) {
//				c[j] = b[j-a.length];
//			}
//		}
//		return c;
//	}
//	static int[] con(int a1[],int a2[]){
//		int c[]=new int [a1.length+a2.length];
//		for(int i=0;i<a1.length;i++) {
//			c[i] = a1[i]; // 1,2,3,4
//			c[i+a1.length] = a2[i]; // 5,6,7,8
//		}
//		return c;
//	}
//	static void pr(int a[]) {
//		for(int i=0;i<a.length;i++)
//			System.out.print(a[i] + " ");
//	}
//}