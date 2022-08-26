package ch06.book.s060705;

public class Car_213 {
	//필드
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car_213() {}
	
	Car_213(String model){
		this(model,"은색",111);
	}
	
	Car_213(String model, String color){
		this(model, color,250);
	}
	
	Car_213(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
}
