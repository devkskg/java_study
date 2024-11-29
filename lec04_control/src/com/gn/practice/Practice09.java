package com.gn.practice;

public class Practice09 {

	public static void main(String[] args) {
		int stop = 0;
		
		for(int i = 2; i <= 9; i++) {
			if(stop == 45) {
				break;
			}
			System.out.println("=== " + i + " 단===");
			for(int j = 1; j<=9; j++) {
				stop = (i * j);
				System.out.println(i + " * " + j + " = " + stop);
			}
		}
		System.out.println("계산 결과가 " + stop + "입니다.");

	}

}
