package ch15.book;

import java.util.*;

public class HashMapExample2 {
	//p745
	
	public static void main(String[] args) {
		Map<Student_744, Integer> map = new HashMap<Student_744, Integer>();
		
		map.put(new Student_744(1,"홍길동"), 95);
		map.put(new Student_744(1,"홍길동"), 95);
		
		System.out.println("총 Entry 수 : " + map.size());
	}
}
