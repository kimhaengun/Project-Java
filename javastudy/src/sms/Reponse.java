package sms;

import java.awt.image.RescaleOp;

public class Reponse {
	String  group_id;
	String error_list;
	String success_count;
	String error_count;
	
	public static void main(String[] args) {
		String data="{\"group_id\":\"R2G1dkO1WfaxB7Gt\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}\r\n"
				+ "";
		Reponse res = new Reponse();
		System.out.println(data);
		
		int a = data.indexOf("{");
		System.out.println(a);
		int a1 =data.indexOf("1}");
		System.out.println(a1);
		
		String s = data.substring(1, 90);
		System.out.println(s);
		System.out.println();
		//s.replaceAll('\"','1');
		System.out.println(s);
		System.out.println("============================");
		String s1[] = s.split(",");
		System.out.println(s1[0]); //"group_id":"R2G1dkO1WfaxB7Gt"
		System.out.println(s1[1]); //"error_list":{"1":"1062"}
		System.out.println(s1[2]); //"success_count":0
		System.out.println(s1[3]); //"error_count":1
		String s2[] = s1[0].split(":"); // "group_id" / "R2G1dkO1WfaxB7Gt"
		String s3[] = s1[1].split(":"); //"error_list"  /  {"1" / "1062"}
		String s4[] = s1[2].split(":"); //"success_count" / 0
		String s5[] = s1[3].split(":");// "error_count" / 1
		System.out.println(s3[2]);
	
	}
}
