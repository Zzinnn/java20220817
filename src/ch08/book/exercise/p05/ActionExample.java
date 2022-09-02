package ch08.book.exercise.p05;

public class ActionExample {
	public static void main(String[] args) {
		
		Action action = new Action() {
		
			//추상메소드 구현 코드가 들어가야함
			public void work() {
				System.out.println("복사를 합니다.");
			}
			
		};
		
		action.work();
		
	}
}
