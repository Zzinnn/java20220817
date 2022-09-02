package ch08.lecture.p03defaultMethod;

public interface MyInterface4 {
	//static 작성가능
	
	// static 메소드 : 인스턴스 생성없이 실행
	static void method() {
		
	};
	
	 void method1(); //추상 메소드
	 
	 //instance 메소드
	 default void method2() {
		 
	 }
}
