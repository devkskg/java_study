package com.gn.homework04.controller;

public class ExMethodController {
	private String str;
	private int num;
//	private char ch;
	private int sum;
	
	public ExMethodController() {}
	
	public ExMethodController(String str) {
		this.str = str;
	}
	public ExMethodController(int num) {
		this.num = num;
	}
//	public ExMethodController(char ch) {
//		this.ch = ch;
//	}
//	public ExMethodController(String str, char ch) {
//		this.str = str;
//		this.ch = ch;
//	}
	
	public void method1() {
		System.out.println(str);
	}
	
	public int method2() {
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
//		여기에 뭐 쓰면 실행은 되는건가..? sum을 다시 0으로 초기화 한다던가? < 내일 강사님께 질문!
	}
	
	public String method3() {
		
		if(num % 2 == 0) {
			return "짝수입니다.";
		} else if(num % 2 == 1) {
			return "홀수입니다.";
		} else {
			return "잘못된 숫자입니다.";
		}
		
	}
	
	public String method4() {
		sum = 0;
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i)<= 'z') {
				sum++;
			}
		}
		if(sum > 0) {
			return "영문자가 있습니다.";
		} else {
			return "영문자가 없습니다.";
		}
	}
	
	public void method5() {
		sum = 0;
		System.out.println("문자가 " + str.length() + "개 있습니다.");
	}
	
	public void method6() {
		System.out.println("=== " + num + "단 ===");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
