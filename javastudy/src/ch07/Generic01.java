package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ //<T> 제너릭
	private int statusCode; //200정상, 300 다시 요청, 400 잘못된 요청
	private T data;  //제너릭 무조건 대문자(T) / 정해지지 않은 타입
}

class Dog{
	
}
public class Generic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200); //통신으로 받은 값이라고 가정
		dto.setData(1);
		
		System.out.println(dto.getStatusCode());
		System.out.println(dto.getData());
		if (dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}

}
