package com.gn.study.model.vo;

public class Calculator {

	public int divide(int a, int b) {

//		1. 모든 블록에 return을 쓴다.
//		try {
//			return a/b;
//		}catch(ArithmeticException e) {
//			return -1;
//		}
//		
//		2. 임의의 변수를 활용한다. - 이거 바로 이해가 안되는 거라..
		int answer = -1;
		try {
			answer = a / b;
		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			// getMessage 는 반환형이 있기 때문에 표준 출력문과 같이 써야한다.
			// 메소드 부분에서 바로 써야 보임.
			// 메인 메소드 클래스에서 sysout으로 받아줘도 안보임..
			System.out.println(e);
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인");
		return answer;
	}

}
