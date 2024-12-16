package com.gn.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열(1):");
		String str1 = sc.next();
		System.out.print("문자열(2):");
		String str2 = sc.next();
		System.out.print("문자열(3):");
		String str3 = sc.next();

//		int l1 = str1.length();
//		int l2 = str2.length();
//		int l3 = str3.length();

		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		list.add(str3);

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).length() > list.get(j).length()) {
					String temp = list.get(i);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}

		if (list.get(2).length() == list.get(1).length()) {
			if (list.get(2).compareTo(list.get(1)) < 0) {
				System.out.println(list.get(1) + list.get(1));
			} else {
				System.out.println(list.get(2) + list.get(2));
			}
		} else {
			System.out.println(list.get(2) + list.get(2));
		}

		sc.close();
	}
}
