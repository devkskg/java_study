package com.gn.homework.loop;

import java.util.Scanner;

public class Practice02_1 {
	public void ptc02_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("양수만 입력해주세요.");
		} else if(num >= 1) {
			for(int i = num; i <= 9; i++) {
				System.out.println("=== " + i + "단 ===");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
			
		}
		
		
		sc.close();
	}

}
