package ch05.book;

public class ArrayInArrayExample_164 {
	public static void main(String[] args) {
		
		int[][] methScores = new int [2][3];
		
		for (int i = 0; i < methScores.length; i++) {
			for (int k =0; k < methScores[i].length; k++) {
				System.out.println("methScores[" + i + "][" + k + "]="
												+ methScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int [2][];
		
		englishScores[0] = new int [2];
		englishScores[1] = new int [3];
		
		for (int i = 0; i < englishScores.length; i++) {
					System.out.println(i);//0,1
			for (int k = 0; k < englishScores[i].length; k++) { 
				// System.out.println(k);//0,1
					System.out.println("englshScores[" + i + "][" + k + "] ="
								+ englishScores[i][k]);
			}
		}
		
		
		int[][] javaScores = {{95,80},{92,96,80}};
		
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores[" + i +"]["+ j + "] = " + javaScores[i][j]);
			}
			
		}
		
		
		
		
	}
	
}
