package ch13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



public class Timer extends JFrame{
	private Container c;
	private JLabel latime, lat;
	class MyThread implements Runnable{
		@Override
		public void run() {
			LocalDateTime now = LocalDateTime.now();
			latime.setText(now.getHour()+" : "
			+now.getMinute()+" : "+now.getSecond()+"mmmmm");
			
			for (int i = now.getSecond(); i < 61; i++) {
				try {
					lat.setText(i+"");
					Thread.sleep(1000);
					for (int a = now.getMinute(); a < 61; a++) {
						if (now.getSecond()==60) {
							a++;
						}
					}
					for (int b = now.getHour(); b < 25; b++) {
						if (now.getMinute()==60) {
							b++;
							lat.setText(now.getHour()+" : "
									+now.getMinute()+" : "+now.getSecond());

						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

	
	public Timer() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		latime = new JLabel();
		
		lat = new JLabel();
		c.add(latime);
		c.add(lat);
		Thread t1 = new Thread(new MyThread());
		t1.start();
		
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
	}

}
