package ch16.lecture.p02stream;

import java.util.*;
import java.util.stream.Stream;

public class C07Mapping {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("강자바", 26)
				);
		
		double avg = list.stream()
					.mapToInt((e)->e.getAge())
					.average()
					.getAsDouble();
					
				
		System.out.println("평균나이: " + avg);	
				
	}
}

class Member{
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
		
}	
//	public static void main(String[] args) {
//	// map 메소드 : 원본 원소의 타입을 다른 타입으로 변경한 스트림을 리턴
//	int r1 = Stream.of("3", "6", "9", "1")
//			.map((s) -> Integer.valueOf(s))
//			.reduce((a, b) -> a + b)
//			.get();
//
//	System.out.println(r1);
//
//	int r2 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu")
//			.map((s) -> s.substring(0, 1))
//			.map((s) -> Integer.valueOf(s))
//			.reduce((a, b) -> a + b)
//			.get();
//	
//	System.out.println(r2);
//	
//	int r3 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu")
//		.mapToInt((s) -> Integer.parseInt(s.substring(0, 1)))
//		.sum();
//	System.out.println(r3);
//}
//}
