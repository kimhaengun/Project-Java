package ch03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) { //void = return이 없다.
		// TODO Auto-generated method stub
		// Scanner를 이용하면 I/O연산에 접근 가능.
	Scanner sc = new Scanner(System.in); // I/O 선에 접근하는 래퍼런스	
	int num = sc.nextInt(); //블락킹
	
	System.out.println("입력 받은 값 :"+num);
	}

}
 