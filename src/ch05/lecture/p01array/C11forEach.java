package ch05.lecture.p01array;

public class C11forEach {
	public static void main(String[] args) {
		//향상된 for (enhanced for, for-each)
		int[] a = {5,6,7,9};
		
		//인덱스가 필요한 경우 이전For문
		for (int i = 0; i < a.length; i++ ) {
			System.out.println(a[i]);
		}
				
		
		System.out.println("향상된 For");
		for(int item : a) {
			System.out.println(item);
		}
		

	}
}
