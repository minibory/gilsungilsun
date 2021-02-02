package D21_02_02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrame_Pr extends JFrame {
	ImageIcon img = new ImageIcon("C:/Users/reime/OneDrive/¹ÙÅÁ È­¸é/Ä«Ä«¿ÀÅå.png");
	JMenuBar Bar = new JMenuBar();
	JMenu File = new JMenu("File");
	JLabel jl = new JLabel(img);

	JMenuItem Load = new JMenuItem("Load");
	JMenuItem Hide = new JMenuItem("Hide");
	JMenuItem Exit = new JMenuItem("Exit");

	JFrame_Pr() {
		setSize(400, 600);
		setLayout(new FlowLayout());

		setJMenuBar(Bar);

		Bar.add(File);

		File.add(Load);
		File.add(Hide);
		File.add(Exit);
		add(jl);
		jl.setVisible(false);
		
		Load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setVisible(true);
			}
		});
		Hide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setVisible(false);
			}
		});
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {

		new JFrame_Pr();

	}
}