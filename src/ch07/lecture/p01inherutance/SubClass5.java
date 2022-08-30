package ch07.lecture.p01inherutance;

public class SubClass5 extends SuperClass5 {
	//상위 메소드 코드 + 추가 코드 쓰고 싶을 때
	@Override
	public void method1() {
		super.method1();    //상위 클래스 코드(필드 메소드) 그래도 실행 
		System.out.println("추가한 코드들.....");
	}
}
