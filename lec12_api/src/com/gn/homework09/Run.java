package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2025, 01 - 1, 24);
		Date openDate = cal1.getTime();

		Calendar cal2 = Calendar.getInstance();
		Date today = cal2.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("오늘 날짜 : yyyy년 MM월 dd일");

		System.out.println(sdf1.format(today));

		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		long days = diff / (1000 * 60 * 60 * 24);

		System.out.println("카페 오픈일까지 남은 날 : " + days + "일");

		System.out.println("오픈달의 마지막 날 : " + cal1.getActualMaximum(Calendar.DATE) + "일");

		int day = cal1.get(Calendar.DAY_OF_WEEK);
		String whenOpenDay = "";
		switch (day) {
		case 1:
			whenOpenDay = "일요일";
			break;
		case 2:
			whenOpenDay = "월요일";
			break;
		case 3:
			whenOpenDay = "화요일";
			break;
		case 4:
			whenOpenDay = "수요일";
			break;
		case 5:
			whenOpenDay = "목요일";
			break;
		case 6:
			whenOpenDay = "금요일";
			break;
		case 7:
			whenOpenDay = "토요일";
			break;

		}
		System.out.println("카페 오픈일의 요일 : " + whenOpenDay);
	}
}
