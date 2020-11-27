package login;

public class Facebook implements OAuth{
	private String provider;
	private String email;
	private String password;
	private String username;
	
	public Facebook() {
		// TODO Auto-generated constructor stub
		this("facebook","ssar@nate.com","1234","����");
	}

	public Facebook(String provider, String email, String password, String username) {
		super();
		this.provider = provider;
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return provider;
	}

	@Override
	public String oauthid() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String oauthpassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return username;
	}
	
}