package SolDesk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClassSix {
	// ���� ��ȯ��
	static void pro(int age) {
		System.out.println("�ȳ�");
		System.out.println("���̴� " + age + "�̴�");
	}

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int n=0; //-1�� �ԷµǸ� ����
//		while(true) {
//			if((n=sc.nextInt())==-1)
//				break;
//			System.out.println(n);
//		}

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		while(true) { //-1�� �ԷµǸ� ����
//			st = new StringTokenizer(bf.readLine());
//			int a=Integer.parseInt(st.nextToken());
//			if(a==-1)
//				break;
//			System.out.println(a);
//		}

//		int arr[]= {53,47,96,30,64} ;
//		int max=arr[0];
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max)
//				max=arr[i];
//			if(arr[i]<min)
//				min=arr[i];
//		}
//		System.out.println(max);
//		System.out.println(min);

//		int arr[] = { 53, 47, 96, 30, 64 };
//		int sum = 0;
//		for (int s : arr) {
//			sum += s;
//		}
//		System.out.println(sum);

//		int arr[][] = new int[1][3];
//		int arr1[][] = { { 53, 47 }, { 96, 30 }, { 64, 61 } };//3,2
//		
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) { //arr1[i].length
//				System.out.print(arr1[i][j]+" "); //���������迭���� ���ǰ���������
//			}
//			System.out.println();
//		}
//		

//		int arr[][]= {{10,11,12},{20,21},{30,31,32},{40,41}};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) { 
//				System.out.print(arr[i][j]+" "); 
//			}
//			System.out.println();
//		}

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		int A=Integer.parseInt(st.nextToken());
//		int B=Integer.parseInt(st.nextToken());
//		int arr1[][] = new int[A][B];
//		for(int i=0;i<arr1.length;i++) {
//			st = new StringTokenizer(bf.readLine());
//			for(int j=0;j<arr1[i].length;j++) {
//				arr1[i][j]=Integer.parseInt(st.nextToken());
//			}
//		}
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) { 
//				System.out.print(arr1[i][j]+" "); 
//			}
//			System.out.println();
//		}

//		Scanner sc=new Scanner(System.in);
//		int i=sc.nextInt();
//		switch(i) {
//			case 1:
//				System.out.println("!");
//				break;
//			case 2:
//				System.out.println("@");
//				break;
//			default : 
//				System.out.println("*");
//				break;
//		}

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		int i = Integer.parseInt(st.nextToken());
//		switch(i) {
//		case 1:
//			System.out.println("!");
//			break;
//		case 2:
//			System.out.println("@");
//			break;
//		default : 
//			System.out.println("*");
//			break;
//		}
//		bf.close();

//		int i = 0;
//		int j;
//		System.out.println((i%2==0?(j=10):(j=20))); //���׿�����

//		Scanner sc = new Scanner(System.in);
//		int n=0;
//		for(int i=0;i<1;i++) {
//			n=sc.nextInt();
//			if(n<0) { //����� ���
//				continue;
//			}
//			else {
//				System.out.println(n);
//			}
//		}

//		System.out.printf("%d + %.1f = %d\n", 50, 11.8, (int) (50 + 11.8));
//
//		int i = 0;
//		while (true) {
//			i++;
//			if (i % 5 == 0) {
//				continue;
//			}
//			if (i >= 30) {
//				break;
//			}
//			System.out.print(i + " ");
//			//0�� ��� ������ ����̴�, 30�̵Ǹ� continue�� break�� �˻��Ѵ�
//		}
//		
//		int i = 0;
//		for(;;) {
//			i++;
//			if(i%5==0) {
//				continue;
//			}
//			else if(i>=30) {
//				System.out.println("break");
//				break;
//			}
//		}
//		System.out.println(i);

//		3
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		int arr[]=new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//			sum+=arr[i];
//		}
//		System.out.println((double)(sum/arr.length));
//		
//		
////		3-1
//		Scanner s = new Scanner(System.in);
//		int arr1[]=new int[10];
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=s.nextInt();
//			if(arr1[i]%7 == 0) {
//				System.out.println(arr1[i]);
//			}
//		}
//		
////		4-1
//		double sum41 = 0.0;
//		double ary41[]={1.0, 1.5, 2.0, 2.5};
//		int i=0;
//		while(i<4) {
//			sum41+=ary41[i];
//			i++;
//		}
//		System.out.println(sum41);
//
////		4-2
//		double sum42 = 0.0;
//		double ary42[]={1.0, 1.5, 2.0, 2.5};
//		int i42=0;
//		do {
//			sum42+=ary42[i42];
//			i42++;
//		}
//		while(i42<4);
//		System.out.println(sum42);
//		
//		4-3
//		double sum43 = 0.0;
//		double ary43[]={1.0, 1.5, 2.0, 2.5};
//		for(double i43:ary43) {
//			sum43+=i43;
//		}
//		System.out.println(sum43);

////		5.1 3 / 3
//		int ary[][] = {{0,1,2},{3,4,5},{6,7,8}};
//		
////		5.2 2 / 3
//		char arr[][] = {{'a','b','c'},{'d','e','f'}};
//		
////		6
//		int bae[][] = new int[3][4];
//		for(int i=0;i<bae.length;i++) {
//			for(int j=0;j<bae[i].length;j++) {
//				bae[i][j] = (int)(Math.random()*10);
//			}
//		}
//		double sum=0;
//		for(int i=0;i<bae.length;i++) {
//			for(int j=0;j<bae[i].length;j++) {
//				sum+=bae[i][j];
//				System.out.print(bae[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("���� : "+sum);

//		Scanner sc = new Scanner(System.in);
//		String arr[][] = { { "book", "å" }, { "water", "��" }, { "note", "��" } };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i][0] + "�� ����?");
//			String str = sc.next();
//			if (str.equals(arr[i][1])) {
//				System.out.println("����");
//			} else {
//				System.out.println("������ " + arr[i][1]);
//			}
//		}

//		���������� (public,private,protected,����Ʈ(���������ڰ� �����Ȱ��))
//		�Լ��� ���� - ��ȯ�� �Լ��� (�Ű�����){������} 
//		static ���� / void ��ȯ
//		ĸ��ȭ : �Լ�(�޼ҵ�)�� �ݵ�� Ŭ�����ȿ����� �����ϸ� ����� �� �ִ�
//		��ȯ���� void�� �Լ��� ��κ� ��¹��� ����
//		System.out.println("����");
//		pro(52); //�Լ� ȣ��
//		pro(53); //�Լ� ȣ��
//		System.out.println("��");

//		int n=add(10,20);
//		System.out.println(n);

//		System.out.println("���� ����: "+area(5.5));
//		System.out.println("���� �ѷ�: "+round(3.2));
		
//		meter(176);
//		
//		System.out.println(meter(176));
		
//		1 ����� ��𿡼� �Ұ��� 
//		- 1 (main������ return �Լ�ȣ��� �������)(������ �ָ鼭 ���ϰ��� ����)
//		- 2 (�Լ����� �ϸ� �����ʿ���� void)
		
//		total(1,10);
//		total(1,100);
		
//		System.out.println(multi(2,10));
		
//		int a=0; //�������� local variable
//		in(); //�Լ�ȣ�� 10
//		System.out.println(a); // 0
		
//		aa();
//		bb();
//		System.out.println(a);
		
//		System.out.println(big(5.5,6.5));
		
//		Scanner sc=new Scanner(System.in);
//		int c=sc.nextInt();
//		int d=sc.nextInt();
//		big(c,d);
		
//		Scanner sc=new Scanner(System.in);
//		int a[]=new int[7];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println(big(a));
//		//�Ű� ������ �迭�� ȣ���� �� �迭�� ������ ��
		
//		Scanner s=new Scanner(System.in);
//		char a=s.next().charAt(0);
//		int b=s.nextInt();
//		int c=s.nextInt();
//		cal(a,b,c); // + b+c   /   - b-c
		
		
	}
	
//	static void cal(char a,int b,int c) {
//		switch(a) {
//		case '+':
//			System.out.println(b+c);
//			break;
//		case '-':
//			System.out.println(b-c);
//			break;
//		default :
//			System.out.println("�װǸ𸣰ھ��");
//		}
//		
//	}
	
//	static int big(int a[]) { // a[] �Էµ� �迭��
//		int max=0;
//		for(int i=0;i<a.length;i++) {
//			if(max<a[i]) {
//				max=a[i];
//			}
//		}
//		return max;
//	}
	
//	static void big(int c, int d) {
//		System.out.println((c>d)? c : d);
//	}
	
//	static double big(double a,double b) {
//		return (a>b)? a : b;
//	}
	
//	static int a; //��������(global variable)
//	
//	static void aa() {
//		a=10;
//	}
//	
//	static void bb() {
//		int a=20; //��������  bb() �ȿ����� ����ϴ� int a=20; 
//	}
	
//	static void in() {
//		int a=10; //��������
//		System.out.println(a);
//	}
	
//	static int multi(int a, int b) {
//		int mul=1;  // 1��� a�� ����������
//		for(int i=0;i<b;i++) {
//			mul*=a;
//		}
//		return mul; 
//	}

//	static void total(int a,int b) {
//		int sum = 0;
//		for(int i=0;i<=b;i++) {
//			sum+=i;
//		}		
//		System.out.println(sum);
//	}
	
	
//	
//	static double meter(int ki) {
//		return ki/100.0;
//	}
	
//	static void meter(int ki) {
//		System.out.printf("%.2f M\n",ki/100.0);
//	}

//	static double area(double a) {
//		return Math.PI * a * a;
//	}
//
//	static double round(double b) {
//		return 2 * Math.PI * b;
//	}
//
//	static int add(int a, int b) {
//		return a + b;
//	}
}
