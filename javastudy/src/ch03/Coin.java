package ch03;

import java.util.Scanner;

public class Coin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int coin = sc.nextInt();
		int coin50000, coin10000, coin1000, coin100, coin50, coin10, coin1;
		int money, money2,money3,money4, money5, money6,money7;
		
		//65376
		coin50000=coin/50000;
		 money = coin%50000;
		 
		 coin10000=money/10000;
		 money2 = money%10000; 
	
		 coin1000=money2/1000;
		 money3 = money2%1000;
		 
		 coin100 = money3/100;
		 money4 = money3%100;
		 
		 coin50 = money4/50;
		 money5 = money4%50;
		 
		 coin10 = money5/10;
		 money6 = money5%10;
		 
		 coin1 = money6/1;
		 money7 = money6%1;
		 
		if (coin>=50000) {
			System.out.println("��������:"+coin50000+"��");
		}if (money>=10000) {
			System.out.println("������"+coin10000+"��");
		}if (money2 >=1000) {
			System.out.println("õ����"+coin1000+"��");
		}if (money3>=100) {
			System.out.println("�����"+coin100+"��");
		}if (money4>=50) {
			System.out.println("���ʿ�"+coin50+"��");
		}if (money5>=10) {
			System.out.println("�ʿ�"+coin10+"��");
		}if (money6>=1) {
			System.out.println("�Ͽ�"+coin1+"��");
		}
		
	}

}
