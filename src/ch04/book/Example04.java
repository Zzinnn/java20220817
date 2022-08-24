package ch04.book;

public class Example04 {
	public static void main(String[] args) {
		
		while (true) {
			int value1 = (int)(Math.random()*6)+1;
			int value2 = (int)(Math.random()*6)+1;
			System.out.println("(" + value1 + "," + value2 + ")");
			
			 if ( (value1+value2)==5 ) {
				 break;
			 }
		}
		System.out.println("프로그램 종료");
		
	}
}
