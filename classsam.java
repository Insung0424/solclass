import java.util.Scanner;

public class classsam {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = sc.next();
//		System.out.println("Enter your address: ");
//		String address = sc.nextLine();
//		
//		System.out.println(name + " " + address);
//		
		// next ���� �Ǵ� ���ڿ��� ����������� �Է¹���(�����Է� �ȵ�)
		
		// nextLine �� �� ������ �Է¹���(����ġ�������� �Է¹��� ���鵵�Է�)
		// nextline�ܿ� �ٸ� next������� �Է� ������ enter�� ���ۿ� \n�� 
		// ���Եǰ� nextLine()�� ����� ���๮��(Enter)�� 
		// �и��ڸ� ���Խ�Ű�� ������ \n�� �������� ���α׷��� ����Ǵ� ���̴�.
		
//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
//		
//		if(score%10==0)
//			System.out.println("Pass");
//		else
//			System.out.println("Failed");
		
//		Math.random()*10+1 1~10
//		Math.random()*11+4 4~14
//		Math.random()*100+1 1~100
		
//		int n = (int)(Math.random()*100+1);
//		System.out.println(n);
//		if(n%5==0 && n%10!=0) 
//			System.out.println("A multiple of 5");
//		
//		else if(n%5==0 && n%10==0) 
//			System.out.println("A multiple of 10");
//		
//		else
//			System.out.println("Not a multiple of 5 or a multiple of 10 ");
//			
//		int n = (int)(Math.random()*20+81);
//		String grade;
//		if(n>=90) {
//			if(n>=95) {
//				grade = "A+";
//			}
//			else { // 90 ~ 94
//				grade = "A";
//			}
//		}
//		else
//			if(n>=85) { // 85 ~ 89
//				grade = "B+";
//			}
//			else  // 81 ~ 84
//				grade = "B";
//		
//		System.out.println(n + " " +grade);
		
//		for(int i = 0;i<11;i=i+2) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0;i<11;i++) {
//			if(i%2==0)
//				System.out.println(i);
//		}
		
//		for(int i = 1; i<100;i++)
//			if(i%5==0 && i%6==0)
//				System.out.println(i);
		
//		int sum = 0; //�����ձ��ϱ�
//		for(int i = 0; i<101;i++)
//			sum += i;
//		System.out.println(sum);
		
//		int sum=0;
//		for(int i = 1;i<101;i++) {
//			if(i%2==0)
//				sum+=i;
//		}
//		System.out.println(sum);
		
//		for(int i = 1;i<16;i++) {
//			System.out.print("*");
//			if(i%5==0)
//				System.out.println();
//		}
		
//		Scanner sc = new Scanner(System.in); //������
//		System.out.println("What's multiplication table?");
//		int dan = sc.nextInt();
//		
//		for(int i = 9;i>=1;i--)
//			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		
//		for(int i=0;i<10;i++,System.out.println(i));
		// 1���� �� ��µ�
//		for(int i=0;true;i++) //true -> ���ѹݺ�
		
//		1.5/3 �� ������� �Ҽ��� ��° �ڸ� ���� ����ض�. (printf ���)
//		System.out.printf("%d / %d = %.2f",5,3,5/3.0);
		
//		2.Ű(double)�� �ϳ� �Է¹޾� 160���� ������ ��small��, 
//		170���� ������ ��medium��, 180���� ������ ��large��
//		Scanner sc = new Scanner(System.in);
//		double height =sc.nextDouble();
//		if(height<160)
//			System.out.println("small");
//		else if(height<170)
//			System.out.println("medium");
//		else
//			System.out.println("large");
		
		
//		3.n1�� 50, n2�� 100���� �ʱ�ȭ�Ͽ�
//		�� �� �� ū ���� �Ǻ��Ͽ� ����ض�. (���� ������ Ȱ��)
//		int n1=50,n2=100;
//		System.out.println(n1>n2? n1:n2);
		
//		4.���̸� �������� ��øif���� ����Ͽ� ����ض�.(����, Ű, ������ ���� ������ ����)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է�:");
//		int age = sc.nextInt();
//		System.out.println("Ű �Է�:");
//		double height = sc.nextDouble();
//		char size = '0';
//		if(age<20) {
//			if(height<160) {
//				size = 'S';
//			}
//			else if(height<170){
//				size = 'M';
//			}
//			else if(height>=170){
//				size = 'L';
//			}
//		}
//		else {
//			if(height<165) {
//				size = 'S';
//			}
//			else if(height<175){
//				size = 'M';
//			}
//			else if(height>=175){
//				size = 'L';
//			}
//		}
//		System.out.println(size);
		
//		5.1���� 50������ ������ ����ض�.(for)
//		for(int i=1;i<51;i++)
//			System.out.println(i);
		
//		5-1.1~50 ���� �� 6�� ����� ����ض�.(for, if)
//		for(int i=1;i<51;i++)
//			if(i%6==0) {
//				System.out.println(i);
//			}
		
//		5-2.1~50������ ���� ����ض�.
//		int sum=0;
//		for(int i=1;i<51;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);

//		5-3.1~50 ������ random�Լ��� ���� ���� �� �� ������ �� �ϳ�(����)����ض�.
//		System.out.println((int)(Math.random()*50+1));	
		
//		6.a=10, b=20���� �ʱ�ȭ�ϰ�, ������(+,-,*,/)�� �ϳ��� �Է¹޴´�.
//				+�̸� �μ��� ��, -�̸� ��, *�̸� ��, /�̸� ���� ���Ͽ� ����ض�.(switch-case�� ���)
//		int a=10,b=20;
//		Scanner sc =new Scanner(System.in);
//		System.out.println("+,-,*,/ �� �ϳ��� �Է����ּ���");
//		String sign = sc.next();
//		switch(sign) {
//		case "+":
//			System.out.println(a+b);
//			break;
//		case "-":
//			System.out.println(a-b);
//			break;
//		case "*":
//			System.out.println(a*b);
//			break;
//		case "/":
//			System.out.println(a/b);
//			break;
//		}
		
//		int sum=0;
//		for(int i = 0;i<=10;i++) {
//			sum+=i;
//			System.out.print(i);
////			if(i<=9)System.out.print("+");
//			if(i==10) {
//				System.out.print("=");
//				System.out.print(sum);
//			}
//			else
//				System.out.print("+");
//		}

//		�ʱ��
//		while(���ǽ�) {
//			�۾���
//			������
//		}
//		int i = 0;
//		while( i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		for(int i=0;i<10;i++)
//			System.out.println(i);
		
//		int i = 0;
//		while(i<100) {
//			if(i%2!=0)
//				System.out.println(i);
//			i++;
//		}
		
//		int i = 10;
//		while(i>0) {
//			System.out.print(i+" ");
//			i--;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = sc.nextInt();
//		
//		switch(n) {
//		case 2:
//			System.out.println("2dan");
//			int i = 1;
//			while(i<10) {
//				System.out.println(n+"*"+i+"="+n*i);
//				i++;
//			}
//			break;
//		case 3:
//			System.out.println("3dan");
//			i = 1;
//			while(i<10) {
//				System.out.println(n+"*"+i+"="+n*i);
//				i++;
//			}
//			break;
//			
//		default :
//			System.out.println("You entered it incorrectly");
//		}
		
//		int i = 1;
//		while(i<100) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 1;
//		while(i<100) {
//			if(i%2==0 && i%3==0)
//				System.out.println(i);
//			i++;
//		}
		
//		for(int i=2;i<=9;i++) { //�ٱ���for���� �������� ����for���� ����
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//		}
		
//		for(int i=1;i<=3;i++) { //��
//			for(int j=1;j<=3;j++) { //��
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=2;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("@");
//			}
//			System.out.println();
//		}
		
		//�������� ��� i���� ����� j���� ������
//*		for(int i=0;i<=4;i++) {
//**		for(int j=1;j<=i+1;j++) {
//***				// ���� ���ǽ� j<=i+1;
//****			System.out.print("*");
//*****		}
//			System.out.println();
//		}
		
//		for(int i=5;i>0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<9;i++) {
//			if(i<5) {
//				for(int j=4;j>i;j--) 
//					System.out.print(" ");
//				for(int j=0;j<=i;j++)
//					System.out.print("*");	
//				System.out.println();
//			}
//			else {
//				for(int j=4;j<i;j++)
//					System.out.print(" ");
//				for(int j=8;j>=i;j--)
//					System.out.print("*");
//				System.out.println();
//			}
//		}
		
	}
}