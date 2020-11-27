package ch06;

public class Object03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		System.out.println(str1==str2); 
		// == -> 최초 액세스한 메모리 공간의 내용을 비교
		
		String str3 = "임꺽정"; //Heap 내부의 Constant pool
		String str4 = new String("임꺽정");//Heap
		
		System.out.println();
		//String의 Hash 함수는 오버라이딩되어
		//같은 문자열이면 같은 해쉬를 뽑아낸다.
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3==str4);
		// ==으로 먼저 비교 같으면 true
		// ==으로 비교했는데 false 가 나오면 최종목적지 값을 비교
		System.out.println(str3.equals(str4));
		
	}

}
