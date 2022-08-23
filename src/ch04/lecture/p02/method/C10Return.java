package ch04.lecture.p02.method;

public class C10Return {
	public static void main(String[] args) {
		
	int a = max(3, 5);
	System.out.println(a);  //5

	int b = max(5, 3);
	System.out.println(b);  //5
	
	int c = max(-100, 100);
	System.out.println(c);  //5
	
	
	int d = max(100, 200);
	System.out.println(d);  //5
	
	}
	public static int max(int p1, int p2) {
		
		if(p1<p2) {
			return p2;
		}	
		return p1;
				
	}	
}
