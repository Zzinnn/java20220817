package ch12.book.p02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Tread(new MusicThread());
		thread2.start();
	}
}
