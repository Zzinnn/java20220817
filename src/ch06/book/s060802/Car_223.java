package ch06.book.s060802;

public class Car_223 {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;  //false를 리턴
		}
		
		System.out.println("gas가 있습니다.");
		return true; //true를 리턴
	}
}
