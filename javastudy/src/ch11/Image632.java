package ch11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Image632 extends JFrame {
	private Container c;
	private JLabel laimage;
	private JButton jbleft, jbright;
	private JPanel jp1, jp2, jp3, jp4, jp5;
	private ImageIcon [] image = {new ImageIcon("images/boo.jpg"),
												new ImageIcon("images/2.jpg"),
												new ImageIcon("images/3.jpg"),
												new ImageIcon("images/4.jpg")};
	public Image632() {
		
		c=getContentPane();
		laimage = new JLabel();
		
		jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jbleft = new JButton("¿ÞÂÊ");
		jbleft.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jbleft==e.getSource())
					
			}
		});
		jbright = new JButton("¿À¸¥ÂÊ");
		jp1.add(jbleft);
		jp1.add(jbright);
		
		
		
		c.add(laimage,BorderLayout.CENTER);
		c.add(jp1,BorderLayout.SOUTH);
		
		
		
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Image632();
	}

}
