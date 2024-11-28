package com.gn.homework;

import java.util.Scanner;

public class Homeworks05 {

	public static void main(String[] args) {
//		1) 문제
//	주민번호를 입력하면 남자인지 여자인지 출력해주는 
//	프로그램을 구성해주세요.
//	주민번호 7번째 자리의 값이 1 또는 3이면 남성,
//	2 또는 4이면 여성입니다.
//	💡
//	가능하다면 1,2,3,4 외의 값을 입력한 경우도 고려해보세요.
//	2) 출력 예시
//	주민번호(-) : 123456-1234567
//	입력하신 주민번호는 남성입니다.
//	​
//	주민번호(-) : 123456-7891234
//	입력하신 주민번호는 잘못된 값입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		char resiNum = sc.next().charAt(7);
		if(resiNum == '1' || resiNum == '3') {
			System.out.println("입력하신 주민번호는 남성입니다.");
		} else if(resiNum == '2' || resiNum == '4') {
			System.out.println("입력하신 주민번호는 여성입니다.");
		} else {
			System.out.println("입력하신 주민번호는 잘못된 값입니다.");
		}
		
		sc.close();

	}

}
