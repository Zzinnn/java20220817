package Baekjoon;

import java.util.Scanner;

public class Main2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		
		if((m-45) < 0) {
			if(h == 0) {
				h = 24;
			}
			h--;
			m = 60+(m-45);
		} else {
			m -= 45;
		}		
		System.out.println(h +" "+ m);

	}
}
