package ch06.lecture.p05final;

public class C01Final {
	public static void main(String[] args) {
		//책 (645)
		//final : 변수에 값을 한 번만 할당할 수 있다
		
		int a = 3;
		a =5;
		final int b;
		b=9;
//		b=10 //X 무조건 1번 값 설정해야한다
		
		method1(30);
		method2(33);
		method2(44);
	}
	
	static void method1 (int i) {
		i=3;
	}
	
	static void method2 (final int i) {
	//	i=5; (X) // 메소드 호출할 때 한번 할당되기 때문에 이미 한번 끝남
	}

	
}

