package com.gn.homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("생년월일 : ");
		String birth = sc.next();

		String lastName = name.substring(0, 1);
		String firstName = name.substring(1);
		String mixBirth1 = birth.substring(2, 4);
		String mixBirth2 = birth.substring(6);

		System.out.println("암호 : " + lastName + mixBirth1 + mixBirth2 + firstName);

		sc.close();
	}
}
