package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame {
	public OpenChallenge() {
		setTitle("Open Challenge 9");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JPanel p1 = new JPanel();
		JButton btn1 = new JButton("Open");
		JButton btn2 = new JButton("Read");
		JButton btn3 = new JButton("Close");
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.setBackground(Color.gray);
		
		JPanel p2 = new JPanel();
		JLabel jl1 = new JLabel("Java");
		JLabel jl2 = new JLabel("Hello");
		JLabel jl3 = new JLabel("Love");
		p2.setLayout(null);
		jl1.setLocation(100, 300);
		jl1.setSize(100,20);
		jl2.setLocation(200, 10);
		jl2.setSize(100,20);
		jl3.setLocation(300, 200);
		jl3.setSize(100,20);
		p2.add(jl1);
		p2.add(jl2);
		p2.add(jl3);
		
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OpenChallenge();
	}

}
