package ch06;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		//문자열의 길이(개수) 표현 length()
		System.out.println(a+"의 길이는 "+a.length());
		//문자열의 포함 관계 contains() #이 a값이 포함되었는지 확인 가능
		System.out.println(a.contains("#"));
		//문자 연결하기 concat()
		a = a.concat(b);
		System.out.println(a);
		//문자열 앞 뒤 공백 제거 trim()
		a = a.trim();
		System.out.println(a);
		//문자열 대치(변경) replace(현재 값, 변경 값)
		a=a.replace("C#","Java");
		System.out.println(a);
		//문자열 분리 split(분리 정의)
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) 
			System.out.println("분리된 문자열"+i+":"+s[i]);
		//인덱스 5부터 끝까지 출력 substring()
		a=a.substring(5);
		System.out.println(a);
		//인덱스 2의 문자 리턴 charAt()
		char c = a.charAt(2);
		System.out.println(c);
	}

}
