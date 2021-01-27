import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;



public class Jfra extends JFrame {
	Jfra() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("안녕하세요");
		ImageIcon i =
		new ImageIcon("C:/Users/reime/OneDrive/바탕 화면/img2.jpg");
		
		JLabel j1 = new JLabel(i);
		JLabel j2 = new JLabel("수요일", SwingConstants.CENTER);
		
		c.add(j);
		c.add(j1);
		c.add(j2);
		
		setVisible(true);
			
	}
	
	public static void main(String[] args) {

		new Jfra();
	}
}