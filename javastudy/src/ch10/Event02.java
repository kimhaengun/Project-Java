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
		latitle = new JLabel("���");
		btn1 = new JButton("���� Ŭ��");
		btn2 = new JButton("�ٳ��� Ŭ��");
		btn3 = new JButton("���� Ŭ��");
		c = getContentPane();
		c.add(latitle,BorderLayout.NORTH);
		c.add(btn1,BorderLayout.EAST);
		c.add(btn2,BorderLayout.CENTER);
		c.add(btn3,BorderLayout.WEST);
		
		//�͸� Ŭ������ �̿��ؼ� �����ϼ���.
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		setTitle("�̺�Ʈ 02");
		setSize(400, 500);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Event02();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btn1 ==(JButton)e.getSource()) {
			latitle.setText("����");
		}
		if (btn2 ==(JButton)e.getSource()) {
			latitle.setText("�ٳ���");
		}
		if (btn3 ==(JButton)e.getSource()) {
			latitle.setText("����");
		}
		
		
		
		//		//getSource()�� ���� Ÿ���� Object 
//		System.out.println("Ŭ���� :"+e.getSource());
//		JButton btn = (JButton)e.getSource();
//		System.out.println(btn.getText());
	}

}
