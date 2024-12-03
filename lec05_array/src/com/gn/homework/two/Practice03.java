package com.gn.homework.two;

import java.util.Scanner;

public class Practice03 {
	public void ptc03() {
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		while(true) {
			System.out.print("행 : ");
			row = sc.nextInt();
			if(row < 1 || 10 < row) {
				System.out.println("반드시 1~10  사이의 정수를 입력해야 합니다.");
			} else {
				break;
			}
		}
		
		while(true) {
			System.out.print("열 : ");
			col = sc.nextInt();
			if(col < 1 || 10 < col) {
				System.out.println("반드시 1~10  사이의 정수를 입력해야 합니다.");
			} else {
				break;
			}
		}
		
		char[][] arr = new char[row][col];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)(Math.random()*26+65);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
