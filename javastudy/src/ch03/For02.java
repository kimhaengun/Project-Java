package ch03;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//짝수 1~100
		for (int i = 1; i < 101; i++) {
			if (i%2==0) {
				System.out.println("2의 배수"+i);	
			}
		}
		System.out.println();
		for (int i = 1; i < 101; i++) {
			if (i%3==0) {
				System.out.println("3의 배수"+i);
			}
		}
		//홀수 1~100
		for (int i = 0; i < 101; i++) {
			if (i%2==1) {
				System.out.println("홀수 :"+i);
			}
		}
		//50~1까지 의 수중 홀수 출력(내림차순)
		for (int i = 50; i > 0; i--) {
			if (i%2==1) {
				System.out.println("50~1까지 홀수 :" +i);
			}
		}
	}

}
