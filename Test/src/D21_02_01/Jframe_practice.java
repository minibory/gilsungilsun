package D21_02_01;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class My {
	String name;
	int age;
	My(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + " " + age;
	}
}

public class Jframe_practice {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		Vector<My> v = new Vector<My>();
		
		v.add(new My("Àç°æ", 23));
		
		JComboBox c = new JComboBox(v);
		
		j.add(c);
		j.setVisible(true);
		
	}
}