package ch02.lecture;

public class C02Scope {
	public static void main(String[] args) {
//		변수는 선언된 블럭{} 안에서만 사용가능
		int a = 3;
		if (true) {
//			int a = 4; 다시 선언하는건 안된다
			int b = 4;
			System.out.println(a);
			System.out.println(b);
		}
//		System.out.println(b); 안된다(X)
	}
}
