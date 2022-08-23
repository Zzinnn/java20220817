package ch04.lecture.p02.method;

public class C06Parameter {
	public static void main(String[] args) {
		sum(1,10);
		sum(10,100);
		sum(50,200);
	}
	public static void sum (int p1, int p2) {
		long sum = 0;
		for (int i= p1; i < p2; i++) {
			sum +=1;
		}
		System.out.println(p1 + "와" + p2 + "사이의 정수의 합은" + sum + "입니다." );
	}
}

