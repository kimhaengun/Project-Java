package ch02;

public class Var02 {

	public static void main(String[] args) {
		
		int num = 10; // 4Byte-32bit
		long num2 = 100; // 8Byte
		char s = 'A'	;	// 2Byte
		double d =7.5; // 8Byte
		boolean b =true; //1Bit

		num=(int)d; //������ ����ȯ(�ٿ�ĳ����-�ڷ� ����(7.5-->7))
		num=(int)num2; //������ ����ȯ(�ٿ� ĳ����)
		num2 = num; //������ ����ȯ(�� ĳ����)
	}//end of main

}