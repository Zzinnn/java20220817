package ch12.book.p581;

import java.awt.Toolkit;

public class BeepPrintExample {
	// 메인 스레드만 이용 (순차적으로 실행)
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i <5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
		
		for(int i =0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);}
			catch(Exception e) {}
		}
	}
}
