package ch07.lecture.p01inherutance;

public class SubClass1 extends SuperClass1 {
	// 필드와 메소드를 물려받음 extends 상속
	// super class 멤버 있음
	
	public String name;
	
	public void method2() {
		System.out.println("서브클래스의 메소드2");
	}
}
