package ch04.lecture.p02.method;

public class C07Return {
	public static void main(String[] args) {
		
		System.out.println(1);
		method1();
		System.out.println(2);
		
	}
	
	public static int method2() {
		
		// 오른쪽 값을 호출한 곳으로 반환 (return)
		// return으로 값을 반환할 때
		// 메소드의 리턴 타입과 반환값의 타입이 일치해야함
		// void(타입) 는 int value값을 반환하지 못한다
		
		return 3; //integer(타입)
	}
	
	public static double method3() {
		//리턴값보다 큰 타입으로 메소드 리턴 타입 작성가능
		return 4;
	}
	
	
	
	
	public static void method1() {
		System.out.println("가");
		
		//조건에 의해 실행되거나 실행되지 않는다면
		if(false) {
			return; //메소드 종료
		}
		
		System.out.println("나");
	}
}
