package ch13;

class Another implements Runnable { //Runnable 타입이 되어야 함.
	//실행단위 코드블록=스택(스레드)
	@Override
	public void run() {
		System.out.println("새로운 스레드 실행됨");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run :"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		System.out.println("새로운 스레드 종료");
	}
}
public class Thread01 {
public static void main(String[] args) {
	System.out.println("메인 스레드 실행됨");
		
	//새로운 스레드 실행 규칙!!!!!!
	Thread t1 = new Thread(new Another()); //1.스레드 객체 만들기
	//2. 타겟(실행하고싶은) 설정 = new Another()
	t1.start();//3. 실행  --> start()실행시 run()이 때려진다.
	
	for (int i = 1; i < 11; i++) {
		try {
			System.out.println("메인 :"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	System.out.println("메인 스레드 종료");

} //end of main
}
