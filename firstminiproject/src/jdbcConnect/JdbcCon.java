package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcCon {
	public static void main(String[] args) {
//		String url;
//		Connection conn = null;
//		url="jdbc:oracle:thin:@localhost:1521/xepdb1";
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("fine");
//			conn=DriverManager.getConnection(url,"ID","PW");
//			System.out.println("good");
//			String a = "select empno,ename,job from emp1 where ename='KING'";
//			PreparedStatement psmt = conn.prepareStatement(a);
//			ResultSet rs = psmt.executeQuery();
//			
//			int a1 = 0;
//			String n1 = null;
//			String n2 = null;
//			while(rs.next()) {
//				a1 = rs.getInt(1);
//				n1 = rs.getString(2);
//				n2 = rs.getString(3);
//			}
//			System.out.println(a1+" "+n1+" "+n2);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		String url;
		Connection conn = null;
		// DB�� ��Ŭ������ �����ϴ� ��ü
		
		
		url="jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
		/*
		 *  url ������ 
		 *  jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=
		 *  ��������� �⺻ �״�� �νø� �˴ϴ�
		 *  ���Ŀ� ������ �̺κ��� ���� �ؾ��մϴ� /ora/Wallet_DBSOLDESKTEAM1"
		 * 	������������������ ���������ٵ� ���������Ͻð�
		 * 	������������ Wallet_DBSOLDESKTEAM1 �� �ִ� ��θ� ���ֽø� �˴ϴ�
		 *  ��õ ��δ� c ����̺� �ؿ� ora������ ����� �� �ȿ��� ���������Դϴ�
		 *  C:/ora/Wallet_DBSOLDESKTEAM1(��������������) �� ���°� �Ǹ�
		 *  ��� ������� ��밡�� �մϴ�
		 *  
		 */
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("fine");
			
			
			conn=DriverManager.getConnection(url,"admin","soldesk01TEAM)!");
			System.out.println("good");
			
			
			String a = "select LO_ROUND,NUM1,NUM2 from copy_lotto_table "
					+ "where lo_round=30";
			
//			String a1 = "select LO_ROUND,NUM1,NUM2 from copy_lotto_table";
			/*
			 * �⺻���� ��Ŭ������ Ŭ����DB�� ������ Ȯ�Ή���ϴ�
			 * 
			 * ������ �����ؼ� �����ٹ޾ƺ����ߴµ� ���� ������� ���ٸ� ���Խ��ϴ�
			 * ���� ����ǻ�Ϳ����� ���������Ѱ� ��� ��� �ϴ��� ���� �Ѱ���ϴ�
			 * ����� �ƽô� ���� Ȯ�ιٶ��ϴ� 
			 * 
			 */
			PreparedStatement psmt = conn.prepareStatement(a);
			ResultSet rs = psmt.executeQuery();
			
			int a1 = 0;
			int n1 = 0;
			int n2 = 0;
			while(rs.next()) {
				a1 = rs.getInt(1);
				n1 = rs.getInt(2);
				n2 = rs.getInt(3);
			}
			System.out.println(a1+" "+n1+" "+n2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
