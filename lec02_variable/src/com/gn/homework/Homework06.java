package com.gn.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("한 자리 숫자를 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		int convertCh = ch - 48;
		int squared = convertCh * convertCh;
		System.out.println("입력한 숫자의 제곱은 " + squared + "입니다.");
		
		sc.close();
		
	}

}
