package ch15.book;

public class Student_778 implements Comparable<Student_778> {
	public String id;
	public int score;
	
	
public Student_778 (String id, int score) {
	this.id = id;
	this.score = score;
}
@Override
public int compareTo(Student_778 o) {
	return this.score - o.score;
}

}
