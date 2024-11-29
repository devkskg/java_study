package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
//		1) 문제
//	철수는 스위치로 조명을 조절하는 스마트 조명을 설치했어요.
//	조명의 밝기는 사용자가 입력한 값에 따라서 조절돼요.
//	아래와 같은 기준을 따른다고 했을 때,
//	사용자가 입력한 값에 따라서 밝기를 출력하는 프로그램을 작성해주세요.
//	0 : 조명을 끕니다.
//	1 : 어두운 조명입니다.
//	2 : 밝은 조명입니다.
//	3 : 매우 밝은 조명입니다.
//	입력 값이 위의 기준에 해당하지 않으면 “올바른 입력이 아닙니다.”라고 출력하세요.
//	2) 출력 예시
//	조명의 밝기를 입력하세요 (0~3): **3**
//	현재 조명의 밝기: 매우 밝은 조명입니다.
		Scanner sc = new Scanner(System.in);
//		ctrl + shit + 'o' import 편하게 해줌.
		System.out.print("조명의 밝기를 입력하세요 (0~3): ");
		int num = sc.nextInt();
//		현재 조명의 밝기 : oooo (V)
		
//		방법 참고 1.
//		System.out.print("현재 조명의 밝기 : ); // 이런식으로 ln없애고 case 들의 수행문장을 붙여서 반복 줄일 수 있다.
//		방법 참고 2.
//		text = "현재 조명의 밝기: " 스위치 위에 만들어두고  수행문장에 text += "어두운 조명입니다." 이런 식으로 쌓기 가능
		switch(num) {
			case 0 : System.out.println("조명을 끕니다."); break;
			case 1 : System.out.println("현재 조명의 밝기: 어두운 조명입니다."); break;
			case 2 : System.out.println("현재 조명의 밝기: 밝은 조명입니다."); break;
			case 3 : System.out.println("현재 조명의 밝기: 매우 밝은 조명입니다."); break;
			default : System.out.println("올바른 입력이 아닙니다."); break;
		}
		
		sc.close();
		
	}

}
