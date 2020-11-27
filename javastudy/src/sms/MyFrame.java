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
		laphone = new JLabel("��ȭ��ȣ");
		tfphone = new JTextField();
		latext = new JLabel("�޼���");
		tftext = new JTextField();
		jp2 = new JPanel();
		btn1 = new JButton("����");
		btn2 = new JButton("�ʱ�ȭ");
	}
	private void initSetting() {
		setTitle("");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp1.setLayout(new GridLayout(2, 2, 0, 0));
		tfphone.setColumns(10);
		tftext.setColumns(10);
		btn1.addActionListener(this); //��ư�� �׼Ǹ����� �̺�Ʈ �߻� ��Ű��
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
		if (btn1==e.getSource()) { //���� ��ư(btn1)Ŭ�� �� ����
			to = tfphone.getText(); //�ؽ�Ʈ�ʵ�(��ȭ��ȣ) �������ͼ� String to�� ����
			text = tftext.getText(); //�ؽ�Ʈ �ʵ�(�ؽ�Ʈ) ���ڰܿͼ� String text�� ���� 
												//��������(����)�� String �̱⶧���� String���� �����������
			ExampleSend ex = new ExampleSend(); //ExampleSendŬ���� ��ü ����
			ex.��������(to, text);
		}
		if (btn2 == e.getSource()) {
			tfphone.setText("");
			tftext.setText("");
		}
	}
}
