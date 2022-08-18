package ch03.book;

public class OverflowExample80 {
	public static void main(String[] args) {
		int x =1000_000;
		int y =1000_000;
		int z = x * y;
		System.out.println(z);
	}
}
