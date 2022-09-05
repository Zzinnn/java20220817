package ch10.book.Example;

public class Array {
	public static void main(String[] args) {
		int account[][] = {{2,8,7},{7,4,3},{1,2,3}};
		
		for(int i = 0; i < account.length; i++) {
			for(int j = 0; j < account[i].length; j++) {
				System.out.println(account[i][j]);
			}
		}
	}
}
