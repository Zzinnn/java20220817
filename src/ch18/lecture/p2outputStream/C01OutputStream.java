package ch18.lecture.p2outputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01OutputStream {
	public static void main(String[] args) throws Exception {
		
		
		
		String name = "C:\\Users\\user\\Desktop\\output\\output1.txt";
		
		OutputStream os = new FileOutputStream(name);
		
		os.write(0);
		os.write(0);
		os.write(0);
		os.write(127);
		os.write(-128);
		
		os.close();
	}
}
