package ch02;

public class Var02 {

	public static void main(String[] args) {
		
		int num = 10; // 4Byte-32bit
		long num2 = 100; // 8Byte
		char s = 'A'	;	// 2Byte
		double d =7.5; // 8Byte
		boolean b =true; //1Bit

		num=(int)d; //명시적 형변환(다운캐스팅-자료 유실(7.5-->7))
		num=(int)num2; //명시적 형변환(다운 캐스팅)
		num2 = num; //묵시적 형변환(업 캐스팅)
	}//end of main

}
