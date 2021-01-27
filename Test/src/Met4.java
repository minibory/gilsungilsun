import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Met4 extends JFrame{
	JTextField j = new JTextField(20);
	JTextArea j1 = new JTextArea(10, 20);
	
	Met4() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j3 = new JLabel("enter Å° ÀÔ·Â");
		c.add(j3);
		c.add(j);
		c.add(new JScrollPane(j1));
		
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j1.append(j.getText() + "\n");
				j.setText("");
			}
		});
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new Met4();
	}

}
