package ch15.book;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);  // auto boxing 
		scores.add(new Integer(98)); 
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println();
	}
}
