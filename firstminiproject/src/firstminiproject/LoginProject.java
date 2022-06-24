package firstminiproject;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginProject {

	JPanel cardPanel;
	LoginProject lp;
	CardLayout card;
	

	public static void main(String[] args) {

		LoginProject lp = new LoginProject();
		lp.setFrame(lp);
		
	}

	public void setFrame(LoginProject lpro) {

		JFrame jf = new JFrame();
		LoginPanel lp = new LoginPanel(lpro);

		card = new CardLayout();

		cardPanel = new JPanel(card);
		cardPanel.add(lp.mainPanel, "Login");
		
		jf.add(cardPanel);
		jf.setSize(500, 700);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;

		conn = DriverManager.
				getConnection("jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=C://ora/Wallet_DBSOLDESKTEAM1",
						"admin","soldesk01TEAM)!");

		return conn;
	}


	
	
}
	
class LoginPanel extends JPanel implements ActionListener {

		JPanel mainPanel;
		JTextField idTextField;
		JPasswordField passTextField;

		LoginProject lp;
		Font font = new Font("ȸ������", Font.BOLD, 40);

		public LoginPanel(LoginProject lp) {
			this.lp = lp;
			
			mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(5, 1));

			JPanel centerPanel = new JPanel();
			JLabel loginLabel = new JLabel("�α��� ȭ��");
			loginLabel.setFont(font);
			centerPanel.add(loginLabel);

			JPanel userPanel = new JPanel();

			JPanel gridBagidInfo = new JPanel(new GridBagLayout());
			gridBagidInfo.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
			GridBagConstraints c = new GridBagConstraints();

			JLabel idLabel = new JLabel(" ���̵� : ");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 0;
			gridBagidInfo.add(idLabel, c);

			idTextField = new JTextField(15);
			c.insets = new Insets(0, 5, 0, 0);
			c.gridx = 1;
			c.gridy = 0;
			gridBagidInfo.add(idTextField, c);

			JLabel passLabel = new JLabel(" ��й�ȣ : ");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 1;
			c.insets = new Insets(20, 0, 0, 0);
			gridBagidInfo.add(passLabel, c);

			passTextField = new JPasswordField(15);
			c.insets = new Insets(20, 5, 0, 0);
			c.gridx = 1;
			c.gridy = 1;
			gridBagidInfo.add(passTextField, c);

			JPanel loginPanel = new JPanel();
			JButton loginButton = new JButton("�α���");
			loginPanel.add(loginButton);

			JPanel signupPanel = new JPanel();
			JButton signupButton = new JButton("ȸ������");
			loginPanel.add(signupButton);

			mainPanel.add(centerPanel);
			mainPanel.add(userPanel);
			mainPanel.add(gridBagidInfo);
			mainPanel.add(loginPanel);
			mainPanel.add(signupPanel);


			loginButton.addActionListener(this);

			signupButton.addActionListener(new ActionListener() {
					// ȸ���������� �Ѿ��
				@Override
				public void actionPerformed(ActionEvent e) {
//					lp.card.next(lp.cardPanel);
			//====================���� ���� â�� ��� ȸ������ ��ư�� �ӽ÷� ����==========================
					try {
						String count = "SELECT lotto_num, SUM(CNT) AS CNT"
								+ "  FROM ( SELECT num1 lotto_num, COUNT(*) CNT"
								+ "           FROM copy_lotto_table"
								+ "          GROUP BY num1"
								+ "          UNION ALL"
								+ "         SELECT num2 lotto_num, COUNT(*) CNT"
								+ "           FROM copy_lotto_table"
								+ "          GROUP BY num2"
								+ "          UNION ALL"
								+ "          SELECT num3 lotto_num, COUNT(*) CNT"
								+ "           FROM copy_lotto_table"
								+ "          GROUP BY num3"
								+ "          UNION ALL"
								+ "          SELECT num4 lotto_num, COUNT(*) CNT"
								+ "           FROM copy_lotto_table"
								+ "          GROUP BY num4"
								+ "          UNION ALL"
								+ "          SELECT num5 lotto_num, COUNT(*) CNT"
								+ "           FROM copy_lotto_table"
								+ "          GROUP BY num5"
								+ "          UNION ALL"
								+ "          SELECT num6 lotto_num, COUNT(*) CNT"
								+ "           FROM copy_lotto_table"
								+ "          GROUP BY num6 )"
								+ " GROUP BY lotto_num"
								+ " ORDER BY 2 DESC";
					
						Connection conn = lp.getConnection();
						Statement stmt = conn.createStatement();
					
						ResultSet rset = stmt.executeQuery(count);
						while(rset.next()) {
							int i=rset.getInt(1);
							int j=rset.getInt(2);
							System.out.println("����"+ i+" �� "+ "�Ⱓ���� " + "���� Ƚ��"+ j);
							
						}
					}catch(Exception er) {
						er.printStackTrace();
					}
					//========================================================================
					
				}
				
				
				
			});

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton) e.getSource();

			switch (e.getActionCommand()) {
			case "�α���":

				String id = idTextField.getText();
				String pass = passTextField.getText();

				try {

					String passCheck = "SELECT m_id,m_pw FROM copy_member_signup "
							+ "WHERE m_id = 'admin123' and m_pw='admin'";

					Connection conn = lp.getConnection();
					Statement stmt = conn.createStatement();

					ResultSet rset = stmt.executeQuery(passCheck);
					rset.next();

					if(id.equals(rset.getString(1))) {
						if (pass.equals(rset.getString(2))) {
							JOptionPane.
							showMessageDialog(this, "�α��� �Ǿ����ϴ�", "�α��� ����", 1);
							
							System.out.println("good");
							
							//���⼭ �̵� �������� �̵�
						} 
						else {
							JOptionPane.
							showMessageDialog(this, "ID Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�","�α��� ����", 1);
						
							System.out.println("fail");
						}
					}
					else {
						JOptionPane.
						showMessageDialog(this, "ID Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�","�α��� ����", 1);
						
						System.out.println("fail");
					}
					
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(this, "Login Failed", "�α��� ����", 1);
					System.out.println("SQLException" + ex);
				}

				break;

			}
		}

	} // class LoginPanel




