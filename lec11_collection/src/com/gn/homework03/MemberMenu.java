package com.gn.homework03;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberContoroller mc = new MemberContoroller();

	public void mainMenu() {
		while (true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choice == 1) {
				joinMember();
			} else if (choice == 2) {
				login();
			} else if (choice == 3) {
				sameName();
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}
	}

	public void MemberMenu() {
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			int choice = sc.nextInt();
			if (choice == 3) {
				System.out.println("로그아웃 되었습니다.");
				break;
			} else if (choice == 1) {
				changePassword();
			} else if (choice == 2) {
				changeName();
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}

	}

	public void joinMember() {
		System.out.println("=== 1. 회원가입 ===");

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			if (mc.joinMember(id, new Member(pwd, name))) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");

			}
		}

	}

	public void login() {
		System.out.println("=== 2. 로그인 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			mc.logIn(id, pwd);
			if (mc.logIn(id, pwd) == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			} else {
				System.out.println(mc.logIn(id, pwd) + "님, 환영합니다!");
				break;
			}
		}
		MemberMenu();
	}

	public void changePassword() {
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.next();
			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.next();
//			mc.changePassword(id, oldPw, newPw)
			if (mc.changePassword(id, oldPw, newPw)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}

	}

	public void changeName() {
		System.out.println("=== 2. 이름 바꾸기 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			mc.logIn(id, pwd);
			if (mc.logIn(id, pwd).equals(null)) {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			} else {
				System.out.println("현재 설정된 이름 : " + mc.logIn(id, pwd));

				System.out.print("변경할 이름 : ");
				String newName = sc.next();
				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공하였습니다.");

				break;
			}
		}

	}

	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		mc.sameName(name);
		Set<Entry<String, String>> entSet = mc.sameName(name).entrySet();
		Iterator<Entry<String, String>> i = entSet.iterator();
		while (i.hasNext()) {
			Entry<String, String> entry = i.next();
			String key = entry.getKey();
			String value = entry.getValue();
			if (mc.sameName(name).isEmpty()) { // 이거 왜 안됨?
				System.out.println("일치하는 회원이 없습니다");
			} else {
				System.out.println(value + "-" + key);
			}
		}
	}
}
