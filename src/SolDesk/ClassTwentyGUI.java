package SolDesk;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationGroupID;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassTwentyGUI extends JFrame{
//	//JFrame ��ӹ޾� �����
//	ClassTwentyGUI(){
//		super("Title is here"); // ���� ����
//		JButton j1 = new JButton("button1");
//		JButton j2 = new JButton("button2");
//		JButton j3 = new JButton("button3");
//		Container c = getContentPane();
//			// ����Ʈ���� ��������
//		c.setLayout(new FlowLayout());
	/*
	 * ��ġ������ ����(setLayout(new ))
	 *  FlowLayout : left -> right 
	 *  BorderLayout : E/W/S/N/M ���� ��ġ����
	 *  GridLayout : 2����
	 *  CardLayout : ī�带 �׾Ƴ����� ��ġ
	 *  
	 */
//		c.add(j1);
//		c.add(j2);
//		c.add(j3);
//		
//		setSize(300,450); // ũ�� ����
//		setVisible(true); // ��¸޼ҵ�
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}
	
//	ClassTwentyGUI(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.add(new JButton("b1"));
//		setSize(900,600);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyGUI(){
//		Container c = getContentPane();
//		setTitle("Forth");
//		c.setLayout(new GridLayout(1,10));
//		for(int i=0;i<10;i++) {
//			JButton b = new JButton(Integer.toString(i));
//			c.add(b);
//		}
//		
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyGUI(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		setTitle("sixth");
//		JButton b = new JButton("click");
////		
////		��� 1
////		b.addActionListener(new my());
////		
////		��� 2
//		b.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton b = (JButton) e.getSource();
//									// e �� ��õ�� ������
//				if(b.getText().equals("click")) {
//					b.setText("Ŭ��");
//				}
//				else {
//					b.setText("click");
//				}
//			}
//		});
//		
//		c.add(b);
//		setSize(600,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		ClassTwentyGUI(){
//			Container c = getContentPane();
//			setTitle("seventh");
//			JButton b1 = new JButton("ok");
//			JButton b2 = new JButton("cancel");
//			c.setLayout(new FlowLayout(50,100,200));
//			c.setBackground(Color.lightGray);
//			// ���� ����
//			
//			b1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("ok");
//				}
//			});
//			
//			b2.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					b2.setEnabled(false); //��ư ��Ȱ��ȭ
//				}
//			});
//			
//			c.add(b1);
//			c.add(b2);
//			setSize(600,450);
//			setVisible(true);
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}
	
	public static void main(String[] args) {
		
//		new ClassTwentyGUI();
		
//		JFrame j = new JFrame();
//		j.setTitle("The Title");
//		j.setLayout(new BorderLayout());
//		j.add(new JButton("b1"), BorderLayout.EAST);
//		j.add(new JButton("b2"), BorderLayout.WEST);
//		j.add(new JButton("b3"), BorderLayout.NORTH);
//		j.add(new JButton("b4"), BorderLayout.SOUTH);
//		j.add(new JButton("b5"), BorderLayout.CENTER);
//		j.setSize(450,300);
//		j.setVisible(true);
//		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JFrame j = new JFrame();
//		j.setTitle("Fifth");
//		j.setLayout(new FlowLayout());
//		JButton j1 = new JButton("one");
//		JButton j2 = new JButton("two");
//		j.add(j1);
//		j.add(j2);
//		j1.addMouseListener(new Mouse());
//		// one �� Ŭ�� ���� �� �̺�Ʈ ó��
//		j2.addMouseListener(new Mouse());
//		j.setSize(450,300);
//		j.setVisible(true);
//		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
//class my implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//							// e �� ��õ�� ������
//		if(b.getText().equals("click")) {
//			b.setText("Ŭ��");
//		}
//		else {
//			b.setText("click");
//		}
//	}
//}
//class Mouse extends MouseAdapter{
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("���콺Ŭ��");
//		JButton b = (JButton) e.getSource();// �׼��� �߻����� �� ��ư�� ����
//        b.setText("��ư ����");
//	}
//}