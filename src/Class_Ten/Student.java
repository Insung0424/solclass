package Class_Ten;

public class Student {
	//private -> �ܺο��� ��������
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	//������� Ȥ�� field
	
	
	public String getStudentName() {
		return studentName;
	}

	public void showStudetnInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	

	public static void main(String[] args) {
		Student a;
		//Student a; ���۷��� ������ ����
		//��ü�� �����ϱ����� ��ü�� ����ų ���۷��� ���������� �ʿ�
		a=new Student();
		//a=new Student(); Student ��ü ����
		//new�����ڴ� StudentŸ���� ũ�⸸�� �޸𸮸� �Ҵ�޾�
		//�޸𸮿� ���� �ּҸ� �����ϰ� �ּҰ��� a�� �����Ѵ�
		
//      Student a = new Student(); �������� ���� ��ü����		
		
		a.studentName = "Tom";
		a.studentId = 2022051901;
		a.grade = 3;
		a.address = "Seoul";
		
		
		a.showStudetnInfo();
		
		
		
	}
	
	
}
