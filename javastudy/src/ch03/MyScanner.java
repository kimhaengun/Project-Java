package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
	
	public String getData() {
		InputStream in = System.in; 
		// inputStream=�����͸� Byte������ �޾� �ƽ�Ű�ڵ�� ���
		InputStreamReader ir = new InputStreamReader(in);
		//�ƽ�Ű �ڵ带 ���ڷ� �ٲ������� �ϳ��� ��°���
		BufferedReader br = new BufferedReader(ir);
		
		try {
			return br.readLine(); //���۸� �����.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������");
		}
		return "";
	}
}
