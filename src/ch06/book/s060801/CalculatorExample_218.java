package ch06.book.s060801;

public class CalculatorExample_218 {
	public static void main(String[] args) {
		Calculator_217 myCalc = new Calculator_217();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1 : " + result1);
		
		byte x =10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2 : " + result2);
		
		
		
	}
}
