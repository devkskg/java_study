package com.gn.homework10.view;

import java.util.Scanner;

import com.gn.homework10.TokenController.BuilderController;

public class BuilderMenu {
	Scanner sc = new Scanner(System.in);
	BuilderController bc = new BuilderController();

	public void mainMenu() {
		while (true) {
			System.out.println("==============================");
			System.out.println("1. 지정 문자열 사용");
			System.out.println("2. 입력 문자열 사용");
			System.out.println("3. 프로그램 끝내기");
			int num = sc.nextInt();
			if (num == 1) {
				builderMenu();
			} else if (num == 2) {
				inputMenu();
			} else if (num == 3) {
				System.out.println("\"프로그램을 종료합니다.\"");
				break;
			} else {
				System.out.println("\"잘못 입력하셨습니다. 다시 입력해주세요\"");
			}

		}

	}

	public void builderMenu() {
		sc.nextLine();
		System.out.print("띄어쓰기 제거 전 : ");
		String str = sc.nextLine();
		String repstr = bc.afterReplace(str);
		System.out.println("띄어쓰기 제거 후 : " + repstr);
		System.out.println("띄어쓰기 제거 후 글자수 : " + repstr.length());
		System.out.println("대문자로 변환 : " + repstr.toUpperCase());
	}

	public void inputMenu() {
		sc.nextLine();
		System.out.print("문자열 입력 : ");
		String input1 = sc.nextLine();
		String capStr = bc.firstCap(input1);
		System.out.println(capStr);

		System.out.print("문자열 입력 : ");
		char input2 = sc.next().charAt(0);
		int findChar = bc.findChar(input1, input2);
		System.out.println(findChar);

	}
}
