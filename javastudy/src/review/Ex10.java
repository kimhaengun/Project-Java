package review;
//클래스와 오브젝트 인스턴스의 차이

abstract class 가구{ //class = 설계도  = new X -> Object라 부를 수 없음
	
}
class 침대{ //class = 설계도 = new O -> Object가 된다.
	
}
public class Ex10 {

	public static void main(String[] args) {
	침대 s = new 침대(); // heap 공간에 침대 메모리가 뜬다(인스턴스)	
	}

}
