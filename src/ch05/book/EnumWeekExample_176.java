package ch05.book;

import java.util.Calendar;

public class EnumWeekExample_176 {
	public static void main(String[] args) {
		Week_172 today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week_172.SUNDAY; break;
		case 2:
			today = Week_172.MONDAY; break;
		case 3:
			today = Week_172.TUESDAY; break;
		case 4:
			today = Week_172.WEDNESDAY; break;
		case 5:
			today = Week_172.THURSDAY; break;
		case 6:
			today = Week_172.FRIDAY; break;
		case 7:
			today = Week_172.SATURDAY; break;
		}
		System.out.println("오늘 요일" + today);
		
		if(today == Week_172.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");	
		} else {
			System.out.println("열심히 자바공부 합니다.");
		}
	}
}
