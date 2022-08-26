package ch05.lecture.p02Reference;

import java.util.Arrays;

public class C10Compare {
	public static void main(String[] args) {
		// 기본타입과 참조타입 비교 
		int a =3;
		int b =3;
		
		System.out.println(a==b);
		
		int[] c = new int[] {3,4,5};
		int[] d = new int[] {3,4,5};
		
		System.out.println(c==d); //false
		System.out.println(Arrays.equals(c, d));  //true
		
		
		int[] e = c;
		
		e[0] =33;
		System.out.println(c[0]);  //33
		
		System.out.println( e==c );  //true
		System.out.println(Arrays.equals(c, d));  //false
	}
}

