package review;
//�͸�Ŭ����
//�������̽��� ���ؼ� �͸�Ŭ����(�Լ� �����Ǿ����)�� �������� /�޼ҵ常 ����ϰ� ������ ���
//�ڹٴ� �Լ��� ������� ����.
//���ϱ� �Լ��� ����� ����. -> ���ϱ� �Լ� ������� Ŭ������ �ʿ���.
interface A{
	void add();
}

public class Ex121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A() {
			
			@Override
			public void add() {
				System.out.println("���ϱ� :");
				
			}
		}.add();
	}

}