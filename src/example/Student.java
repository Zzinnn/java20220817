package example;

public class Student extends Joogang implements Human {
	int stuNum;
	
	Student(int stuNum, int HP){
		
	}
	
	void ask(String str){
		if(str == "GOOD") {
			System.out.println("감사합니다");
		} else if (str == "BAD") {
			HP = HP-10;
			System.out.println("감사합니다.");
		}
	}
}
