package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//DTO = Data Transfer Object = ��ſ��� ���� ����.
class UserDto{
	private int id;
	private String name;
	
}

public class String01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "id : 1,name : ȫ�浿";
		String s[] = data.split(",");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println();
		System.out.println(s[0].toString());
		System.out.println(s[1].toString());
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			System.out.println("�и�:"+s[i]);
			
		}
		System.out.println();
		// �Ľ� parsing(���� �м� / ������ ����� �м� )
		UserDto dto = new UserDto();
		dto.setId(1);
		dto.setName("ȫ�浿");
		System.out.println(dto);
	
	
	}

}
