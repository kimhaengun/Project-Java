package login;

//����ڰ� �α����� �� -> ���̽���, ���̹�
public class LoginApp {
	static void userinfo(OAuth o) {
		System.out.println("�α����� ����ڴ� ,,,");
		System.out.println(o.oauthProvider());
		System.out.println(o.oauthid());
		System.out.println(o.oauthpassword());
		System.out.println(o.oauthNick());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook f = new Facebook(); //�α����ϸ� �ڵ����� �������..
		userinfo(f);
		
		Naver n = new Naver();
		userinfo(n);
		
		Kakao k = new Kakao();
		userinfo(k);
	}

}
