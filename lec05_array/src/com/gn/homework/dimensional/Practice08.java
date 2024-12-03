package com.gn.homework.dimensional;

public class Practice08 {
	public void ptc08() {
		
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		int sumLength = menu.length + add.length;
		String[] today = new String[sumLength];
		for(int i = 0; i < menu.length; i++) {
			today[i] = menu[i];
		}
		for(int i = menu.length; i < sumLength; i++) {
			today[i] = add[i - menu.length];
		}
		System.out.print("어제의 메뉴판 : ");
		for(int i = 0; i < menu.length; i++) {
			if(i == menu.length -1) {
				System.out.println(menu[i]);
			} else {
				System.out.print(menu[i] + ", ");
			}
		}
		
		System.out.print("오늘의 메뉴판 : ");
		for(int i = 0; i < today.length; i++) {
			if(i == today.length -1) {
				System.out.println(today[i]);
			} else {
				System.out.print(today[i] + " ,");
			}
		}
	}

}
