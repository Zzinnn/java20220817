package ch18.lecture.p6filter;

public class C08PrintStream {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output14.txt";
		
		try(
		FileInputStream fis = new FileInputStream();
		PrintStream ps =new PrintStream(fis);
			){
			
		} catch(Exception) {
			
		}
	}
}
