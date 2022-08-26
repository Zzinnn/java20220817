package ch05.book;

public class Exercise07_ForEach {
	public static void main(String[] args) {
		int max =Integer.MIN_VALUE;
		int[] array = {1,5,3,8,2};
		
		for (int arr : array) {
			if( max < arr) {
			max = arr; }
		}
		
		
		int min =Integer.MAX_VALUE;
		for (int arr1 :array) {
			if( min > arr1) {
			min = arr1; }
		}
		
		
		System.out.println("max : " + max);
		System.out.println("min :" + min );
	}
}
