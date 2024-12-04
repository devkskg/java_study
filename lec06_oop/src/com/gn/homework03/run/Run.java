package com.gn.homework03.run;

import java.util.Scanner;

import com.gn.homework03.brain.Brain;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메소드 번호 입력 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : String str1 = sc.next();
		String str2 = sc.next();
		Brain b1 = new Brain(str1, str2);
		System.out.println(b1.method1());
		break;
		
		case 2 : int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Brain b2 = new Brain(num1, num2);
		System.out.println(b2.method2());
		break;
		
		case 3 : String str3 = sc.next();
		String str4 = sc.next();
		Brain b3 = new Brain(str3, str4);
		System.out.println(b3.method3());
		break;
		}
		sc.close();
		
	}

}
