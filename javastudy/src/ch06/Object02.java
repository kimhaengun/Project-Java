package ch06;

public class Object02 {
//	static void test(Object num) {
//		int money = 10000;
//		int sum = money + num; 
//		//num�� objectŸ���̸� ������ƮŸ���� �ֻ���Ŭ�����̱� ������ ���� ������Ʈ������ �ٲ�
//}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object num = 10;
//		test(num);
		String str ="ȫ�浿";
		System.out.println(str.hashCode()); //hashCode �ּҺ񱳰���
		
		String str2 = "ȫ�浿";
		System.out.println(str2.hashCode());
		
		str = "�Ӳ���";
		System.out.println(str.hashCode());
		
		System.out.println(str2.hashCode());
	}

}
