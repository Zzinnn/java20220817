package ch15.book;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP"); //3번 인덱스로 밀려난다
		list.add(2,"Database");  //2번 인덱스로 Database가 들어가고
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2); //2번인덱스 변수 skill
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		
		list.remove(2); //2번 인덱스가 지워지고 3,4번 인덱스가 앞으로 당겨짐
		list.remove(2); //2번 인덱스가 또 지워지고 3번 인덱스가 당겨짐
		list.remove("iBATIS"); // 2번 인덱스의 값인 iBATIS를 지워줌
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +":"+str);
		}
	}
}




