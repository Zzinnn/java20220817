package Baekjoon;

import java.util.Scanner;

public class Main9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		
		if(90 <= result && result <=100) {
			System.out.println("A");
		} else if(80 <= result) {
			System.out.println("B");
		} else if(70 <= result) {
			System.out.println("C");
		} else if(60 <= result) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
