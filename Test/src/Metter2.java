import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Metter2 {
	Metter2() {
		JFrame f = new JFrame();
	
		f.setLayout(new GridLayout(0, 1));
	
		JCheckBox c = new JCheckBox("공부선택");
		
		ButtonGroup bg = new ButtonGroup();

		JRadioButton j1 = new JRadioButton("JAVA");
		JRadioButton j2 = new JRadioButton("PYTHON");
		JRadioButton j3 = new JRadioButton("C#");
		
		j1.setEnabled(false);
		j2.setEnabled(false);
		j3.setEnabled(false);
		
		f.add(c);
		f.add(j1);
		f.add(j2);
		f.add(j3);
	
		bg.add(j1);
		bg.add(j2);
		bg.add(j3);
		
		c.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					j1.setEnabled(true);
					j2.setEnabled(true);
					j3.setEnabled(true);
				} else {
					j1.setEnabled(false);
					j2.setEnabled(false);
					j3.setEnabled(false);
				}
			}
			
		});
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("자바!!");
			}
		});
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("파이썬!!");
			}
		});
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("C#!!");
			}
		});
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Metter2();
	}
}