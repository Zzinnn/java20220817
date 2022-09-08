package ch11.book.p490;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		
		System.out.println("[클래스이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
	}
}
