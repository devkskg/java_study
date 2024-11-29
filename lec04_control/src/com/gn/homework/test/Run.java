package com.gn.homework.test;

import java.util.Scanner;

//	메인 메소드 -> 실행
public class Run {
	public static void main(String[] args) {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 인사하기");
		System.out.println("2. 두 정수의 합 구하기");
		System.out.print("선택 : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
//		밖에 있는 것을 불러오는 것
		Practice practice = new Practice();
		
//		if를 사용하는 방법
//		if(menu == 1) {
//			practice.practice01();
//		} else if(a == 2) {
//			practice.practice02();
//		} else {
//			System.out.println("잘못된 숫자입니다.");
//		}
		
//		switch를 사용하는 방법
		switch(menu) {
		case 1 : practice.practice01(); break;
		case 2 : practice.practice02(); break;
		default : System.out.println("잘못된 숫자입니다."); break;
		}
		sc.close();
		
//		1번 기능 호출
//		practice.practice01();
////		2번 기능 호출
//		practice.practice02();
	}

}
