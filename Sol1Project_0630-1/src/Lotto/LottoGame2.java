package Lotto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LottoGame2 extends JFrame implements ActionListener {

   JPanel p1 = new JPanel();

   static JTextField text1 = new JTextField(7);
   static JTextField text2 = new JTextField(7);
   static JTextField text3 = new JTextField(7);
   static JTextField text4 = new JTextField(7);
   static JTextField text5 = new JTextField(7);
   static JTextField text6 = new JTextField(7);

   JPanel p2 = new JPanel();
   ButtonGroup bg = new ButtonGroup();
   static JButton num[] = new JButton[45];

   JPanel p3 = new JPanel();
   JButton go = new JButton("��÷");
   JButton reset = new JButton("�ʱ�ȭ");
   JButton lotto = new JButton("�ڵ���÷");

   public LottoGame2() {
      setSize(new Dimension(850, 575));
      setBackground(Color.black);
      setResizable(true);
      setLayout(null);
      setVisible(true);
      add(p1);

      p1.setBounds(32, 37, 775, 94);
      p1.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
      p1.setBackground(Color.white);
      p1.add(text1);

      text1.setEditable(false);
      text1.setText("��");
      text1.setPreferredSize(new Dimension(81, 35));
      text1.setHorizontalAlignment(JTextField.CENTER);

      p1.add(text2);
      text2.setEditable(false);
      text2.setText("��");
      text2.setPreferredSize(new Dimension(81, 35));
      text2.setHorizontalAlignment(JTextField.CENTER);

      p1.add(text3);
      text3.setEditable(false);
      text3.setText("��");
      text3.setPreferredSize(new Dimension(81, 35));
      text3.setHorizontalAlignment(JTextField.CENTER);

      p1.add(text4);
      text4.setEditable(false);
      text4.setText("÷");
      text4.setPreferredSize(new Dimension(81, 35));
      text4.setHorizontalAlignment(JTextField.CENTER);

      p1.add(text5);
      text5.setEditable(false);
      text5.setText("��");
      text5.setPreferredSize(new Dimension(81, 35));
      text5.setHorizontalAlignment(JTextField.CENTER);

      p1.add(text6);
      text6.setEditable(false);
      text6.setText("��");
      text6.setPreferredSize(new Dimension(81, 35));
      text6.setHorizontalAlignment(JTextField.CENTER);
      
      JLabel lblNewLabel = new JLabel("������ ��ȣ�� ������ �ڵ���÷");
      lblNewLabel.setBounds(350, 453, 180, 15);
      getContentPane().add(lblNewLabel);

      add(p2);
      p2.setBackground(Color.white);
      p2.setLayout(new GridLayout(8, 6, 10, 10));
      p2.setBounds(32, 174, 775, 269);

      add(go);
      go.setBounds(32, 474, 139, 42);
      go.addActionListener(this);

      add(lotto);
      lotto.setBounds(362, 474, 139, 42);
      lotto.addActionListener(this) ;
         
         
         

      add(reset);
      reset.setBounds(197, 474, 139, 42);
      reset.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            text1.setText("��");
            text2.setText("��");
            text3.setText("��");
            text4.setText("÷");
            text5.setText("��");
            text6.setText("��");
            for (int i = 0; i < 45; i++) {
               num[i].setEnabled(true);
            }
         }
      });

      for (int i = 0; i < 45; i++) {
         String s = Integer.toString(i + 1);
         num[i] = new JButton(s);
         p2.add(num[i]);
         num[i].addActionListener(this);

      }

   }

   public void actionPerformed(ActionEvent e) {
      String input = e.getActionCommand();
      int lotonum[] = new int[6];
      switch (e.getActionCommand()) {
      case "��ȣȮ��":

         text1.setText("��");
         text2.setText("��");
         text3.setText("��");
         text4.setText("÷");
         text5.setText("��");
         text6.setText("��");

         break;

      case "�ڵ���÷":
         try{
         Random ran = new Random();
         int nonnum[] = new int[6];
         nonnum[0] = Integer.parseInt(text1.getText());
         nonnum[1] = Integer.parseInt(text2.getText());
         nonnum[2] = Integer.parseInt(text3.getText());
         nonnum[3] = Integer.parseInt(text4.getText());
         nonnum[4] = Integer.parseInt(text5.getText());
         nonnum[5] = Integer.parseInt(text6.getText());

         int lottonum[] = new int[6];
         for (int i = 0; i < lottonum.length; i++) {
            lottonum[i] = ran.nextInt(46);
            if (lottonum[i] == 0 || lottonum[i] == nonnum[0] || lottonum[i] == nonnum[1] || lottonum[i] == nonnum[2]
                  || lottonum[i] == nonnum[3] || lottonum[i] == nonnum[4] || lottonum[i] == nonnum[5]) { // ���� 0�Ͻ�
                                                                                    // �ٽ� ��÷
               i--;
            }
            for (int erch2 = 0; erch2 < i; erch2++) { // ��÷��ȣ�� �ߺ� ����
               if (lottonum[i] == lottonum[erch2]) {
                  i--;
               }
            }
         }
         
         Arrays.sort(lottonum);
         
         text1.setText(Integer.toString(lottonum[0]));
         text2.setText(Integer.toString(lottonum[1]));
         text3.setText(Integer.toString(lottonum[2]));
         text4.setText(Integer.toString(lottonum[3]));
         text5.setText(Integer.toString(lottonum[4]));
         text6.setText(Integer.toString(lottonum[5]));
         }catch (Exception e2) {
            JOptionPane.
            showMessageDialog(null,"��ȣ�� ��� �Է����ּ���");
         }
         break;

      default:

         if (text1.getText().equals("��")) {
            text1.setText(input);
         } else if (text2.getText().equals("��")) {
            text2.setText(input);
         } else if (text3.getText().equals("��")) {
            text3.setText(input);
         } else if (text4.getText().equals("÷")) {
            text4.setText(input);
         } else if (text5.getText().equals("��")) {
            text5.setText(input);
         } else if (text6.getText().equals("��")) {
            text6.setText(input);
         }
         num[Integer.parseInt(input) - 1].setEnabled(false);
         break;
      }

   }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void main(String[] args) {
      new LottoGame2();

   }

   public static Connection getConnection() throws SQLException {
      Connection conn = null;

      conn = DriverManager.getConnection("jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1",
            "admin", "soldesk01TEAM)!");

      return conn;

   }

   public static String setLPad(String strContext, int iLen, String strChar) {

      String strResult = "";

      StringBuilder sbAddChar = new StringBuilder();
      for (int i = strContext.length(); i < iLen; i++) { // iLen���� ��ŭ strChar���ڷ� ä���.

         sbAddChar.append(strChar);
      }

      strResult = sbAddChar + strContext; // LPAD�̹Ƿ�, ä�﹮�ڿ� + �������ڿ��� Concate�Ѵ�.

      return strResult;
   }
}