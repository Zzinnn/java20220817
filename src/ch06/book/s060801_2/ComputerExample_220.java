package ch06.book.s060801_2;

public class ComputerExample_220 {
	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int[] values1 = {1 ,2 ,3};    //메소드가 배열일때
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});  //메소드가 배열일때
		System.out.println("result2 : " + result2 );
		
		int result3 = myCom.sum2(1,2,3);   //메소드가 ...일 때
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);   //메소드가 ...일 때
		System.out.println("result4 : " + result4);
		
	}
}

