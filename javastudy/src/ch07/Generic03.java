package ch07;

import java.util.Vector;

public class Generic03 {

	public static void main(String[] args) {
		// 동기화(일의 순서가 있음) 되어 있는 임계(위험)구역(동시 접근 불가 )
		Vector<Integer> list1 = new Vector<>();
		//사용법 --> Arraylist와 같음
		list1.add(100);
		list1.add(200);
		list1.add(1,300);
		
		System.out.println(list1.get(1));
	}

}
