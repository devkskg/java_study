package com.gn.homework04.run;

import java.util.Scanner;

import com.gn.homework04.controller.ExMethodController;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 메소드 ===");
		System.out.println("1. 전달된 메세지를 출력하는 메소드 구현");
		System.out.println("2. 1~100까지 합을 반환하는 메소드구현");
		System.out.println("3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현");
		System.out.println("4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현");
		System.out.println("5. 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드구현");
		System.out.println("6. 전달된 정수의 구구단을 출력하는 메소드 구현");
		System.out.print("선택 : ");
		int choiceNumber = sc.nextInt();
//		ExMethodController e = new ExMethodController();
//		exMethod.method1();
//		exMethod.method2();
//		exMethod.method3();
//		exMethod.method4();
//		exMethod.method5();
//		exMethod.method6();
		
		switch(choiceNumber) {
		case 1 : System.out.print("메세지를 입력 해주세요. : ");
		String choiceStr1 = sc.next();
		ExMethodController e1 = new ExMethodController(choiceStr1);
		e1.method1();
		break;
		
		case 2 : System.out.print("1부터 100까지 합계 : ");
		ExMethodController e2 = new ExMethodController();
		System.out.println(e2.method2());
		break;
		
		case 3 : System.out.print("숫자를 입력 해주세요. : ");
		int choiceNum3 = sc.nextInt();
		ExMethodController e3 = new ExMethodController(choiceNum3);
		System.out.println(e3.method3());
		break;
		
		case 4 : System.out.print("문자열을 입력 해주세요. : ");
		String choiceStr4 = sc.next();
		ExMethodController e4 = new ExMethodController(choiceStr4);
		System.out.println(e4.method4());
		break;
		
		case 5 : System.out.print("문자열을 입력 해주세요. : ");
		sc.nextLine();
		String choiceStr5 = sc.nextLine();
		ExMethodController e5 = new ExMethodController(choiceStr5);
		e5.method5();
		break;
		
		case 6 : System.out.print("숫자를 입력 해주세요. : ");
		int choiceNum6 = sc.nextInt();
		ExMethodController e6 = new ExMethodController(choiceNum6);
		e6.method6();
		break;
		}
		sc.close();
		
		
	}

}
