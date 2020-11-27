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
	//heap ����
	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;
	
	public MyClientSocket2() {
	try {
		socket = new Socket("127.0.0.1",10000);
		
		//Ű����κ��� �Է� �޾Ƽ� 
		sc = new Scanner(System.in);
		//���Ͽ� ���� ���۴ޱ�
		writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				String input = null;
				try {
					while((input = reader.readLine())!=null) {
						System.out.println("�����κ��Ϳ� �޽��� : "+input);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		//���ν������ Ű����κ��� �Է��� ���� �� Ŭ���̾�Ʈ ���Ͽ� ����
		while(true) { //���� �����尡 ���������ϰ� ���ο� �����尡 ���� ���� ��
			String input = sc.nextLine(); //���ڿ� �ޱ�
			//����������
			writer.write(input+"\n");
			writer.flush(); //��Ʈ�� ����
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
