package com.gn.study;

public class Test {
	// 메인 메소드
//	라인주석. 컨트롤+/
//	메소드 : 일꾼(블록사이)
	/*
	 * 블록주석. 여러줄 가능 컨트롤+쉬프트+/
	 */  
	public static void main(String[] args) {
		System.out.println("Hello World1");
//		1. print -> 줄 바꾸기 X
		System.out.print("Hello World2");
		System.out.print(123);
//		2. println -> 줄 바꾸기 O
		System.out.println("Hello World3");
		System.out.println(123);
//		3. printf(표현식, 데이터)
//		이름 : 김철수, 나이 : 25, 키 : 179.8
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f",
				"\n김철수",25,179.83);
//		System.out.printf("실수: %.2f", 3.141592);
		
//		이스케이프 문자
//		"안녕하세요."
		System.out.println();
		System.out.println("\"안녕하세요.\"");
//		hello와 world 사이에 줄 바꾸기
		System.out.println("hello\nworld");
		/*
		 * System.out.println(); System.out.println("it's fine");
		 * System.out.println("it\'s fine");
		 */
	}
	

}
