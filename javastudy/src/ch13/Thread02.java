package ch13;
class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("��ƿ�ƿ�ƿ��");
	}
}
public class Thread02 {

	public static void main(String[] args) {
		//1.������ ��ü ���� 
		Thread t1 = new Thread(new NewThread());
		//2.Ÿ�� ����
		t1.start();
		//3.����
		
		NewThread t2 = new NewThread();
		t2.start();
		
		
		
	}

}
