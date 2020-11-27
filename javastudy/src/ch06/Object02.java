package ch06;

public class Object02 {
//	static void test(Object num) {
//		int money = 10000;
//		int sum = money + num; 
//		//num은 object타입이며 오브젝트타입은 최상위클래스이기 때문에 값이 오브젝트값으로 바뀜
//}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object num = 10;
//		test(num);
		String str ="홍길동";
		System.out.println(str.hashCode()); //hashCode 주소비교가능
		
		String str2 = "홍길동";
		System.out.println(str2.hashCode());
		
		str = "임꺽정";
		System.out.println(str.hashCode());
		
		System.out.println(str2.hashCode());
	}

}
