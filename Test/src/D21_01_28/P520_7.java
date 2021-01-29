package D21_01_28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P520_7 extends JFrame {
	
	P520_7() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField jf = new JTextField(10);
		JTextArea ja = new JTextArea(10, 20);
		
		c.add(jf);
		c.add(ja);
		
		jf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				String s = jf.getText().toUpperCase();
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					ja.append(s + "\n");
					jf.setText("");
				}
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new P520_7();
	}
}