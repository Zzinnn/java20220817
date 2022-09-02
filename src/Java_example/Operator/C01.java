package Java_example.Operator;

import java.util.Scanner;

public class C01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		double avg = 0;
		System.out.print("첫 번째 값 입력: ");
		double first = scanner.nextDouble();
		System.out.println(first);
		
		System.out.print("두 번째 값 입력: ");
		double last = scanner.nextDouble();
		
		sum = first + last;
		System.out.println("합: " + sum);
		
		avg = sum / 2;
		System.out.println("평균: " + avg);
	}
}
