package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/01InputStream.java";
		InputStream input =new FileInputStream(path); 
		input.close();
	}
}
