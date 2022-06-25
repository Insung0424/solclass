package firstMiniProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SixMonthCountRecord {
	String count = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_aSC_MONTH6";
	String countd = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_DESC_MONTH6";
	
	SixMonthCountRecord(LoginProject lp){
		
		try {
			Connection conn = lp.getConnection();
			Statement stmt = conn.createStatement();
		
			ResultSet rset = stmt.executeQuery(count);
			while(rset.next()) {
				int i=rset.getInt(1);
				int j=rset.getInt(2);
				System.out.println("���� "+ i+"�� �ֱ� 6������ ���� Ƚ�� "+ j);
			}
			System.out.println("��Ͽ� ���� ���ڴ� �ֱ� 6������ ������ �ʾҽ��ϴ�");
		}catch(Exception er) {
			er.printStackTrace();
		}
	}
}
