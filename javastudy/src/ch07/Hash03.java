package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ���ڸ� �������ִ� Ŭ����
		Random r= new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		//�ǽ� ���������� ���� ���� ������ �ߺ��� ������ ���� �ʱ�
		while(true) {
		int num = r.nextInt(45)+1;
		System.out.println(num);
		
		//���� ���� �������� add�ϱ�
		for (int i = 0; i < lotto.size(); i++) {
			if(lotto.get(i) != num) {
				lotto.add(num);	
		
		if (lotto.size()==6) {
			break;
		}	
			}
		}
		}
		
//		Iterator<Integer> it = lotto.iterator();
		
//		while(it.hasNext()) { //���� ������ true, ������ false
//			System.out.print(it.next()+" "); //���� �ε����� ���� ����+�ε��� ����
			
//		}
		
	}

}