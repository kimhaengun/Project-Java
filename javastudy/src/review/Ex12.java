package review;
//인터페이스

//TV 4대, 삼성, LG, 대우, 일렉트론
//인터페이스는 강제성을 부여한다.
//사용자에게 편리한 인터페이스 제공
interface Remocon{ //new 불가
	void changes(); 
}

class SamsungRemocon implements Remocon{

	@Override
	public void changes() {
		// TODO Auto-generated method stub
		System.out.println("삼성 채널변경");
	}
	
}
class LGRemocon implements Remocon{

	@Override
	public void changes() {
		// TODO Auto-generated method stub
		System.out.println("LG 채널변경");
	}
	
}
public class Ex12 {
	static void 채널변경(Remocon r) {
		r.changes();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		채널변경(new SamsungRemocon());
		채널변경(new LGRemocon());
		
		Remocon r = new Remocon() {
			//익명 클래스
			@Override
			public void changes() {
				// TODO Auto-generated method stub
				System.out.println("안녕");
			}
		};
		r.changes();
	} // end of main

}
