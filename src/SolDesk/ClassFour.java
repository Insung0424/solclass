package SolDesk;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ClassFour {

	public static void main(String[] args) {
//		for(int i = 0;i<10; i++)
//			System.out.print(i);
//		int sum=0;
//		for(int i=0;i<101;i++) {
//			sum += i;//0~100
//		}
//		System.out.println(sum);
//		
//		int total=0;
//		for(int i=100; i>0;i--)
//			total += i;//100~0 
//		System.out.println(total);

//		for(int i=0;i<11;i++)
//			if(i%2==0){ //0~10 only even number
//				System.out.print(i);
//			}
//			else
//				System.out.print(" ");

//		for(int i=0;i<5;i++) {
//			for(int v=4;v>i;v--)
//				System.out.print(" ");
//			for(int j=0;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}

//		for(int i=0;i<10;i++) { //������
//			for(int j=0;j<10;j++) {
//				System.out.println(i+" "+j);
//			}
//		}

//		for(int i=0;i<9;i++) { //���� ����
//			if(i<5) {
//			//������ ���� ���� ������ i���� ���� ����
//				for(int j=0;j<4-i;j++) {
//					System.out.print(" ");
//				}
//			//i�� ���� �ϸ� *�� ����	 j�� ������ i+1
//				for(int j=0;j<i+1;j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//			// i���� 4���̷� ����
//				for(int j=0;j<i-4;j++) {
//					System.out.print(" ");
//				}
//			// 9���� i���� ���� *
//				for(int j=0;j<9-i;j++) {
//					System.out.print("*");
//				}
//			}
//			//if - else ����
//			System.out.println(" ");//i�� ����
//		}

//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++)
//				System.out.print(" ");
//			for(int j=1;j<i*2+2;j++) {
//				System.out.print(j);
//			}
//		System.out.println(" ");
//		}

//		for(int i=0;i<5;i++) {
//			if(i<3) {
//				for(int j=0;j<2-i;i++) {
//					System.out.print(" ");
//				}
//				for(int j=0;j<i*2+1;j++) {
//					System.out.print("*");
//				}
//			}System.out.println(" ");
//		}
////			else {
////				for(int j=0;j<i-2;i++) {
////					System.out.println(" ");
////				}
////				for(int j=0;j<=i-1;j++) {
////					System.out.println("*");
////				}
////			}
////			System.out.println(" ");
////		}

//		int i=0;
//		while(i<11) {
////			i++; 1���� ��� ~10
//			System.out.println(i);
//			i++; //0���� ��� ~10
//		}

//		int i=0;
//		while(i<11) {
//			if(i%2==0)
//				System.out.println(i);
//			i++; //0���� ��� ~10 : even number
//		}

//		int sum=0,n=100; //while�� ������� �ʱ�ȭ
//		Scanner sc= new Scanner(System.in);
//		while(n!=0) { //0�� �ƴҶ�����
//			System.out.println("Enter a number");
//			// 0�� �Է��� �� ���� ��� ��µ�
//			n=sc.nextInt(); 
//			//���� �Է� 0�� �Է��� �� ���� ��� ��µ�
//			sum+=n; 
//			//���� �Է��� �� ��� ����
//			
//		}
//		System.out.println(sum);

//		for(int i=0;i<5;i++) {
//			if(i<3) {
//				for(int j=0;j<2-i;j++) {
//					System.out.print(" ");
//				}
//				for(int j=0;j<i*2+1;j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				for(int j=0;j<i-2;j++) {
//					System.out.print(" ");
//				}
//				for(int j=9;j>=i*2+1;j--) {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}

		// break �ݺ��� �ϳ��� ������ �������� �� ���
		// break���� �ϳ��� �ݺ����� ���
		// ��ø�ݺ����� ���ʿ��� break�� ������ٸ�
		// ���ʹݺ����� ����Ե�

//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("Enter your name: ");
//			String name=sc.next();
//			if(name.equals("In")) { //���ڿ� �� .equals()
//				break; //�ùٸ� ���� �ԷµǸ� �Ʒ����� ������� X
//						//�ݺ��� ������� ����
//			}
//			System.out.println(name);
//		}

//		while(true) {
//			int n=(int)(Math.random()*6+1);
//			if(n==6) {
//				System.out.println(n + " break");
//				break;
//			}			
//			else
//				System.out.println(n);
//		}

//		Scanner s = new Scanner(System.in);
//		int n=0;
//		
//		while(true) {
//			if(s.nextInt() == -1) {
//				break;
//			}
//			n++;
//			//else �� ��������
//		}
//		System.out.println(n);
//		// s �� �Է¹޾Ƽ� -1�� ������ Ȯ���� ���ٸ� break
//		// �ٸ��ٸ� n�� +1 ���� �ٽ� s �Է¹ݺ�(n=count)

//		int s = 1;
//		while(s<100) {
//			if(s%2==0 && s%3==0) {
//				System.out.println(s);
//			}
//			s++;
//		}

//		continue �ݺ����� ���������� �ʴ´�
//		�ݺ��� ���� ���� ���� �ݺ��� ����

//		for(int i=1;i<=100;i++) { 
//			if(i%2==0) { // ¦���� �ݺ�������ǹǷ�  i++
//				continue;
//			}
//			else {
//				System.out.println(i); //Ȧ�����
//			}
//		}

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter 5 integers");
//		int sum=0;
//		for(int i=0;i<5;i++) { //i=0 i<5 i->0,1,2,3,4 �ټ���
//			int n=sc.nextInt(); 
//			if(n<0) {
//				continue; // ���ܶ�� �����ϸ� ����
//			}
//			else {
////				System.out.println(n);
//				sum+=n;
//			}
//		}
//		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in);
//		int math = sc.nextInt();
//		int english = sc.nextInt();
//		System.out.printf("%d + %d / 2 = %.1f\n", math, english, (math + english) / 2.0);
//		System.out.print(math + " + " + english + " / 2 = " + ((double) (math + english) / 2));

//		Scanner sc = new Scanner(System.in);
//		int money = 100000;
//		int price;
//		System.out.println("�ð��� �Է��Ͻÿ�");
//		int time = sc.nextInt();
//		System.out.println("������ �Է��Ͻÿ�");
//		int number = sc.nextInt();
//
//		if (time == 14 && number <= 3) {
//			System.out.println("5% ����");
//			price = (int) ((money - (money * 0.05)) * number);
//			System.out.println(price);
//		} else if (time == 18 && number <= 5) {
//			System.out.println("10% ����");
//			price = (int) ((money - (money * 0.1)) * number);
//			System.out.println(price);
//		} else if (time == 20 && number <= 10) {
//			System.out.println("20% ����");
//			price = (int) ((money - (money * 0.20)) * number);
//			System.out.println(price);
//		} else {
//			System.out.println("���� �ݾ��� :" + money);
//		}

//		int i = 5;
//		while (i <= 9) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j);
//			}
//			i++;
//			System.out.println();
//		}
//
//		int n = 1;
//		int sum = 0;
//		while (n <= 100) {
//			if (n % 5 == 0) {
//				sum += n;
//			}
//			n++;
//		}
//		System.out.println(sum);

//		int x = 0, y = 0;
//		int a = 0;
//		while (true) {
//			x = (int) (Math.random() * 5 + 1);
//			y = (int) (Math.random() * 5 + 1);
//			a = x + y;
//			if (a == 5) {
//				break;
//			}
//			System.out.println(x + " " + y);
//		}
		
//		do while
//			������ �ȸ¾Ƶ� �ּ� �ѹ��� ����� , ���������� ����Ǳ⶧��
//		int i = 0; //�ʱ�ȭ  
//		do {
//			System.out.println(i); 
//			i++; //������
//		}while(i<10); //���Ǻ�
		
//		int i = 1;  // 1~20������ ��
//		int sum=0;
//		do {
//			sum+=i;
//			i++;
//		}while(i<21);
//		System.out.println(sum);
		
//		String str;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("Enter an String");
//			str=sc.next();
//			
//			if(str.equals("exit")) { // exit �̸� ���α׷�����
//				System.out.println("Exit the program");
//			}
//			else { // exit �� �ƴ� ���ڿ� ���
//				System.out.println(str);
//			}
//		}while(!str.equals("exit")); //exit �� �ƴ� ����
		
//		int ans=18;
//		Scanner sc=new Scanner(System.in);
//		int c = 0;
//		while(true) {
//			int my=sc.nextInt();
//			if(ans!=my) {
//				if(ans>my) {
//					System.out.println("ans > my");
//				}
//				else{
//					System.out.println("ans < my");
//				}
//			}
//			else {
//				System.out.println("ans = my");
//			}
//			c++;
//		}

//		Scanner sc=new Scanner(System.in);
//		System.out.println("�� ���ڸ� �Է����ּ���");
//		char A = sc.next().charAt(0);
//		int n = (int)A;
//		for(int i=97;i<=n;i++) {
//			for(int j=i;j<n;j++) {
//				char ch= (char)j;
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//		int sum=0;
//		for(int i = 1;i<=10;i++) {
//			System.out.print(i + " ");
//			sum+=i;
//			if(sum>=30) {
//				System.out.println(sum);
//				break;
//			}
//		}

//		int i = 0;
//		while(i<=10) {
//			System.out.print(i + " ");
//			sum+=i;
//			if(sum>=30) {
//				System.out.println(sum);
//				break;
//			}
//			i++;
//		}

//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(i%2==0) {
//					System.out.println(i+" "+j);
//				}
//				
//				else {
//					continue;
//				}
//			}
//			System.out.println();
//			
//		}
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(i%2==1) { //i%2 != 0
//					continue;
//				}
//				
//				else {
//					System.out.println(i+" "+j);
//				}
//			}
//			System.out.println();
//			
//		}
//		int i=0;
//		while(i<=9) {
//			i++;			
//			if(i%2==0) {// 0���� �����Ѵٸ� 0���� �ٷ� continue
//				continue;
//			}
//			else {
//				System.out.println(i);
//			}
////			i++;
//		}

		
	
		
	}

}
