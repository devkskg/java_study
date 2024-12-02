package com.gn.practice;

public class Practice03 {
	public static void main(String[] args) {
//		1) 문제
//	총 10명의 학생들의 출석 여부를 표현한 배열 attend가 있습니다.
//	학생이 출석한 경우 1, 결석한 경우 0으로 표시되어 있습니다.
//	출석한 학생의 수를 계산하여 출력해주세요.
//	int[] attend = {1,1,1,1,1,0,1,0,0,1};
//	2) 출력 예시
//	출석한 학생 수 : 7
//	3) 더해보기
//	결석한 학생의 수도 함께 출력하세요.
//	결석한 학생 수 : 3
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int sum = 0;
		for(int att : attend) {
			sum += att;
		}
		System.out.println("출석한 학생 수 : " + sum);
		System.out.println("결석한 학생 수 : " + (attend.length - sum));
	}
}
