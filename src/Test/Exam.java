package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


//class JavaTest1 {
//	JavaTest1(){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� i �Է�");
//		int i = sc.nextInt();
//		System.out.println("���� j �Է�");
//		int j = sc.nextInt();
//		System.out.println("���� : "+ (i+j));
//	}
//}


//class Circle {
//	private double r;
//	Circle(double r) {
//		this.r = r;
//	}
//	double area() {
//		return 3.14 * r * r;
//	}
//}
//class JavaTest2 {
//	JavaTest2(){
//		Circle[] cary = new Circle[5];
//		double sum=0;
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<cary.length;i++) {
//			System.out.println((i+1)+"�� ���� ������ �Է�");
//			cary[i] = new Circle(sc.nextDouble());
//		}
//		for(Circle i : cary) {
//			sum+=i.area();
//		}
//		System.out.println("5�� ���� ���� ���� "+sum);
//	}
//}

//class JavaTest3{
		class Num{
			int n;
			int sum=0;
			int max=0;
			void add(int n) {
				sum += n;
				if(max<n) {
					max = n;
				}
			}
			public int getSum() {
				return sum;
			}
			public int getMax() {
				return max;
			}
			
			public int getSum(int n) {
				sum += n;
				return sum;
			}
			
			public int getMax(int n) {
				if(max<n) {
					max = n;
				}
				return max;
			}
			
			Num(){
				this(0);
			}
			Num(int n){
				this.n=n;
				sum += n;
				if(max<n) {
					max = n;
				}
			}
		}
//}

//class JavaTest4{
//	HashMap<String,Double> hm = new HashMap<>();
//	Scanner sc = new Scanner(System.in);
//	JavaTest4(){
//		hm.put("Kim", 11.1);
//		hm.put("Lee", 22.2);
//		for(int i=0;i<hm.size();i++) {
//			System.out.println("Kim, Lee �� �ϳ� �Է�");
//			String s = sc.next();
//			if(s.equals("Kim") || s.equals("Lee")) {
//				System.out.println(hm.get(s));
//			}
//		}
//	}
//}

//class JavaTest5 extends JFrame{
//	JavaTest5(){
//		Container c = getContentPane();
//		c.setLayout(null);
//		JPanel j = new JPanel();
//		j.setBounds(22,10,240,200);
//		j.setLayout(new GridLayout(3,3,10,10));
//		JButton[] jary=new JButton[9];
//		for(int i=0;i<jary.length;i++) {
//			jary[i] = new JButton((i+1)+"");
//			j.add(jary[i]);
//		}
//		
//		c.add(j);
//		setTitle("Dial");
//		setSize(300,300);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//}

//class JavaTest6 implements Serializable{
//	class Student implements Serializable{
//		String a,b;
//		int i;
//		public Student(String a, String b, int i) {
//			this.a = a;
//			this.b = b;
//			this.i = i;
//		}
//		void show() {
//			System.out.println(a + " " + b + " " + i);
//		}
//	}
//	JavaTest6(){
//		Student s= new Student("jack","123",20);
//		try {
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("java.txt"));
//			out.writeObject(s);
//			out.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			ObjectInputStream in = new ObjectInputStream(new FileInputStream("java.txt"));
//			Student b = (Student) in.readObject();
//			b.show();
//			in.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

public class Exam {

	public static void main(String[] args) {
//		JavaTest1 j = new JavaTest1();
		
//		JavaTest2 j = new JavaTest2();
		
//		Num nb = new Num();
//		nb.add(7); nb.add(-1); nb.add(20); nb.add(5); // 4�� ���ڸ� �Է�
//		System.out.println("Sum = " + nb.getSum());   // 4�� ������ �հ�
//		System.out.println("Max = " + nb.getMax());   // 4�� ���� �� �ִ밪
//		System.out.println("======���м�======");
//		Num nb2 = new Num(8);
//		System.out.println("Sum = " + nb2.getSum(22));
//		System.out.println("Max = " + nb2.getMax(12));
		
//		JavaTest4 j = new JavaTest4();
		
//		JavaTest5 j = new JavaTest5();
		
//		JavaTest6 j = new JavaTest6();
		
		Scanner sc =new Scanner(System.in);
		ArrayList<Worker> aWork = new ArrayList<>();
		while(true) {
			System.out.println("��� ���� ���� ���α׷�");
			System.out.println("1. ��� ���� �Է�");
			System.out.println("2. ������� ���� ��ȸ");
			System.out.println("3. ���α׷� ����");
			int i = sc.nextInt();
			
			switch (i){
			case 1 :
				System.out.println("���ο� ��� ������ �Է��մϴ�");
				
				System.out.println("��� :");
				int iNum = sc.nextInt();
				
				System.out.println("�̸� : ");
				String name= sc.next();
				
				System.out.println("�μ� : ");
				String part = sc.next();
				
				sc.nextLine();
				System.out.println("�ּ� : ");
				String address = sc.nextLine();
				
				System.out.println("���� : ");
				String bDate = sc.next();
				
				aWork.add(new Worker(iNum,name,part,address,bDate));
				//����� ��� �߰��� ���� �����ؼ� �Է¹��� ���� ������ �ϴ� 
				//Worker ��ü�� ArrayList�� �߰��Ѵ�
				//set�� �̿��� ��� �⺻�����ڷ� ��ü�� �����ϰԵǸ� 
				//������ ��ü���� ��ü���� �����ؾ� �ϹǷ�
				//�⺻�����ڴ� private�� ��ٴ�
				System.out.println("��������� �ԷµǾ���");
				break;
				
			case 2 :
				System.out.println("�˻��ϰ��� �ϴ� ����� �����? ��) 123(�Է�)");
				int id = sc.nextInt();
				Iterator<Worker> it = aWork.iterator();
				while(it.hasNext()) {
					Worker num = it.next();
					if(id == num.getId()) {
						System.out.println("�̸� : "+num.getName());
						System.out.println("�μ� : "+num.getDepart());
						System.out.println("�ּ� : "+num.getAddress());
						System.out.println("���� : "+num.getbDate());
					}
					else {
						System.out.println("�������� �ʴ»�� �Դϴ�");
					}
				}
				break;
				
			case 3 :
				System.out.println("���α׷� ����");
				System.exit(0); //jvm����
				return; //�Լ�����
			}
			
		}
	}

}
