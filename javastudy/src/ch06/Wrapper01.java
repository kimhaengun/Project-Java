package ch06;

public class Wrapper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		Integer num2 = 20;	
		
		String num3 =num2.toString(); 
		// toString���ڸ� ���ڷ� ��ȯ����
		System.out.println(num3);
		
		String num4 = num+"";  
		//����+���ڸ� �����ϸ� ������ ũ�Ⱑ ��ũ�� ������ ��Ʈ������ ��ȯ ��.
		
		String num5="10";
		int num6 =Integer.parseInt(num5); //���ڸ� ��Ʈ������ ��ȯ
		System.out.println(num6);
		
	}

}
