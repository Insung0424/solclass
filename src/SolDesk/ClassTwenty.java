package SolDesk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ClassTwenty {

	public static void main(String[] args) {
//		HashMap<Integer,String> hashMap =
//				//key , value
//				new HashMap<>();
//		hashMap.put(1, "k");
//		hashMap.put(2, "i");
//		hashMap.put(3, "j");
//		hashMap.put(4, "l");
//		System.out.println(hashMap.get(1)); //get(key)
//		System.out.println(hashMap.get(2)); 
//		System.out.println(hashMap.get(3));
//		System.out.println(hashMap.get(4)); 
		
//		HashMap<String,String> h = new HashMap<>();
//		h.put("��", "water");
//		h.put("Ŀ��", "coffee");
//		h.put("�ֽ�", "juice");
//		h.put("��", "tea");
//		Set<String> key = h.keySet();	
//		Iterator<String> i = key.iterator();
//		while(i.hasNext()) {
//			String s = i.next();
//			String v = h.get(s);
//			System.out.println(s+" "+v);
//		}
		
//		HashMap h = new HashMap();
//		h.put("h1", 123);
//		h.put("h2", 456);
//		h.put("h3", 789);
//		h.put("h4", 012);
//		Scanner sc =new Scanner(System.in);
//		String id;
//		int pw;
//		while(true) {
//			id=sc.next();
//			pw=sc.nextInt();
//			
//			if(!h.containsKey(id)) { 
//				//map�� id�� �������
//				System.out.println("���̵� ����");
//				continue;
//			}
//			else {//map�� id�� �������
//				if(! h.get(id).equals(pw)) {
//					//id ���� pw�� ������ ��
//					System.out.println("pw wrong");
//					continue;
//				}
//				else {
//					System.out.println("Log In");
//					break;
//				}
//			}
//		}
		
//		HashMap<String,String> h = new HashMap<>();
//		h.put("computer", "��ǻ��");
//		h.put("coffee", "Ŀ��");
//		h.put("cream", "ũ��");
//		Set<String> keys = h.keySet();
//		Iterator<String> it = keys.iterator();
//		while(it.hasNext()) {
//			String s=it.next();
//			String v=h.get(s);
//			System.out.println(s+" "+v);
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("ã�� �ܾ�");
//			String find = sc.next();
//			
//			String out = h.get(find);
//			// ������ �� = ã�� �ܾ� ã�ƿ���
//			if(out == null) {
//				// �������
//				System.out.println("���� �ܾ�");
//			}
//			else {
//				//�ִٸ� ���
//				System.out.println(out);
//			}
//		}
		
//		1
//		main()���� �ο����� �Է¹޾� �ο� ���� 
//		Profile������ ��ü�迭������ �����Ѵ�. 
//		�̸��� ���̵� �Է¹޾� ��ü�迭�� ������ �� ����ض�
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�迭 ���� �Է�");
//		int i = sc.nextInt();
//		Profile[] pf = new Profile[i];
//		for(int a=0;a<pf.length;a++) {
//			System.out.println("�̸� �Է�");
//			String name=sc.next();
//			System.out.println("���̵� �Է�");
//			String id=sc.next();
//			pf[a] = new Profile(name,id);
//		}
//		for(Profile b:pf) {
//			System.out.println(b.getname()
//					+" "
//					+b.getid());
//		}

////		2
////		ArrayList�� 0~100���������������� 
////		10���������ϰ�������ض�. 
////		����Ҷ��� Iterator�������̽�������ؼ�����ض�
//		ArrayList<Integer> soo = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		while(i<10) {
//			System.out.println((i+1)+"��°�� �Է�");
//			int a = sc.nextInt();
//			soo.add(a);
//			i++;
//		}
//		Iterator<Integer> it = soo.iterator();
//		while(it.hasNext()) {
//			int a = it.next();
//			System.out.print(a+" ");
//		}
		
////		3
//		HashMap<String, Integer> h =new HashMap<>();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ũ���?");
//		int size = sc.nextInt();
//		int i=0;
//		while(i<size) {
//			System.out.println("�̸� �Է�");
//			String s = sc.next();
//			System.out.println("���� �Է�");
//			int k = sc.nextInt();
//			h.put(s, k);
//			i++;
//		}
//		while(true) {
//			System.out.println("ã�� ���");
//			String find = sc.next();
//			Integer g = h.get(find);
//			if(g == null) {
//				System.out.println("����");
//			}
//			else {
//				System.out.println(g);
//				break;
//			}
//		}
		
////		4
//	HashMap<Integer, String> h =new HashMap<>();
//	Scanner sc = new Scanner(System.in);
//	for(int i=0;i<3;i++) {
//		System.out.println("�̸� �Է�");
//		String a = sc.next();
//		System.out.println("���� �Է�");
//		int b = sc.nextInt();
//		h.put(b,a);
//	}
//	int max=0;
//	Set<Integer> key = h.keySet();
//	Iterator<Integer> i = key.iterator();
//	String name = "";
//	while(i.hasNext()) {
//		int s = i.next();
//		if(max<s) {
//			name = h.get(s);
//			max = s;
//		}
//	}
//	System.out.println(max+" "+name);
		
//		Fo<Food> f = new Fo<Food>();
//		f.in(new Food());
//		pr(f);
//		Fo<Pizza> f1 = new Fo<Pizza>();
//		f1.in(new Pizza());
//		pr(f1);
		
//		GUI : graphic user interface
		
////		5
//		LinkedList<String> li = new LinkedList<>();
//		li.add("one");
//		li.add("two");
//		li.add("three");
//		Iterator<String> it = li.iterator();
//		while(it.hasNext()) {
//			String s = it.next();
//			if(s.compareTo("three") == 0) {
//				li.remove(s);
//			}
//		}
//		System.out.println(li);
//		System.out.println("================================");
//		
////		6
//		HashMap<Integer, String> h = new HashMap<>();
//		h.put(1, "one");
//		h.put(2, "two");
//		h.put(3, "three");
//		System.out.println(h);
//		Scanner sc = new Scanner(System.in);
//		int i=0;
//		while(true) {
//			System.out.println("1,2,3 �ƴϸ� -1");
//			i=sc.nextInt();
//			if(i==-1) {
//				System.out.println("����");
//				break;
//			}
//			System.out.println(h.get(i));
//		}

		
	}
		

//	static void pr(Fo <? extends Food> f) {
//				//�ڷ��� ���� �ڽİ� �ڽ��� ����
//		Food fo=f.get();// Food fo = Food.get();
//		fo.show();
//	}
}
//class Fo<T>{
//	T t;
//	void in(T t) {
//		this.t = t;
//	}
//	T get() {
//		return t;
//	}
//}
//class Food{
//	void show() {
//		System.out.println("food");
//	}
//}
//class Pizza extends Food{
//	void show() {
//		super.show();
//		System.out.println("pizza");
//	}
//}
//class Profile{
//	String name,id;
//	Profile(String name, String id){
//	  this.name=name; this.id=id;
//	}
//	String getname(){ 
//		return name;
//	}
//	String getid(){ 
//		return id;
//	}
//}