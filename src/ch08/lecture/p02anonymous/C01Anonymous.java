package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
//		MyInterface1 o1 = new MyInterface1();
		// interface로는 인스턴스를 만들 수 없다
		
		// 인터페이스 구현과 객체 생성을 한 번에
		MyInterface1 o3 = new MyInterface1() {
			@Override
			public void method () {
				System.out.println("재정의한 메소드");
			}
		};
	
	
	}
}
//class MyClass1 implements MyInterface1{
//	
//}

//class MyClass1 interface MyInterface1 {
//	
//}


interface MyInterface1 {
	
}
