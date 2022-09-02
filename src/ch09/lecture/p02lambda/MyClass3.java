package ch09.lecture.p02lambda;


//파라미터가 한 개일 때 코드를 줄여나감
public class MyClass3 {
	public static void main(String[] args) {
		MyInterface1 o1 = (String s) -> System.out.println(s);
		
		o1.method("");
		o1.method("");
		
		//파라미터가 이미 정해져 있기 때문에 타입 생략 가능하고 쓸 수 있다
		MyInterface1 o2 = (s) -> System.out.println(s.repeat(2));
	}
}

interface MyInterface1 {
	void method(String s);
}