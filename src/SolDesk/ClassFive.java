package SolDesk;

import java.util.Scanner;

public class ClassFive {

	public static void main(String[] args) {
//		int sum=0;
//		for(int i=0;i<=100;i++) {
//			if(i%2==1) {
//				continue; //break�� �ϸ� 1���� ���� sum=0
		// break �� �ݺ����� Ż���Ҷ� ���δ�
//			}
//			else {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);//¦����

//		Scanner sc=new Scanner(System.in);
//		int num=0;
//		double sum=0;
//		int i=0;
//		
//		while((i=sc.nextInt())!=0) {
//			sum+=i;
//			num++;
//		}// 0�� �Է¹��������� �Է¹������� sum����Ӵ��ϸ� num�� �Է�Ƚ���� �ִ´�
//		System.out.println(num+" "+(sum/num));

//		int i=1;
////		int sum=0;
//		do {
////			sum+=i;
//			System.out.println(i);
//			i++;
//		}while(i<=20);
////		System.out.println(sum);

//		char a='a'; //97
//		do {
//			System.out.println(a);
//			a=(char)(a+1); // �ƽ�Ű�ڵ�󿡼� a���� 1�������ְ� �ɸ��ͷκ�ȯ
//		}while(a<='z'); // a~z���� ���

//		�迭(array)
//		�ѹ��� ���� �޸� ���� ���� ����
//		���� Ÿ���� �����͵��� ���������� �����
//		�迭 �ε����� 0���� ����	
//		int  	ary[]  =  new  int[n];
//		�ڷ��� �迭���ε��� 	���λ��� �ڷ���[����]
//			�迭 ����    =    �迭 ����

//		int a[] = new int[5];
//		double b[] = new double[10];
//		int c[] = new int[3];
//		char d[]=new char[5];

//		int a[] = {1,2,3};  //�迭�ʱ�ȭ  �ʱ�ȭ �� ���� �����ۼ�X
//		System.out.println(a[2]); // 3
//		
//		float b[]= {0.1f,0.2f,0.3f,0.4f,0.5f};
//		System.out.println(b[3]); // 0.4
//		
//		int c[]= {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0;i<10;i++) {
//			System.out.println(c[i]);
//		}
//		
//		Scanner sc=new Scanner(System.in);
//		double arr[] = new double[3];
//		for(int i=0;i<=2;i++) {
//			arr[i]=sc.nextDouble(); //�Ǽ��� 3�� �Է���
//			System.out.println(arr[i]);
//		}
		
//		Scanner sc=new Scanner(System.in);
//		double a[]=new double[5];
//		int sum=0;
//		for(int i=0;i<5;i++) {
//			a[i]=sc.nextDouble();
//			sum+=a[i];
//			System.out.println(a[i]);
//		}
//		System.out.println("Average of the number entered" + (sum/5.0));

//		Scanner sc = new Scanner(System.in);
//		int a[] = new int[5];
//		int max = 0;
//		for (int i = 0; i < 5; i++) { // �Էµ� �� �� �ִ�ã��
//			a[i] = sc.nextInt();      // Find the maximum of 
		// the entered values
//			if (max < a[i]) {
//				max = a[i];
//			}
//		}
//		System.out.println("The biggest number is " + max);

//		int arr[]=new int[5];
//		int size=arr.length; // �迭��.length
//		System.out.println(size);

//		Scanner sc = new Scanner(System.in);
//		int arr[]=new int[5];
//		double sum=0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//			sum+=arr[i];
//		}
//		System.out.println("The average is "+(sum/arr.length));

//		Scanner sc = new Scanner(System.in);
//		int arr[]=new int[7];
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//			sum+=arr[i];
//		}
//		System.out.println((double)sum/arr.length);

//		int arr[]=new int[10]; //fibonacci
//		arr[0]=1;
//		arr[1]=2;
//		for(int i=0;i<8;i++) {
//			arr[i+2]=arr[i]+arr[i+1];
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
		
//		Scanner s = new Scanner(System.in);
//		int sum = 0; // ���պ���
//		int multi = 1; // �Ѱ�����
//		int ary[] = new int[4];
//		for(int i=0;i<ary.length;i++) {
//			ary[i]=s.nextInt();
//			sum+=ary[i];
//			multi*=ary[i];
//		}
//		System.out.println("The Sum of the number entered is "+sum);
//		System.out.println("Multiply all the entered numbers by "+multi);
		
//		int[] num = {1,2,3,4,5};
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		(����for��)for - each: �迭�� ����Ҹ� ���������� �����Ѵ�
//		for(int i:num) {
//			System.out.println(i);
//		}
		
//		String name[]= {"�����丶��","���ξ���","�ٳ���","���","��",};
//		for(String i:name) {
//			System.out.println(i);
//		}
		
//		int sum=0;
//		int arr[]= {1,2,3,4,5};
//		for(int i:arr) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		String str[]= {"computer","java","DB"};
//		for(String s:str) {
//			System.out.println(s);
//		}
		
//		2���� �迭 �࿭
//		int  arr[][];
//		arr=new int[2][5];
//		int arr[][] =new int[2][5];
		
//		char s[][] =new char[5][5];
//		double d[][] =new double[5][2];
//		
//		int c[][] = {{1,2,3},{4,5,6}};
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println(c[i][j]);
//			}
//		}
			
//		Scanner sc = new Scanner(System.in);
//		double arr[][]=new double[2][3];
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				arr[i][j]=sc.nextDouble();
//				System.out.println(arr[i][j]);
//			}
//		}
		int a[]= new int[10];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<11;i++) {	
			a[i]=sc.nextInt();
			if(a[i]%5==0) {
				System.out.println(a[i]);
			}
		}
		
		
		

	}

}
