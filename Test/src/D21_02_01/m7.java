package D21_02_01;

import java.awt.*;
import javax.swing.*;

class Th extends Thread {
	JLabel j;

	Th(JLabel j) {
		this.j = j;
	}

	public void run() {
		for(int i = 0; i < 10; i++ ) {
			try {
					j.setText(Integer.toString(i));
					Thread.sleep(1000);
				
			} catch(Exception e) {
				return;
			}
		}
	}
}

public class m7 extends JFrame {

	m7() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel j = new JLabel();
		c.add(j);
		setSize(400, 600);

		Th t = new Th(j);
		setVisible(true);
		t.start();
	}

	public static void main(String[] args) {

		new m7();

	}
}