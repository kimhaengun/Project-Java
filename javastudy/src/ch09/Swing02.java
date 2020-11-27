package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing02 extends JFrame {

	public Swing02() {
		setTitle("플로우 레이아웃");
		setSize(300, 400);
		Container c = getContentPane();
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());
		JButton btn1 = new JButton("버튼1");
		jp1.add(btn1);
		c.add(jp1, BorderLayout.NORTH);
		
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BorderLayout());
		JButton btn2 = new JButton("버튼2");
		jp2.add(btn2);
		c.add(jp2, BorderLayout.CENTER);
		
		JPanel jp3 = new JPanel();
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		jp3.add(btn3);
		jp3.add(btn4);
		jp3.add(btn5);
		c.add(jp3, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing02();
	}

} 
