package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice02 {
	public void ptc02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum = 0;
		int[] numArr = new int[num];
		
		for(int i = 0; i < numArr.length; i++) {
			
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			numArr[i] = sc.nextInt();
			
		}
		
		for(int nums : numArr) {
			System.out.print(nums + " ");
			sum += nums;
		}
		System.out.println("\n" + "총 합 : " + sum);
		
	}

}
