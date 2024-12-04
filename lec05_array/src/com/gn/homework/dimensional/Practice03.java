package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice03 {
	public void ptc03() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			num = sc.nextInt();
			if(num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요.");
			} else {
				break;
			}
			
		}
		
		int[] numArr = new int[num];
		for(int i = 0; i < (num+1)/2; i++) {
			numArr[i] = i + 1;
			System.out.print(numArr[i]);
		}
		for(int i = (num+1)/2; i < numArr.length; i++) {
			numArr[i] = num - i;
			System.out.print(numArr[i]);
		}
		sc.close();
		
//		121	3 -1
//		12321	5 -2
//		1234321	7 -3
//		123454321	9 -4
//		
//		
	}

}
