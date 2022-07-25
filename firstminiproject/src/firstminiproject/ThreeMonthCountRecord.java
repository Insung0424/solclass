package firstMiniProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ThreeMonthCountRecord {
	String count = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_aSC_MONTH3";
	String countd = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_DESC_MONTH3";
	
	ThreeMonthCountRecord(LoginProject lp){
		
		try {
			Connection conn = lp.getConnection();
			Statement stmt = conn.createStatement();
		
			ResultSet rset = stmt.executeQuery(count);
			while(rset.next()) {
				int i=rset.getInt(1);
				int j=rset.getInt(2);
				System.out.println("���� "+ i+"�� �ֱ� 3������ ���� Ƚ�� "+ j);
			}
			System.out.println("��Ͽ� ���� ���ڴ� �ֱ� 3������ ������ �ʾҽ��ϴ�");
		}catch(Exception er) {
			er.printStackTrace();
		}
	}
}
