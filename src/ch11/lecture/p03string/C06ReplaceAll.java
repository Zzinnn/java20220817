package ch11.lecture.p03string;

public class C06ReplaceAll {
	public static void main(String[] args) {
		String s1 = "hashcode is a code of instance";
		String s2 = s1.replace("code", "코드");
		// 문자열 자체를 바꿈 
		// 바뀐 값을 리턴
		System.out.println(s2);
		
		String t1 = s1.replaceAll("code", "코드");
		// 패턴으로 받음
		System.out.println(t1);
		
		String t2 = s1.replaceAll(".{3}e", "코드");
		// e로 끝나는 세글자 정규표현식,정규식표현 regular expression (regex)
		System.out.println(t2);
	}
}
