package D21_02_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cal_JFrame extends JFrame {

	public Cal_JFrame() {
		Container c = getContentPane();
		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();
		
		j1.setBackground(Color.orange);
		j2.setLayout(new GridLayout(4, 4));
		j3.setBackground(Color.yellow);
		
		c.add(j1, BorderLayout.NORTH);
		c.add(j2);
		c.add(j3, BorderLayout.SOUTH);
		
		JLabel jl = new JLabel("입력");
		JTextField jf = new JTextField(10);
		
		j1.add(jl);
		j1.add(jf);
		
		JLabel ja = new JLabel("결과");
		JTextField jt = new JTextField(10);
		
		j3.add(ja);
		j3.add(jt);
		
		for(int i = 0; i < 16; i++) {
			JButton b = new JButton();
			j2.add(b);
			
			String[] s = {"+", "-", "*", "/", "계산", "CE"};
			
			if(i<10) {
				b.setText(Integer.toString(i));
			} else {
				b.setText(s[i-10]);
			}
		}
		
		setVisible(true);
	}	
	public static void main(String[] args) {
		new Cal_JFrame();
	}
}