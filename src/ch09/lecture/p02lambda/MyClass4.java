package ch09.lecture.p02lambda;

//파라미터가 여러개일 때
public class MyClass4 {
	public static void main(String[] args) {
		// () 생략불가
		MyInterface1 o1 = (String s, int a) -> System.out.println(s.repeat(a));
		MyInterface1 o2 = (s, a) -> System.out.println(s.repeat(a));
		
		o1.method("top", 2);
		o2.method("java", 5);
	}
}

interface MyInterface1 {
	void method(String s, int b);
}