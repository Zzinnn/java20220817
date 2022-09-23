package example;

public class Test {
	public static void main(String[] args) {
		System.out.println(sum());
	}
		
	public static boolean sum() {
		int sum = 0;
		for (int i = 0; i <=20; i++) {
			if( i % 2 == 0 ) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		if(sum % 2 == 0 ) {
			return true;
		}
		return false;	
	}
	
}
