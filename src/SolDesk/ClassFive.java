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
		
		int a[] = {1,2,3};  //�迭�ʱ�ȭ  �ʱ�ȭ �� ���� �����ۼ�X
		System.out.println(a[2]); // 3
		
		float b[]= {0.1f,0.2f,0.3f,0.4f,0.5f};
		System.out.println(b[3]); // 0.4
		
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++) {
			System.out.println(c[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		double arr[] = new double[3];
		for(int i=0;i<=2;i++) {
			arr[i]=sc.nextDouble(); //�Ǽ��� 3�� �Է���
		}
		
	 	
		
		
	}

}
