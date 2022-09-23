package ch18.lecture.p2outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C02OutputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p2outputStream/C02OutputStream.java";
		String path1 = "C:\\Users\\user\\Desktop\\output\\output2.txt";
		
		InputStream in = new FileInputStream(path);
		OutputStream out = new FileOutputStream(path1);
		
		int r = 0;
		while((r = in.read()) != -1) {
			out.write(r);
		}
		
		in.close();
		out.close();
	}
}
