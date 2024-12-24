package com.gn.practice03_1.run;

import java.util.Scanner;

import com.gn.practice03_1.controller.LoginManager;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		LoginManager lm = new LoginManager();
		lm.login(id, pwd);
		sc.close();
	}
}
