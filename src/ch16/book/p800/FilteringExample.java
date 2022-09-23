package ch16.book.p800;

import java.util.Arrays;
import java.util.*;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
		
		names.stream()
		.distinct()		//중복제거
		.forEach(n-> System.out.println(n));
		System.out.println();
		
		
		names.stream()
		.filter(n -> n.startsWith("신"))  //"신"으로 시작하는 아이템
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		
		names.stream()
		.distinct()    //중복제거
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));
	}
}
