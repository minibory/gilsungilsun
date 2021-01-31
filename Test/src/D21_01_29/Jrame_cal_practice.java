package D21_01_29;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jrame_cal_practice extends JFrame {
	String[] str = { "+5", "-5", "/5" };
	JButton[] j = new JButton[3];
	int a = (int) (Math.random() * 100) + 1;
	JLabel jl = new JLabel(Integer.toString(a));

	Jrame_cal_practice() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		
		for (int i = 0; i < j.length; i++) {
			j[i] = new JButton(str[i]);
			c.add(j[i]);
		}
		
		j[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(jl.getText()) + 5;
				String s = Integer.toString(n);
				jl.setText(s);
				j[0].setEnabled(false);
			}
		});
		j[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(jl.getText()) - 5;
				String s = Integer.toString(n);
				jl.setText(s);
				j[1].setEnabled(false);
			}
		});
		j[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(jl.getText()) / 5;
				String s = Integer.toString(n);
				jl.setText(s);
				j[2].setEnabled(false);
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new Jrame_cal_practice();

	}
}