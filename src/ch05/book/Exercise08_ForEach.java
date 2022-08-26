package ch05.book;

public class Exercise08_ForEach {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		double cnt = 0;
		
		for (int[] i : array) {
			for (int arr : i) {
				sum += arr;	
				cnt++;
			}	
		}
		
		
		System.out.println("sum : " + sum);
	 	
	 	avg =sum/cnt;
		System.out.println("avg : " + avg);
		
	}
}
