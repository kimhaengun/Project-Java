package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.print.attribute.standard.JobImpressionsSupported;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Conn01 {
	public static void main(String[] args) {
		try {
			//1.占쌍소쇽옙占쏙옙 URL 클占쏙옙占쏙옙 占쏙옙占�
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%A0%EC%94%A8");
			//2.占쏙옙占쌜울옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙트占쏙옙占쏙옙 占쏙옙占쏙옙
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			//3.占쏙옙占쏙옙 占쏙옙占쏙옙 (8192byte)
			BufferedReader br =new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String input =null;
			String download = "";
			while((input = br.readLine()) != null) {
				download =download + input;
			}

			FileWriter f = new FileWriter("D:\\index.txt");
			f.write(download);
			
			Document doc = Jsoup.parse(download);
			Elements tem = doc.select("todaytemp");
			
			
			
//			Document doc = Jsoup.parse(download);
//			Elements temp = doc.
			System.out.println("오늘의 온도는 : ");
//			System.out.println(download);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//end of main
}
