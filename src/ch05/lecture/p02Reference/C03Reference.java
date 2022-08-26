package ch05.lecture.p02Reference;

public class C03Reference {
	// 03.참조타입.png
	public static void main(String[] args) {
		int[] a = {3,4,5};
		int[] b=a;
		System.out.println(a.hashCode());
		System.out.println(b[2]); //5
		
		
		a = new int[] {9,8,7};
		
		System.out.println(b[2]);  //5
		System.out.println(b.hashCode());
		System.out.println(a.hashCode());
	}
}
