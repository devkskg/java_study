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
		
		System.out.println("6. equals");
		String str1 = "apple";
		String str3 = new String("apple");
		boolean bool = str1.equals(str3);
		// bool = str3.equals(str1); // 위랑 똑같음
		System.out.println(bool);
		
		System.out.println("7. 논리 연산자");
		int a = 6;
		int b = 5;
		int c = 7;
		
//		b < a < c ?? 우리가 궁금한 질문
//		b < a && a < c ?? 자바에 입력해야 하는 코드 / 자바는 비교 연산자 하나씩만 가능. 연결 하려면 &&, || 써야함. 
		
//		(1) AND : 6은 5보다 크고, 그리고 6은 7보다 큰가요?
		boolean andBool = (a > b) && (a > c);
		System.out.println(andBool);
		
//		(2) OR : 6은 5부다 크고, 또는 6은 7보다 큰가요?
		boolean orBool = (a > b) || (a > 7);
		System.out.println(orBool);
		
		System.out.println("8. 논리 부정 연산자");
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println(isFalse);
		
//		논리 연산자(&&, ||) 와 함께 사용
		boolean test1 = 3 < 5; // true
		boolean test2 = 6 < 5; // false
		
//		!(true && false) -> !false -> true
		System.out.println(!(test1 && test2));
//		true && !false -> true && true -> true
		System.out.println(test1 && !test2);
		
	}

}
