package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C03InputStream {
	public static void main(String[] args) throws Exception {
		String path ="src/ch18/lecture/p1inputStream/C03InputStream.java";
		InputStream in = new FileInputStream(path);
		
		byte[] b = new byte[100];
		
		int len1 = in.read(b);
		int len2 = in.read(b);
		int len3 = in.read(b);
		int len4 = in.read(b);
		int len5 = in.read(b);
		int len6 = in.read(b);
		int len7 = in.read(b);
		int len8 = in.read(b);
		int len9 = in.read(b);
		int len10 = in.read(b);
		int len11 = in.read(b);
		int len12 = in.read(b);
		
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println(len4);
		System.out.println(len5);
		System.out.println(len6);
		System.out.println(len7);
		System.out.println(len8);
		System.out.println(len9);
		System.out.println(len10);
		System.out.println(len11);
		System.out.println(len12);
		
		in.close();
		
//		읽은 바이트 수를 리턴한다
//		byte 크기만큼만 읽어줄 수 있음
	}
}
