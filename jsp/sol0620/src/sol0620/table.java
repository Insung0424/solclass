package sol0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class table {
	public static Connection c;
	
	public static Connection Ct() {
		Connection c= null;
		
		PreparedStatement psmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			c = DriverManager.getConnection(url,"JIS","123456");
			
			System.out.println("�����");
			
		}catch(Exception e) {
			System.out.println("�ε� ����");
		}
		return c;
	}
	
	public static void main(String[] args) throws SQLException {
		
		
		String input = "create table emp3 as select * from emp1";
		Connection con = null;
		PreparedStatement psmt = null;
		
		try {
			con = Ct();
			//DB �� ����
			psmt = con.prepareStatement(input);
			//sql ��ɹ� ����
			int n = psmt.executeUpdate();
			//sql ��ɹ� ����
			
			System.out.println(n>0 ? "����":"����");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		psmt.close();
		con.close();
		
	}

}
