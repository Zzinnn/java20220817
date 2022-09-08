package ch11.lecture.p03string;

public class C03Length {
	public static void main(String[] args) {
		String s1 ="topgun";
		String s2 ="maverick";
		String s3 ="goose";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		System.out.println(s1.charAt(s1.length()-1));
		
		
		String backAround = "cat";
		System.out.println(backAround.charAt(backAround.length()-1));
		char a = backAround.charAt(backAround.length()-1);
		System.out.println(a);
		System.out.println(a + backAround + a);
		
		int n = 2;
		String str = "Miracle";
		System.out.println(str.charAt(n));
		
		
		String allowed = "ab";
		String[] words = {"ad", "db","aaab","baa","badab"};
		
		for (int i = 0; i < words.length; i++) {
			for(int j = 0; j < words[i].length(); j++) {
				if(allowed.charAt(0) == words[i].charAt(j) ) {
					
				}
			}
		}
		
	}
}
