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
		sc.nextLine();
		while(true) {
			System.out.print("파일에 저장할 내용을 입력하세요\nex끝it  이라고 입력하면 종료됩니다.\n내용 : ");
			String str = sc.nextLine();
			if(!str.contains("ex끝it")) {
				sb.append(str).append("\n");
			} else {
				if(sb.length() > 0) {
					sb.deleteCharAt(sb.length()-1);
				}
				break;
			}
		}
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String title = sc.next();
			if(fc.checkName(title)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				String answer = sc.next().toUpperCase();
				if(answer.equals("Y")) {
					fc.fileSave(title, sb);
					break;
				} else if(answer.equals("N")) {
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				
			} else {
				fc.fileSave(title, sb);
				break;
			}
		}
		
		
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String str = sc.next();
		if(fc.checkName(str) == false) {
			System.out.println("없는 파일입니다.");
		} else {
			StringBuilder sb = fc.fileOpen(str);
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb.toString());
		}
	}
	
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		System.out.print("수정할 파일 명 : ");
		sc.nextLine();
		String str = sc.nextLine();
		if(fc.checkName(str)) {
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String str2 = sc.nextLine();
				if(str2.contains("ex끝it")) {
					if(sb.length() > 0) {
						sb.deleteCharAt(sb.length()-1);
					}
					break;
				} else {
					sb.append(str2).append("\n");
				}
			}
			fc.fileEdit(str, sb);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
}
