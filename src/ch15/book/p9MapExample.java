package ch15.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class p9MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//작성
		Set<String> key = map.keySet(); //여러 메소드 중에 키만 얻어옴
		for(String a : key) {
			Integer value = map.get(key);
			System.out.println(value);
			totalScore +=
		}
		
	}
}
