package com.gn.homework.condition;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 놀이동산 입장료 계산하기");
		System.out.println("2. 일기예보");
		System.out.println("3. 세개의 정수 비교하기");
		System.out.println("4. 철수네 공장");
		System.out.println("5. 헬스 마니아 철수");
		System.out.println("6. 합격인가? 불합격인가?");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		Practice01 a = new Practice01();
		Practice02 b = new Practice02();
		Practice03 c = new Practice03();
		Practice04 d = new Practice04();
		Practice05 e = new Practice05();
		Practice06 f = new Practice06();
//		Practice02 ptc02 = new Practice02();
//		Practice03 ptc03 = new Practice03();
//		Practice04 ptc04 = new Practice04();
//		Practice05 ptc05 = new Practice05();
//		Practice06 ptc06 = new Practice06();
		
		
		switch(num) {
		case 1 : a.ptc01(); break;
		case 2 : b.ptc02(); break;
		case 3 : c.ptc03(); break;
		case 4 : d.ptc04(); break;
		case 5 : e.ptc05(); break;
		case 6 : f.ptc06(); break;
//		case 2 : ptc02.practice02(); break;		
//		case 3 : ptc03.practice03(); break;		
//		case 4 : ptc04.practice04(); break;		
//		case 5 : ptc05.practice05(); break;		
//		case 6 : ptc06.practice06(); break;
		default : System.out.println("잘못된 숫자입력"); break;
		}
		sc.close();
	}

}
