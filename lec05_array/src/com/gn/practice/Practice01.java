package com.gn.practice;

//import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
//		1) 문제
//	철수는 친구들의 이름을 배열에 넣고 싶어졌어요.
//	친구들 이름이 아래와 같다고 할때, 친구들의 이름을 담고 있는 배열 friends를 구성하세요.
//	박지영, 김태우, 이지훈, 최유진, 정승호
//	:흰색_확인_표시:
//	13
//
//
//
//	김가남
//	  오후 12:35
//	그리고 반복문을 활용해서 출력예시와 같이 출력하세요.
//	2) 출력 예시
//	1 : 박지영
//	2 : 김태우
//	3 : 이지훈
//	4 : 최유진
//	5 : 정승호
//		
//		+ 홀수번째에 있는 친구들만 출력하기
		
		String[] friends1 = new String[] {"박지영", "김태우", "이지훈", "최유진", "정승호"};
		for(int i = 0; i < friends1.length; i++) {
			if((i + 1) % 2 == 0) {
				continue;
			}
			System.out.println((i + 1) + " : " + friends1[i]);
		}
		
		System.out.println();
		
		String[] friends2 = new String[5];
		friends2[0] = "박지영";
		friends2[1] = "김태우";
		friends2[2] = "이지훈";
		friends2[3] = "최유진";
		friends2[4] = "정승호";
		for(int i = 0; i < friends1.length; i++) {
			System.out.println((i + 1) + " : " + friends2[i]);
		}
		
		String[] friends3 = {"박지영", "김태우", "이지훈", "최유진", "정승호"};
		
//		
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		
		
		
		
	}
}
