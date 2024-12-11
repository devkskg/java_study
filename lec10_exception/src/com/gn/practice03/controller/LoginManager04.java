package com.gn.practice03.controller;

import com.gn.practice03.exception.InvalidCredentialsException;

public class LoginManager04 {
//	로그인을 시도하는 메소드
	public void login(String id, String pwd) throws InvalidCredentialsException {
		if (isValidCredentials(id, pwd) == false) {
			throw new InvalidCredentialsException("로그인이 실패하였습니다.\n잘못된 아이디와 비밀번호 입니다.");
		}
	}

	private boolean isValidCredentials(String id, String pwd) {
		boolean tf = false;
		if (id.equals("admin") && pwd.equals("admin1234!")) {
			System.out.println("로그인 성공!123");
			tf = true;
		}
		return tf;
	}
}
