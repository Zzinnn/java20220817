package ch10.p02try;

public class C04Finally {
	public static void main(String[] args) {
		try {
			System.out.println("코드");
		} finally {
			//catch 블럭 없이 사용 가능
			System.out.println("항상 실행되는 코드");
			System.out.println("catch 블럭 있으면 그 다음(마지막)에 작성");
		}
	}
}
