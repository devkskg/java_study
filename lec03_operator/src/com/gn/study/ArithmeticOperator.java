package com.gn.study;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
//		1. 산술 연산자
		System.out.println("1. 산술 연산자");
		int su1 = 10;
		int su2 = 3;
		System.out.println(su1 + su2);
		System.out.println(su1 - su2);
		System.out.println(su1 * su2);
		System.out.println(su1 / su2);
		System.out.println(su1 % su2);
		
		System.out.println();
		
//		2. 복합 대입 연산자
		System.out.println("2. 복합 대입 연산자");
		int a = 5;
//		a = a + 3;
		a += 3;
		System.out.println(a);
		
		int b = 10;
		b -= 4; // b = 10 - 6 = 4
		b *= 5; // b = 4 * 5 = 20
		System.out.println(b);
		
		int c = 10;
		c /= 3;
		System.out.println(c);
		
		int d = 10;
		d %= 3;
		System.out.println(d);
		
		System.out.println();
		
//		3. 증감 연산자
		System.out.println("3. 증감 연산자");
		int pre = 5;
		System.out.println(pre);
		System.out.println(++pre);
//		System.out.println(pre++);
		System.out.println(pre);
		System.out.println();
		int post = 5;
		System.out.println(post);
		System.out.println(post++);
		System.out.println(post);
		
	}

}