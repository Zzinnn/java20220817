package ch06.book.exercise.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray =new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int index = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			
			int selecNo = scanner.nextInt();
			
			if( selecNo == 1 ) {
				createAccount();
			} else if ( selecNo == 2 ) {
				accountList();
			} else if ( selecNo == 3 ) {
				
			} else if ( selecNo == 4 ) {
				
			} else if ( selecNo == 5 ) {
				run = false;
			}
			
			System.out.println("프로그램 종료");
			
		}
		
		//계좌생성하기
		
		private static void createAccount() {
			System.out.print("계좌번호:");
			String a  = scanner.next();
			Account account = new Account(a , null, 0);
			accountArray[index] = account;
			index++;	
		}
		
		//계좌목록보기
		
		private static void accoutList() {
			
		}
		
		//예금하기
		
		private static void deposit() {
			
		}
		
		//출금하기
		
		private static void withdraw() {
			
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			
		}
		
}
