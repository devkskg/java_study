package com.gn.homework.loop;

import java.util.Scanner;

public class Practice08 {

	public void ptc08() {
		Scanner sc = new Scanner(System.in);
		String str2 = "";
		
		while(true) {
			int count = 0;
			System.out.print("문자열 : ");
			String str1 = sc.next();
			System.out.print("문자 : ");
			char ch = sc.next().charAt(0);
			for(int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
			
			while(true) {
				System.out.print("다시 입력하시겠습니까? : ");
				str2 = sc.next();
				
				if(str2.equals("n") || str2.equals("N")) {
					break;
				} else if(str2.equals("y") || str2.equals("Y")) {
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
			
			if(str2.equals("n") || str2.equals("N")) {
				break;
			}
		}
		sc.close();
		
	}
}