package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


	public class LoginScreen extends JFrame{
		
		//Context = 컨텍스트 원래화면을 다음화면까지 옮겨 가져감 = 스토커
		private JTextField tfUsername;
		private JButton btnLogin;
		private LoginScreen loginScreen = this;
	public LoginScreen() {
		tfUsername =  new JTextField("");
		btnLogin = new JButton("로그인");
		setTitle("Login");
		setSize(400, 500);
		Container c = getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		initListener();
		
		setVisible(true);

}
	//리스너 등록 모아두기
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String Username = tfUsername.getText();
				if(Username.equals("ssar")) {
					
					new HomeScreen(loginScreen);
					loginScreen.setVisible(false);
				}else {
					System.out.println("로그인 실패 아이디 다시 입력");
				}
			}
		});
	}
	public JTextField getTfUsername() {
		return tfUsername;
	}
	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}
	public JButton getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	public LoginScreen getLoginScreen() {
		return loginScreen;
	}
	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}
	
}
	
