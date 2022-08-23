package ch04.lecture.p01.control;

import java.util.Scanner;  //ctrl +shift+o

public class C18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int d = (int)(Math.random()*100) +1;
		System.out.println(d);
		

		while (true) {			
			System.out.print("1~100까지의 값을 입력하세요 :");
			int a = scanner.nextInt();
			
			if (a<d) {
				System.out.println("더 높은 값을 입력하세요.");
			} else if (d<a) {
				System.out.println("더 낮은 값을 입력하세요.");
			} else {
				System.out.println("정답");
				break;
			}
		}		
	}
}
