package ch07.lecture.p03abstract;

public abstract class SuperClass2 {
	public void walk() {
		System.out.println("네발로 걷습니다.");
	}
	
	public abstract void cry(); 
	// 추상메소드
	// body가 없는 메소드
	// 상속받는 클래스가 꼭 구현해야함
	// 추상 메소드가 있으려면 추상 클래스여야 한다.
	// 몸통을 만들어줘야한다
	
	
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}
