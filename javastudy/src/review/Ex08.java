package review;
//�޼����� �Ű������� �μ�
public class Ex08 {
	//void�� ������ ����. add�� �����̸�,()�� �Լ���� ��
	//int n1, int n2 �Ű�����(arguments)
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	int minus(int n1, int n2) {
		return n1-n2; //�Լ��� ȣ���� ������ ���� n1-n2�� �����.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex08 e = new Ex08();
		e.add(2, 3); //�Լ��� ȣ�� (12�����ο��� 6������ ����)
		
		int result = e.minus(10, 5);
		System.out.println(result);
		
	}

}