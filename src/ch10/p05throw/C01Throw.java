package ch10.p05throw;

public class C01Throw {
	public static void main(String[] args) {
		method1();
		
	}
	public static void method1() {
		System.out.println("코드1");
		System.out.println("코드2");
		// 내 코드에서 예외 발생하고 싶을 때
		// throw Exception : 예외 발생
		
				  // 인스턴스 생성 코드를 이어서 써줌
		throw new RuntimeException();
	}
}
