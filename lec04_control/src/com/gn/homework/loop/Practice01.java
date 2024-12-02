package com.gn.homework.loop;

import java.util.Scanner;

public class Practice01 {
	public void ptc01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(1~50) : ");
		int num = sc.nextInt();
		int sum = 0;
		int j = 1;
		
		for(int i = 1; ; i++) {
			if(num < 1 || 50 < num) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				num = sc.nextInt();
			} else if(1 <= num && num <= 50) {
				for(j = 1; j <= num; j++) {
					if(j % 2 == 0) {
						sum += j;
						
					}
					if(j == num) {
						break;
					}
				}
			}
			if(j == num) {
				break;
			}
			
		}
		System.out.println("합계 : " + sum);
		sc.close();
	}

}
