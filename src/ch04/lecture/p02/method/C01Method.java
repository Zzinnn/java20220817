package ch04.lecture.p02.method;

public class C01Method {
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// call method (invoke method)
		method1();
		method1(); //여러번 호출 가능
		
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
		method2();
		
	} //메소드 = 함수
	
	public static void method1() {  
		//나중에 실행되는 코드 호출됐을때 실행
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
			
	}
	
	public static void method2() {
		
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		System.out.println("("+ a + "," + b + ")");
		

		
	}
	
	
}
