package ch04;

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	//디폴트 생성자는 생성자가 하나도 없으면 컴파일러가 자동으로 만들어줌.
	//만약 생성자가 있으면 디폴트 생성자를 만들어주지 않음.
	//이경우에는 디폴트 생성자를 직접 만들어줘야 함.(오버로딩)
	public Person() {
		// TODO Auto-generated constructor stub
		
	}
	
	//초기화를 위한 생성자 (초기화를 위한 함수)
	public Person(String a, String b, int c, char d, String e) {
		// TODO Auto-generated constructor stub
		System.out.println("사람이 태어남");
		name = a;
		job= b;
		gender = d;
		age = c;
		blood = e;
		
	}
	
	void perview() {
		System.out.println("===="+name+"====");
		System.out.println("직업:"+job);
		System.out.println("나이:"+age);
		System.out.println("성별:"+gender);
		System.out.println("혈액형:"+blood);
		System.out.println() ;//내려쓰기 <br/>
	}
}
