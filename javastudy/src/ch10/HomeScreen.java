package ch10;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

//�����ε�
public class HomeScreen extends JFrame{
	private LoginScreen loginScreen;
	private HomeScreen homeScreen = this;
	private JLabel laUsername;
	public HomeScreen() { //�پ� Ȩȭ�������
		this(null);
		
	}
	public HomeScreen(LoginScreen loginScreen) { //�α����ؼ� ��ȭ��
		this.loginScreen=loginScreen;
		
		laUsername = new JLabel(loginScreen.getTfUsername().getText());
		
		setTitle("Home");
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.add(laUsername,BorderLayout.CENTER);
		setVisible(true);	
	}
}
