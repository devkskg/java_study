package com.gn.study.controller;

import java.util.Calendar;

public class DateRun {
	public static void main(String[] args) {
//		Calendar
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		int year = cal1.get(Calendar.YEAR); // cal1이 가지고 있는 정보 중에서 YEAR를 꺼내오겠다~ 라는 뜻~
		int mon = cal1.get(Calendar.MONTH) + 1; // 월은 인덱스 처리된 형태라서 +1 해줘야해~

		System.out.println(year + "년" + mon + "월");

		Calendar cal2 = Calendar.getInstance();
		int year2 = cal2.get(Calendar.YEAR);
		int mon2 = cal2.get(Calendar.MONTH) + 1;
		int date2 = cal2.get(Calendar.DATE);
		int day2 = cal2.get(Calendar.DAY_OF_WEEK);
		// 일=1, 월=2, 화=3
		String str2 = "";
		switch (day2) {
		case 1:
			str2 = "일요일";
			break;
		case 2:
			str2 = "월요일";
			break;
		case 3:
			str2 = "화요일";
			break;
		}

		System.out.println(year2 + "년 " + mon2 + "월 " + date2 + "일 " + str2);
	}
}
