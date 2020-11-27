package ch04;

//자바 특징 : 모든 코드는 class 내부에 둬야 한다.
public class method01 {
	// heap 공간
	static void add() {
		System.out.println("add함수 호출됨");
	}
	void sound() {
		System.out.println("sound 함수 호출됨");
	}
	
	public static void main(String[] args) {
		//stack 공간
		method01.add();
		
		method01 m = new method01();
		m.sound();
	}//end of main
}
