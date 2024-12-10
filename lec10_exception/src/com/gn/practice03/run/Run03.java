package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager03;

public class Run03 {
	public static void main(String[] args) {
		LoginManager03 l = new LoginManager03();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();

		l.login(id, pwd);

		sc.close();
	}
}
