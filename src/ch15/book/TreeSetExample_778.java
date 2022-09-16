package ch15.book;

import java.util.TreeSet;

public class TreeSetExample_778 {
	public static void main(String[] args) {
		TreeSet<Student_778> treeSet = new TreeSet<Student_778>();
		treeSet.add(new Student_778("blue", 96));
		treeSet.add(new Student_778("hong", 86));
		treeSet.add(new Student_778("white", 92));
	
		Student_778 student = treeSet.last();
		System.out.println("최고점수: " + student.score);
		System.out.println("최고점수를 받는 아이디: " + student.id);
	
	}
}
