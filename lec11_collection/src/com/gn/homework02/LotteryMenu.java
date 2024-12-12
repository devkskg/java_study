package com.gn.homework02;

import java.util.Iterator;
import java.util.Scanner;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {

		while (true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choice == 1) {
				insertObject();
			} else if (choice == 2) {
				deleteObject();
			} else if (choice == 3) {
				searchObject();
			} else if (choice == 4) {
				winObject();
			} else if (choice == 5) {
				sortedWinObject();
			} else if (choice == 6) {
				searchWinner();
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}

	}

	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		int i = 1;
//		Set<Lottery> lottery = new HashSet<Lottery>();
		while (i <= num) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("휴대폰 번호(-빼고) : ");
			String phone = sc.next();
//			Lottery l = new Lottery();
			Lottery ll = new Lottery(name, phone);
			if (lc.insertObject(ll)) {
				i++;
			} else {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			}
//			if (l.compareTo(l) != 0) {
//				Lottery ll = new Lottery(name, phone);
//				lc.insertObject(ll);
//			} else {
//				System.out.println("중복된 대상입니다. 다시 입력하세요.");
//
//			}

//			if (lottery.add(new Lottery(name, phone))) {
//				i++;
//			} else {
//				System.out.println("중복된 대상입니다. 다시 입력하세요.");
//			}
		}
		System.out.println(num + "명 추가 완료되었습니다.");

	}

	public void deleteObject() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("휴대폰 번호(-빼고) : ");
		String phone = sc.next();
		Lottery ll = new Lottery(name, phone);
		if (lc.deleteObject(ll)) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}

	public void searchObject() {
		System.out.println(lc.searchObject());
	}

	public void winObject() {
//		Set<Lottery> w = lc.winObject(); // set win
		Iterator<Lottery> iter = lc.winObject().iterator();
		while (iter.hasNext()) {
			Lottery lot = iter.next();
			System.out.println(lot);
		}

	}

	public void sortedWinObject() {
//		Set<Lottery> sortW = lc.sortedWinObject();
		Iterator<Lottery> iter2 = lc.sortedWinObject().iterator();
		while (iter2.hasNext()) {
			Lottery lot2 = iter2.next();
			System.out.println(lot2);
		}
	}

	public void searchWinner() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("휴대폰 번호(-빼고) : ");
		String phone = sc.next();
		if (lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("다음 기회에!");
		}

	}

}
