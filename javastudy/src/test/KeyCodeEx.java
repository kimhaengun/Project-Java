package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la ;
	private Container c;
	public KeyCodeEx() {
		setTitle("d");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		c = getContentPane();
		c.addKeyListener(new MykeyListener());
		la = new JLabel("");
		c.add(la);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class MykeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
		c = (Container)e.getSource();
		la.setText(KeyEvent.getKeyText(e.getKeyCode())+"Å°°¡ ÀÔ·ÂµÊ");
		if (e.getKeyChar()=='%')
			c.setBackground(Color.yellow);
		if (e.getKeyChar()==KeyEvent.VK_F1) {
			c.setBackground(Color.green);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
