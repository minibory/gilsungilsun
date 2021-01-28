package D21_01_28;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_JButton_practice extends JFrame{
	
	GUI_JButton_practice() {
		Container c = getContentPane();
		
		c.setBackground(Color.red);
		c.setLayout(new FlowLayout());
		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		
		c.add(j1);
		c.add(j2);
		
		j1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("»Æ¿Œ");
			}
		});
		j2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j2.setEnabled(false);
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUI_JButton_practice();
		
	}
}