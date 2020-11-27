package ch02;

public class Oper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1+1); //연산
		System.out.println(1+"1"); //결합

		int num = 10;
		String s = "5";
		
		String sum = num+s; //type이 String으로 됨.
		System.out.println(sum);
		
		System.out.println(10-5);
		System.out.println(10/3); //타입이 인트로 됨 
		System.out.println(10.0/3);//타입이 double
		System.out.println(10%3);//나머지 
		System.out.println(10*3);
	}//end of main
}
