package com.gn.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A2");
		list.add("A1");
		list.add("B2");
		list.add("B1");
		System.out.println("초기 좌석 목록 : " + list);
		
		list.add(2, "A3");
		System.out.println("A3 좌석 추가 후 : " + list);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("예약 좌석 : ");
			String seat1 = sc.next();
			if(list.indexOf(seat1) != -1) {
				list.set(list.indexOf(seat1), list.get(list.indexOf(seat1)) + "(예약)");
				System.out.println("좌석 예약 후 : " + list);
				break;
			} else {
				System.out.println("존재하지 않는 좌석입니다.");
			}
		}
		
		while(true) {
			System.out.print("삭제 좌석 : ");
			String seat1 = sc.next();
			if(list.indexOf(seat1) != -1) {
				list.remove(list.indexOf(seat1));
				System.out.println("좌석 삭제 후 : " + list);
				break;
			} else {
				System.out.println("존재하지 않는 좌석입니다.");
			}
		}
		
		Collections.sort(list);
		System.out.println("좌석 정렬 후 : " + list);
		
		
		
		
		
		
		
		sc.close();
	}
}
