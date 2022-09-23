package ch18.book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample_1027 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\user\\Desktop\\output\\output8.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter는 한글로된"+"\r\n");
		fw.write("문자열을 바로 출력한 수 있다."+"\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}