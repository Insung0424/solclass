package lottomaxrecord;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTextArea;

import UI.LottoLogin;

public class TimeRecord2 extends Thread implements maxRecord{
	
	//����ϱⰣ�� ���ϸ� �ش�Ⱓ�� �´� �����̺��� �������� ���� ����ġ���̽��� select��
	JTextArea tarea;
	private String count;
	private String select = "";
	private TimeRecord2() {}
	ArrayList<Integer> nlist = new ArrayList<>();
	
	public TimeRecord2(String count,JTextArea tarea) {
		this.count = count;
		this.tarea = tarea;
	}

	@Override
	public void run() {
		SelectQuery();
	}

	@Override
	public void SelectQuery() {
		try {
			Connection conn = LottoLogin.getUserConnection();
			Statement stmt = conn.createStatement();
			if(tarea.getText().equals("��谡 ���̴� ��")) {
				tarea.setText("");
			}
		
			switch (count) {
			case "��ü�Ⱓ" :
				select = "select * from admin.copy_lotto_table_count_number_ASC";
				break;
			case "�ֱ� �Ѵ�" :
				select = "select * from admin.copy_lotto_table_count_number_ASC_MONTH1";
				break;
			case "�ֱ� 3����" :
				select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH3";
				break;
			case "�ֱ� 6����" :
				select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH6";
				break;
			case "�ֱ� 1��" :
				select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
				break;
			}
			
			ResultSet rset = stmt.executeQuery(select);
			nlist.clear(); //����� ����� �� ���� ���Ⱓ�� �����Ҷ� ������ ���� 
	    
		    while(rset.next()) {
		        int i=rset.getInt(1);
		        nlist.add(i);
		        int j=rset.getInt(2);
		        tarea.append("���� "+ i+"�� "+count+"���� ���� Ƚ�� "+ j+"\n");
		     }
		    tarea.append("\n");
		    NoneNum Nn = new NoneNum(nlist);
		     
		    if(Nn.getNoneNum().length() > 1) {
		    	 tarea.append("��Ͽ� ���� ����");
		    	 tarea.append("\n");
		    	 tarea.append(Nn.getNoneNum());
		    	 tarea.append("\n");
		    	 tarea.append("��(��) "+ count +"���� ������ �ʾҽ��ϴ�\n");
		    }
	    
	    }catch(Exception er) {
			er.printStackTrace();
		}
	}
}
	
	

	

	
	
	
	


