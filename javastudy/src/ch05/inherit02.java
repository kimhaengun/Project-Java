package ch05;

class 지구인{
	String name = "지구인";
}

class 한국인 extends 지구인{
	String name = "한국인";
}
class 부산인 extends 한국인{
	String name = "부산인";
}

public class inherit02 {

	public static void main(String[] args) {
		// heap (한국인, 지구인) -> 포인터(지구인)
		지구인 b = new 한국인();
		
		//1.b는 한국인 지구인이 메모리에 다 있기 때문에
		//다운캐스팅 가능..
		한국인 h = (한국인)b; //다운캐스팅 
		
		try {
			부산인  busan = (부산인)b;
		} catch (Exception e) {
			// TODO: handle exception  //개발자가 핸들링 할 수 있음.
			System.out.println("오류 발생했지만 무시");
		}
	}

}
