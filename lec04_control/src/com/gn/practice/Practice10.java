package com.gn.practice;

public class Practice10 {

	public static void main(String[] args) {
//		while문을 사용하여 1부터 5까지 출력하세요.
//		반복 횟수: 1
//		반복 횟수: 2
//		반복 횟수: 3
//		반복 횟수: 4
//		반복 횟수: 5
//		반복 종료!

		int loop1 = 1;
		while(loop1 <= 5) {
			System.out.println("반복 횟수: " + loop1);
			loop1++;
		}
		System.out.println("반복 종료!");
		
		int loop2 = 1;
		while(true) {
			System.out.println("반복 횟수: " + loop2);
			loop2++;
			if(loop2 > 5) {
				break;
			}
		}
		System.out.println("반복 종료!");
		
	}

}
