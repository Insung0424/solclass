package SolDesk;

import java.util.Scanner;

//class XY{
//	private int x,y;
//	public XY(int x,int y) {
//		this.x=x;
//		this.y=y;
//	}
//	public String toString() {
//		return x+" "+y;
//	}
//}

//class Book{
//	String name;
//	int won;
//	Book(String name){
//		this(name,40000);
//	}
//	Book(String name,int won){
//		this.name=name;
//		this.won=won;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getWon() {
//		return won;
//	}
//	public void title() {
//		System.out.println(getName()+" "+getWon()+"��");
//	}
//}

//class Box<T>{
//	Box<T> next;
//	T t;
//	void in(T t) {
//		this.t=t;
//	}
//	T out() {
//		return t;
//	}
//}

//class St1<T>{
//	int n;
//	Object[] st;
//	
//	St1(){
//		st=new Object[3];
//		n=0;
//	}
//	public void push(T item) {
//		if(n==3) { //stack full
//			return; //�Լ�����
//		}
//		st[n]=item;
//		n++;
//	}
//	
//	public T pop() {
//		if(n==0) { // stack �� �������
//			return null;
//		}
//		n--; //�ϳ�����
//		return (T) st[n]; // ������ ��ȯ (������Ʈ�̹Ƿ� �ٿ�ĳ����)  
//	}
//}

public class classNineteen {

	public static void main(String[] args) {
//		ArrayList<Integer> ary = new ArrayList<>();
//		ary.add(1);
//		ary.add(new Integer(2)); //auto unboxing
//		ary.add(3);
//		ary.add(2,4);
//		for(int k:ary)
//			System.out.println(k);
		
//		ArrayList<XY> xyarr = new ArrayList<>();
//		xyarr.add(new XY(1,2));
//		xyarr.add(new XY(3,4));
//		xyarr.add(1,new XY(5,6));
//		xyarr.remove(1); //index 1 remove
//		for(XY i:xyarr) {
//			System.out.println(i);
//		}
		
//		ArrayList<String> ary = new ArrayList<>(/*�迭ũ�⼳������*/);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("If you want to stop enter a 'stop'");
//		for(;;) {
//			String s = sc.nextLine();
//			if(s.equals("stop")) {
//				break;
//			}
//			ary.add(s);
//		}
//		for(String i:ary) {
//			System.out.println(i);
//		}
//		
//		int max=0;
//		for(int i=0;i<ary.size();i++) {
//			if(ary.get(max).length() < ary.get(i).length()) {
//				max = i;
//			}
//		}
//		System.out.println(ary.get(max));
		
////		1
//		Book b1=new Book("�ڹ�"); 
//		b1.title();            //�ڹٴ� 40000��
//		Book b2=new Book("���̽�", 30000);
//		b2.title();           //���̽� 30000��
//		
////		2
//		Scanner sc = new Scanner(System.in);
////		StringBuilder st = new StringBuilder();
//		ArrayList<String> str = new ArrayList<>();
//		int i=sc.nextInt();
//		while(true) {
//			if(i==0) {
//				break;
//			}
//			int n = i%10;
//			int a = i/10;
//			if(n%3 != 0) {
//				if(a%3 != 0) {
//					System.out.print("��");
//					break;
//				}
//			}
//			else {
////				st.append("¦");
//				str.add("¦");
//			}
//			i/=10;
//		}
////		System.out.println(st);
//		for(String k:str) {
//			System.out.print(k);
//		}
		
//		Box<Integer> box = new Box<>();
//		box.in(30);
//		box.next = new Box<Integer>();
//		box.next.in(40);
//		
//		box.next.next = new Box<Integer>(); 
//		box.next.next.in(50);
//		
//		Box<Integer> tmp;
//		tmp=box.next;
//		System.out.println(tmp.out());
		
//		St1<String> st1 = new St1<>();
//		st1.push("ha");
//		st1.push("hi");
//		st1.push("hu");
//		st1.push("he");
//		st1.push("ho");
//		for(int i=0;i<=st1.n+1;i++) {
//			System.out.println(st1.pop());
//		}
		
//		St1<Integer> s = new St1<>();
//		Scanner sc = new Scanner(System.in);
//		for(;;) {
//			int num = sc.nextInt();
//			s.push(num);
//			if(s.n == 3) {
//				break;
//			}
//		}
//		for(int i=0;i<=s.n+1;i++) {
//			System.out.println(s.pop());
//		}
			
//		ArrayList<Integer> ai = new ArrayList<>();
//		ai.add(33);
//		ai.add(66);
//		ai.add(99);
//		Iterator<Integer> it = ai.iterator();
//		//������ ���� Ŭ�������� ���
//		while(it.hasNext()) { //���� �ִµ���
//			int n = it.next(); //������ ��ȯ
//			System.out.println(n);
//		}
		
////		3
//		Scanner sc = new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		Cal c= new Show();
//		System.out.println(c.cal(a,b));
//		
////		4
//		Gen<String> g=new Gen<String>("seoul","busan");
//		System.out.println(g.one());   //seoul ���
//		System.out.println(g.two());   //busan ���
//		System.out.println(g.three());  //false ��� (�� ���ڿ� ��) 
		
//		HashSet<Num> h = new HashSet<>(); 
//		// hashcode,equals �� �ڵ�����
//		h.add(new Num(30));
//		h.add(new Num(40));
//		h.add(new Num(50));
//		h.add(new Num(50)); //
//		Iterator<Num> it = h.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		TreeSet<Pro> t= new TreeSet<>();
//		t.add(new Pro("cc",128));
//		t.add(new Pro("aa",130));
//		t.add(new Pro("bb",125));
//	
//		Iterator<Pro> it=t.iterator();
//		while(it.hasNext()) {
//			it.next().show(); 
//		//��ü�� ������  ��� ���������� ��������
//		}
		
//		HashSet<Student> set =new HashSet<Student>();
//		set.add(new Student("100","ȫ�浿"));
//		set.add(new Student("200","������"));
//		set.add(new Student("300","�̼���"));
//		set.add(new Student("400","�����"));
//		set.add(new Student("100","���߱�"));
//		System.out.println(set);
		
//		TreeSet<Integer> grade = new TreeSet<>();
//		grade.add(30);
//		grade.add(100);
//		grade.add(50);
//		Iterator it = grade.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			//���� �������� ��µǴ� ���� : �������ڵ���
//		}
//		Integer i;
//		i=grade.first();
//		System.out.println(i);
//		i=grade.last();
//		System.out.println(i);
//		i=grade.lower(new Integer(80)); 
//		//the greatest element less than e
//		System.out.println(i);
//		i=grade.higher(80);
//		//the least element greater than e
//		System.out.println(i);
		
////		5
//		Scanner sc = new Scanner(System.in);
//		System.out.println("5~10 �� �Է�");
//		Calcclass cal= new Calcclass();
//		while(true) {
//			int i = sc.nextInt();
//			if(i == 0) {
//				break;
//			}
//			if(i<5 || i>10) {
//				System.out.println("�ٽ��Է�");
//				continue;
//			}
//			System.out.println(cal.claculate(i));
//			System.out.println("0�Է��ϸ� ����");
//		}
//		
////		6
//		System.out.println("���� 9�� �Է�");
//		int[][] ary=new int[3][3];
//		for(int i=0;i<ary.length;i++) {
//			for(int j=0;j<ary[i].length;j++) {
//				ary[i][j] = sc.nextInt();
//			}
//		}
//		high(ary,3,3);
		
////		7
//		try {
//			FileOutputStream fos = new FileOutputStream("fi.txt");
//			byte[] b= {1,2,3,4,5};
//			try {
//				fos.write(b);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			try {
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
////		7-1
//		try {
//			FileInputStream fis = new FileInputStream("fi.txt");
//			int a;
//			try {
//				while((a=fis.read()) != -1) {
//					System.out.print(a+" ");
//				}
//				System.out.println();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
////		8
//		int [] arr={1,2,3,4,5};
//		int r;
//		r=add(arr,5);
//		System.out.println(r);
		
//		10
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				System.out.println("����,���� �Է�");
//				int w =sc.nextInt();
//				int h =sc.nextInt();
//				Rectangle rec = new Rectangle();
//				rec.setWidth(w);
//				rec.setHeigt(h);
//				System.out.println("������ "+ rec.area());	
//				break;
//			}catch(Exception e) {
//				System.out.println("int �� �ƴ�,ó������ �ٽ� �Է�");
//				sc.next();
//				continue;
//			}
//		}
		
		
		
	}
//	static int add(int []a,int b) {
//		int sum=0;
//		for(int i=0;i<b;i++){
//			sum+=a[i];
//		}
//		return sum;
//	}
//	static void high(int[][]arr,int a,int b){
//		int max=arr[0][0];
//		for(int i=0;i<a;i++) {
//			for(int j=0;j<b;j++) {
//				if(max < arr[i][j]) {
//					max = arr[i][j];
//				}
//			}
//		}
//		System.out.println("���� ū���� "+max);
//	}
	
}

////9
//class Rectangle{
//	private int width,heigt;
//
//	public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public int getHeigt() {
//		return heigt;
//	}
//
//	public void setHeigt(int heigt) {
//		this.heigt = heigt;
//	}
//	
//	public int area() {
//		return getWidth()*getHeigt();
//	}
//	
//}
//class Calcclass{
//	public int claculate(int n){
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			if(i%2 == 1) {
//				sum+=i;
//			}
//		}
//		return sum;
//	}
//}
//class Student{
//	String Num;
//	String name;
//	Student(String n,String m){
//		this.Num=n;
//		this.name=m;
//	}
//	public String toString() {
//		return Num+":"+name;
//	}
//	@Override
//	public int hashCode() {
//		return Integer.parseInt(Num); 
//		//������ �Ǵ� ù��°���ڿ��� ������ ��ȯ
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Student student = (Student)obj;
//		if(student.Num == this.Num) {
//			return true;
//		}
//		return false;
//	}
//}

//class Pro implements Comparable<Pro>{
//	String n;
//	int m;
//	Pro(String n,int m){
//		this.n=n;
//		this.m=m;
//	}
//	void show() {
//		System.out.println(n+" "+m);
//	}
//	@Override
//	public int compareTo(Pro o) {//������ ������������
//		return this.m - o.m; //�ݴ�� �ϸ� ��������
//	}
//	
//}
//class Num{
//	int n;
//	Num(int a){
//		n=a;
//	}
//	public String toString() {
//		return n+"";
//	}
//	@Override
//	public int hashCode() {
//		return n%3; //������ ���ؼ� �׷�ȭ
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Num num = (Num)obj; //�ٿ�ĳ����
//		if(num.n==n) {
//			return true;
//		}
//		return false;
//	}
//	
//}
//class Gen<T>{
//	T a,b;
//	Gen(T s1, T s2){
//		this.a=s1;
//		this.b=s2;
//	}
//	public T one() {
//		return a;
//	}
//	public T two() {
//		return b;
//	}
//			//	g.three(T t) 
//	public boolean three() {
//		if(a.equals(b)) {
//			return true;
//		}
//		return false;
//	}
//}
//
//interface Cal{
//	public int cal(int a,int b);
//}
//class Show implements Cal{
//	public int cal(int a,int b) {
//		int sum=0;
//		for(int i=a;i<=b;i++) {
//			sum+=i;
//		}
//		return sum;
//	}
//}