package ch03.lecture.p2.binary;

public class C03Arithmetic {
	public static void main(String[] args) {

		//실수는 근사치로 저장된다
		double a =0.1;
		double b=0.2;
		double c= a+b;
		System.out.println(c);
		
		// 정수를 0으로 나눌 때 주의(프로그램 종료)
		int d=3;
		int e=0;
		System.out.println(e/d);
		if (e != 0) {
		System.out.println(d/e); //0으로 나누기 안됨
		}
		System.out.println("계속 실행되는 코드들...");
		
		//실수를 0으로 나누면 결과는 Infinity
		double f= 3.0;
		double g= 0.0;
		double h=-3.0;
		double i=-0.0;
		System.out.println(g/f); 
		System.out.println(f/g);
		System.out.println(g/f);
		System.out.println(g/f);
		
		
	}
}
