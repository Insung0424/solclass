package fun1;

import java.time.LocalDate;

import javax.swing.JTextArea;

public class Sleep extends Thread{
	
	//������� �����ϴ� �޺��ڽ��� �Ǿ��� ���� 1��
	
	JTextArea jt;
	
	public Sleep(JTextArea jt) {
		this.jt = jt;
	}

	public void run() {
        LocalDate now = LocalDate.now();
        int day = now.getDayOfMonth();
        int randomN = (int) (Math.random()*45+1);
        String teacher = "����� ������ "+day+"���̴ϱ� "+randomN+"��";
        
            try {
            	Thread.sleep(700);
            	jt.append(teacher);
            	Thread.sleep(700);
            	jt.append("\n��?");
            	Thread.sleep(1400);
            	jt.append("\n�׷��� ��� �־� ������ ��������");
            	jt.append("\n");
            } 
            catch (InterruptedException er) {
                er.printStackTrace();
                return;
            }
		
	}

}
