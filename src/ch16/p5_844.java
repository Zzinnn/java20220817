package ch16;

import java.util.*;

public class p5_844 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"This is java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		list.stream()
		.filter((e)->e.toUpperCase().contains("java".toUpperCase()))
		.forEach(a -> System.out.println(a));
	
	}
}
