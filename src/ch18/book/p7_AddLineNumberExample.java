package ch18.book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class p7_AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/ch18/book/p7_AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int num = 1;
		while ((line = br.readLine()) != null) {
			System.out.println(num + " : " + line);
			num++;
		}
		
		fr.close();
		br.close();
		
	}
}
