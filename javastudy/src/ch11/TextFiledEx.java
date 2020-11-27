package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFiledEx extends JFrame {
	private Container c;
	private JLabel 이름, 학과, 주소;
	private JTextField tf이름, tf학과, tf주소;

	public TextFiledEx() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		이름 = new JLabel("이름");
		학과 = new JLabel("학과");
		주소 = new JLabel("주소");
		
		tf이름 = new JTextField(20);
		tf학과 = new JTextField(20);
		tf주소 = new JTextField(20);
		
		c.add(이름);
		c.add(tf이름);
		c.add(학과);
		c.add(tf학과);
		c.add(주소);
		c.add(tf주소);
		
		
		
		
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFiledEx();
	}

}
