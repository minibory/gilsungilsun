package D21_01_29;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class jslider extends JFrame {
	JSlider j = new JSlider(100, 200, 150);
	JLabel j1 = new JLabel(" ");
	
	jslider() {
		super("�巡ŷ");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		c.add(j1);
		
		j.setMajorTickSpacing(20);		//ū ���� ����
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setHorizontalAlignment(JLabel.CENTER);
		//���ڿ��� ��ġ�� �߾�����.
		j1.setOpaque(true);		//���� ����
		j1.setBackground(Color.magenta);
		j1.setText(Integer.toString(j.getValue()));
		//���� �������� ���ڿ��� �����ؼ� �����ӿ� ���.
		
		j.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				j1.setText(Integer.toString(j.getValue()));
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new jslider();

	}
}