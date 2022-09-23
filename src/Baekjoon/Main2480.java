package Baekjoon;

import java.util.Scanner;
import java.util.Random;

public class Main2480 {
	public static void main(String[] args) {
//		int a = (int)(Math.random()*6)+1;
//		int b = (int)(Math.random()*6)+1;		
//		int c = (int)(Math.random()*6)+1;
//		
//		System.out.println(a + " " + b + " " + c);
//		
//		int[] a = new int[3];
//		
//		for(int i= 0; i < a.length; i++) {
//			a[i] = (int)(Math.random()*6)+1;
//			System.out.print(a[i] + " ");
//			}
//		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
			
		
		if(a==b && a==c) {
			System.out.println(10000+(a*1000));
		} else if(a==b || a==c) {
			System.out.println(1000+(a*100));
		} else if(b==c) {
			System.out.println(1000+(b*100));
		} else if(a > b && a > c) {
			System.out.println(a*100);
		} else if(b > c && b > a) {
			System.out.println(b*100);
		} else {
			System.out.println(c*100);
		}
	
	}		
}
