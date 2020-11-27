package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999); //서버 소켓 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("보내기>>>"); //프롬프트
				String outputMessage = scanner.nextLine();//키보드에서 한 행 읽기
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage+"\n"); //키보드에서 읽은 문자열 전송
				out.flush(); //out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage = in.readLine(); //서버로부터 한 행 수신
				System.out.println("서버 : "+inputMessage);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close(); // scanner 닫기
				if (socket != null) socket.close(); //클라이언트 소켓 닫기
			} catch (Exception e2) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}

}
