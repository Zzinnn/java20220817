package ch10.p02try;

public class C03Finally {
	public static void main(String[] args) {
		try {
			int a = 3 / 1;
			
			if (a == 1) {
				return;
				}
			} catch (ArithmeticException e) {
				System.out.println("exception!");
			} finally {
				System.out.println("@@@@@finally");
			}
			
			System.out.println("continues...");
		}
	}

