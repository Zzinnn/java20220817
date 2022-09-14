package ch15.book;

import java.util.*;

public class StudentArrayList {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("김",1));
		list.add(new Student("이",2));
		list.add(new Student("박",3));
		
		System.out.println(list.get(0).name);
	}
}
