package review;
//�������̽�

//TV 4��, �Ｚ, LG, ���, �Ϸ�Ʈ��
//�������̽��� �������� �ο��Ѵ�.
//����ڿ��� ���� �������̽� ����
interface Remocon{ //new �Ұ�
	void changes(); 
}

class SamsungRemocon implements Remocon{

	@Override
	public void changes() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ä�κ���");
	}
	
}
class LGRemocon implements Remocon{

	@Override
	public void changes() {
		// TODO Auto-generated method stub
		System.out.println("LG ä�κ���");
	}
	
}
public class Ex12 {
	static void ä�κ���(Remocon r) {
		r.changes();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ä�κ���(new SamsungRemocon());
		ä�κ���(new LGRemocon());
		
		Remocon r = new Remocon() {
			//�͸� Ŭ����
			@Override
			public void changes() {
				// TODO Auto-generated method stub
				System.out.println("�ȳ�");
			}
		};
		r.changes();
	} // end of main

}
