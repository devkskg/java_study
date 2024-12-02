package com.gn.practice;

import java.util.Scanner;

public class Practice12 {
	public static void main(String[] args) {
//		1) 문제
//	철수는 여자친구 영희에게 생일 축하 메시지를 보내려고 해요.
//	그런데 철수의 여자친구 영희는 띄어쓰기를 싫어합니다.
//	철수가 어떤 문자열을 입력하든 영희에게 혼나지 않게
//	글자 사이에 있는 띄어쓰기가 없게 출력해주세요.
//	String str = "생 일 축 하 해 !";
//	2) 출력 예시
//	**영희야 생 일 축 하 해 !**
//	영희야생일축하해!
//	3) 힌트
//	문자열의 길이를 측정할때는 length()를 사용합니다. ex) str.length()
//	반복문을 활용하여 ‘문자’를 한땀 한땀 출력하세요.
//	그러다가 공백을 만날 경우 다음 반복 회차로 넘어가는 분기문을 사용하세요.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strAnswer = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			}
			strAnswer += str.charAt(i);
		}
		System.out.println(strAnswer);
		sc.close();
//		이런 느낌으로도 가능해!
//		if(str.charAt(i) != ' '){
//		 sysout(str.charAt(i));
//		}
		
	}

}
