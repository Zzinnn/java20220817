package ch07.book.exercise.p05;

public class Child extends Parent {
	private int studentNo;
	
	public Child (String name, int studentNo) {  
		super(name);
//		부모 클래스 기본 생성자를 불러와줘야한다
//		이미 parent에서 생성자가 만들어져 있기 때문에 명시적으로 호출해와야한다
		this.name =name; //자식에서 필드 초기화할 필요 X 이미 부모에 있음
		this.studentNo = studentNo;
	}
}
