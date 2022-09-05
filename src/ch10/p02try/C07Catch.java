package ch10.p02try;

public class C07Catch {
	public static void main(String[] args) {
		// catch 블럭은 순서가 상관 있음
		
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("wroog index!");
		} catch(Exception e) {
			System.out.println("wroog format!");
		} //다형성에 의해 catch 블럭의 순서가 중요하다
		// Exception이 먼저 나오면 자식인 ArrayIndexOutOfBoundsException은 실행되지 않는 코드임
		// 상위타입은 아래에 써줘야한다.
	}
}
