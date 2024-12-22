package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run06 {
	public static void main(String[] args) {
		LocalDate open = LocalDate.of(2024, 12, 25);
		LocalDate now = LocalDate.now();
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + now.format(dtf1));
		
		long day = ChronoUnit.DAYS.between(now, open);
		System.out.println("영화 개봉까지 남은 날 : " + day + "일");
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E요일");
		System.out.println("영화 개봉일의 요일 : " + open.format(dtf2));
		
		System.out.println("개봉일 : " + open.format(dtf1));
		
	}
	
	
	
}
