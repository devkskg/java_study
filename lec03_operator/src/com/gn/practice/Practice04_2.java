package com.gn.practice;

import java.util.Scanner;

public class Practice04_2 {
	public static void main(String[] args) {
//		이니셜 "Cheolsu" 맞으신가요?
//		아니요 "Chulsu" 입니다.
//		혹시 "30"대 이신가요?
//		"23"살입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String enName = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("이니셜 \"Cheolsu\" 맞으신가요?");
		System.out.println("아니요" + "\"" + enName + "\"" + "입니다.");
		System.out.println("혹시 \"30\"대 이신가요?");
		System.out.println("\"" + age + "\"" + "살입니다.");
		
		sc.close();
		
	}

}
