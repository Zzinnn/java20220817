package ch08.book.exercise.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.forntLeftTire = new KumhoTire();
		myCar.forntRightTire = new KumhoTire();
		
		myCar.run();
		
	}
}
