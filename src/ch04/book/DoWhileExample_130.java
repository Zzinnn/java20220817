package ch04.book;

import java.util.Scanner;

public class DoWhileExample_130 {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner =new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q") );  //q와 같지 않으면 true
		//q와 같으면 false
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
}
