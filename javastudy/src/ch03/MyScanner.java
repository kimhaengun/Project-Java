package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
	
	public String getData() {
		InputStream in = System.in; 
		// inputStream=데이터를 Byte단위로 받아 아스키코드로 출력
		InputStreamReader ir = new InputStreamReader(in);
		//아스키 코드를 문자로 바꿔주지만 하나만 출력가능
		BufferedReader br = new BufferedReader(ir);
		
		try {
			return br.readLine(); //버퍼를 비워냄.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("괜찮아");
		}
		return "";
	}
}
