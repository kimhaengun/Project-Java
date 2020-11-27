package conn;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("D:\\test.txt");
			while(true) {
				String line = sc.nextLine();
				if (line.length()==0) 
					break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
