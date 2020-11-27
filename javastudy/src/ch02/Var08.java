package ch02;

//heap
class Zealot{
	String name = "질럿";
	int attack = 10;
	int armor = 5;
	static int hp =100;
}

public class Var08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot z = new Zealot(); //이 라인에서 질럿 생성됨. , type=클래스명  heap저장
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot();//이 라인에서 질럿 생성됨.
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		z.attack = 50;
		System.out.println("변화관찰");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		z.hp = 50; //정적(static)변수의 데이터를 건들면 static의 값은 모두 변함
		System.out.println(z.hp);
		System.out.println(z2.hp);
	
		//포지 업그레이드
		z.attack=11;
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}

}
