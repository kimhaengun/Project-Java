package login;

//사용자가 로그인할 때 -> 페이스북, 네이버
public class LoginApp {
	static void userinfo(OAuth o) {
		System.out.println("로그인한 사용자는 ,,,");
		System.out.println(o.oauthProvider());
		System.out.println(o.oauthid());
		System.out.println(o.oauthpassword());
		System.out.println(o.oauthNick());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook f = new Facebook(); //로그인하면 자동으로 만들어짐..
		userinfo(f);
		
		Naver n = new Naver();
		userinfo(n);
		
		Kakao k = new Kakao();
		userinfo(k);
	}

}
