package sol0620;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EE {

	public static void main(String[] args) throws SQLException {
		Connection conn = null; 
		// db�� �����ϴ� �������̽�
		PreparedStatement psmt = null;
		// sql�� �����Ű������  ��ü
		ResultSet rs = null;
		// sql�� ���� ��ȯ��(�������࿡���� ���������)

		try {
			conn = CC.get();
//			String input = "insert into emp1";
//					input += " values(8000,'ATOM','MANAGER',null,sysdate,7777,null,20)";
			
//			psmt=conn.prepareStatement(input);
//			int rs = psmt.executeUpdate();
			//executeUpdate �� ��ȯ�� int
			
			String delete = "delete from emp1";
			delete += " where ename in 'ATOM'";
			
			psmt=conn.prepareStatement(delete);
			rs = psmt.executeQuery();
			
			System.out.println("����");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		rs.close();
		psmt.close();
		conn.close();
	}

}
