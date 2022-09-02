package ch09.lecture.p01nestedClass;

public class MyClass2 {
	public static void main(String[] args) {
		// 대부분 인터페이스를 구현해서 로컬클래서 만든다
		class LocalClass implements MyInterface2 {
			@Override
			public void method() {
				System.out.println("메소드");
			}
		}
		MyInterface2 l = new LocalClass();
		l.method();
		
	}
}



interface MyInterface2 {
	void method();
}