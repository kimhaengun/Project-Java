package ch06;

public class Wrapper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		Integer num2 = 20;	
		
		String num3 =num2.toString(); 
		// toString숫자를 문자로 변환해줌
		System.out.println(num3);
		
		String num4 = num+"";  
		//숫자+문자를 결합하면 문자의 크기가 더크기 때문에 스트링으로 변환 됨.
		
		String num5="10";
		int num6 =Integer.parseInt(num5); //문자를 인트형으로 변환
		System.out.println(num6);
		
	}

}
