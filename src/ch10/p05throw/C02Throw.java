package ch10.p05throw;

public class C02Throw {
	public static void main(String[] args) {
		try{
			method();
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println("실행코드 이어감");
	}
	
	public static void method() throws Exception {
		
		System.out.println("코드");
		throw new Exception();
	}
}
