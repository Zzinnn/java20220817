package ch07.book.s070706;

public class InsranceofExample {
	
	public static void method1(Parent parent) {
		
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-Child로 변환 성공");
		} else {
			System.out.println("method1-Child로 변환되지 않음");
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"abc","b","c"};
		int[] b = new int[10]; 
		
		for(int i=1; i < 11; i=i+2) {
			b[i] = i;
			System.out.print(b[i]);
		}
		System.out.println();
		for(int i =0; i <10; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		
		String[] c = new String[4];
		c[0] = "java";
		c[1] = "ja";
		
		for(int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
		}
		
		String[] d= {"java","ja","va"};
		System.out.println(d[0] +"\t"+ d[1] +"\t"+ d[2]);
		
		
		
		
	}
	
	
}
