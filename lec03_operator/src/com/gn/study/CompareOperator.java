package com.gn.study;
// 비교 연산자
public class CompareOperator {
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println("1. 등호");
//		System.out.println(num1 == num2);
		boolean same = num1 == num2;
		System.out.println(same);
		
		System.out.println("2. (부)등호");
		boolean diff = num1!=num2;
//		System.out.println(num1 != num2);
		
		System.out.println("3. 크다, 작다");
		boolean big = num1 > num2;
		boolean small = num1 < num2;
		
//		System.out.println(num1 > num2);
//		System.out.println(num1 < num2);
		
		System.out.println("4. 크거나 같다, 작거나 같다.");
		boolean bigSame = num1 >= num2;
//		boolean smallSame = num1 <= num2;
//		System.out.println(num1 >= num2);
//		System.out.println(num1 <= num2);
		
		System.out.println("5. char와 비교 연산자");
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1 < c2); // 대문자가 더 크지않나? 싶지만 유니코드 값으로 변환하여 비교하기 때문.
		System.out.println((int)c1 + " < " + (int)c2);
		
	}

}
