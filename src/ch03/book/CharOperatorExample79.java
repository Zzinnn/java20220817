package ch03.book;

public class CharOperatorExample79 {
	public static void main(String[] args) {
		
	char c1 ='A' + 1;
	char c2 ='A';
	int c4 = c2 +1;
	
	//char c3 = c2 +1;  //변수(c2)가 int타입으로 변환되어 계산되기 때문에 char 객체에 담길수없다
	char c3 = (char) (c2+1);
	
	System.out.println("c1:" + c1);
	System.out.println("c2:" + c2);
	System.out.println("c4:" + c4);
	System.out.println("c3:" + c3);
	}
}
