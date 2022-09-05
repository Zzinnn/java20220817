package ch10.p03exceptions;

public class C03Exception {
	public static void main(String[] args) {
		try {
			Class a = Class.forName("java.lang.String");

			System.out.println(a.toString());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
