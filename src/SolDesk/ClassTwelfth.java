package SolDesk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//class LCD{
//	private int size;
//	public LCD(int n) {
//		size = n;
//	}
//}
//
//class ColorLCD extends LCD{
//	int colorsize;
//	public ColorLCD(int colorsize, int n) {
//		super(n); // �θ������ ȣ�� size = n; ù�ٿ� �������
//		this.colorsize = colorsize;
//	}
//}

//class Person{
//	private String name;
//	public Person(String name) {
//		this.name = name;
//	}
//	void name() {
//		System.out.println(name);
//	}
//}
//
//class Student extends Person{
//	private String job;
//	private String major;
//	public Student(String name,String job,String major) {
//		super(name); // this.name = name;
//		this.job = job;
//		this.major = major;
//	}
//	void show() {
//		name();
//		System.out.println(job);
//		System.out.println(major);
//	}
//}

//class A{
//	A(){
//		System.out.println("A ������ ȣ��");
//	}
//	A(int n){
//		System.out.println(n);
//	}
//}
//
//class B extends A{
//	B(){
//		System.out.println("B ������ ȣ��");
//	}
//	B(int n){
//		System.out.println(n);
//	}
//}

//class Point{
//	private int x,y;
//	Point(){
//		this.x=0;
//		this.y=0;
//	}
//	Point(int x,int y){
//		this.x=x;
//		this.y=y;
//	}
//	void pr() {
//		System.out.println(x+" "+y);
//	}
//}
//class Color extends Point{
//	private String color;
//	Color(int x,int y,String color){
//		super(x,y);
//		this.color=color;
//	}
//	void show() {
//		pr();
//		System.out.println(color);
//	}
//}
//class Number{
//	static void show(int n) {
//		System.out.println(n);
//	}
//	void show(double n) { //�����ε� : �Լ����̰����� 
//						  // �Ű�����Ÿ�� || 
////						  // �Ű����� ������ �ٸ��� �������
//		System.out.println(n);
//	}
//}
//class AAA{
//	void ride() {
//		System.out.println("�������̵� AAA");
//	}
//	void load() {
//		System.out.println("�����ε� AAA");
//	}
//}
//class BBB extends AAA{
//	void ride() { // �������̵� - �޼ҵ� ������
//		System.out.println("�������̵� BBB");
//	}
//	void load(int n) { //�����ε� - �Ű���������
//		System.out.println("�����ε� BBB");
//	}
//}
//class Score{
//	void show(int n[][]) {
//		double c=0;
//		int sum=0;
//		for(int i=0;i<n.length;i++) {
//			for(int j=0;j<n[i].length;j++) {
//				sum+=n[i][j];
//			}
//			c+=n[i].length;
//		}
//		System.out.println(sum/c); //12���� ���� ���¹�
//	}
//}
//class Car{
//	public int gas; //field
//	public void up() {
//		gas+=1;
//		System.out.println(gas);
//	}
//	public final void stop() { // Cannot override - final
//		System.out.println("stop");
//		gas = 0;
//	}
//}
//class SportCar extends Car{
//	public void up() {
//		gas+=100;
//		System.out.println(gas);
//	}
//}
public class ClassTwelfth {
	public static void main(String[] args) {
//		Person p = new Person("that");
//		p.name();
		
//		Student s=new Student("Him","IT","Computer Science");
//		s.show();
		
//		protected 
//		���� ��Ű�� Ŭ���� ���� ����
//		�ٸ� ��Ű�� Ŭ���� ���� �ȵ�
//		���� ��Ű���� ���� Ŭ������ ���� ����
//		�ٸ� ��Ű���� ���� Ŭ������ ���� ����(���)
		
//		B b = new B(); //A ������ ȣ�� B ������ ȣ��
//		B b1 = new B(8); 
//		//A ������ ȣ�� 8
//		/*	A(int n){
//			System.out.println(n);
//			}
//		 * 	B(int n){
//			System.out.println(n);
//			}
//		 */
//		
//		B b2 = new B(8);
//		// 8 8
//	/*	A(int n){
//	 * 	super(n);
//		System.out.println(n);
//		}
//	 * 	B(int n){
//		System.out.println(n);
//		}
//	 */
		
//		Color color = new Color(3,6,"red");
//		color.show();
		
//		Number.show(20);
//		Number n = new Number();
//		n.show(3.14);
		
//		AAA a = new AAA();
//		a.ride();
//		a.load();
//		
//		BBB b = new BBB(); //b�� AAA�� load();�� ��밡��
//		b.ride();
//		b.load(10);
		
//		int [][] grade= {{90,100,80},
//				  		{70,95,87},
//				  		{80,90,70},
//				  		{90,100,100}};
//		
//		Score s = new Score();
//		s.show(grade);
		
//		Car c = new Car();
//		c.gas=0;
//		c.stop();
//		c.up();
//		
//		SportCar spCar = new SportCar();
//		spCar.stop();
//		spCar.up();
		
//		int arr[][]=new int[3][4];
//		for(int i=0;i<arr.length;i++) {
//			int s=i; //i���� ����
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = s;
//				//arr[i][j] = i+j; 
//				s++; // j���� �����ϴ� ���� s�� ���� ��Ŵ
//			}
//		}
		
		try {
			FileReader fr = new FileReader("f.txt");
			// ���ϸ����� ������ int �� �о��
			int s = 0; 
			// �о�� ���� �����ϱ� ���� ����
			try {
				while((s=fr.read()) != -1) {
					// ���� ���� ������ -1 �� ��ȯ�ϹǷ� �ƴѵ��� �ݺ�
					System.out.print((char)s);
					// int �� �о�� ���� char�� ����ȯ
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
