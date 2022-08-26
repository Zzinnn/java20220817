package ch05.lecture.p02Reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = {9,8}; //a
		changeItem(a); 
		
		System.out.println(a[0]);
	}
	public static void changeItem (int[] arr) {
		System.out.println(arr[0]);
		arr =new int [] {3,4};
	}
}
