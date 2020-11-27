package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay; //������ �ٲ�� ���� �ð�. �и��� ����
	public FlickeringLabel(String text, long delay) {
	super(text);
	this.delay = delay;
	setOpaque(true);
	
	Thread th = new Thread(this);
	th.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=0;
		while(true) {
			if(n==0)
				setBackground(Color.yellow);
			else
				setBackground(Color.green);
			if(n==0) n=1;
			else n=0;
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
				// TODO: handle exception
				return;
			}
		}
	}
	
}


public class FlickeringLableEx extends JFrame {
	public FlickeringLableEx() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("����",500);
		JLabel label = new JLabel("�ȱ���");
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		
		
		setTitle("FlickeringLableEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickeringLableEx();
	}

}
