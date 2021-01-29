package D21_01_28;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class jlabel extends JFrame {
	JLabel j = new JLabel("문자열");
	
	jlabel() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(j);
		setVisible(true);
		
		c.addKeyListener(new Key());
		c.requestFocus();			//컨텐드팬에 포커스 설정
									//키 입력이 가능하도록
	}
	class Key extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int a = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			int c = (int)(Math.random() * 256);
			
			switch(e.getKeyChar()) {
			case '\n':
				j.setText(a + " " + b + " " + c);
				getContentPane().setBackground(new Color(a, b, c));
				break;
				
			case 'p':
				System.exit(0);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		new jlabel();
	}
}