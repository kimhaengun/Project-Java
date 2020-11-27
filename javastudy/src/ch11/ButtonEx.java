package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class ButtonEx extends JFrame {
	private Container c;
	private JButton btn1;
	
	public ButtonEx() {
		// TODO Auto-generated constructor stub
	c=getContentPane();
	c.setLayout(new FlowLayout());
	
	ImageIcon icon1 = new ImageIcon("images/boo.jpg");
	ImageIcon icon2 = new ImageIcon("images/2.jpg");
	ImageIcon icon3 = new ImageIcon("images/3.jpg");
	btn1 = new JButton("call~",icon1);
	btn1.setRolloverIcon(icon2);
	btn1.setPressedIcon(icon3);
	
	c.add(btn1);
	
		
		
		
		
		
		
	setTitle("이미지 버튼 예제");
	setSize(600, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx();
	}

}
