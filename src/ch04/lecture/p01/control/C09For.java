package ch04.lecture.p01.control;

public class C09For {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		
		for (int i=5; i >= 1; i--) {
			for(int j=5; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for (int i=4; i>=0; i--) {
			for (int j=4; j>=0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		for (int i = 0; i<=4; i++) {
			for(int j= 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();	
		}		
		System.out.println("-----------------");
		
		int k =0;
			
	for (int i=0; i < 4; i++) {     //i=0 j=0  0=0 k=0 k=1 j=1 ln() i=1 1=1
		System.out.println("i는" + i );
		
		for(int j=0; j<=i; j++) {
			System.out.println("j는"+j);
//			System.out.print(k);
//			k++;	
		}
		System.out.println();
	}
	
	
	}
}
