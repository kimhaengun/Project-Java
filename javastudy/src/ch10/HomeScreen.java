package ch10;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

//오버로딩
public class HomeScreen extends JFrame{
	private LoginScreen loginScreen;
	private HomeScreen homeScreen = this;
	private JLabel laUsername;
	public HomeScreen() { //근양 홈화면왔을때
		this(null);
		
	}
	public HomeScreen(LoginScreen loginScreen) { //로그인해서 온화면
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
