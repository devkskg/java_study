package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run05 {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDate open = LocalDate.of(2024, 12, 25);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println(now.format(dtf1));
		
		long ch = ChronoUnit.DAYS.between(now, open);
		System.out.println(ch + "일");
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E요일");
		System.out.println(open.format(dtf2));
		
		System.out.println(open.format(dtf1));
		
		
	}
}
