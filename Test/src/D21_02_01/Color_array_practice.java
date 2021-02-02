package D21_02_01;

import java.awt.*;
import javax.swing.*;

public class Color_array_practice extends JFrame {

	Color_array_practice() {
		setLayout(new GridLayout(1, 5));
		
		Color[] col = {Color.RED, Color.ORANGE,
				Color.YELLOW, Color.GREEN, Color.BLUE}; 
		
		JButton[] j = new JButton[5];
		
		for(int i = 0; i < j.length; i++) {
			j[i] = new JButton();
			j[i].setBackground(col[i]);
			add(j[i]);
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Color_array_practice();
	}
}