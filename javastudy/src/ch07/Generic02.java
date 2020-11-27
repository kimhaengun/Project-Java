package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(); //()=생성자
		//부모 타입으로 잡아야함 list...는
		list1.add("사과");
		list1.add("딸기");
		
		int size = list1.size();
		// 컬렉션의 길이 = .size(); for 도는 동안 함수에 접근해야 함으로 묶어줌
		for (int i = 0; i < size; i++) {
			System.out.println(list1.get(i));
		}
		
		list1.add("바나나"); //추가
		System.out.println(list1.get(2));
		
		list1.add(1,"참외");
		System.out.println(list1.get(1));
		
		list1.remove(1);
		System.out.println(list1.get(1));
		
		list1.clear();
		System.out.println(list1.size());
		
	}

}
