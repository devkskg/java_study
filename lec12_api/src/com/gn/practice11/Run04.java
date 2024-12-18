package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run04 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate open = LocalDate.of(2024, 12, 25);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println(now.format(dtf));

		long ch = ChronoUnit.DAYS.between(now, open);
		System.out.println("영화 개봉까지 남은 날 : " + ch + "일");

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E요일");
		System.out.println("영화 개봉일의 요일 : " + open.format(dtf2));

		System.out.println("개봉일 : " + now.format(dtf));
	}
}
