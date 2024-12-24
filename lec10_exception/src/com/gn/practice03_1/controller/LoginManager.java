package com.gn.practice03_1.controller;

import com.gn.practice03.exception.InvalidCredentialsException;

public class LoginManager {
	public void login(String id, String pwd) {
		try {
			if (isValidCredentials(id, pwd)) {
				System.out.println("로그인 성공");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private boolean isValidCredentials(String id, String pwd) throws InvalidCredentialsException {
		boolean result = false;
		if (id.equals("admin") && pwd.equals("admin1234!")) {
			result = true;
		} else {
			throw new InvalidCredentialsException("로그인에 실패하셨습니다.");
		}

		return result;
	}
}
