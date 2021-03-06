package test;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la;
	private Container c;

	private void initObject() {
		c = getContentPane();
		la = new JLabel("�����δ�");
	}

	private void initSetting() {
		setTitle("11111");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(null);
		la.setLocation(50, 50);
		la.setSize(100, 20);
		System.out.println("1");
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("2");
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - FLYING_UNIT, la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				}

			}
		});
		c.setFocusable(true);
		setVisible(true);
	}

	private void initBatch() {
		c.add(la);
	}

	public FlyingTextEx() {
		initObject();
		initSetting();
		initBatch();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
