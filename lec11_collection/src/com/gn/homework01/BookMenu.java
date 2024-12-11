package com.gn.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
	private BookController bc = new BookController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {
			System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가 -> insertBook() 호출");
			System.out.println("2. 도서 전체 조회 -> selectList() 호출");
			System.out.println("3. 도서 검색 조회 -> searchBook() 호출");
			System.out.println("4. 도서 삭제 -> deleteBook() 호출");
			System.out.println("5. 도서 오름차순 정렬 -> ascBook() 호출");
			System.out.println("9. 종료 -> \"프로그램을 종료합니다.\" 출력 후 종료");
			System.out.print("메뉴 선택 :");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choice == 1) {
				insertBook();
			} else if (choice == 2) {
				selectList();
			} else if (choice == 3) {
				searchBook();
			} else if (choice == 4) {
				deleteBook();
			} else if (choice == 5) {
				ascBook();
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}

	}

	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		sc.nextLine();
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 : ");
		int category1 = sc.nextInt();
		String category2 = "";
		if (category1 == 1) {
			category2 = "인문";
		} else if (category1 == 2) {
			category2 = "자연과학";
		} else if (category1 == 3) {
			category2 = "어린이";
		} else {
			category2 = "기타";
		}
		System.out.print("가격 : ");
		int price = sc.nextInt();
		bc.insertBook(new Book(title, author, category2, price));
	}

	public void selectList() {
		System.out.println("=== 전체 조회 ===");
		bc.selecList();
		List<Book> arr = new ArrayList<Book>();
		arr = bc.selecList();
//		System.out.println(arr);
		if (arr.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
		}

	}

	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
		System.out.print("검색어 : ");
		String keyword = sc.next();

		if (bc.searchBook(keyword).isEmpty()) {
			System.out.println("검색 결과 없슈");
		} else {
			for (Book a : bc.searchBook(keyword)) {
				System.out.println(a);
			}
		}
//		bc.searchBook(keyword);

	}

	public void deleteBook() {
		System.out.println("=== 도서 삭제 ===");
		sc.nextLine();
		System.out.print("삭제할 도서명 입력 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 입력 : ");
		String author = sc.nextLine();

		if ((bc.deleteBook(title, author)).getTitle() != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

	public void ascBook() {
//		System.out.println(bc.ascBook());
		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
			selectList();
			System.out.println("================");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}

}
