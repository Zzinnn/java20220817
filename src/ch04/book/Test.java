//여기 패키지 써주시고 
package ch04.book;

import java.util.Scanner;

//이건 스캐너 내장함수 선언할때  ctrl + shift + O  단축키 (자동으로 내장함수사용가능하도록 해줌)



public class Test{
   public static void main(String[] agrs) {
      
      //스캐너 내장함수 선언
      //스캐너 클래스의 객체인 input 변수 생성
      Scanner input = new Scanner(System.in);
      
      
      //입력 유도 출력문
      System.out.println("정수를 입력하세욧");
      
      
      //스캐너 내장함수의 기능은  nextInt() 메소드 실행
      //메소드로 인하여  inputValue 변수안에 값을 저장
      int inputValue = input.nextInt();
      
      
      //입력 받은 inputValue를 출력
      System.out.println(inputValue);
      
      }
   
}