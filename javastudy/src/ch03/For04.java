package ch03;

public class For04 {

	static void starPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	static void starPrint2(int num) {
		for (int i = 3; i > num; i--) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			starPrint(i);

		}
		for (int i = 1; i < 3; i++) {
			starPrint2(i);
		}

		
		
		
		
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j  > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
