package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("writer.txt");
			fw.write('A');
			char buf[] = {'B','C','D','E','F','G'};
			fw.write(buf);
			fw.write("�ȳ��ϼ���. �� �����׿�");
			fw.write(buf,1,2);
			fw.write("65");
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		
		
		
		
		
		try {
			BufferedReader br= new BufferedReader(new FileReader("writer.txt"));
			String s;
			while(true) {
				try {
					s=br.readLine();
					if(s==null) {
						break;
					}
					System.out.println(s);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
