package D21_01_28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image_combobox extends JFrame {
	
	Image_combobox() {
		String[] s = {"��,��,��", "��,��"};
		ImageIcon[] im =
		{new ImageIcon("C:/Users/reime/OneDrive/���� ȭ��/img1.jpg"),
		new ImageIcon("C:/Users/reime/OneDrive/���� ȭ��/img2.jpg")};
		
		JLabel j = new JLabel(im[0]);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox com = new JComboBox(s);
		
		c.add(com);
		c.add(j);
		
		com.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = com.getSelectedIndex();
				j.setIcon(im[i]);
				
				
			}
		});
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new Image_combobox();
	}
}