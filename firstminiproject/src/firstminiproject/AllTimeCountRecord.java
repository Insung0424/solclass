package firstMiniProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllTimeCountRecord {
	
	String count = "select * from copy_lotto_table_count_number_asc";
	String countd = "select * from copy_lotto_table_count_number_desc";
	
	AllTimeCountRecord(LoginProject lp){
		
		try {
			Connection conn = lp.getConnection();
			Statement stmt = conn.createStatement();
		
			ResultSet rset = stmt.executeQuery(count);
			while(rset.next()) {
				int i=rset.getInt(1);
				int j=rset.getInt(2);
				System.out.println("���� "+ i+"�� ��ü�Ⱓ���� ���� Ƚ�� "+ j);
				
			}
		}catch(Exception er) {
			er.printStackTrace();
		}
	}
	
}
