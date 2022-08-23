package ch04.lecture.p02.method;

public class C08Return {
	public static void main(String[] args) {
		
		System.out.println(1);
		method1();  // 호출명령이 5로 대체됨
		int r = method1();   //int r = 5;
		System.out.println(r);
		System.out.println(2);
	}
	public static int method1() {
		return 5; //호출하는 곳으로 5반환 (return)
	}
}
