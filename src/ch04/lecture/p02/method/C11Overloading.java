package ch04.lecture.p02.method;

public class C11Overloading {
	public static void main(String[] args) {
		method1(3,5);
		method2(9);
		method2();
		method2(3.14);
		method2(5); //int double에 다 들어갈 수 있지만 가장 정확한 int 호출
		method2(3.14,5);
		method2(5,3.14);
		
	}
	// 메소드 overloading  
	// println() 10개로 오버로딩되고 있음 int double char 어느값을 넣어도 맞춰 실행됨
	// 메소드 명이 같아도 파라미터의 타입, 개수, 순서가 다를 수 있음
	
	public static void method2 (int b, double a) {
		System.out.println("인트, 더블");
	}
	public static void method2 (double a, int b) {
		System.out.println("더블, 인트");
	}
	public static void method2 (double a) {
		System.out.println("더블 타입 받는 메소드2");
	}
	public static void method2 () {
		System.out.println("파라미터 없는 메소드2");
	}
	public static void method2 (int a) {
		System.out.println("파라미터 있는 메소드2");
	}
	public static void method1 (int a, int b) {
		
	}
}
