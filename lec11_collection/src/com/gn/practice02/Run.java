package com.gn.practice02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First(문자열) 입력 : ");
		String tVar = sc.next();
		System.out.print("Second(숫자) 입력 : ");
		int uVar = sc.nextInt();
//		1. pair 타입 객체 생성 + 2. 매개변수 생성자 활용
		Pair<String, Integer> p = new Pair<String, Integer>(tVar, uVar);
//		3. getter를 통해 필드값 출력
		System.out.println("First : " + p.getFirst() + "\nSecond : " + p.getsecond());

		sc.close();
	}
}
