package ch03;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 5�� �Է��Ͻÿ�");
		int sum=0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n<=0) {
				//continue;// ��� ���� �ݺ������� �Ѿ�� ��ɾ�
				break;//�ݺ����� �����ϴ� ��ɾ�
			}else {
				sum=sum+n;
			}
		}
		System.out.println("����� ���� :"+sum);
		sc.close();
	}//end of main

}
