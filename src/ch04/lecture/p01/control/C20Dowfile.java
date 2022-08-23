package ch04.lecture.p01.control;

import java.util.Scanner;

public class C20Dowfile {
	public static void main(String[] args) {
		int com = (int) (Math.random() * 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		int user = 0; //코드블럭 안에 입력된 변수 사용을 밖에서 못하기 때문에 미리 선언해둠
		do {
			System.out.print("(1~100) 입력 :");
			
			user = scanner.nextInt();
			
			if (com == user) {
				System.out.println("정답");
			} else if (com > user) {
				System.out.println("큰값 입력해보세요");
			} else {
				System.out.println("작은 값 입력해보세요");
			}
		} while (com != user);
		
		System.out.println("프로그램 종료");	
	}
}
