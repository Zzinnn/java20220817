package ch15.book;

public class Student_744 {
	public int sno;
	public String name;
	
	public Student_744 (int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student_744) {
			Student_744 student = (Student_744) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
	
}
