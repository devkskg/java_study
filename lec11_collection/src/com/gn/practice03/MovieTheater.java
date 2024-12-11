package com.gn.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
	public static void main(String[] args) {
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		System.out.println("초기 좌석 목록 : " + seats);

		seats.add(2, "A3");
		System.out.println("A3 좌석 추가 후 : " + seats);

		Scanner sc = new Scanner(System.in);
		System.out.print("예약 좌석 : ");
		String st = sc.next();
		if (seats.contains(st)) {
			String ya = seats.get(seats.indexOf(st)) + "(예약)";
			seats.set(seats.indexOf(st), ya);
//			seats.set(seats.indexOf(st), seats.get(seats.indexOf(st)) + "(예약~)"); // 이런 식으로도 가능하구나
		} else {
			System.out.println(st + "(는)은 존재하지 않는 좌석입니다.");
		}
		System.out.println("좌석 예약 후 : " + seats);

		System.out.print("삭제 좌석 : ");
		String sd = sc.next();
		if (seats.contains(sd)) {
			seats.remove(sd);
		} else {
			System.out.println(sd + "(는)은 좌석 목록에 없습니다.");
		}
		System.out.println("좌석 삭제 후 : " + seats);
		Collections.sort(seats);
		System.out.println("좌석 정렬 후 : " + seats);

		sc.close();
	}

}
