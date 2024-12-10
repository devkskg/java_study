package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.exception.CharCheckException;
import com.gn.homework03controller.CharacterController;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 :: ");
		String str = sc.nextLine();
		
		CharacterController ccon = new CharacterController();
		
		try {
			System.out.println(ccon.countAlpha(str));
		} catch (CharCheckException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
