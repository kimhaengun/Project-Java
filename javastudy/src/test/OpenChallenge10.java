package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge10 extends JFrame {
	private Container c;
	private JLabel jl1, jl2, jl3, jl4;
	private JPanel jp1, jp2;
	
	public OpenChallenge10() {
	setTitle("Open Challenge 10");
	setSize(500, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	c = getContentPane();
	c.addKeyListener(new MyKeyListener());
	jp1 = new JPanel();
	jl1 = new JLabel("0");
	jl1.setFont(new Font("Serif", Font.BOLD,100));
	jl1.setForeground(Color.yellow);
	jl2 = new JLabel("0");
	jl2.setFont(new Font("Serif", Font.BOLD, 100));
	jl2.setForeground(Color.yellow);
	jl3 = new JLabel("0");
	jl3.setFont(new Font("Serif", Font.BOLD, 100));
	jl3.setForeground(Color.yellow);
	
	jp1.add(jl1);
	jp1.add(jl2);
	jp1.add(jl3);
	c.add(jp1, BorderLayout.NORTH);
	
	
	jp2 = new JPanel();
	jl4 = new JLabel("시작합니다.");
	jp2.add(jl4);
	c.add(jp2, BorderLayout.CENTER);
	
	
	c.setFocusable(true);
	setVisible(true);
	}
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("d");
			c = (Container)e.getSource();
			if (e.getKeyChar()=='\n') {
			int x1 = (int)(Math.random()*5);
			jl1.setText(x1+"");
			int x2 = (int)(Math.random()*5);
			jl2.setText(x2+"");
			int x3 = (int)(Math.random()*5);
			jl3.setText(x3+"");
			 
		}
		
		}
	}
	public static void main(String[] args) {
	new OpenChallenge10();

	}

}
