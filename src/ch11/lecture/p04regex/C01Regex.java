package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression(regex)
		// 정규표현식, 정규식표현
		// 문자열의 패턴을 표현하는 코드 (문자열 표현임)
		
		String str1 ="a";
		
		// 하나의 문자
		String pattern1 ="a";
		
		// matches(String regex)
		System.out.println(str1.matches(pattern1));
		// "a"라는 문자는 "a"라는 패턴과 일치하는가
		
		String s3 ="bb";
		String p3 = "b";
		System.out.println(s3.matches(p3));
		
		System.out.println("---------------------------");
		
		String s4 = "bbb";
		String p4 = "b+";  // +는 한개 이상, b가 여러개라는 뜻(0개 안됨)
		System.out.println(s4.matches(p4));
		System.out.println(s3.matches(p4));
		System.out.println(str1.matches(p4));
		
		System.out.println("---------------------------");
		
		String p5 = "b*"; // * : 0개 이상
		System.out.println("bbb".matches(p5));
		System.out.println("bb".matches(p5));
		System.out.println("".matches(p5));
		
		System.out.println("---------------------------");
		
		String p6 ="dog";
		System.out.println("dog".matches(p6)); //패턴 맞음 true
		
		String p7 = "do+g"; // o가 한개 이상
		System.out.println("dog".matches(p7));
		System.out.println("doooooooog".matches(p7));
		System.out.println("dg".matches(p7));
		
		System.out.println("---------------------------");

		String p8 = "[abcd]"; // [] : 안에 나열된 문자 중 하나(대소문자구분)
		System.out.println("a".matches(p8));
		System.out.println("b".matches(p8));
		System.out.println("A".matches(p8));
		System.out.println("c".matches(p8));
	
		System.out.println("---------------------------");
		
		String p9 = "[a-c]"; //범위로 나타냄
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("c".matches(p9));
		System.out.println("v".matches(p9));
		
		System.out.println("---------------------------");

		String p10 = "[a-cA-B]"; // abcABC 범위 글자중 하나
		System.out.println("A".matches(p10));
		System.out.println("b".matches(p10));
		System.out.println("c".matches(p10));
		System.out.println("abc".matches(p10));
		
		System.out.println("abc".matches("[a-c]+"));
		
		System.out.println("---------------------------");
		
		String p11 = "[^abcdefghijkl]"; // [^] :제외하고
		System.out.println("a".matches(p11));
		System.out.println("m".matches(p11));
		System.out.println("2".matches(p11));
		
		System.out.println("---------------------------");

		String p12 = "[^a-z]"; 
		System.out.println("a".matches(p12));
		System.out.println("A".matches(p12));
		System.out.println("9".matches(p12));
		
		System.out.println("---------------------------");
		
		String p13 = "d[^o]+g"; //d [o가 아닌]여러개 g
		System.out.println("dwkjslg".matches(p13));
		
		
		//수량
		// + : 1개이상
		// * : 0개이상
		// ? : 0개이상
		// {n} : n개
		// {n,} : n개 이상
		// {n,m} : n개 이상 m개 이하
		
		
		String p14 = "do+g";
		System.out.println("doooooooooog".matches(p14));
		
		String p15 = "do*g"; //0개이상
		System.out.println("dg".matches(p15));
		
		String p16 = "do?g";
		System.out.println("dog".matches(p16));
		System.out.println("dg".matches(p16));
		System.out.println("dooog".matches(p16));
		
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17));
		System.out.println("dog".matches(p17));
		System.out.println("do3333g".matches(p17));
		System.out.println("doooooog".matches(p17));
		
		System.out.println("----------------");
		
		String str = "Hello";
		
		if (matches(e) )
		
	}
}
