package ch18.lecture.p7network;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
	public static void main(String[] args) throws Exception {
		
	ServerSocket server = new ServerSocket(8000);
	Socket socket = server.accept();
	
	try (
			OutputStream os = socket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			PrintWriter pw = new PrintWriter(bos);) 
	{
		String data = "<h1>내일부터 jsp 책 가져오세요</h1>";
		
		pw.println("HTTP/1.1 200 OK"); //버전정보 상태코드 
		pw.println("Content-Type: text/html; character=utf-8"); //CONTENT타입
		pw.println("Content-Length" + data.getBytes().length); //본문의 길이
		pw.println(); //한칸뛰고
		pw.println(data); //본문 시작
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}
}
