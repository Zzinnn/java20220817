package ch06.book.s060704;

public class CarExample {
	public static void main(String[] args) {
		Car_210 car1 = new Car_210();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
	
		// String 하나 받는 생성자
		Car_210 car2 = new Car_210("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		
		// String String 받는 생성자
		Car_210 car3 = new Car_210("자가용","빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
	
		
		// String String integer 받는 생성자
		Car_210 car4 = new Car_210("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
	
	}
	
}
