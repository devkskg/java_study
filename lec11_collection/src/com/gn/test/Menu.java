package com.gn.test;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	Controller con = new Controller();

	public void insertItem() {
		System.out.print("입력 : ");
		String str = sc.next();
		con.insertItem2(str);

	}
}
