package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//DTO = Data Transfer Object = 통신에서 많이 사용됨.
class UserDto{
	private int id;
	private String name;
	
}

public class String01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "id : 1,name : 홍길동";
		String s[] = data.split(",");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println();
		System.out.println(s[0].toString());
		System.out.println(s[1].toString());
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리:"+s[i]);
			
		}
		System.out.println();
		// 파싱 parsing(구문 분석 / 구문을 나누어서 분석 )
		UserDto dto = new UserDto();
		dto.setId(1);
		dto.setName("홍길동");
		System.out.println(dto);
	
	
	}

}
