package review;
//상속
//상속은 데이터를 물려주는 것이 목적이 아니다.
//데이터를 물려주고 싶으면 콤포지션 
//상속을 하는 이유는 다형성!!!!!!!!에있음. 타입을 일치시키려는 것(공통 모듈 생성 가능.)
class 나무{
	void start() {}
}
class 나무의자 extends 나무{
	void start() {
		System.out.println("나무의자 사용");
	}
}
class 나무책상 extends 나무{
	void start() {
		System.out.println("나무책상 사용");
	}
}
public class Ex11 {

	static void use(나무 u) {
		u.start();
	}
	public static void main(String[] args) {
		use(new 나무책상());
		use(new 나무의자());
	}
}
