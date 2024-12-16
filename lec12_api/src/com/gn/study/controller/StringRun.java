package com.gn.study.controller;

public class StringRun {
	public static void main(String[] args) {
//		1. 리터럴 방식 -> ""
//		String Constant Pool 에 저장된다.
//		값이 같으면 hashCode 동일 , == 비교 연산자 사용 가능
		String str = "Hello";
//		String str = new String("Hello");
		System.out.println("Hello(1) : " + System.identityHashCode(str));
//		str += "World";
//		System.out.println(str);
//		System.out.println(System.identityHashCode(str));

		String str1 = "Hello";
		System.out.println("Hello(2) : " + System.identityHashCode(str1));
		if (str == str1) {
			System.out.println("같다!");
		}

//		2. new 연산자 객체 방식 -> new String("");
//		Heap 영역에 저장된다.
//		값이 같아도 hashCode 다름, == 비교 연산자 사용 불가능
		String str2 = new String("Hello");
		System.out.println("Hello(3) : " + System.identityHashCode(str2));

//		3. equals
		System.out.println("equals() : " + ("Hi".equals(str2))); // equals 는 리터럴이든 객체로 쓰든 상관 없다
//		4. length()
		System.out.println("length() : " + str2.length());
//		5. charAt()
		System.out.println("charAt(i) : " + str2.charAt(0));
//		6. toCharArray()
		char[] arr = str2.toCharArray();
		for (char a : arr) {
			System.out.print((int) a + " | ");

		}
		System.out.println();
//		7. contains()
		System.out.println("contains() : " + str2.contains("lo"));
//		8. compareTo() => Hello vs ZZZ -> H와 Z가 18만큼 차이 난다. / 음수면 기준 문자열이 앞에 있구나!
		System.out.println("compareTo() : " + str2.compareTo("ZZZ"));
//		9. concat
		String test = "우리는";
		test.concat("할수있다.");
//		System.out.println(test); -> 불변 객체의 특징!!!!!!!!!!!!!!!!!!!!!
//		System.out.println(test.concat("할수있다.")); // 요런 식으로 하거나
		test = test.concat("할수있다.");
		System.out.println(test); // 이런 식으로 재할당 해줘야함!!!!!!!!!!!!!!!!

//		10. indexOf
		test = "2024.12.16.12.43";
		System.out.println(test.indexOf("."));
		System.out.println(test.indexOf("12"));
		System.out.println(test.lastIndexOf("."));
		System.out.println(test.lastIndexOf("12"));

//		11. split
		String[] time = test.split(".");
		for (String t : time) {
			System.out.println(t);
		}
	}
}
