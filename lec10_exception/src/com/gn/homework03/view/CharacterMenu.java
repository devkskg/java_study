package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03controller.CharacterController;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 :: ");
		String str = sc.nextLine();
		
		CharacterController ccon = new CharacterController();
		
		try {
			System.out.println(ccon.countAlpha(str));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
