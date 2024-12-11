package com.gn.practice02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First(문자열) 입력 : ");
		String tVar = sc.next();
		System.out.print("Second(숫자) 입력 : ");
		int uVar = sc.nextInt();

		Pair<String, Integer> p = new Pair<String, Integer>(tVar, uVar);
		System.out.println("First : " + p.getFirst() + "\nSecond : " + p.getsecond());

		sc.close();
	}
}
