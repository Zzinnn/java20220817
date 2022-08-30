package ch07.lecture.p01inherutance;

public class SubClass4 extends SuperClass4 {
//		상위클래스 SuperClass 내용이 맘에 안들면 재정의(override) 가능하다
	@Override  //컴파일러에게 재정의(override) 메소드 인지 점검받는 annotation
	public void method1() {
		System.out.println("subclas4 method1");
	}
	
	public void method2() {
		System.out.println("subclass4 method2");
	}
	
	@Override
	public void method3() {
		System.out.println("subclass4 method3 재정의");
	}
}
