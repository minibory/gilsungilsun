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
		super("드래킹");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		c.add(j1);
		
		j.setMajorTickSpacing(20);		//큰 눈금 간격
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setHorizontalAlignment(JLabel.CENTER);
		//문자열의 위치를 중앙으로.
		j1.setOpaque(true);		//투명도 설정
		j1.setBackground(Color.magenta);
		j1.setText(Integer.toString(j.getValue()));
		//눈금 정수값을 문자열로 변경해서 프레임에 띄움.
		
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