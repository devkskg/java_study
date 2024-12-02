package com.gn.homework.loop;

import java.util.Scanner;

public class Practice02 {
	public void ptc02() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("숫자 : ");
			num = sc.nextInt();
			if(num < 0) {
				System.out.println("양수만 입력해주세요.");
			} else if(9 < num) {
				System.out.println("9이하의 숫자를 입력해주세요.");
			} else if(num == 0) {
				break;
			} else {
				for(int i = num; i <= 9; i++) {
					System.out.println("=== " + i + "단 ===");
					for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}
				}
			}
		}
		sc.close();
	}

}
