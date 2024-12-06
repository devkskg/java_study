package com.gn.homework02.run;

import com.gn.homework02.view.CakeMenu;

public class Run {
	public static void main(String[] args) {
		CakeMenu menu = new CakeMenu();
		
		while(true) {
			menu.mainMenu();
			if(menu.num == 1) {
				menu.chocolateMenu();
			} else if(menu.num == 2) {
				menu.greenTeaMenu();
			} else if(menu.num == 9) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 번호입니다.");
			}
		}
	}
}
