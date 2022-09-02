package ch09.book.example;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass {
	public static void main(String[] args) {
		IntConsumer o1 = (int a) -> System.out.println( a*a );
		
		o1.accept(3);
		o1.accept(4);
		o1.accept(10);
		
		//타입 , () 생략가능
		DoubleConsumer o2 = (double x) -> System.out.println(x/2);
		
		o2.accept(5);
		o2.accept(10);
		o2.accept(7);
	}
}
