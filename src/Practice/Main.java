package Practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Main extends JFrame{
		HashMap<String,String> hashmap = new HashMap<>();
		Main(){
			Container c = getContentPane();
			c.setLayout(new GridLayout(3,2));
			
			JPanel jpanel1 = new JPanel();
			
			JLabel jlabel1 = new JLabel("����");
			JTextField textfield1 = new JTextField(10);
			jpanel1.add(jlabel1); jpanel1.add(textfield1);
			
			JLabel jlabel2 = new JLabel("�ѱ�");
			JTextField textfield2 = new JTextField(10);
			jpanel1.add(jlabel2); jpanel1.add(textfield2);
			
			JButton jbutton1 = new JButton("����");
			JButton jbutton2 = new JButton("ã��");
			jpanel1.add(jbutton1); jpanel1.add(jbutton2);
			c.add(jpanel1);
			
			JPanel jpanel2 = new JPanel();
			JTextArea jtextarea = new JTextArea(5,25);
			Border lineBorder = 
					BorderFactory.createLineBorder(Color.black, 1);
			jtextarea.setBorder(lineBorder);
			
			jpanel2.setSize(100,200);
			jpanel2.add(jtextarea);
			c.add(jpanel2);
			
			jbutton1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s1=textfield1.getText();
					String s2=textfield2.getText();
					hashmap.put(s1, s2);
					jtextarea.append(s1);
					jtextarea.append(" : ");
					jtextarea.append(s2+"\n");
				}
			});
			
			Set<Map.Entry<String, String>> set = hashmap.entrySet();
			jbutton2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String find = JOptionPane.showInputDialog("���� �˰���� ���ܾ� �Է�");
					if(find != null) {
						for(Map.Entry<String, String> map : set) {
							String eng = map.getKey();
							String kor = map.getValue();
							if(find == eng) {
								System.out.println(kor);
							}
						}
					}
				}
			});
			
			setSize(350,400);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new Main();
		
	}
}