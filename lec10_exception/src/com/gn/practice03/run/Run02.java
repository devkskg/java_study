package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager02;

public class Run02 {

	public static void main(String[] args) {
		LoginManager02 l = new LoginManager02();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();

		l.login(id, pwd);

		sc.close();
	}

}
