package review;
//메서드의 매개변수와 인수
public class Ex08 {
	//void는 리턴이 없다. add는 변수이름,()는 함수라는 뜻
	//int n1, int n2 매개변수(arguments)
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	int minus(int n1, int n2) {
		return n1-n2; //함수를 호출한 문장의 값이 n1-n2로 변경됨.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex08 e = new Ex08();
		e.add(2, 3); //함수의 호출 (12번라인에서 6번라인 점프)
		
		int result = e.minus(10, 5);
		System.out.println(result);
		
	}

}
