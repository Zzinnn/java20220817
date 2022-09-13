package ch13.lecture.p05wildcard;

import java.util.ArrayList;
import java.util.List;

public class C01polymorphism {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("iceman");
		list1.add("goose");
		
		// List는 ArrayList 상위 개념으로 받을수있다. 
		List<String> list2 = list1;
		list2.add("maverick");
		list2.add("rooster");
	}
}
