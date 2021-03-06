package ch13;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerThreadEx extends JFrame {
	private Container c;
	private JLabel latext;
	private JButton btn1;
	class MyThread implements Runnable{
		
		@Override
		public void run() {
			for (int i = 1; i < 50; i++) {
				try {
					latext.setText(i+"");
					Thread.sleep(2000);
				} catch (Exception e) {
					
				}
			}
		}
	}
	public TimerThreadEx() {
	c=getContentPane();
	c.setLayout(null);
	latext=new JLabel("GOGO");
	latext.setLocation(100, 50);
	latext.setSize(100, 50);
	Thread t1 = new Thread(new MyThread());
	t1.start();
	btn1 = new JButton("Kill Timer");
	btn1.setLocation(150, 50);
	btn1.setSize(100, 50);
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (btn1==(JButton)e.getSource())
				t1.interrupt();
			btn1.setEnabled(false);
				
		}
	});
	c.add(latext);
	c.add(btn1);
	setTitle("Thread를 상속받은 타이머 스레드");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 170);

	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerThreadEx();
	}

}
