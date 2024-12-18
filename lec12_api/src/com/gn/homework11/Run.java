package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalTime startTime = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		System.out.println("기준 : " + startTime.format(dtf));

		while (true) {

			System.out.print("입력 : ");
			String str = sc.next().toUpperCase();

			LocalTime recordTime = LocalTime.now();
			long ch = ChronoUnit.SECONDS.between(startTime, recordTime);
			if (str.equals("Y")) {
				System.out.println("경과(초) : " + ch);
			} else if (str.equals("N")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}

		}
		sc.close();
	}
}
