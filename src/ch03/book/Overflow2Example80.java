package ch03.book;

public class Overflow2Example80 {
	public static void main(String[] args) {
		
	long x = 100_0000;
	long y = 100_0000;
	long z = x * y;
	System.out.println(z);	
	}
}
