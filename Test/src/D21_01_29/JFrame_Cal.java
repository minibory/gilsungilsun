package D21_01_29;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrame_Cal extends JFrame {
	JPanel jp1 = new JPanel();
	
	JTextField jf = new JTextField(30);
	
	JButton[] j = new JButton[16];
	Container c = getContentPane();
	
	JFrame_Cal() {
		
		c.setLayout(new BorderLayout(5, 5));
		jp1.setLayout(new GridLayout(4, 4));
		
		c.add(jf, BorderLayout.NORTH);
		c.add(jp1);
	
		for(int i = 0; i < j.length;i++) {
			j[i] = new JButton(Integer.toString(i));
			jp1.add(j[i]);
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