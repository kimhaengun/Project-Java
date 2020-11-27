package ch05;

//인터페이스는 new할 수 없다. because 추상 메서드를 가졌기 때문에
//반드시 같은 함수를 사용하게 만듬. /타입 일치(강제성)

//인터페이스 정의-약속을 만드는 값
//ex)자동차 엑셀 
interface Animal2{
	void sound(); //추상메서드 (함수의 몸체가 없다.비어있음.)
}
class Dog2 implements Animal2{
	//implements = 구현
	//오버라이딩 (무효화 하다.->부모의 함수를 무효화) 재정의 아님 주의
	public void sound() {
		System.out.println("멍멍");
	} 
	
}
class Cat2 implements Animal2{
	//오버라이딩 (무효화 하다.->부모의 함수를 무효화)
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("냐옹");
	}
}
class Bird2 implements Animal2{
	//오버라이딩 (무효화 하다.->부모의 함수를 무효화)
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("짹짹");
	}
}
class Tiger2 implements Animal2{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("어흥");
	}
	
}
class Monkey implements Animal2{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
	System.out.println("몽몽");	
	}
	
}
//Monkey 클래스를 만들고 몽몽 출력하고
//반드시 Animal2를 구현하세여.
public class Inherit04 {
	
	static void start(Animal2 a) {
		a.sound();
	}
	//자기 자신의 클래스의 static을 호출할 때는 클래스명 생략가능 줄48.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start((new Monkey()));
	}

}
