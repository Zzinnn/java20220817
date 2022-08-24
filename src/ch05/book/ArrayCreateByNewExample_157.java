package ch05.book;

public class ArrayCreateByNewExample_157 {
	public static void main(String[] args) {
		int[] arr1 =new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] =10;
		arr1[1] =20;
		arr1[2] =30;
	}
}
