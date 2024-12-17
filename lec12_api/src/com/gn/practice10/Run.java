package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
//		오늘 날짜를 기준으로 1주일 뒤에 날짜 정보를 출력
//		OO월 OO일 O요일
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE, 7);
		Date d1 = c1.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf1.format(d1));

		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.MONTH, 1);
		Date d2 = c2.getTime();
//		SimpleDateFormat sdf2 = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf1.format(d2));

	}
}
