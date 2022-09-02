package ch07.book.s070502;

public class SportsCar extends Car {
	
	// speedUp 메소드 재정의
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	
	// final 메소드라 상속받아 오버라이딩(재정의) 할 수 없음
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	
	
}
