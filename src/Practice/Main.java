package Practice;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class MyFrame extends Frame{
	MyFrame(){
		setBounds(500,200,400,400);
		setVisible(true);
	}
}

//class MyEvent implements WindowListener{
//	@Override
//	public void windowOpened(WindowEvent e) {}
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println(" x ��ư�� Ŭ���� ");
//		System.exit(0); // ����
//	}
//	@Override
//	public void windowClosed(WindowEvent e) {}
//	@Override
//	public void windowIconified(WindowEvent e) {
//		System.out.println("�ּ�ȭ ��");
//	}
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		System.out.println("������� ���ƿ�");
//	}
//	@Override
//	public void windowActivated(WindowEvent e) {}
//	@Override
//	public void windowDeactivated(WindowEvent e) {}
//}

class Listen implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("���ᴭ���µ� ���ᰡ �ƴ�?");
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
}
public class Main extends JFrame{
//	Main(){
//		setBounds(500,200,400,400);
//				//x, y, width, height 
//		setVisible(true);
//	}
	
	public static void main(String[] args) {
//		new Main();
		
//		MyFrame fr = new MyFrame();
//		fr.setBackground(Color.yellow);
//		fr.setTitle("fourth");
		
//		MyFrame fr = new MyFrame();
//		fr.setBackground(Color.yellow);
//		fr.setTitle("fifth");
//		fr.addWindowListener(new MyEvent());
		
//		MyFrame fr = new MyFrame();
//		fr.setBackground(Color.yellow);
//		fr.setTitle("sixth");
////		fr.addWindowListener(new Listen());
//		fr.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("Ŭ���� ���� ����");
//			}
//		});
		
		
	}
}