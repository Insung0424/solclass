package Test;

import java.util.HashMap;
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

////class JavaTest3{
//		class Num{
//			int n;
//			int sum=0;
//			int max=0;
//			void add(int n) {
//				sum += n;
//				if(max<n) {
//					max = n;
//				}
//			}
//			public int getSum() {
//				sum += n;
//				return sum;
//			}
//			public int getMax() {
//				if(max<n) {
//					max = n;
//				}
//				return max;
//			}
//			
//			Num(){
//				n=0;
//			}
//			Num(int n){
//				this.n=n;
//			}
//		}
////}

class JavaTest4{
	HashMap<String,Integer> hm = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	JavaTest4(){
		hm.put("Kim", 111);
		hm.put("Lee", 222);
//		Iterator<String> it = hm.keySet().iterator(); 
		for(int i=0;i<hm.size();i++) {
			System.out.println("Kim, Lee �� �ϳ� �Է�");
			String s = sc.next();
			if(s.equals("Kim") || s.equals("Lee")) {
				System.out.println(hm.get(s));
			}
		}
	}
}
public class Exam {

	public static void main(String[] args) {
//		JavaTest1 j = new JavaTest1();
		
//		JavaTest2 j = new JavaTest2();
		
//		Num nb = new Num();
//		nb.add(7); nb.add(-1); nb.add(20); nb.add(5); // 4�� ���ڸ� �Է�
//		System.out.println("Sum = " + nb.getSum());   // 4�� ������ �հ�
//		System.out.println("Max = " + nb.getMax());   // 4�� ���� �� �ִ밪
//		Num nb2 = new Num(15);
//		System.out.println("Sum = " + nb2.getSum());
//		System.out.println("Max = " + nb2.getMax());
		
		JavaTest4 j = new JavaTest4();
	}

}
