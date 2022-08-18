package ch03.book;

public class AritmeticOperatorExample78 {
	public static void main(String[] args) {
		int v1 =5;
		int v2 =2;
		
		int result1 =v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;      // 연산의 결과 integer이기 때문에 2.5가 아니라 2
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = ((double) v1) / v2;	// 강제형변환 casting 먼저 연산 안헷갈리기 위해 ( )처리
		System.out.println("result6=" + result6);
	}
	
}
