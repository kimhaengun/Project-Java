package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		InputStream in = System.in; 
		// inputStream=데이터를 Byte단위로 받아 아스키코드로 출력
		InputStreamReader ir = new InputStreamReader(in);
		//아스키 코드를 문자로 바꿔주지만 하나만 출력가능
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String data = br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
