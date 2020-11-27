package ch02;
//자바는 .class파일을 실행하면 static 부분을 메모리에 로드한다.(static 공간)
//static공간에 있는 main()함수를 찾아서 호출하고
//이때 stack이 생성되는데 이 stack의 이름은 main이라고 한다.
//main이 stack 종료되면 프로그램 종료
public class Var01 {

	public static void main(String[] args) {
		//이제부터 모든 코드는 여기에 작성. (Code 부분)
		//함수가 호출되면 함수내부(stack)는 함수가 종료될때까지
		System.out.println("첫번째");
		System.out.println("두번째");
	}//end of main
}
