package ch04;
class president{
	
	static president instance = new president();
	public static president getinPresident() {
		return instance;
	}
	private president() {
		// TODO Auto-generated constructor stub
	}
	
}

public class SingletoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		president p = president.instance;
	
	}
	
}
