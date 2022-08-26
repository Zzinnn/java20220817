package ch06.lecture.p03method;

public class C01Method {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		o1.name = "maverick";
		o1.age = 99; // (인스턴스) 필드
		
//		method : 나중에 실행된 코드 (호출할 때)
//		인스턴스가 있어야 메소드 호출
		
		o1.method();// (인스턴스) 메소드 호출
		
		System.out.println("메인 메소드 코드1");
	}
}		
