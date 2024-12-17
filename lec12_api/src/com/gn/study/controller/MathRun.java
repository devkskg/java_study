package com.gn.study.controller;

public class MathRun {
	public static void main(String[] args) {

//		1. abs() : 절대값
		int num = -37;
//		num = num < 0 ? -num : num;
		num = Math.abs(num);
		System.out.println(num);

//		2. pow(a, b) : a의 b제곱 -> double이 반환된다.
		double dNum = Math.pow(5, 4);
		System.out.println(dNum);

		int result = 1;
		for (int i = 1; i <= 4; i++) {
			result *= 5;
		}
		System.out.println(result);

//		3. round() : 반올림
		double pi = 3.141592653578;
//		(1) 원하는 자리수만큼 10의 지수 곱하기
		double multi = pi * Math.pow(10, 3);
//		(2) 반올림 처리 
// 		round 사용시 정수형 타입 long으로 나오니까 조심해야함. 
//		-> 3번 나누기 할때 잘못된 결과 나올 수도 있음!!!!!!!!
//		마지막에 나누는 값을 1000.0 이런식으로 해도 괜찮다!!!!
		double half = Math.round(multi);
//		(3) 10의 지수 만큼 나누기
		double div = half / Math.pow(10, 3);
		System.out.println(div);
//		한줄로 정리!!!!!!!!!!!!!!!
		double after = Math.round(pi * Math.pow(10, 3)) / Math.pow(10, 3);
		System.out.println(after);

//		4. ceil() : 올림
//		double up1 = 3.000001;
		double up = Math.ceil(pi);
		System.out.println(up);
//		5. floor() : 내림
		double down = Math.floor(pi);
		System.out.println(down);
//		주의사항!!!!
		System.out.println(Math.ceil(1 / 2));
		System.out.println(Math.ceil(1.0 / 2.0));
		System.out.println(Math.ceil(1 / 2.0));
		System.out.println(Math.ceil(1.0 / 2));
		System.out.println("==========");
//		소수점 처리 가능
		System.out.println(Math.ceil(pi * Math.pow(10, 2)) / Math.pow(10, 2));
	}

}
