package ch07.book.exercise.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;  //재정의 된 snowTire를 tire에 대입
		
		snowTire.run(); //메소드 호출
		tire.run();
	}
}
