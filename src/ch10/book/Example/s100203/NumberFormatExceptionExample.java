package ch10.book.Example.s100203;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);  //integer로 변경할 수 있는지
		int value2 = Integer.parseInt(data2);  //NumberFormatException
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
