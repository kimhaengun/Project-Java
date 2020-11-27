package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lombok.Data;
import sms.ExampleSend;
@Data
public class GridLayoutEx extends JFrame implements ActionListener {
	public GridLayoutEx() {
		
	setTitle("GridLayout Sample");
	setSize(300, 200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	GridLayout grid = new GridLayout(4, 2);
	grid.setVgap(5);
	
	Container a = getContentPane();
	
	JPanel c = new JPanel();
	c.setLayout(grid);
	c.add(new JLabel(" 이름"));
	c.add(new JTextField(""));
	c.add(new JLabel(" 학번"));
	c.add(new JTextField(""));
	c.add(new JLabel(" 학과"));
	c.add(new JTextField(""));
	c.add(new JLabel(" 과목"));
	c.add(new JTextField(""));
	
	JPanel a2 = new JPanel();
	a2.setLayout(new BorderLayout());
	JButton btn1 = new JButton("클릭");
	btn1.addActionListener(this);
	
	a2.add(btn1);
	
	a.add(c,BorderLayout.NORTH);
	a.add(a2, BorderLayout.SOUTH);
	setVisible(true);
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
		ExampleSend send = new ExampleSend();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
