package ch12.book.p581;

import java.awt.Toolkit;

public class BeepPrintExample3 {
		//lambda로 변경
	public static void main(String[] args) {
		Thread thread = new Thread(()-> {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		});
	}
}
