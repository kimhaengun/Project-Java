package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event02 extends JFrame implements ActionListener{
	private JLabel latitle;
	private JButton btn1, btn2, btn3;
	private Container c;
	public Event02() {
		latitle = new JLabel("사과");
		btn1 = new JButton("딸기 클릭");
		btn2 = new JButton("바나나 클릭");
		btn3 = new JButton("참외 클릭");
		c = getContentPane();
		c.add(latitle,BorderLayout.NORTH);
		c.add(btn1,BorderLayout.EAST);
		c.add(btn2,BorderLayout.CENTER);
		c.add(btn3,BorderLayout.WEST);
		
		//익명 클래스를 이용해서 구현하세요.
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		setTitle("이벤트 02");
		setSize(400, 500);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Event02();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btn1 ==(JButton)e.getSource()) {
			latitle.setText("딸기");
		}
		if (btn2 ==(JButton)e.getSource()) {
			latitle.setText("바나나");
		}
		if (btn3 ==(JButton)e.getSource()) {
			latitle.setText("참외");
		}
		
		
		
		//		//getSource()의 리턴 타입은 Object 
//		System.out.println("클릭됨 :"+e.getSource());
//		JButton btn = (JButton)e.getSource();
//		System.out.println(btn.getText());
	}

}
