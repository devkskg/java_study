package com.gn.homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String strSum = "";

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문자열 : ");
			String str = sc.next();
			str = str.toUpperCase();
			if (str.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				strSum += str;
			}
		}
		System.out.println("최종 문자열 : " + strSum);
		sc.close();
	}
}
