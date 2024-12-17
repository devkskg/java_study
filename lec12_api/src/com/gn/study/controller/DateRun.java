package com.gn.study.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

//		날짜 변경(1) : set
		Calendar christmas = Calendar.getInstance();
		christmas.set(Calendar.DATE, 25);
		christmas.set(2024, 12 - 1, 25); // 넣을때는 -1 뺄때는 +1
		System.out.println(christmas);

//		날짜 변경(2) : add
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.DATE, 7);
		System.out.println(cal3);

//		문자열 형태 날짜 정보로 변환
		String toDay = "2024-05-14";
		String[] temp = toDay.split("-");
		Calendar cal4 = Calendar.getInstance();

		cal4.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[2]));
		cal4.add(Calendar.MONTH, -1);
		System.out.println(cal4.get(Calendar.YEAR) + "년 " + (cal4.get(Calendar.MONTH) + 1) + "월 ");

//		두 날짜 사이의 차이 구하기
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2024, 10 - 1, 16);
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis() - cal5.getTimeInMillis();
//		long diffSecond = diff / 1000;
//		long diffMinute = diffSecond / 60;
//		long diffHour = diffMinute / 60;
//		long diffDay = diffHour / 24;
		long diffDay = diff / (1000 * 60 * 60 * 24);
		System.out.println(diffDay);

//		최대값 구하기
		Calendar cal6 = Calendar.getInstance();
		int last = cal6.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막 날짜 : " + last);

//		Date 써보기
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH:mm:ss");
		String printDate = sdf.format(d);
		System.out.println(printDate);

//		2024-12-17 오후 03:30:23

		Calendar cal7 = Calendar.getInstance();
//		cal7.add(Calendar.YEAR, 1);
		Date date = cal7.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a KK:mm");
		sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일 a KK:mm:ss");
		System.out.println(sdf2.format(date));

	}
}
