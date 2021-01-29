package D21_01_29;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrame_Cal extends JFrame {
	JTextField jf = new JTextField(10);
	JButton[] j = new JButton[16];
	Container c = getContentPane();
	
	JFrame_Cal() {
		
		c.setLayout(new BorderLayout(5, 5));
		
		c.add(jf, BorderLayout.NORTH);
	
		for(int i = 0; i < j.length;i++) {
			j[i] = new JButton(Integer.toString(i));
			c.add(j[i], BorderLayout.CENTER);
		}
		setVisible(true);	
	}
	class KeyPad extends JPanel {
		
		KeyPad() {
			
			
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new JFrame_Cal();
		
	}
}