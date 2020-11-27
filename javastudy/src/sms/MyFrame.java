package sms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import lombok.Data;

@Data
public class MyFrame extends JFrame implements ActionListener{
	private JPanel jp1, jp2;
	private Container c;
	private JLabel laphone, latext;
	private JTextField tfphone,tftext;
	private JButton btn1, btn2;
	private String to, text;

	public JTextField getTfphone() {
		return tfphone;
	}
	public void setTfphone(JTextField tfphone) {
		this.tfphone = tfphone;
	}
	public JTextField getTftext() {
		return tftext;
	}
	public void setTftext(JTextField tftext) {
		this.tftext = tftext;
	}
	private void initObject() {
		c=getContentPane();
		jp1 = new JPanel();
		laphone = new JLabel("전화번호");
		tfphone = new JTextField();
		latext = new JLabel("메세지");
		tftext = new JTextField();
		jp2 = new JPanel();
		btn1 = new JButton("전송");
		btn2 = new JButton("초기화");
	}
	private void initSetting() {
		setTitle("");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp1.setLayout(new GridLayout(2, 2, 0, 0));
		tfphone.setColumns(10);
		tftext.setColumns(10);
		btn1.addActionListener(this); //버튼에 액션리스너 이벤트 발생 시키기
		btn2.addActionListener(this);
		setVisible(true);
	}
	private void initBatch() {
		c.add(jp1, BorderLayout.NORTH);
		jp1.add(laphone);
		jp1.add(tfphone);
		jp1.add(latext);
		jp1.add(tftext);
		c.add(jp2, BorderLayout.CENTER);
		jp2.add(btn1);
		jp2.add(btn2);
	}
	public MyFrame() {
		initObject();
		
		initSetting();
		
		initBatch();
		
	}
	public static void main(String[] args) {
		new MyFrame();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btn1==e.getSource()) { //만약 버튼(btn1)클릭 시 동작
			to = tfphone.getText(); //텍스트필드(전화번호) 값가져와서 String to로 변형
			text = tftext.getText(); //텍스트 필드(텍스트) 값자겨와서 String text로 변형 
												//문자전송(인자)가 String 이기때문에 String으로 변형해줘야함
			ExampleSend ex = new ExampleSend(); //ExampleSend클래스 객체 생성
			ex.문자전송(to, text);
		}
		if (btn2 == e.getSource()) {
			tfphone.setText("");
			tftext.setText("");
		}
	}
}
