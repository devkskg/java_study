package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;

public class Run {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
//		DateTimeFormatter 로도 할 수 있다. 해보자
		File dir = new File("C:\\test\\sub\\" + year + "\\" + month + "\\" + day);
//		if (!dir.exists()) {
//			if (dir.mkdirs()) {
//				System.out.println("디렉토리 생성 성공");
//			} else {
//				System.out.println("디렉토리 생성 실패");
//			}
//		} else {
//			System.out.println("이미 존재하는 디렉토리");
//		}
		File dir2 = new File("C:\\test\\sub");
//		System.out.println(dir2.getPath());
		Practice p = new Practice();
		p.deleteFile(dir2);

	}
}
