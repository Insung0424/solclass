package SolDesk;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

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
		
//		try {
//			FileReader fr = new FileReader("f.txt");
//			// ���ϸ����� ������ int �� �о��
//			int s = 0; 
//			// �о�� ���� �����ϱ� ���� ����
//			try {
//				while((s=fr.read()) != -1) {
//					// ���� ���� ������ -1 �� ��ȯ�ϹǷ� �ƴѵ��� �ݺ�
//					System.out.print((char)s);
//					// int �� �о�� ���� char�� ����ȯ
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
//		1
//		Scanner sc =new Scanner(System.in);
//		int n;
//		double sum=0;
//		int c=0;
//		while(true) {
//			n=sc.nextInt();
//			sum+=n;
//			if(n == -1) {
//				break;
//			}
//			c++;
//		}
//		System.out.println(sum/c);

//		2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			FileWriter fw = new FileWriter("test01.txt");
//			String str;
//			while((str=br.readLine()) != null) {
//				fw.write(str);
//				fw.write("\n");
//			}
//			fw.close();
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		3
//		String stop = "�׸�";
//		Scanner sc =new Scanner(System.in);
//		String str;
//		try {
//			FileWriter fw =new FileWriter("test02.txt");
//			while(true) {
//				str = sc.nextLine();
//				if(str.equals(stop)) { //str.equals("�׸�")
//					break;
//				}
//				fw.write(str+"\n");
//			}
//			fw.close();
//			sc.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		3-1
//		try {
//			FileReader fr = new FileReader("test01.txt");
//			int n;
//			try {
//				while((n=fr.read()) != -1) {
//					System.out.print((char)n);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		4
//		Rectangle rec = new Rectangle();
//		rec.width = 5;
//		rec.height = 6;
//		System.out.println("�簢�� ���� " + rec.area());

//		5
//		Song s1 = new Song("On");
//		Song s2 = new Song("Butter");
//		System.out.println("�����ϴ� �뷡 " + s1.getSong());
//		System.out.println("�� �뷡 " + s2.getSong());
		
//		NCircle n = new NCircle(10,"red");
//		n.show();
		
//		int arr[] = new int[4];
//		Book arr1[]=new Book[3];
//		��ü�� ���ҷ� �ϴ� �迭�� ���� �� �ִ�
//		��ü �迭: ��ü�� ���� ���۷����� ���ҷ� ���� �迭
//		Book b[]; Book�迭�� ���� ���۷������� b����
//		b=new Book[5]; ���۷����迭 ����
		
//		Circle []arr = new Circle[4];
//		//�������� ��ü�� �迭���·� ������
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=new Circle(i);
//			// ��ü4���� ������ �迭 ��ġ�� ����
//			System.out.println(arr[i].getarea());
//		}
//		
//		Scanner sc= new Scanner(System.in);
//		Song so[]=new Song[2];
//		for(int i=0;i<2;i++) {
//			System.out.println("singer");
//			String singer=sc.next();
//			System.out.println("title");
//			String title=sc.next();
//			so[i] = new Song(singer,title);
//		}
//		for(int i=0;i<2;i++) {
//			System.out.println(so[i].singer+" "+
//		so[i].title);
//		}
		
////		1
//		InputStreamReader in = new InputStreamReader(System.in);
//		try {
//			int i;
//			FileWriter out = new FileWriter("java.txt");
//			while((i=in.read()) != -1) {
//				out.write(i);
//			}
//			in.close();
//			out.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
////		2
//		Student s1=new Student("��浿","kim");
//		Student s2=new Student("�̱浿","lee");
//		s1.pr();
//		s2.pr();
		
		
//		��ü�迭 �����ϱ�
//		Book[] brr1 = new Book[3];
//		Book[] brr2 = new Book[3];
//		brr1[0]= new Book("�¹���","������");
//		brr1[1]= new Book("���̾�","�츣�� �켼");
//		brr1[2]= new Book("��� �� ���ΰ�","���ù�");
//		System.arraycopy(brr1, 0, brr2, 0, 3);
////		arraycopy(brr1, 0, brr2, 0, 0)
//		/*	brr1 - ������ �迭
//		 * 	ù��° 0 - ������ ù ��ġ
//		 *  brr2 - ������ ������ �ٿ����� �迭
//		 *  �ι�° 0 - �ٿ����� �迭�� �ٿ����� ù ��ġ
//		 *  ����° 0 - ������ ����� ����
//		 */
////		�ν��Ͻ��� �ּҰ��� ���� - ���� ����
//		brr1[1].setBookName("����");
//		brr1[1].setAuthor("�ڿϼ�");
////		brr2 �� ������ �޾Ƽ� �ּҰ��� brr1�� �ּҰ����� ����
//		for(int i=0;i<brr2.length;i++) {
//			brr2[i].showBookInfo();
//		}
		
		
		
	}
}
//class Book{
//	private String bookName;
//	private String author;
//	
//	public Book() {}
//	public Book(String bookName,String author) {
//		this.bookName = bookName;
//		this.author = author;
//	}
//	public String getBookName() {
//		return bookName;
//	}
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public void showBookInfo() {
//		System.out.println(bookName+" "+author);
//	}
//}
//class Student{
//	private String han;
//	private String eng;
//	Student(String han,String eng){
//		this.han = han;
//		this.eng = eng;
//	}
//	void pr() {
//		System.out.println(han + " " + eng);
//	}
//	
//}
//class Song{
//	String singer;
//	String title;
//	Song(String s,String t){
//		this.singer=s;
//		this.title=t;
//	}
//}
//class Circle {
//	int r;
//
//	Circle(int r) {
//		this.r = r;
//	}
//
//	double getarea() {
//		return r * r * 3.14;
//	}
//}
//class NCircle extends Circle{
//	private String color;
//	NCircle(int r, String color){
//		super(r); //�θ������ ȣ��
//		this.color=color; 
//	}
//	void show() {
//		System.out.println("������ "+getR()+" "+color);
//	}
//}
//class Circle{
//	private int r; //�ν��Ͻ�����(�ʵ�)
//	public Circle(int r) { //������
//		this.r = r;
//	}
//	int getR() { //�޼ҵ�
//		return r;
//	}
//}
//class Song {
//	String song;
//
//	Song(String song) {
//		this.song = song;
//	}
//
//	public String getSong() {
//		return song;
//	}
//}
//
//class Rectangle {
//	int width;
//	int height;
//
//	public int area() {
//		return width * height;
//	}
//}