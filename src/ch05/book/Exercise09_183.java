package ch05.book;

import java.util.Scanner;

public class Exercise09_183 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores =null;
		Scanner scanner =new Scanner(System.in);
	
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("선택> ");
			
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				
			} else if (selectNo == 2) {
				
			} else if (selectNo == 3) {
				
			} else if (selectNo == 4) {
				
			} else if (selectNo == 5) {
				run = false;
			}
			
			System.out.println("프로그램 종료");
			
			
			
			
			
		}
	
	}
}
