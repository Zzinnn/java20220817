package ch08.lecture.p03defaultMethod;

public interface MyInterface1 {
	//interface에서 가지고 있는 값은 정의하지 않아도 모두 public이다
	void method();
	
	default void method2() {
		// interface default method
		// 재정의가 필요하지 않게 몸통을 같이 만들어줌
		// 재정의 하지 않아도 되는 interface 메소드
	}
}
