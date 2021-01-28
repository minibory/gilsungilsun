package Programmers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class Text implements ActionListener {
	JTextArea jt;
	Text(JTextArea jt) {
		this.jt = jt;
	}
	public void actionPerformed(ActionEvent e) {
		jt.setText("������!\n");
		jt.append("���� �Է�");
	}
}



public class Text_practice1 {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10, 20);
		
		jt.append("�Է�");
		jt.setLineWrap(true);		//�ڵ� �ٹٲ�
		
		JButton b = new JButton("����");
		
		b.addActionListener(new Text(jt));
		j.add(b);
		j.add(jt);
		
		j.setVisible(true);
	}
}