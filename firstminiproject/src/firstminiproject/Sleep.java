package firstMiniProject;

import java.awt.Toolkit;
import java.time.LocalDate;

public class Sleep {
    	
	Sleep(){
        Toolkit toolkit =  Toolkit.getDefaultToolkit();
        LocalDate now = LocalDate.now();
        int day = now.getDayOfMonth();
        int randomN = (int) (Math.random()*45+1);
        String teacher = "����� ������ "+day+"���̴ϱ� "+randomN+"��";
        
            try {
            	for(int i=0;i<teacher.length();i++) {
            		Thread.sleep(300);
                    System.out.print(teacher.charAt(i));
            	}
            	System.out.println();
            	Thread.sleep(500);
            	System.out.println("��?");
            	Thread.sleep(1000);
            	System.out.println("�׷��� ��� �־� �� ������");
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
	}
        
}
