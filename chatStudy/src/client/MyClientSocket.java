package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {
	private Socket socket;
	
	public MyClientSocket() {
	try {
		socket = new Socket("127.0.0.1",10000);
		
		//키보드로부터 입력 받아서 
		Scanner sc = new Scanner(System.in);
		//소켓에 쓰기 버퍼달기
		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		while(true) {
			String input = sc.nextLine(); //문자열 받기
			//서버에전송
			bw.write(input+"\n");
			bw.flush(); //스트림 전송
		}
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClientSocket();
	}

}
