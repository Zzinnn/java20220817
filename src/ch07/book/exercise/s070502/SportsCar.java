package ch07.book.exercise.s070502;

public class SportsCar extends Car {
		
	@Override
	public void speedUp() {speed +=10;}
	
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}


}
