package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
//		1) 문제
//	아래와 같이 변수 checkNum을 선언하세요.
//	int checkNum;
//	그리고 키보드로 값을 입력 받아서 checkNum을 초기화합니다.
//	만일 checkNum에 할당된 숫자가 양수일 경우
//	“양수입니다.”를 출력하는 프로그램을 만드세요.
//	2) 출력 예시
//	입력 : **123**
//	숫자 : 123
//	양수입니다.
		int checkNum; // 문제에서 checkNum을 먼저 선언하라 했으니 위로 올리는 게 맞음.
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		checkNum = sc.nextInt();
		if(checkNum > 0) {
			System.out.println("숫자 : " + checkNum + "\n" + "양수입니다.");
		} else {
			System.out.println("숫자 : " + checkNum + "\n" + "음수입니다.");
		}
//		\n을 사용한 줄바꿈 사용 test. \n 사용하기 위해서는 "" 안에서 써야한다.
//		sysout을 추가하는 것이 코드와 결과값 비교하기에 가독성이 더 좋을 것 같다.
//		숫자 : checkNum 이 부분도 중복되니까 그냥 위로 올리는 게 더 좋을 것 같다.
//		checkNum = 0인 경우에는 위의 코드를 따르면 "음수입니다."가 나온다.
//		제 3의 숫자인 0은 else-if 문을 사용해야한다. ConditionStmt 참고.
		
		sc.close();
		
	}

}
