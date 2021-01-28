package D21_01_28;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Text1 implements ActionListener {
	JTextField id;
	JPasswordField pw;
	Text1(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(id.getText());
		System.out.println(pw.getText());
	}
}

public class Login_Practice1 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setBounds(120, 120, 150, 150);
		f.setLayout(new GridLayout(2, 2));
		
		JLabel id = new JLabel("ID", SwingConstants.LEFT);
		JTextField jid = new JTextField(20);
		
		JLabel pw = new JLabel("PW", SwingConstants.LEFT);
		JPasswordField jpw = new JPasswordField(20);
		jpw.setEchoChar('*');
		
		jpw.addActionListener(new Text1(jid, jpw));
		f.add(id);
		f.add(jid);
		f.add(pw);
		f.add(jpw);
		
		f.setVisible(true);
		
	}
}