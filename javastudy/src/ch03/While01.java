package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		//���� (Daemon Process) ���̾��� ���ư��� ���α׷� - ex)������
		while(check >=0) {
			int num = sc.nextInt();
			System.out.println("���� ��:"+num);
			
			check=num;
//			if (num<0) {
//				break;
//			}
		}
		
	}//end of main

}
