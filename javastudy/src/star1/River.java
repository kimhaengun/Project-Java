package star1;

class River {
	//1.상태
	String name; 
	int hp;
	int attack;
	
	//2.초기화를 위한 생성자 (마법X)
	public River(String a, int b, int c) {
		// TODO Auto-generated constructor stub
		name = a;
		hp = b;
		attack = c;
	}
	
	//3.디폴트 생성자를 직접 만들어줌.(이유:컴파일러가 자동으로 안만들어주기 때문에)
	public River() {
		// TODO Auto-generated constructor stub
	}
	//4.변수의 값을 변경하거나 확인하는 행위가 필요
	
}
