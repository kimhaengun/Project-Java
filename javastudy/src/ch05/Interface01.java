package ch05;
//인터페이스 규칙
//1.인터페이스는 new할 수 없다.
//2.인퍼테이스는 변수를 가질 수 있다. 그변수는 public static final이다.
//3.인터페이스는 추상메서드를 가진다. 그 메서드는 public abstract 이다. 추상메서드에 abstract
//4.인터페이스는 정상적인 메서드를 가질 수 없다.
//5.인터페이스를 구현하는 클래스는 반드시 오버라이딩해야한다.

interface Remocon{
	String name ="리모컨"; //public static final이 생략되어 있음.
	public abstract void control(); //public abstract생략 가능.
}

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
