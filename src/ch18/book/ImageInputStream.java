package ch18.book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class ImageInputStream {
	public static void main(String[] args) throws Exception {
		String img = "C:\\Users\\user\\Desktop\\output\\오징어게임.jpg";
		String des = "C:\\Users\\user\\Desktop\\output\\오징어게임2.jpg";
		
		FileInputStream in = new FileInputStream(img);
		FileOutputStream os = new FileOutputStream(des);
		
		int len = 0;
		byte[] b = new byte[100];
		while((len = in.read(b)) != -1) {
			
		}
		
		in.close();
	}
}
