package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	private Container c;
	private JLabel lalove, laimage, lacall;
	public LabelEx() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		lalove = new JLabel("����մϴ�.");
		
		ImageIcon  love = new ImageIcon("images/boo.jpg");
		laimage = new JLabel(love);
		
		ImageIcon call = new ImageIcon("images/call.jpg");
		lacall = new JLabel("��������� ��ȭ�ϼ���",call,SwingConstants.CENTER);
		
		
		
		
		c.add(lalove);
		c.add(laimage);
		c.add(lacall);
		
		setTitle("���̺� ����");
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
