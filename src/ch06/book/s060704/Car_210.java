package ch06.book.s060704;

public class Car_210 {
	//필드
	String company = "현대자동차";
	String model;     //null
	String color;     //null
	int maxSpeed;     //0
	
	//생성자 (Field를 초기화)
	Car_210() {
		
	}
//	생성자 이름에 커서 f3 생성자로 이동 // alt 방향키 left
	Car_210(String model) {
		this.model = model;
	}
	
	Car_210(String model, String color){   
		this.model = model;
		this.color = color;
	}
	
	Car_210(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
