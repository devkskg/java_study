package com.gn.study.method.model.vo;

public class Library {
	
//	1. 책 빌리기
	public void borrowBooks(String...books) {
		System.out.println("=== 대출할 책 목록 ===");
		for(String book : books) {
			System.out.println("- " + book);
//			System.out.println(books.length);
//			for(int i = 0; i < books.length; i++) {
//				System.out.println(books[i]);
//			}
		}
			
		}
//	2. 빌린 책 반납하기
	public void returnBooks(int lateFee, String...books) { // 가변인자 매개변수는 가장 오른쪽에 써야한다.
		System.out.println("총 연체로 : " + lateFee + "원");
		System.out.println("=== 반납할 책 목록 ===");
		for(String book : books) {
			System.out.println("- " + book);
		}
		
	}

}
