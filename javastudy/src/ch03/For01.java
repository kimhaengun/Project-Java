package ch03;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ��� - > ������ �ݺ��Ǵ� ��
		for(int i =1; i<5; i++) { //���� �ʱ�ȭ ��������.. for���� ������ ���� ��������.
			//�ʱⰪ�� i=1 (for�� ������ �ѹ��� ȣ���)
			//���ǽ��� i �� 5���� ���� ������ �ݺ��ϰ�
			//������ �ѹ� ����� �� ���� i�� 1�� ����
			
			//ù��° ������ �ʱⰪ ���� �� ���� Ȯ��
			//�ι�° ������ i�� ���� �� ���� Ȯ��(�ݺ�)
			System.out.println("���� :"+i);	
		}
		System.out.println();
		
		for (int i = 4; i >= 1; i--) {
			System.out.println("����: "+i);
		}
		System.out.println();
		for (int i = 1; i < 101; i=i+2) {
			System.out.println("���� : "+i);
		}
		System.out.println();
		//0���� 100���� ���߿��� 3�� ����� ����Ͻÿ� 3 6 9 12
		for (int i = 3; i < 101; i=i+3) {
			System.out.println("���� :"+i);
		}
	}

}
