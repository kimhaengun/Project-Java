package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFiledEx extends JFrame {
	private Container c;
	private JLabel �̸�, �а�, �ּ�;
	private JTextField tf�̸�, tf�а�, tf�ּ�;

	public TextFiledEx() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		�̸� = new JLabel("�̸�");
		�а� = new JLabel("�а�");
		�ּ� = new JLabel("�ּ�");
		
		tf�̸� = new JTextField(20);
		tf�а� = new JTextField(20);
		tf�ּ� = new JTextField(20);
		
		c.add(�̸�);
		c.add(tf�̸�);
		c.add(�а�);
		c.add(tf�а�);
		c.add(�ּ�);
		c.add(tf�ּ�);
		
		
		
		
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFiledEx();
	}

}