package ch13;
class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("우아우아우아우아");
	}
}
public class Thread02 {

	public static void main(String[] args) {
		//1.스레드 객체 생성 
		Thread t1 = new Thread(new NewThread());
		//2.타겟 설정
		t1.start();
		//3.실행
		
		NewThread t2 = new NewThread();
		t2.start();
		
		
		
	}

}
