package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run03 {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.add(Calendar.WEEK_OF_MONTH, 1);
		Date cal11 = cal1.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println("1주 뒤의 날짜 : " + sdf.format(cal11));
		cal2.add(Calendar.MONTH, 1);
		Date cal22 = cal2.getTime();
		System.out.println("1달 뒤의 날짜 : " + sdf.format(cal22));
	}
}
