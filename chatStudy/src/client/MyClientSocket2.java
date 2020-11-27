package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket2 {
	//heap 변수
	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;
	
	public MyClientSocket2() {
	try {
		socket = new Socket("127.0.0.1",10000);
		
		//키보드로부터 입력 받아서 
		sc = new Scanner(System.in);
		//소켓에 쓰기 버퍼달기
		writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				String input = null;
				try {
					while((input = reader.readLine())!=null) {
						System.out.println("서버로부터온 메시지 : "+input);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		//메인스레드는 키보드로부터 입력을 받은 뒤 클라이언트 소켓에 전송
		while(true) { //메인 스레드가 쓰는읽을하고 새로운 스레드가 쓰는 읽을 함
			String input = sc.nextLine(); //문자열 받기
			//서버에전송
			writer.write(input+"\n");
			writer.flush(); //스트림 전송
		}
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClientSocket2();
	}

}
