package SolDesk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassNine {

	public static void main(String[] args) throws IOException {
		
//		int arr[]; //�迭 ���۷���(����) ���� ����
//		arr=make();// �迭 ����
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		5
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				System.out.println("���� �Է�:");
//				int A =sc.nextInt();
//				System.out.println("���� �Է�:");
//				int B =sc.nextInt();
//				System.out.println("����: "+(A+B));
//				break;
//			}catch(Exception e) {
//				System.out.println("�Ǽ��� �ȵȴ�");
//				sc.next();
//				continue;//�Ʒ��ڵ尡�����Ƿ� �ǹ̾���
//			}	
//		}
		
//		6
//		Scanner s=new Scanner(System.in);
//		int a=0,b=0;
//		func(a,b);
		
//		7
//		int score[] = {58,60,86,90,84};
//		pr(score,5);

//		8
//		System.out.println(show('$',10));

//		9. �����δ� �������, ��ճ׿䡱��� ���ڿ��� str�� 
//		������ ��,","�� �������� ���ڿ��� �����غ���,
//		�ε��� 6�� �ִ� �� ���ڸ� ���, �����δ¡� ���
//		String s = "���δ� �������, ��ճ׿�";
//		String[] c = s.split(",");
//		System.out.println(s.charAt(6));
//		System.out.println(s.substring(0, 3));
		
		/*
		 *  ����� ��Ʈ��
		 *  �������α׷��� �������ġ�� �����ϴ� ����Ʈ������
		 *  �Է�-�Է½�Ʈ��-�ڹ�����α׷�-��½�Ʈ��-���
		 */
		
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("hi.txt"));
//			bw.write("�ȳ��ϼ���");
//			bw.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			BufferedReader br=new BufferedReader(new FileReader("hi.txt"));
//			String s;
//			while(true) {
//				try {
//					s=br.readLine();
//					if(s==null) {
//						break;
//					}
//					System.out.println(s);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		BufferedReader br=null;//�Է��ϱ����� ���ڴ��� ��Ʈ��
//		PrintWriter pw=null;//����ϱ����� ���ڴ��� ��Ʈ��
//		
//		try {
//			InputStreamReader in = new InputStreamReader(System.in);
//			br = new BufferedReader(in);//�ֿܼ� �Է��ϱ�����
//			FileWriter fw = new FileWriter("c.txt");//���ϻ���
//			pw = new PrintWriter(fw);
//			
//			String str=null;
//			while((str=br.readLine()) != null){
//				pw.println(str);
//			}
//			br.close();//�Է� ����
//			
//		}catch(Exception e) {
//			
//		}finally {
//			pw.close(); //���� ����
//		}
		/*
		 * �ܼ�â���� ctrl + z ������ �ܼ�â��ܻ��¹ٿ���
		 * ���ڿ����� �ԷµǸ� terminated �� �ٲ� 
		 */
		
//		FileOutputStream fos = new FileOutputStream("ouput2.txt", true);
//		try(fos) {
//			byte[] bs = new byte[26];
//			byte data = 65;
//			for(int i=0;i<bs.length;i++) {
//				bs[i]=data;
//				data++;
//			}
//			fos.write(bs);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("��� �Ϸ�");
		
//		ByteArrayInputStream in = null;
//		FileOutputStream out= null;
//		
//		try {
//			byte[] b=new byte[] {1,2,3};
//			in = new ByteArrayInputStream(b);
//			out = new FileOutputStream("g.dat");
//			
//			int r=-1;
//			while((r=in.read())!=-1) {
//				out.write(r);
//			}
//		}
//		catch(Exception e) {}
//		out.close();
//		in.close();
		
//		FileInputStream in=null;
//		ByteArrayOutputStream out = null;
//		
//		try {
//			in = new FileInputStream("g.dat");
//			// g.dat �� �о���� ��ü
//			out = new ByteArrayOutputStream();
//			// ����Ʈ�迭������ ���� ��ü
//			int r = -1;
//			while((r=in.read()) != -1) {
//				out.write(r);
//			}
//			byte a[]=out.toByteArray();
//			//���ο� ����Ʈ�迭�� ����
//			for(int i=0;i<a.length;i++) {
//				System.out.println(a[i]);
//			}
//			
//		}
//		catch(Exception e) {}
//		in.close();
//		out.close();
		
		
//		byte[]in= {1,2,3,4,5};
//		byte[]out=null;
//		
//		ByteArrayInputStream bin =null;
//		ByteArrayOutputStream bout = null;
//		
//		try {
//			bin= new ByteArrayInputStream(in);
//			bout= new ByteArrayOutputStream();
//			int r=0;
//			while((r=bin.read()) != -1 ) {
//				bout.write(r);//��Ʈ���� ����
//			}
//			out = bout.toByteArray();
//			//����Ʈ��Ʈ���� ����Ʈ�迭�� �ٲ㼭 out������
////			for(int i=0;i<out.length;i++) {
////				System.out.println(out[i]);
////			}
//			System.out.println(Arrays.toString(in));
//			//toString : ��ü�� ���ڿ��� ��ȯ���ִ� �޼���
//			System.out.println();
//			System.out.println(Arrays.toString(out));
//			
//		}catch(Exception e){}
//		bin.close();
//		bout.close();
		
		
//		DataOutputStream dout = null;
//		try {
//			int a=5;
//			double b=1.5;
//			boolean c=true;
//			FileOutputStream fout = new FileOutputStream("h.txt");
//			dout =new DataOutputStream(fout);
//			
//			dout.writeInt(a);
//			dout.writeDouble(b);
//			dout.writeBoolean(c);
//			
//		}catch(Exception e) {}
//		dout.close();
//		
//		DataInputStream din =null;
//		try {
//			FileInputStream fin =new FileInputStream("h.txt");
//			din = new DataInputStream(fin);
//			int a = din.readInt();
//			double b = din.readDouble();
//			boolean c = din.readBoolean();
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
//		}catch(Exception e) {
//			
//		}
//		din.close();
		
//		InputStreamReader in =new InputStreamReader(System.in);
//		
//		FileWriter out = null;
//		try {
//			out = new FileWriter("save.txt");
//			int r;
//			while((r=in.read()) != -1) {
//				out.write(r);
//			}
//		}catch(Exception e) {}
//		in.close();
//		out.close();
		
//		InputStreamReader in =new InputStreamReader(System.in);
//		FileWriter out = null;
//		try {
//			out = new FileWriter("sample.txt");
//			int n;
//			while((n=in.read())!=-1) {
//				out.write(n);
//			}
//		}catch(Exception e) {}
// 		in.close();
// 		out.close();
 		
// 		BufferedReader fr=new BufferedReader(new FileReader("sample.txt"));
// 
// 		try {
// 			String n;
//			while((n=fr.readLine()) != null) {
//				System.out.println(n);
//			}
// 		}catch(Exception e) {}
// 		fr.close();
 		
		
	}
	
//	static void pr(int a[],int b) {
//		for(int i=0;i<a.length;i++) {
//			int s=a[i]/b;
//			for(int j=0;j<s;j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//	}
//	
//	static String show(char c,int a) {
//		String s="";
//		for(int i=0;i<a;i++) {
//			s += c;
//		}
//		return s;
//	}
	
//	(Ű����� �Է��� ����� 5�� ������ ��� �������� ������ �����ϱ�)
//	static void func(int a,int b) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("���� �Է�:");
//		int i = s.nextInt();
//		a = i/5;
//		b = i%5;
//		System.out.println("��: "+a+", "+"������: "+b);;
//	}
	
//	static int[] make() {
//		int arr[]=new int [4];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i;// 0 1 2 3
//		}
//		return arr;
//	}
}
