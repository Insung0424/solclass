package SolDesk;

import java.util.StringTokenizer;

//class Pizza implements Food{
//	public String name() { // �������̵�
//		return "Pizza";
//	}
//}
//class Steak implements Food{
//	public String name() { // �������̵�
//		return "Steak";
//	}
//}
//interface A{
//	public void funcA(); 
//}
//interface B{
//	public void funcB(); 
//}
//interface C extends A,B{
//	public void funcC(); 
//	//extends�� ����Ѵٸ� �߻�޼ҵ带 ����
//	//�Ϲ����� �޼ҵ�� �ȵ�
//	//�������̽� ���� ����� extends (implements�ƴ�)
//}
//class D implements C{
//	public void funcB() {
//		System.out.println("funcB");
//	}
//	public void funcA() {
//		System.out.println("funcA");
//	}
//	public void funcC() {
//		System.out.println("funcC");
//	}
//}

//class Tv{
//	public void on() {
//		System.out.println("Tv on");
//	}
//}
//interface Computer{
//	public void m(); //abstract method
//}
//class Com{
//	public void m() {
//		System.out.println("Com");
//	}
//}
//class Ipad extends Tv implements Computer{
//	Com c=new Com();
//	public void m() { //Computer
//		c.m(); //Com
//	}
//	public void ip() {
//		m(); //Com
//		on(); //Tv
//	}
//}
//interface IT{
//	public void java();
//}
//class Student{
//	public void study(IT it) {
//		//��üŬ������ �޼ҵ尡 �Ķ���͸� �������̽�IT�� ����
//		//�������̽���ü�� �ƹ��͵� �� �� ���� �������̽��� �����
//		//Ŭ������ �޼ҵ带 �����س� Ŭ������ ������
//		//�� Ŭ���������� �޼ҵ尡 �����
//		it.java();
//	}
//}
//class ITStudent implements IT{ 
//	//�������̽� IT�� �޾Ƽ� �׾��� �߻�޼ҵ� java�� ����
//	public void java() {
//		System.out.println("learn java");
//	}
//}
//class DBStudent implements IT{ 
//	//�������̽� IT�� �޾Ƽ� �׾��� �߻�޼ҵ� java�� ����
//	public void java() {
//		System.out.println("learn DB");
//	}
//}
//class In{
//	private int n;
//	In(int num){
//		n=num;
//	}
//	public String toString() {
//		return n+" , ";
//	}
//}
//class Po{
//	private int a,b;
//	Po(int n,int m){
//		a=n;
//		b=m;
//	}
//	void show() {
//		System.out.println(a+" "+b);
//	}
////	public String toString() {
////		return a+" "+b;
////	}
//	public boolean equals(Po p) {
//		if(a==p.a && b==p.b) {
//			return true;
//		}
//		else
//			return false;
//	}
//}
public class ClassFifteen {
//	static void pr(Food f) {
//		System.out.println(f.name());
//	}

	public static void main(String[] args) {
//		pr(new Pizza()); 
//		pr(new Steak());
		
//		D d1=new D();
//		A a1=d1; //upcasting
//		a1.funcA(); //ok
//		B b1=d1; //upcasting
//		b1.funcB(); //ok
//		C c1=d1; //upcasting
//		c1.funcA(); //ok
//		c1.funcB(); //ok
//		c1.funcC(); //ok
		//�������̽����� ��ä���� �Ұ����ϱ⶧����
		//��ӹ��� Ŭ���� D���� ��ü��������
		
//		Ipad i = new Ipad();
//		Tv t = i; // up
//		Computer c = i; // up
//		i.ip(); 
		
//		Student s=new Student();
//		ITStudent i=new ITStudent();
//		DBStudent d=new DBStudent();
//		s.study(i);
//		s.study(d);
		
//		In i = new In(4);
//		System.out.println(i);// toString�� ������ �ϱ���
//		//SolDesk.In@7d6f77cc �ν��Ͻ��� ����
		
//		Po p = new Po(3,4);
//		System.out.println(p.getClass().getName());
//						// ��ü�� Ŭ���� �̸� ���
//		System.out.println(p.hashCode()); // 16������
//		System.out.println(p.toString());
//		//toString ������ �� Ŭ������ + �ּҰ�
//		//toString ������ �� a+" "+b
//		Po q = new Po(2,3);
//		Po r = new Po(3,4);
//		if(p==q) {
//			System.out.println("p==q");
//		}
//		if(p.equals(q)) {
//			System.out.println("p and q are the equal");
//		}
//		if(p.equals(r)) {
//			System.out.println("p and r are the equal");
//		}
		
//		String a=new String("Java");
//		String a1=new String("Java");
//		String a2=a;
//		if(a==a1) {
//			System.out.println("A");
//		}
//		if(a==a2) {
//			System.out.println("B");
//		}
//		if(a.equals(a1)) {
//			System.out.println("C");
//		}
		
//		MyDog dog = new MyDog("�۸���","������");
//		System.out.println(dog);//������ �۸���
		
//		�⺻���� ��üȭ
//		Integer i = new Integer(10);//Integer i = 10;
//		Character c = new Character('c');
//		Boolean b = true;
//		Integer i1 = new Integer("10");
		
//		Integer i = new Integer(10);//boxing
//		int i1=i.intValue();//unboxing
//		Character c=new Character('a');//boxing
//		char c1=c.charValue();//unboxing
//		Boolean b=new Boolean(true);//boxing
//		boolean b1=b.booleanValue();//unboxing
//		//���ڿ��� �⺻Ÿ������ ��ȯ
//		int i2 = Integer.parseInt("123");
//		boolean b2=Boolean.parseBoolean("true");
//		double d2=Double.parseDouble("3.14");
//		// parse~ �� ��ȯ���� �⺻�ڷ���
//		int i3=Integer.valueOf("123");
//		int i4=Integer.valueOf("10")+Integer.valueOf("20");
//		// valueOf �� ��ȯ���� ��ü
//		String s=Integer.toString(123);
//		System.out.println(s);
//		Integer i11=100; // autoBoxing
//		int n1=i11+200; //i11�� ����� �� �ִ����� autoUnBoxing
		
////		1
//		Point p = new Point(3,4);
//		System.out.println(p);
//		
////		2
//		String n = "841111-1234560";
//		switch(n.charAt(7)) {
//			case '1':
//				System.out.println("male");
//				break;
//			case '2':
//				System.out.println("female");
//				break;
//			case '3':
//				System.out.println("male");
//				break;
//			case '4':
//				System.out.println("female");
//				break;
//			default:
//				System.out.println("Not human");
//				break;
//		int a = Integer.valueOf(n.substring(7,8));
//		}
			
////		3
//		Tv1 t = new Tv1(20,"samsung");
//		t.show(); //samsung 20inch Tv 
		
//		4
//		Shape s=new Shape();
//		Shape s1 = new Shape(2,5); 
//		//�����ι��� ���� ��� ���̵�
//		s.pr("@");
//		//����ڸ� ������� set �ϴ� �κ�
//		s1.pr("#");
//		s.show();
//		// for�� �ݺ�
//		s1.show();
		
//		5
//		XYZ xyz=new XYZ(10,10,"red");
//		xyz.setxy(20,30);
//		xyz.setcolor("blue");
//		xyz.show();
		
////		6
//		Re r=new Rec(10,20);
//		r.show();         //"�簢��!!" ���
//		System.out.println("���� " + r.area());
		
//		String x=null,y=null;
//		Scanner sc=new Scanner(System.in);
//		Profile[] p = new Profile[2];
//		for(int i=0;i<p.length;i++) {
//			x = sc.next();
//			y = sc.next();
//			p[i] = new Profile(x,y);
//		}
//		for(Profile i:p) {
//			System.out.println(i.name+ " " + i.id);
//		}
		
//		String str="id=123#name=gildong#addr=seoul";
//		StringTokenizer st = new StringTokenizer(str,"#");
//		int n=st.countTokens(); // ����
//		System.out.println(n);
//		while(st.hasMoreTokens()) {
//			String a=st.nextToken();
//			System.out.println(a);
//		}
//		String[] a = str.split("#");
//		for(String i:a) {
//			System.out.println(i+" ");
//		}
		
		//StringBuffer
		//������ ���������� ����ũ�⸦ �ڵ����� ������ �� �ִ�
		//���ڿ��� ��ų� ���ڿ� �۾��� ���� ���
//		StringBuffer sb = new StringBuffer("java");
//		sb.append(" is fine");//�� ���� �߰�
//		sb.insert(0, "The ");//(x��ġ���� ""�� �߰���)
//		sb.replace(4, 8, "Html");
//		System.out.println(sb);
		
//		Num n = new Num(1);
//		Num[] arr = new Num[] {new Num(1),new Num(2),new Num(3)};
//		for(Num i: arr) {
//			System.out.println(i.get());
//		}
		
//		Animal a1=new Dog("������","Ǫ��");
//		System.out.println(a1.ani());   
		
		
	}
}
//class Animal{
//	String a;
//	Animal(String a){
//		this.a=a;
//	}
//	String ani(){
//		return a;
//	}
//}
//class Dog extends Animal{
//	String b;
//	Dog(String a,String b){
//		super(a);
//		this.b=b;
//	}
//	String ani() {
//		return super.ani()+" "+b;
//	}
//}
//class Num{
//	int n;
//	Num(int n){
//		this.n=n;
//	}
//	int get() {
//		return n;
//	}
//}
//class Profile{
//	String name,id;
//	Profile(String name,String id){
//		this.name=name;
//		this.id=id;
//	}
//}
//interface Re{
//	default void show() {
//		System.out.println("�簢��!!");
//	}
//	public abstract int area();
//}
//class Rec implements Re{
//	int x,y;
//	Rec(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//	public int area() {
//		return x*y;
//	}
//}
//class XY{
//	private int x,y;
//	XY(int x,int y){
//		this.x=x;
//		this.y=y;
//	}
//	int getx() {
//		return x;
//	}
//	int gety() {
//		return y;
//	}
//	protected void move(int x,int y) {
//		this.x=x;
//		this.y=y;
//	}
//}
//class XYZ extends XY{
//	String color;
//	XYZ(int x,int y,String z){
//		super(x,y);
//		this.color=z;
//	}
//	void setxy(int x,int y){
//		move(x,y);
//	}
//	void setcolor(String z) {
//		this.color = z;
//	}
//	void show() {
//		System.out.println(getx()+" "+gety()+" "+color);
//	}
//}
//class Shape{
//	int a,b;
//	String s;
//	Shape(){
//		a=1;
//		b=3;
//	}
//	Shape(int a,int b){
//		//this(1,3);
//		this.a=a;
//		this.b=b;
//	}
//	void pr(String s) {
//		this.s=s;
//	}
//	void show() {
//		for(int i=0;i<a;i++) {
//			for(int j=0;j<b;j++) {
//				System.out.print(s);
//			}
//			System.out.println();
//		}
//	}
//}
//class Tv{
//	private int size;
//	Tv(int size){
//		this.size = size;
//	}
//	protected int getsize() {
//		return size;
//	}
//}
//class Tv1 extends Tv{
//	private String made;
//	Tv1(int size,String made){
//		super(size);
//		this.made=made;
//	}
//	void show() {
//		System.out.println(made+" "+getsize()+"inch Tv");
//	}
//}
//class Point{
//	int a,b;
//	Point(int a,int b){
//		this.a=a;
//		this.b=b;
//	}
//	public String toString() {
//		return a+" , "+b;
//	}
//}
//class MyDog{
//	String name;
//	String type;
//	MyDog(String a,String b){
//		name=a;
//		type=b;
//	}
//	public String toString() {
//		return type+" "+name;
//	}
//}