package ch08.lecture.p03defaultMethod;

public class MyClass12 implements MyInterface1 {
	@Override
	public void method() {
		// interface 메소드 재정의
	}
	
	
	// default 메소드 override 가능 
	@Override
	public void method2() {
		
		MyInterface1.super.method2();
		// interface 메소드 값 가져오기
		
	}
}
