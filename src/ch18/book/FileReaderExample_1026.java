package ch18.book;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample_1026 {
	public static void main(String[] args) throws Exception {
		String name = "src/";
		FileReader fr = new FileReader(name);
		
		int readCharNo; //몇 개 읽었는지 담을 변수
		char[] cbuf = new char[100]; //읽을 문자들
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}
