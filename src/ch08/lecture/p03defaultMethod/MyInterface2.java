package ch08.lecture.p03defaultMethod;

public interface MyInterface2 {
	void method1(); //추상메소드
	
	//default 메소드
	default void method2() {
		System.out.println("메소드2 전용 코드들...");
	}
	
	//  private 추가 가능 (기본이 public 메소드로 외부에서 불러오지 않기 위해)
	default void method3() {
		System.out.println("메소드3 전용 코드들...");
	}
	
	//공통 코드들을 모아서 하나의 메소드로 만들고 싶을 때
}
