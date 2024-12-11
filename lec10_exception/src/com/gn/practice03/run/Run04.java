package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager04;
import com.gn.practice03.exception.InvalidCredentialsException;

public class Run04 {
	public static void main(String[] args) {
		LoginManager04 lm = new LoginManager04();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();

		try {
			lm.login(id, pwd);
			System.out.println("로그인 성공!321");
		} catch (InvalidCredentialsException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}
}
