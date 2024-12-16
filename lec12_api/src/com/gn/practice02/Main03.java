package com.gn.practice02;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열(1):");
		String str1 = sc.next();
		System.out.print("문자열(2):");
		String str2 = sc.next();
		System.out.print("문자열(3):");
		String str3 = sc.next();

		String result = "";
//		str1 | str2 | str3
//		a    | b    | c

//		방법 하나
//		if (str1.length() < str2.length()) {
//			result = str2;
//		} else if (str1.length() > str2.charAt(0)) {
//			result = str1;
//		} else {
//			if (str1.compareTo(str2) < 0) {
//				result = str2;
//			} else {
//				result = str1;
//			}
//		}

//		str1 | str2 | str3
//		a    | b    | c

	}
}
