package ch10.p02try;

public class C08MultiCatch {
	public static void main(String[] args) {
		String[] arr = {"삼백"};
		
		try {
			int a =Integer.parseInt(arr[0]);
			
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("exception 발생"); //한번에 작성할 수 있음
		} 
	}
}
