package ch11;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JComponentEx extends JFrame {
private Container c;
private JButton btn1, btn2 ,btn3;
	public JComponentEx() {
		c = getContentPane();
		c.setLayout(null);
		
		btn3 = new JButton("Magenta/Yellow Button");
		btn3.setBounds(80, 22, 300, 50);
		btn3.setBackground(Color.yellow);
		btn3.setFont(new Font("Arial", Font.ITALIC, 20));
		btn3.setForeground(Color.magenta);
		c.add(btn3);
		
		btn1 = new JButton("Disabled Button");
		btn1.setBounds(120, 81, 150, 40);
		btn1.setEnabled(false);
		c.add(btn1);
		
		btn2 = new JButton("getX(), getY()");
		btn2.setBounds(120, 149, 150, 40);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX()+","+b.getY());
			}
		});
		c.add(btn2);
		setTitle("Jcomponent¿« ∞¯≈Î");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}
}
