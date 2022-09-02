package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
		MyInterface6 o1 = () -> {
			int d = (int) (Math.random()*6) + 1;
			return d;  // 메소드에 반환타입이 있기 때문에
		};
	}
	
	
}

interface MyInterface6 {
	int method();
}