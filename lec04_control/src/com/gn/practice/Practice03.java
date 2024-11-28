package com.gn.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(F/M) : ");
		char gender = sc.next().charAt(0);
		System.out.print("머리(cm) : ");
		char hairLength = sc.next().charAt(0);
		
		
		if(gender == 'M') {
			if(hairLength <= '3') {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			if(hairLength <= '7') {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}

		sc.close();
		
	}

}
