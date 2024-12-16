package com.gn.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열(1):");
		String str1 = sc.next();
		System.out.print("문자열(2):");
		String str2 = sc.next();
		System.out.print("문자열(3):");
		String str3 = sc.next();

		int l1 = str1.length();
		int l2 = str2.length();
		int l3 = str3.length();
		if (l1 != l2 && l2 != l3 && l1 != l3) {
			String longStr = l1 > l2 ? (l1 > l3 ? str1 : str3) : (l2 > l3 ? str2 : str3);

			System.out.println(longStr + longStr);
		} else if (l1 == l2 && l2 == l3 && l1 == l3) {
			String lastStr = str1.compareTo(str2) > 0 ? (str1.compareTo(str3) > 0 ? str1 : str3)
					: (str2.compareTo(str3) > 0 ? str2 : str3);
			System.out.println(lastStr + lastStr);

		} else if (l1 == l2) {
			if (str1.compareTo(str2) < 0) {
				System.out.println(str2);
			} else if (str1.compareTo(str2) > 0) {
				System.out.println(str1);
			}

		} else if (l2 == l3) {
			if (str2.compareTo(str3) < 0) {
				System.out.println(str3);
			} else if (str2.compareTo(str3) > 0) {
				System.out.println(str2);
			}

		} else if (l1 == l3) {
			if (str1.compareTo(str3) < 0) {
				System.out.println(str3);
			} else if (str1.compareTo(str3) > 0) {
				System.out.println(str1);
			}

		}

		sc.close();
	}
}
