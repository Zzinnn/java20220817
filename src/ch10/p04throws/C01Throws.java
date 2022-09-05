package ch10.p04throws;

public class C01Throws {
	public static void main(String[] args) {
		//throws : 이 메소드를 호출한 곳으로 exception을 던져질 수 있다.
		method1();
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.String);
	}
}
