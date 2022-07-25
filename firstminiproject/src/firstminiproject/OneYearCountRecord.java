package firstMiniProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OneYearCountRecord {
	String count = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
	String countd = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_DESC_YEAR1";
	
	OneYearCountRecord(LoginProject lp){
		
		try {
			Connection conn = lp.getConnection();
			Statement stmt = conn.createStatement();
		
			ResultSet rset = stmt.executeQuery(count);
			while(rset.next()) {
				int i=rset.getInt(1);
				int j=rset.getInt(2);
				System.out.println("���� "+ i+"�� �ֱ� 1�Ⱓ ���� Ƚ�� "+ j);
			}
			System.out.println("��Ͽ� ���� ���ڴ� �ֱ� 1�Ⱓ ������ �ʾҽ��ϴ�");
		}catch(Exception er) {
			er.printStackTrace();
		}
	}
}
