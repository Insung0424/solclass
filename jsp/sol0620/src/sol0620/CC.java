package sol0620;

import java.sql.Connection;
import java.sql.DriverManager;

public class CC {

	public static Connection con;
	// �����ͺ��̽��� �����ϱ� ���� �������̽�
	public static Connection get() {
		Connection conn = null;
		try {
			String id = "JIS";
			String pw = "123456";
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//jdbc ����̹� �ε� -> DriverManeger �� ��ϵ�
			//forName�� �����޼ҵ�
			
			conn = DriverManager.getConnection(url,id,pw);
			//connection ��ü�� ����
			//conn �� �����ͺ��̽��� �����Ͽ� �۾��� ������ �� �ִ�
			// ��η� �ۿ��ϴ� ��ü������ ����
			
			System.out.println("�����ͺ��̽��� �����");
			
			
			
			
		}catch(Exception e) {
			System.out.println("�ε� ����");
		}
		return conn;
	}
	

}
