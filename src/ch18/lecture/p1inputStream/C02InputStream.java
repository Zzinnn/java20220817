package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C02InputStream {
	public static void main(String[] args) throws Exception {
		String path ="src/ch18/lecture/p1inputStream/C02InputStream.java";
		InputStream input = new FileInputStream(path);	
		
		int cnt = 0;
		while ((input.read()) != -1) {
			cnt++;
		}
		
		System.out.println(cnt + "번 읽음");
		input.close();
			
	}
	
}
