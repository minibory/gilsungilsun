package D21_02_02;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Color_Pr extends JFrame {
	
	JLabel[] j = new JLabel[12];

	Color_Pr() {
		setLayout(new GridLayout(4, 3));

		for (int i = 0; i < j.length; i++) {
			j[i] = new JLabel(Integer.toString(i+1));
			j[i].setBackground(Color.WHITE);
			
			add(j[i]);
			
			j[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					
					JLabel  j = (JLabel) e.getSource();
					
					int r = (int) (Math.random() * 256);
					int g = (int) (Math.random() * 256);
					int b = (int) (Math.random() * 256);
					
					j.setBackground(new Color(r, g, b));
				}
			});
		}
		
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new Color_Pr();

	}
}