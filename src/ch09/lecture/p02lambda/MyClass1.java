package ch09.lecture.p02lambda;

public class MyClass1 {
	public static void main(String[] args) {
				// (파라미터 목록 한개) -> {몸통};
		MyInterface1 o1 = () -> {
			System.out.println("코드작성");
		};
		
		o1.method1();   //메소드 불러와 실행
	}
}


// 재정의 해야하는 메소드 한 개 (추상메소드)
interface MyInterface1 {
	void method1();
}