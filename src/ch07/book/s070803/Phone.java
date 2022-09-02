package ch07.book.s070803;

public abstract class Phone {
	
//	abstract class : 인스턴스는 만들 수 없다.
	
	//필드
	public String owner;
	
	//생성자
	public Phone (String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
