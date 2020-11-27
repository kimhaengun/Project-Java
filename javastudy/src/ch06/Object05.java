package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter, setter, toString
@AllArgsConstructor //풀 생성자
@NoArgsConstructor //디폴트 생성자
class User3{
	private int id;
	private String username;
}

public class Object05 {
	public static void main(String[] args) {
		User3 user = new User3(1,"ssar");
		System.out.println(user);
	}
}
