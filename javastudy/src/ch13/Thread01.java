package ch13;

class Another implements Runnable { //Runnable Ÿ���� �Ǿ�� ��.
	//������� �ڵ����=����(������)
	@Override
	public void run() {
		System.out.println("���ο� ������ �����");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run :"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		System.out.println("���ο� ������ ����");
	}
}
public class Thread01 {
public static void main(String[] args) {
	System.out.println("���� ������ �����");
		
	//���ο� ������ ���� ��Ģ!!!!!!
	Thread t1 = new Thread(new Another()); //1.������ ��ü �����
	//2. Ÿ��(�����ϰ�����) ���� = new Another()
	t1.start();//3. ����  --> start()����� run()�� ��������.
	
	for (int i = 1; i < 11; i++) {
		try {
			System.out.println("���� :"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	System.out.println("���� ������ ����");

} //end of main
}