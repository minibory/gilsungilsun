package D21_01_28;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JOption_prac extends JFrame {
	
	JOption_prac() {
		super("���̾�α�");			//== setTitle()
		Container c = getContentPane();
		c.add(new Dia(), BorderLayout.NORTH);
		setVisible(true);
	}
	class Dia extends Panel {
		JButton j1 = new JButton("�̸� �Է�");
		JTextField jf = new JTextField(10);
		JButton j2 = new JButton("Ȯ��");
		JButton j3 = new JButton("�޼���");
		
		Dia() {
			setBackground(Color.pink);
			add(j1);
			add(jf);
			add(j2);
			add(j3);
			//�� this�� �Ⱥٴ°�
			j1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("�̸��Է�");
					if(name != null) {	//�̸��� ���� ��.
						jf.setText(name);
					}
				}
			});
			j2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null,
							"���?", "Ȯ��", JOptionPane.YES_NO_OPTION);
				}
			});
		}
	}
	
	public static void main(String[] args) {
		
		new JOption_prac();
	}
}