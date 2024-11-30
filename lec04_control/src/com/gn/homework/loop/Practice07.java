package com.gn.homework.loop;

import java.util.Scanner;

public class Practice07 {
	public void ptc07() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		for(int j = 1; ; j++) {
			if(num <= 0) {
				System.out.print("양수가 아닙니다.");
				System.out.print("다시 입력하세용. 정수 : ");
				num = sc.nextInt();
			} else {
				break;
			}
		}
		

			for(i = 1; i <= num; i++) {
				if(i % 2 == 1) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}
		
	sc.close();	
	}


}
