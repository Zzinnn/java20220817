package ch05.lecture.p02Reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9,8,7};
		System.out.println(a[0]);
		
		a = changeItem(a);  //a에 바뀐 changeItem 값을 넣어줌
		
		System.out.println(a[0]);
	}
	public static int[] changeItem (int[] arr) {
		System.out.println(arr[0]);
		arr =new int[] {3,4,5};
		return arr;
	}
}
