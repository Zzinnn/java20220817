package ch04.book;

public class Exercise06 {
	public static void main(String[] args) {
//		for (int i=1; i < 6; i++) {
//			for (int j=0; j < i; j++) {
//				System.out.print("*");
//				
//				
//			}
//			System.out.println();
//		}
	
		for (int i = 1; i < 6; i++) {
			
			for (int j = 5; i < j; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; i > k; k++) {
				System.out.print("*");
			}			
			
			for (int l = 1; i > l; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
				
	}
}