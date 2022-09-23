package ch16.book.p716;

import java.util.function.Function;
import java.util.function.BiFunction;


public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new; //생성자참조
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("신천사", "angel");
	}
}
