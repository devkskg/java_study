package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run02 {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
//		int year = today.getYear();
//		int month = today.getMonthValue();
//		int day = today.getDayOfMonth();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\\yyyy\\MM\\dd");
		File dir = new File("C:\\test\\sub" + today.format(dtf));
		
		if(dir.exists()) {
			System.out.println("이미 있어요");
		} else {
			if(dir.mkdirs()) {
				System.out.println("만들었어요");
			} else {
				System.out.println("실패했어요");
			}
		}
//		
		
	}
}
