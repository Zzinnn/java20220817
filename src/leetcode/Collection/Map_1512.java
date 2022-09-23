package leetcode.Collection;

import java.util.*;

public class Map_1512 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] nums = {1,2,3,1,1,3};
		
		for(int number : nums) {
			if(map.containsKey(number)) {
				int val = map.get(number);
				val++;
				
				map.put(number, val);
			} else {
				map.put(number, 0);
			}
		}
		System.out.println(map);
		
//		
//		int cnt = 0;
//		Set<Map.Entry<Integer,Integer>> set = map.entrySet();
//		for(Map.Entry<Integer,Integer> entry : set) {
//			if((entry.getValue() >= 2) && ((entry.getValue() % 2) == 0)) {
//				cnt ++; 
//				System.out.println(cnt);
//			}
//			
//		}
		
		
		
		
		
//		풀이		
//		public int numIdenticalPairs(int[] nums) {
//			Map<Integer, Integer> map = new HashMap<>();
//			for (int num : nums) {
//				if (map.containsKey(num)) {
//					// 이미 있었으면
//					Integer val = map.get(num);
//					map.put(num, val + 1);
//				} else {
//					// 처음
//					map.put(num, 1);
//				}
//			}
//
//			int result = 0;
//
//			for (Integer n : map.values()) {
//				Integer r = (n - 1) * n / 2;
//				result += r;
//			}
//
//			return result;
//		}
		
	}
}
