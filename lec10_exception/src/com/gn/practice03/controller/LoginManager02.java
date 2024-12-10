package com.gn.practice03.controller;

import com.gn.practice03.exception.InvalidCredentialsException;

public class LoginManager02 {
	public void login(String id, String pwd) {
		try {
			if (isValidCredentials(id, pwd) == true) {
				System.out.println("성공적으로 로그인되었습니다.");
			}
		} catch (Exception e) {
			System.out.println("로그인이 실패하였습니다.\n잘못된 아이디와 비밀번호 입니다.");
		}
	}

	private boolean isValidCredentials(String id, String pwd) throws InvalidCredentialsException {
		boolean tf = false;
		if (id.equals("admin") && pwd.equals("admin1234!")) {
			tf = true;
		} else {
			tf = false;
			throw new InvalidCredentialsException("해킹범 발견!");
		}
		return tf;
	}

}
