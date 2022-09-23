package ch18.book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class p11_ClientExample {
	public static void main(String[] args) {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();  //socket에서 outputStream 꺼내줌
		
		String filePath = "C:\\Users\\user\\Desktop\\output\\오징어게임.jpg";
		File file = new File (filePath);
		
		// 파일이름 보내는데에 100바이트 씀
		String fileName = file.getName();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		byte[] b = new byte[100];
		bw.writer(,0,b);	
		
		
		System.out.println("[파일 보내기 시작]" + fileName);
		FileInputStream fis = new FileInputStream(file);
		int len = 0;
		
		while((len = fis.read(b)) != -1) {
			os.write(b,0,len);
		}
		
		
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
		
	}
}
