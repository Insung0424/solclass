package SolDesk;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) {
//		ServerSocket ser = null;
//		try {
//			ser = new ServerSocket(); //�������ϻ���
//			ser.bind(new InetSocketAddress
//					("localhost",8080));
//			// �������ϰ� ���������� ����� ip�ּҿ� ��Ʈ��ȣ
//			while(true) {
//				System.out.println("����Ǳ⸦ ��ٸ�");
//				Socket so = ser.accept();
//				//�����û�� �����ϸ鼭 ���ϻ����Ѵ�
//				byte[] b = null;
//				String msg = null;
//				InputStream in = so.getInputStream();
//				
//				b = new byte[100];
//				int r = in.read(b);
//				//�޼��� ����Ʈ�迭�� �д´�
//				msg = new String(b,0,r,"UTF-8");
//				//����Ʈ �迭�� ���ڷ� �ٲٴ� �۾�
//				System.out.println("������ �ޱ� ����");
//				
//				OutputStream out = so.getOutputStream();
//				msg = "Hi Client";
//				b=msg.getBytes("UTF-8");
//				//���ڿ��� ����Ʈ�� �����ؼ� �����Ѵ�
//				
//				out.write(b);
//				System.out.println("������ ������ ����");
//				
//				out.close();
//				in.close();
//				so.close();
//				ser.close();
//			}
//			
//		}catch(Exception e) {}

	}

}
