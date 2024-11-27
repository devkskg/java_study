package com.gn.study;

import java.util.Scanner;

public class VariableBasic {
//		 "main" -> ctl + space 하면 메인 메소드 만들기 쉽게 가능.
	public static void main(String[] args){
//		1. 변수 선언
		int number;
//		2. 변수 초기화
		int age;
		age = 100;
		int age2 = 100;
//		int age2 = 50;
//		{}중괄호 기준으로 같은 변수 선언하면 오류난다.
//		3. 변수 표준출력
		System.out.println(age);
		
//		4. 변수의 재할당
		int score = 90;
		System.out.println("1 : " + score);
		score = 95;
		System.out.println("2 : " + score);
		
//		5. 문자열 변수의 초기화
		String str1 = new String("감사");
		String str2 = "합니다.";
		String str3 = str1 + str2;
		String str4 = "감사" + "합니다.";
		System.out.println(str1 + str2);
		System.out.println(str3);
		System.out.println(str4);
		
//		6. 기본형과 문자열 비교
		int num1 = 2;
		int num2 = 2;
		System.out.println("num1과 num2가 같은가? " + (num1 == num2)); // ==은 기본형을 boolean 형태로 비교해준다.
		String txt1 = new String("apple");
		String txt2 = new String("apple");
		System.out.println("txt1과 txt2가 같은가? " + (txt1 == txt2)); 
		// ==은 사실 Stack에 들어있는 값으로 비교를 한다.
		// txt1과 txt2는 서로 다른 주소값을 가지면서 heap에는 같은 데이터를 가진다.
		// Stack에 들어있는 값이 주소값이므로 txt1과 txt2의 == 비교는 false 값을 가진다.
		System.out.println(txt1.equals(txt2)); // 참조형에서는 .equals를 사용해야한다.
		// 추가 비교(new 유무)
		String txt3 = "apple";
		String txt4 = "apple";
		System.out.println(txt3 == txt4); // new를 쓰지 않으면 저장 되는 위치가 다르다. String pool이라는 제3의 공간에 데이터를 저장하고 값을 가지고 온다.
		System.out.println(txt2 == txt4); // new 연산자를 쓰면 heap에 데이터 저장.
		System.out.println(txt2.equals(txt4));
		// 조금이라도 다른 언어(java 외의 언어)가 들어오면 new 형태를 따라가게 된다. 그래서 비교할때는 .equals를 사용하는 습관을 들이자.
		txt2 = "apple";
		System.out.println(txt2 == txt4); // 재선언을 그냥 ""로 해버리면 그냥 해버린 애들이랑 동일하게 String pool에 저장되는 건가 봄..
		
//		7. charAt()
		String word = "Hello";
		char first = word.charAt(0);
		System.out.println(first);
		
//		8. 업캐스팅 - (1)할당
//		값은 범위가 작은 데이터 -> 큰 변수에 할당  - 이때 업캐스팅 발생
		int a = 23;
		double b = a;
		System.out.println(b);
//		(2)연산
		int c = 3;
		double d = 20.5;
		System.out.println(c + d);
		
//		9. 다운캐스팅 = 강제 형변환
		double d_num = 13.6;
		int i_num = 4;
		System.out.println((int)d_num + i_num);
		System.out.println(d_num + (int)i_num);
		System.out.println((int)(d_num + i_num));
		
//		10. char 형변환
//		(1) 할당
		char test = 'a';
		int su = test;
		System.out.println(su);
		
//		(2) 연산
		int e = 50;
		char f = '2';
		System.out.println(e + f);
		// 문자 형태로 작성된 숫자를 온전한 숫자값으로 도출하는 방법
		System.out.println(f - '0');
		
//		대문자 소문자
		System.out.println((char)((int)'a'-32));
		System.out.println((char)((int)'A'+32));
		
//		11. 상수
		final double PI = 3.14;
		final int MAX_SIZE = 100;
		System.out.println(PI + MAX_SIZE);
		

		

	}

}
