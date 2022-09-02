package ch09.book.example;

class Student {
	//필드
	String name;
	int age;
	
	//생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public void study() {
		System.out.println("공부한다.");
	}
	
	public void work() {
		System.out.print("이름:" + name +", 나이:" + age + "살이 ");
	}
	
}

public class StudentExample {
	public static void main(String[] args) {
		Student o1 = new Student("정진아",28);
		
		o1.work();
		o1.study();
		
	}
}
