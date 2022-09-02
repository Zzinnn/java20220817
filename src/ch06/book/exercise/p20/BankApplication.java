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
			System.out.print("선택> ");
			
			int selecNo = scanner.nextInt();
			
			if( selecNo == 1 ) {
				createAccount();
			} else if ( selecNo == 2 ) {
				accountList();
			} else if ( selecNo == 3 ) {
				deposit();
			} else if ( selecNo == 4 ) {
				withdraw();
			} else if ( selecNo == 5 ) {
				run = false;
			}
		}	
			System.out.println("프로그램 종료");
			
		}
		
		//계좌생성하기
		static int cnt = 0;
		private static void createAccount() {
			System.out.println("--------------");
			System.out.println("계좌생성");
			System.out.println("--------------");
			
			
			
			System.out.print("계좌생성:");
			String a = scanner.next();
			
			System.out.print("계좌주:");
			String b = scanner.next();
			
			System.out.print("초기입금액:");
			int c = scanner.nextInt();
			
			System.out.println("결과: 계좌가 생성되었습니다.");
			
			Account account = new Account(a,b,c);
			accountArray[cnt] = account;
			cnt++;
		}
		
		//계좌목록보기
		
		private static void accountList() {
			System.out.println("-----------");
			System.out.println("계좌목록");
			System.out.println("-----------");
			for(int i = 0; i < cnt; i++) {
				System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner() + " " + accountArray[i].getBalance());
			}
		}
		
		
		
		//예금하기
		
		private static void deposit() {
			System.out.println("-----------");
			System.out.println("예금하기");
			System.out.println("-----------");
			
			System.out.print("계좌번호:");
			String a = scanner.next();
			
			System.out.print("예금액:");
			int b = scanner.nextInt();
			
			for(int i=0; i < cnt; i++) {
				if(a == findAccount(a)) {
					accountArray[i].setBalance(b);
				}
			}
			
			
		}
		//출금하기
		
		private static void withdraw() {
			
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		
		private static Account findAccount(String ano) {
			for(int i= 0; i < cnt; i++) {
				if(accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			} return null;
		}
		
}
