package review;
//익명클래스
//인터페이스를 통해서 익명클래스(함수 구형되어야함)를 생성가능 /메소드만 사용하고 싶을때 사용
//자바는 함수만 만들수가 없다.
//더하기 함수를 만들고 싶음. -> 더하기 함수 만들려면 클래스가 필요함.
interface A{
	void add();
}

public class Ex121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A() {
			
			@Override
			public void add() {
				System.out.println("더하기 :");
				
			}
		}.add();
	}

}
