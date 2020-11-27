package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


	public class LoginScreen extends JFrame{
		
		//Context = ���ؽ�Ʈ ����ȭ���� ����ȭ����� �Ű� ������ = ����Ŀ
		private JTextField tfUsername;
		private JButton btnLogin;
		private LoginScreen loginScreen = this;
	public LoginScreen() {
		tfUsername =  new JTextField("");
		btnLogin = new JButton("�α���");
		setTitle("Login");
		setSize(400, 500);
		Container c = getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		initListener();
		
		setVisible(true);

}
	//������ ��� ��Ƶα�
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String Username = tfUsername.getText();
				if(Username.equals("ssar")) {
					
					new HomeScreen(loginScreen);
					loginScreen.setVisible(false);
				}else {
					System.out.println("�α��� ���� ���̵� �ٽ� �Է�");
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
	
