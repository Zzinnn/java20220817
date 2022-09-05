package ch10.book.Example.s100300;

public class TryCatchFinallyRuntimeException {
	public static void main(String[] args) {
		String data1 =null;
		String data2 =null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;  // return을 만나면 다음 실행문 실행 안하고 끝남
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data1);
			int result = value1 + value2;
			System.out.println(result);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			
		} finally {
			//exception 실행 여부와 상관없이 실행
			System.out.println("다시 실행하세요.");
		}
	}
}
