package com.gn.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열(1) : ");
		String str1 = sc.next();
		System.out.print("문자열(2) : ");
		String str2 = sc.next();
		System.out.print("문자열(3) : ");
		String str3 = sc.next();
		int l1 = str1.length();
		int l2 = str2.length();
		int l3 = str3.length();

		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		list.add(str3);

		Collections.sort(list, Collections.reverseOrder());

		if (l1 != l2 && l2 != l3 && l1 != l3) {
			String answer1 = l1 > l2 ? (l1 > l3 ? str1 : str3) : (l2 > l3 ? str2 : str3);
			System.out.println(answer1 + answer1);
		} else if (l1 == l2 || l2 == l3 || l1 == l3) {
			System.out.println(list.get(0) + list.get(0));
		}

		sc.close();

	}
}
