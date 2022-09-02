package ch09.lecture.p02lambda;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class MyClass9 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		setAll(a1, i -> i);
		
		System.out.println(Arrays.toString(a1)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		setAll(a1, i -> i+1);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> i*2);
		System.out.println(Arrays.toString(a1));
	}
	// IntUnaryOperator
	// IntComsumor
	
	// 하나의 인수를 가져와서 작동하는 함수 인수와 반환 형식은 모두 int
	
//	@FunctionalInterface
	
	public static void setAll(int[] arr, IntUnaryOperator gen) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = gen.applyAsInt(i);
			//하나의 int 값을 받아 주어진 연산을 수행하고 int 값 결과를 반환합니다.
		}
	}
}
