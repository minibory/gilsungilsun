package D21_01_29;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class m6 extends JFrame {
	JLabel j[] = new JLabel[3];
	ImageIcon[] im = new ImageIcon[3];
	Image img[] = new Image[3];
	Image cmg[] = new Image[3];
	
	m6() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		

		for (int i = 0; i < 3; i++) {
			im[i] = new ImageIcon("C:/Users/reime/OneDrive/¹ÙÅÁ È­¸é/img" + Integer.toString(i)+ ".jpg");
			img[i] = im[i].getImage();
			cmg[i] = img[i].getScaledInstance(200, 200, 0);
			j[i] = new JLabel();
			c.add(j[i]);
			j[i].setIcon((Icon) cmg[i]);
		}		
		
		setSize(700, 700);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new m6();
	}
}
