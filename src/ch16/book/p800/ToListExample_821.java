package ch16.book.p800;

import java.util.*;
import java.util.stream.Collectors;

import example.Student;

public class ToListExample_821 {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new srudent ("홍길동" , 10 , student.Sex.MALE)
				new srudent ("신수애" , 6 , student.Sex.FEMALE)
				new srudent ("신용권" , 10 , student.Sex.MALE)
				new srudent ("박수미" , 6 , student.Sex.FEMALE)	
				);
		
		//남학생들만 묶어 List 생성
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect (Collectors.toList())
				.
	}
}
