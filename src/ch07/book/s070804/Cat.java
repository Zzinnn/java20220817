package ch07.book.s070804;

public class Cat extends Animal {
	public Cat () {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {   //몸통에는 abstract를 안써줘도됨
		System.out.println("야옹");   //추상 메소드 재정의
	}
}
