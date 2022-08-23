package ch04.lecture.p02.method;

public class C05Parameter {
	public static void main(String[] args) {
		method1(3); //타입에 맞는 파라미터를 넣어야한다
		// 작은 타입은 큰 타입에 넣을 수 있다 (자동항변환)
		//double > int (X)
		
		method1(3);
		method2(3.14);
		method2(5);
//		method1(3.14); //x
//		method2("3.14"); //x
		
		int a = 3;
		method1(a);
		
		double b = 3.14;
		method2(b);

		
		//파라미터 갯수에 맞게 넣어줘야한다
//		method3(1); //x
//		method3(2, 1); //x
		method3(3, 4, 5); //ok
		
//		method4(3.14, 3); //x
		method4(3, 3.14); // ok
		method4(3, 5); // ok
	}
	public static void method4(int p1, double p2) {
		
	}
	
	public static void method3(int p1, int p2, int p3) {
		
	}
	
	public static void method1(int param) {
		
	}
	
	public static void method2(double param) {
		
	}
	
}
