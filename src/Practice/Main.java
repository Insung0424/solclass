package Practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

////p392~393
//class Powder{
//	public void doPrinting() {
//		System.out.println("�Ŀ���� ����Դϴ�");
//	}
//	
//	public String toString() {
//		return "���� powder";
//	}
//}
//class Plastic{
//	public void doPrinting() {
//		System.out.println("�ö�ƽ�� ����Դϴ�");
//	}
//	public String toString() {
//		return "���� plastic";
//	}
//}
//class Printer<T>{
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

////p407
//class Member{
//	private int memberId;
//	private String memberName;
//	public Member(int memberId,String memberName) {
//		this.memberId=memberId;
//		this.memberName=memberName;
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
//	@Override
//	public String toString() {
//		return memberName+"ȸ���� ���̵�� "+memberId+"�Դϴ�";
//	}
////	p427
//	@Override
//	public int hashCode() {
//		return memberId;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;//�ٿ�ĳ����
//			if(this.memberId == member.memberId) 
//				//������ �Ǵ� ��ü�� ��
//				return true;
//			else 
//				return false;
//		}
//		return false;
//	}
//}

////p436
//class Member2 implements Comparator<Member2>{
//	//comparator �������̽��� �̿��� ��
//	private int memberId;
//	private String memberName;
//	public Member2(int memberId,String memberName) {
//		this.memberId=memberId;
//		this.memberName=memberName;
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
//	@Override
//	public int compare(Member2 o1, Member2 o2) {
//		// ��ȯ���� int
//		return o1.getMemberId() - o2.getMemberId();
//		// o1�� �������� -��� ����� ��������
//	}
//}

////p437
//class Mycompare implements Comparator<String>{
//	@Override
//	public int compare(String o1, String o2) { 
//		//Comparator �������̽��� compare�޼ҵ� @Override
////		return o1.compareTo(o2);// ���: ��������
//		return (o1.compareTo(o2))*-1; 
//		// ����� ���� -1 ���ؼ� ���� : ��������
//	}
//}

public class Main{
	
	public static void main(String[] args) {
////		p394
//		Printer<Plastic> pp = new Printer<>();
//		pp.setMaterial(new Plastic());
//		Plastic plastic = pp.getMaterial();
//		System.out.println(pp);
//		
//		Printer<Powder> pw = new Printer<>();
//		pw.setMaterial(new Powder());
//		Powder powder = pw.getMaterial();
//		System.out.println(pw);
		
////		p437
//		Set<String> set = new TreeSet<>(new Mycompare());
//		set.add("aaa");
//		set.add("bbb");
//		set.add("ccc");
//		System.out.println(set);
		
		
	}
}