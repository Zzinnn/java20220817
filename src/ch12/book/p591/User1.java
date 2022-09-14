package ch12.book.p591;

public class User1 {
	private Calculator calculator;
	
	public void setClaculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
