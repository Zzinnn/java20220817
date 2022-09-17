package leetcode;

import java.util.*;

public class NumberOfGoodPairs_1512 {
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
		
//        int sum = 0;
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entries) {
//            if (entry.getValue() == 1) {
//                sum += entry.getKey();
//            }
//        }
//        
//        return sum;
//    }
		
		
		
	}
}
