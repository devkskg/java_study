package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager;
import com.gn.practice03.exception.InvalidCredentialsException;

public class Run {
	public static void main(String[] args) {
		LoginManager loginmanger = new LoginManager();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();

		try {
			loginmanger.login(id, pwd);
		} catch (InvalidCredentialsException e) {
			// System.out.println("로그인이 실패하였습니다."); // 이거 login 메소드에서 출력하게 하고싶은데..외않됌?
			// false인 경우 throw로 invalidException쪽으로 넘겨버리니 return 나오기전에 invalidException쪽으로
			// 결과가 빠져버림. 결국 return이 반환되지 못하고 invalidException으로 흐름이 가버려서 우리는 결과 false를 받을 수
			// 없음.
			// System.out.println("잘못된 아이디와 비밀번호 입니다.");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
