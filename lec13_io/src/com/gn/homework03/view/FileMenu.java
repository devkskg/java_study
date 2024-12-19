package com.gn.homework03.view;

import java.io.File;
import java.util.Scanner;

import com.gn.homework03.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기  -> fileSave() ");
			System.out.println("2. 노트 열기  -> fileOpen() ");
			System.out.println("3. 노트 열어서 수정하기 -> fileEdit() ");
			System.out.println("9. 끝내기  ->  “프로그램을 종료합니다.” 출력 후 종료 ");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			if(num == 1) {
				fileSave();
			} else if(num == 2) {
				fileOpen();
			} else if(num == 3) {
				fileEdit();
			} else if(num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		System.out.print("내용 : ");
		while(true) {
			String str = sc.nextLine();
			if(!str.contains("ex끝it")) {
				sb.append(str);
			} else {
				break;
			}
		}
		sc.nextLine();
		System.out.println(" 저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
		String title = sc.next();
		File file = new file();
		
	}
	
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
		
	}
}
