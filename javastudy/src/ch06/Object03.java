package ch06;

public class Object03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		
		System.out.println(str1==str2); 
		// == -> ���� �׼����� �޸� ������ ������ ��
		
		String str3 = "�Ӳ���"; //Heap ������ Constant pool
		String str4 = new String("�Ӳ���");//Heap
		
		System.out.println();
		//String�� Hash �Լ��� �������̵��Ǿ�
		//���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3==str4);
		// ==���� ���� �� ������ true
		// ==���� ���ߴµ� false �� ������ ���������� ���� ��
		System.out.println(str3.equals(str4));
		
	}

}
