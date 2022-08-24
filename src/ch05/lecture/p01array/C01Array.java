package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[]
		
		int [] arr1;  //arr1 배열이 저장하는 값의 타입은 int
		double [] arr2; 
		String [] arr3;
		
		int [] arr4;
		arr4 =new int[5]; //int 값 5개 저장할 공간 생성
		
		arr4[0] = 10; //첫번째 공간 0인덱스
		arr4[1] = 100;
		arr4[2] = 200;
		arr4[3] = 300;
		arr4[4] = 500;
//		arr4[5] = 10; //5번 인덱스는 없음 
		
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		
		int a = arr4[0];
		System.out.println(a);
		
		
		// 변수 먼저는 잘 안씀
//		int arr4[];
//		double arr5[];
//		String arr6[];
	}
}
