package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame {
	private Container c;
	private JRadioButton [] jRB = new JRadioButton [3];
	private String [] s = {"사과", "배", "체리"};
	private JLabel la;
	private ImageIcon [] image = {
													new ImageIcon("images/boo.jpg"),
													new ImageIcon("images/2.jpg"),
													new ImageIcon("images/3.jpg")};
	 
	public RadioButtonItemEventEx() {
	c = getContentPane();
	c.setLayout(new FlowLayout());
	
	ButtonGroup b = new ButtonGroup();
	for (int i = 0; i < jRB.length; i++) {
		jRB[i] = new JRadioButton(s[i]);
		jRB[i].addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED) {
					for (int j = 0; j < jRB.length; j++) {
						if (jRB[j]==e.getItem())
							la.setIcon(image[j]);
					}
				}
			}
		});
		b.add(jRB[i]);
		c.add(jRB[i]);
	}
	la = new JLabel();
	c.add(la);		
	setTitle("라이도버튼 item Event");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(400, 400);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonItemEventEx();
	}

}
