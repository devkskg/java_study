package com.gn.homework.loop;

import java.util.Scanner;

public class Practice03 {
	public void ptc03() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; ; i++) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			} else {
			System.out.println("??? : " + str);
			}
		}
		
		sc.close();
	}
}
