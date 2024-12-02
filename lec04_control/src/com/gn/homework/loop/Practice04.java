package com.gn.homework.loop;

import java.util.Scanner;

public class Practice04 {
	public void ptc04() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			str = sc.next();
		} while("yes".equals(str));
		System.out.println("게임을 종료합니다.");
		sc.close();
	}
}
