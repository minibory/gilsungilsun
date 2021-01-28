package D21_01_28;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButton_Practice extends JFrame {
	
	JRadioButton_Practice() {
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JRadioButton j1 = new JRadioButton("magenta");
		JRadioButton j2 = new JRadioButton("red");
		
		c.add(j1);
		c.add(j2);
		
		j1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j1.setBackground(Color.magenta);
			}			
		});
		j2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j2.setBackground(Color.red);
			}			
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JRadioButton_Practice();
			
	}
}