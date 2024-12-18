package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {

		LocalDate todayDate = LocalDate.now();
//		철수 감독의 영화는 2024년 12월 25일에 개봉합니다.
		LocalDate openDate = LocalDate.of(2024, 12, 25);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + todayDate.format(dtf1));

		long ch = ChronoUnit.DAYS.between(todayDate, openDate);
		System.out.println("영화 개봉까지 남은 날 : " + ch + "일");

		System.out.println("영화 개봉일의 요일 : " + getKoreanDayOfWeek(openDate.getDayOfWeek().getValue()));

		System.out.println("개봉일 : " + openDate.format(dtf1));

	}

	public static String getKoreanDayOfWeek(int day) {
		String result = "";
		switch (day) {
		case 1:
			result = "월요일";
			break;
		case 2:
			result = "화요일";
			break;
		case 3:
			result = "수요일";
			break;
		case 4:
			result = "목요일";
			break;
		case 5:
			result = "금요일";
			break;
		case 6:
			result = "토요일";
			break;
		case 7:
			result = "일요일";
			break;
		}
		return result;
	}
}
