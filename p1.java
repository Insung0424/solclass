package practice;

public class p1 {

	public static void main(String[] args) {
//		for(int i = 1;i<=5;i++) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" : "+i);
//		} 
		
//		for(int i = 5;i>=1;i--) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" : "+i);
//		} 
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" i:"+i);
//		} 
		// ���ݱ��� ������ for���� ���Ǻΰ� Ƚ���� ������ ������
		// ���Ǻο��� Ƚ���� �����ϴ°ͻӾƴ϶� ���̰� �ø� �� ����
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j)
//				System.out.println(" ");
//			for(int j=0)
//				System.out.println("*");
//				
//		}
		
		for(int i=0;i<5;i++) {
			if(i<3) {
				for(int j=0;j<3-i;i++) {
					System.out.println(" ");
				}
				for(int j=0;j<i*2+1;j++) {
					System.out.println();
				}
			}
			else {
				for(int j=0;j<i-2;i++) {
					System.out.println(" ");
				}
				for(int j=9;j>=i*2+1;j--) {
					System.out.println("*");
				}
			}
			System.out.println(" ");
		}
		
	}

}
