package SolDesk;

import java.util.Scanner;

public class ClassEight {

	public static void main(String[] args) {
//		int arr[]= {4,6,7,5,4};
//		show(arr);
		
//		int a[] = {3,2,1,6,5};  �̰� ��������
//		int temp;//�����
//		for(int i=0;i<4;i++) { 
//		//i�� ������ a.length -1 ���� : �������� j���� �Ǿ��ϹǷ�
//			for(int j=i+1;j<5;j++) {
//				if(a[i]>a[j]) {
//					temp = a[i]; //�ΰ��� ����ȯ �ڵ�
//					a[i] = a[j]; //
//					a[j] = temp; //	 
//				}
//			}
//		}
//		for(int i:a)
//			System.out.print(i + " ");
		
//		int ary[]= {3,2,1,6,5}; �̰Թ�������
//		int temp; //�����
//
//		for(int i=0;i<ary.length;i++) { //i=0
//		for(int j=0;j<ary.length-i-1;j++) { //j=0,1,2,3
//		if(ary[j]>ary[j+1]) {
//		temp=ary[j+1];
//		ary[j+1]=ary[j];
//		ary[j]=temp; //�ΰ��� ��ȯ �ڵ�
//		}
//		}
//		}
//		for(int i=0;i<5;i++) {
//		System.out.println(ary[i]);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int a,b;
//		try { //���� �߻����ɼ� �ִ� ��¹�
//		System.out.println("�Է�");
//		a=sc.nextInt();
//		System.out.println("�Է�");
//		b=sc.nextInt();
//		// b=0 -> java.lang.ArithmeticException: / by zero
//		System.out.println(a/b);
//		}catch(Exception e) { //����ó����
//			System.out.println(e);
//		}finally {// ���� ������� ����
//			System.out.println("end");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�Է�");
//		int n=0;
//		int sum=0;
//		for(int i=0;i<5;i++) { 
//			try { 
//				n = sc.nextInt(); // i<5 -> 5���Է�
//			}catch(Exception e) {
//				System.out.println("�����ƴ�");
//				System.out.println(e);
//				//�̴�λ���ϸ� ���� �߻���  
//				//���� for�� �ݺ��۵�X �����Է� �Ұ�
//				sc.next();//�Է½�Ʈ���� �ִ� ��ū�� ����
//				i--; // �ε��������� �����ϱ����� ����
//				continue; //�����������ʰ� �ݺ��� ����
//			}
//			sum+=n;
		
		/* ����Ʈ ��Ʈ��
		 * 1 �Է½�Ʈ�� inputstream���� ����
		 * 2 ��½�Ʈ�� outputsream���� ����
		 * 
		 * ���ڽ�Ʈ��
		 * 1 �Է� Reader
		 * 2 ��� Writer
		 * 
		 * ���ϻ���(���)
		 * ���ڴ������ϻ���( Writer )
		 * ����Ʈ�������ϻ���( OutputStream )
		 * 
		 * ���ΰ�(��ݽ�Ʈ��), ��� �Ǵܹ�(������Ʈ��)
		 * �������� �Ű����� �ȿ� inputstream,outputsream,
		 * Reader,Writer �� �ʿ��ϸ� ���
		 * �ʿ����� ������ ���ΰ�
		 * 
		 * ���������Ͽ� �� ����
		 * write �޼���
		 * 
		 * ���� �о����
		 * Reader,inputstream
		 * 
		 * ���ϴݱ�
		 * .close()
		 * 
		 * ���� 534~538
		 */
//		char a = 'S';
//		char b = 'W';
//		// a.txt ����
//		try {
//			FileWriter fw = new FileWriter("a.txt");
//			// FileWriter �ܵ����� ���ϻ��� ����
//			fw.write(a);
//			fw.write(b);
//			fw.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		��� ������ sw �� �о����
//		char arr[] =new char[10];
//		int r;
//		try {
//			FileReader fr = new FileReader("a.txt");
//			//���Ͽ� ������ �����б�
//			try {
//				r=fr.read(arr,0,arr.length);
//				for(int i=0;i<arr.length;i++) {
//					System.out.println(arr[i]);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			FileWriter fw= new FileWriter("b.txt");
////			b.txt ���ϻ���
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write("Hi");
//			bw.newLine();//�ٹٲ�
//			bw.write("today is tuseday");
//			bw.newLine();
//			bw.write("My email address is ~");
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			BufferedReader bf = new BufferedReader(new FileReader("b.txt"));
//			while(true)
//			{		
//				String s;// ������ �о�ͼ� �����ϱ����� s 
//				try { 
//					s = bf.readLine(); 
//					if(s == null) {
//						break;
//					}
//					System.out.println(s);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			try {
//				bf.close();//while �� �� ����
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		1
//		Scanner sc = new Scanner(System.in);
//		int a[] = new int [10];
//		for(int i=0;i<a.length;i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%4 == 0) {
//				System.out.println(a[i]);
//			}
//		}

//		2
//		int a=50,b=150;
//		System.out.println(a>b? a*b : a%b);

//		3
//		int i=0;
//		int sum=0;
//		while(i<=100) {
//			if(i%2 == 0 && i%7 == 0) {
//				System.out.println(i);
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);

//		4
//		Scanner sc = new Scanner(System.in);
//		try{
//			int num = sc.nextInt();
//			if(num%2 != 0) {
//				System.out.println("Ȧ��");
//			}
//			else {
//				System.out.println("¦��");
//			}
//		}catch(Exception e) {
//			System.out.println("�����ƴ�");
//			System.out.println(e);
//		}
	
		
		
		
		
	}
	
	/*
	 *  ��������
	 *  3 2 1 6 5
	 *  2 3 1 6 5
	 *  2 1 3 6 5
	 *  2 1 3 5 6 -> 1ȸ��
	 *  --------------------
	 *  1 2 3 5 6 -> 2ȸ�� �Ϸ�
	 */
	
//	static void show(int a[]) {
//		for(int i:a) {
//			System.out.println(i);
//		}
//	}
	

}
