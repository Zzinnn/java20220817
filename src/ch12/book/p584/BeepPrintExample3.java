package ch12.book.p584;

public class BeepPrintExample3 {
	//메인스레드와 작업스레드가 동시에 실행
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) { }
		}
	}
}
