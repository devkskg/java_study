package com.gn.study.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateRun {
	public static void main(String[] args) {
//		1. LocalDate
//		(1) 현재 날짜 구하기
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
//		(2) 특정 날짜 설정
		LocalDate date2 = LocalDate.of(2024, 12, 25);
		System.out.println(date2);
//		(3) 필드 조회
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfMonth());
//		1:월 ~ 7:일
		System.out.println(date1.getDayOfWeek().getValue());
//		(4) 필드 증가
		LocalDate date3 = date1.plusWeeks(3);
		System.out.println(date3);
//		(5) 필드 감소
		LocalDate date4 = date1.minusDays(3);
		System.out.println(date4);

		System.out.println("====");

//		2. LocalTime
//		(1) 현재 시간
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
//		(2) 특정 시간 지정
		LocalTime time2 = LocalTime.of(12, 50, 05);
		System.out.println(time2);
//		(3) 특정 필드 조회
		System.out.println(time1.getMinute());
//		(4) 필드 증가
		LocalTime time3 = time1.plusHours(7);
		System.out.println(time3);
//		(5) 필드 감소
		LocalTime time4 = time1.minusMinutes(20);
		System.out.println(time4);

//		3. LocalDateTime
//		(1) 현재 날짜와 시간
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);
//		(2) 특정 날짜와 시간
		LocalDateTime dateTime2 = LocalDateTime.of(2025, 1, 1, 6, 30, 45);
		System.out.println(dateTime2);

//		4. DateTimeFormater
//		(1) 날짜와 시간 -> 문자열
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 ahh:mm:ss");
		String result1 = now1.format(dtf1);
		System.out.println(result1);
//		(2) 문자열 -> 날짜와 시간
		String str2 = "2024-12-24 13:50:26";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 가이드 해주기
		LocalDateTime dateTime3 = LocalDateTime.parse(str2, dtf2); // dtf2번을 써서 str2를 parse해석해주세요
		System.out.println(dateTime3);

//		LocalDate now2 = LocalDate.now();
//		String result2 = now2.format(dtf1);
//		System.out.println(result2);

//		원래는...
//		String[] arr1 = str2.split(" ");
//		String[] dateArr = arr1[0].split("-");
//		String[] timeArr = arr1[1].split(":");
//		LocalDateTime temp = LocalDateTime.of(dateArr[0], dateArr[0], dateArr[0], timeArr[0], timeArr[0], timeArr[0])
//		여기 안에 값에 int형으로 맞추는 parse 까지 해줘야 했다.

//		5. ChronoUnit
//		LocalDateTime startDate = LocalDateTime.of(2024, 01, 1, 1, 30, 0);
		LocalDate startDate = LocalDate.of(2024, 1, 1);
		LocalDate endDate = LocalDate.of(2024, 12, 31);
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(daysBetween);
	}
}
