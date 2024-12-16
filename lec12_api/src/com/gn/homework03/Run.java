package com.gn.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력 : ");
		String str = sc.next();

		str = str.trim();
		int atIdx = str.indexOf("@");
		String ref = "goodee.co.kr";
		if (str.substring(atIdx + 1).equals(ref)) {
			System.out.println(str.substring(0, atIdx - 1).toUpperCase());
		} else {
			System.out.println("유효하지 않은 이메일입니다.");
		}

		sc.close();
	}
}
