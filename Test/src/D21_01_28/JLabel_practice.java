package D21_01_28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel_practice extends JFrame {
	JLabel_practice() {
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("Hi");
		
		c.add(j);
		
		j.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j.setText("¾È³ç");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JLabel_practice();
		
	}
}