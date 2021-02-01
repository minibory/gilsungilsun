package D21_02_01;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class m4 extends JFrame {
	
	JLabel id = new JLabel("ID : ");
	JTextField idf = new JTextField(20);
	JLabel pw = new JLabel("PW : ");
	JPasswordField pwf = new JPasswordField(20);
	String Id = "abcdef";
	String Pw = "12345";
	
	m4() {
		setLayout(new FlowLayout());	
		add(id);
		add(idf);
		add(pw);
		add(pwf);
		idf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER) {
					if(idf.getText().equals(Id)) {
						System.out.println(Id);
					}
				}
			}
		});
		pwf.setEchoChar('*');
		pwf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER) {
					if(pwf.getText().equals(Pw)) {
						System.out.println(Pw);
					}
				}
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new m4();
	}
}