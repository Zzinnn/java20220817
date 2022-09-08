package ch06.lecture.p11Annotation;

public class C02Element {
	@MyAnnotation2 (value = "coyote")
	private int i;
	
	@MyAnnotation2 (value ="iceman")
	private int j;
	
	@MyAnnotation2 (value = "")
	private int k;
	
	@MyAnnotation2
}
