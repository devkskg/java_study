package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run03 {
	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalDate openDate = LocalDate.of(2024, 12, 25);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + nowDate.format(dtf));

		long betweenDays = ChronoUnit.DAYS.between(nowDate, openDate);
		System.out.println("영화 개봉까지 남은 날 : " + betweenDays);

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E요일");
		System.out.println("영화 개봉일의 요일 : " + openDate.format(dtf1));
//		int weekNum = openDate.getDayOfWeek().getValue();
//		System.out.println("영화 개봉일의 요일 : " + dayofweek(weekNum) + "요일");

		System.out.println("개봉일 : " + openDate.format(dtf));

	}

	public static String dayofweek(int num) {
		String result = "";

		switch (num) {
		case 1:
			result = "월";
			break;
		case 2:
			result = "화";
			break;
		case 3:
			result = "수";
			break;
		case 4:
			result = "목";
			break;
		case 5:
			result = "금";
			break;
		case 6:
			result = "토";
			break;
		case 7:
			result = "일";
			break;
		}
		return result;

	}
}
