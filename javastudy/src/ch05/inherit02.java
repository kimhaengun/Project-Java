package ch05;

class ������{
	String name = "������";
}

class �ѱ��� extends ������{
	String name = "�ѱ���";
}
class �λ��� extends �ѱ���{
	String name = "�λ���";
}

public class inherit02 {

	public static void main(String[] args) {
		// heap (�ѱ���, ������) -> ������(������)
		������ b = new �ѱ���();
		
		//1.b�� �ѱ��� �������� �޸𸮿� �� �ֱ� ������
		//�ٿ�ĳ���� ����..
		�ѱ��� h = (�ѱ���)b; //�ٿ�ĳ���� 
		
		try {
			�λ���  busan = (�λ���)b;
		} catch (Exception e) {
			// TODO: handle exception  //�����ڰ� �ڵ鸵 �� �� ����.
			System.out.println("���� �߻������� ����");
		}
	}

}
