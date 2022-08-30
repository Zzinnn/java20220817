package ch06.book.exercise.p15;

public class MemberService {
	String id;
	String password;
	
	
	public boolean login (String id, String password) {
		return id.equals("hong") && password.equals("12345");
	}
	
	void logout (String id) {
		this.id =id;
		System.out.println("로그아웃되었습니다.");
	}
}
   