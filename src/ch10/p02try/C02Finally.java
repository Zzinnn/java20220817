package ch10.p02try;

public class C02Finally {
	public static void main(String[] args) {
		
		
		try {
			//exception 발생하지 않으면 실행되는 코드들
			System.out.println("익셉션 발생하지 않으면 실행");
		} catch (ArithmeticException e) {
			//exception 발생하면 실행되는 코드들
			System.out.println("익셉션 발생되면 실행");
		} finally {
			//exception 발생 여부 관계 없이 실행되는 코드
			System.out.println("익셉션 발생 여부 관계없이 실행");
		}
	}
	
}
