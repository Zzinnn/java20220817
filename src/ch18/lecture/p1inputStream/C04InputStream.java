package ch18.lecture.p1inputStream;

import java.io.FileInputStream;

public class C04InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C04InputStream.java";
		FileInputStream in = new FileInputStream(path);

		int cnt = 0;
		
		byte[] b = new byte[10];
		while(in.read(b) != -1) {
			cnt++;
		}
		System.out.println(cnt + "읽음");
		
		in.close();
	}
}
