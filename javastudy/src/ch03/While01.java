package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		//데몬 (Daemon Process) 끝이없이 돌아가는 프로그램 - ex)웹서버
		while(check >=0) {
			int num = sc.nextInt();
			System.out.println("받은 값:"+num);
			
			check=num;
//			if (num<0) {
//				break;
//			}
		}
		
	}//end of main

}
