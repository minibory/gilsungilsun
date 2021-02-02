package D21_02_02;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GUI_PR extends JFrame {

	JLabel En = new JLabel("¿µ¾î", SwingConstants.LEFT);
	JTextField Ent = new JTextField(10);

	JLabel Ko = new JLabel("ÇÑ±Û", SwingConstants.LEFT);
	JTextField Kot = new JTextField(10);

	JButton in = new JButton("»ðÀÔ");
	JButton out = new JButton("Ã£±â");

	JTextArea area = new JTextArea(10, 30);

	HashMap<String, String> h = new HashMap<String, String>();

	Set<String> key = h.keySet();
	
	GUI_PR() {
		setLayout(new FlowLayout());
		setSize(350, 300);

		add(En);
		add(Ent);
		
		add(Ko);
		add(Kot);
		
		add(in);
		add(out);
		
		add(area);
		
		in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.put(Ent.getText(), Kot.getText());
				area.append("»ðÀÔ (" + Ent.getText() + ", " + Kot.getText() + ")\n");
			}
		});
		
		out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator<String> it = key.iterator();
				while(it.hasNext()) {
					String s = it.next();
					if(s.equals(Ent.getText())) {
						Kot.setText(h.get(s));
					}
				}
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new GUI_PR();
	}
}