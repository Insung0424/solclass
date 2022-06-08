package Practice;

import java.util.HashSet;

////p392~p393
//class Powder{
//	public void doPrinting() {
//		System.out.println("powder ���� ����մϴ�");
//	}
//	public String toString() {
//		return "���� powder�Դϴ�";
//	}
//}
//class Plastic{
//	public void doPrinting() {
//		System.out.println("Plastic ���� ����մϴ�");
//	}
//	public String toString() {
//		return "���� Plastic�Դϴ�";
//	}
//}
//class GenericPrinter<T>{
//	private T material;
//	public T getMaterial() {
//		return material;
//	}
//	public void setMaterial(T material) {
//		this.material = material;
//	}
//	public String toString() {
//		return material.toString();
//	}
//}

////p400
//class Point<T,V>{
//	T x;
//	V y;
//	public Point(T x, V y) {
//		this.x = x;
//		this.y = y;
//	}
//	public T getX() {
//		return x;
//	}
//	public V getY() {
//		return y;
//	}
//}

////p407~408
//class Member{
//	private int memberId;
//	private String memberName;
//	public Member(int memberId, String memberName) {
//		this.memberId = memberId;
//		this.memberName = memberName;
//	}
//	public int getMemberId() {
//		return memberId;
//	}
//	public void setMemberId(int memberId) {
//		this.memberId = memberId;
//	}
//	public String getMemberName() {
//		return memberName;
//	}
//	public void setMemberName(String memberName) {
//		this.memberName = memberName;
//	}
//	public String toString() {
//		return memberName+" ȸ������ ���̵�� "+
//				memberId+"�Դϴ�";
//	}
//}
////p410
//class MemberArrayList{
//	private ArrayList<Member> arrayList;
//	public MemberArrayList() { //member ��ü�迭
//		arrayList = new ArrayList<>();
//	}
//	public void addMember(Member member) {
//		arrayList.add(member); //member �߰�
//	}
//	public boolean removeMember(int memberId) {
//		for(int i=0;i<arrayList.size();i++) {
//			Member member = arrayList.get(i);
//			// ����Ʈ�� i��° member�� id �� memberId�� �� 
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(i);
//				//������ ����
//				return true;
//			}
//		}
//		//�������
//		System.out.println(memberId+"�� �������� �ʽ��ϴ�");
//		return false;
//	}
//	public void showAllMember() {
//		for(Member m : arrayList) {
//			System.out.println(m);
//		}
//		System.out.println();
//	}
//}

////p440 ����� 407~408�� ����
//class MemberHashMap{
//	private HashMap<Integer,Member> hashMap;
//	public MemberHashMap() {
//		hashMap = new HashMap<Integer,Member>();
//	}
//	public void addMember(Member member) {
//		hashMap.put(member.getMemberId(), member);
//	}
//	public boolean removeMember(int memberId) {
//		if(hashMap.containsKey(memberId)) {
//			//�ش� �ؽøʿ� ���� memberId�� �ִ��� Ȯ��
//			hashMap.remove(memberId);
//			return true;
//		}
//		System.err.println(memberId+"�� �������� �ʽ��ϴ�");
//		return false;
//	}
//	public void showAllMember() {
//		Iterator<Integer> it = hashMap.keySet().iterator();
//		while(it.hasNext()) {
//			Member member = hashMap.get(it.next());
//			System.out.println(member);
//		}
//		System.out.println();
//	}
//}

////p446 Q5
//class Student{
//	String id;
//	String name;
//	public Student(String id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//	@Override
//	public int hashCode() {
//		return Integer.parseInt(id);
//		// String -> int 
//	}
//	@Override
//	public boolean equals(Object obj) {
//			Student std = (Student)obj;
//			if(this.id == std.id) 
//				return true;
//			else 
//				return false;
//	}
//	public String toString() {
//		return id + ":" + name;
//	}
//}

////p447 Q6
//class Car{
//	String name;
//	public Car() {}
//	public Car(String name) {
//		this.name=name;
//	}
//}
public class Task {
////	p401
//	static <T,V> double makeRectangle(Point<T,V>p1, Point<T,V>p2) {
//		// Number Ŭ���� character,boolean �� �����ϰ� 
//		// ��� WrapperŬ������ ��ӹ޴� �߻�Ŭ���� 
//		double left = ((Number) p1.getX()).doubleValue();
//		double right = ((Number) p2.getX()).doubleValue();
//		double top = ((Number) p1.getY()).doubleValue();
//		double bottom = ((Number) p2.getY()).doubleValue();
//		
//		double width = right - left;
//		double height = bottom - top;
//
//		return width*height;
//	}
	public static void main(String[] args) {
////		p394
//		GenericPrinter<Powder> powderPrinter =
//				new GenericPrinter<>();
//		powderPrinter.setMaterial(new Powder());
//		Powder powder = powderPrinter.getMaterial();
//		System.out.println(powderPrinter);
//		
//		GenericPrinter<Plastic> plasticPrinter =
//				new GenericPrinter<>();
//		plasticPrinter.setMaterial(new Plastic());
//		Plastic plastic = plasticPrinter.getMaterial();
//		System.out.println(plasticPrinter);
		
////		p401
//		Point<Integer,Double> p1 = new Point<>(0, 0.0);
//		Point<Integer,Double> p2 = new Point<>(10, 10.0);
//		
//		double ret = makeRectangle(p1, p2);
//		System.out.println("p1,p2 �� ������ ������� �簢���� ���̴� "+ret+"�Դϴ�");
	
////		p411~412
//		MemberArrayList mar = new MemberArrayList();
//		Member memberLee = new Member(1001,"������");
//		Member memberSon = new Member(1002,"�չα�");
//		Member memberPark = new Member(1003,"�ڼ���");
//		Member memberHong = new Member(1004,"ȫ�浿");
//		
//		mar.addMember(memberLee);
//		mar.addMember(memberSon);
//		mar.addMember(memberPark);
//		mar.addMember(memberHong);
//		
//		mar.showAllMember();
//		
//		mar.removeMember(memberHong.getMemberId());
//		mar.showAllMember();
		
////		p441~442
//		MemberHashMap memberHashMap = new MemberHashMap();
//		Member memberLee = new Member(1001,"������");
//		Member memberSon = new Member(1002,"�չα�");
//		Member memberPark = new Member(1003,"�ڼ���");
//		Member memberHong = new Member(1004,"ȫ�浿");
//		
//		memberHashMap.addMember(memberLee);
//		memberHashMap.addMember(memberSon);
//		memberHashMap.addMember(memberPark);
//		memberHashMap.addMember(memberHong);
//		
//		memberHashMap.showAllMember();
//		
//		memberHashMap.removeMember(1004);
//		memberHashMap.showAllMember();
		
////		p446 Q5
//		HashSet<Student> set = new HashSet<>();
//		set.add(new Student("100","ȫ�浿"));
//		set.add(new Student("200","������"));
//		set.add(new Student("300","�̼���"));
//		set.add(new Student("400","�����"));
//		set.add(new Student("100","���߱�"));
//		System.out.println(set);
		
////p447 Q6
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("������");
		Car sonata2 = factory.createCar("������");
		System.out.println(sonata1 == sonata2); //true
		
		Car avante1 = factory.createCar("�¿���");
		Car avante2 = factory.createCar("�¿���");
		System.out.println(avante1 == avante2); //true
		
		System.out.println(sonata1 == avante1); //false
	}

}
