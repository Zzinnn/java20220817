package ch04.lecture.p02.method;

public class C09Return {
	public static void main(String[] args) {
		long a = sum(1,10);
		System.out.println(a);

		long b = sum(1,100);
		System.out.println(b);
		
		long c = sum(50,200);
		System.out.println(c);
		
		
	}
	public static long sum (int p1, int p2) {
		long total = 0; // ctrl+1  
		for(int i = p1; i <=p2; i++ ) {
			total +=i;
		}
		return total;  
	}
}
