package ch18.book;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample_1030  {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;  //키보드에 입력
		Reader reader =new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String (cbuf,0,readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}
}
