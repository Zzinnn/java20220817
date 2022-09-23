package Baekjoon;

import java.util.Scanner;

public class Main2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		if( (b+c) >= 60 ) {
			a = a + (b+c)/60;
			b = (b+c) % 60;
			
			if(a == 24) {
				a = 0;
			}
//		} else {
//			
//		}
		
		
//		while ( b <= 60 && b <= 1000 || (b%2)==0) {
//			a++;
//			b = b-60;
//		}
		
		System.out.println(a + " " + b);
		
		}
	}

