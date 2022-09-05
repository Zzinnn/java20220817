package ch10.p06message;

public class C01Message {
	public static void main(String[] args) {
		
	method1();
	}
	
	public static void method1() {
		System.out.println("메소드 1 코드");
		
		try {
		
			method2();
		
		} catch (Exception e) {
		
			//catch 로그 (메세지) 꼭 남겨야한다
//			System.out.println("exception 발생함!!");
//			System.out.println(e.getMessage());
			e.printStackTrace();  //catch에 작성되어있는 e.printStackTrace 남겨두기 
			// 오류를 빨리 찾기위해
			// p447
		}
		System.out.println("메소드 1 실행 이어감");
	}
	
	public static void method2() throws Exception {
		throw new Exception("어떤 이유로 발생했는지");
	}
}
