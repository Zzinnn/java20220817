package ch08.book.exercise;

public class Array {
	public static void main(String[] args) {
		
		int[] a = new int[10];
		char[] b = {'a','b','c'};
		
		
//		b[0] = 'd';
//		b[1] = 'e';
//		b[2] = 'f';
//		
//		for(int i=0; i=b.length; i++){
//			b[i]
		
		for(int i=0; i < a.length; i++) {
			a[i] = i;
		}
		a[0] = 10;
		
		for(int i =1; i < a.length; i++) {	
			if(i%3 == 0) {
				a[i] = 0;
//				System.out.print(a[i]);
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		
		
	}
}
