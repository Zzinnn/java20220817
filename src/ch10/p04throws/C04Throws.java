package ch10.p04throws;

import java.io.FileInputStream;
import java.io.InputStream;

public class C04Throws {
	public static void main(String[] args) {
		
		method();
		
	}
	private static void method() {
		// 이 코드를 try /catch 사용하지 ㅜ않고
		// 컴파일 되도록 수정하세요
		InputStream is = new FileInputStream("");
	}
}
