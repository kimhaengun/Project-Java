package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Comment{
	private int id;
	private String text;
}
public class Json01 {
	
	public static void main(String[] args) {
		Comment ct1 = new Comment(1,"댓글1");
		
		// 자바 -> JSON(통신은 무조건 String)
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);//toJson==ct1을 Json으로 변경
		System.out.println(ct1Json);
		
		//JSON(String) -> 자바
		Comment ct2 = gson.fromJson(ct1Json, Comment.class); 
		//fromJson==ct1Json을 Comment(ct2).class로 변환
		System.out.println(ct2.getId()); //자바로 변환된 값 가져오기
		System.out.println(ct2.getText()); //자바로 변환된 값 가져오기
	}

}
