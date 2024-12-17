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
		String str3 = new String("Hello");
		System.out.println("Hello(3) : " + System.identityHashCode(str3));

		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

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

		System.out.println("===");

//		11. split
		String[] time1 = test.split("\\.");
		for (String t : time1) {
			System.out.println(t);
		}

		String name = "김-철-수 "; // 이럴때 보통 스플릿 쓴다.
		String[] nameArr = name.split("-");
		for (String n : nameArr) {
			System.out.println(n);
		}
//		역할이 있는 특수기호( 온점, 더하기 )가 구분자로 사용될때 \\ 역슬래시 두번 해준다.
		String a = "a+b+c+d";
		String[] arrA = a.split("\\+");
		String b = "e.f.g.h";
		String[] arrB = b.split("\\.");

//		12. 문자열 바꾸기
		String ide = "eclipse";
		ide = ide.replace("e", "a");
		System.out.println(ide);
		String id = "김 철 수";
		id = id.replace(" ", "");
		System.out.println(id);
//		원하지 않는 띄어쓰기, 특수문자를 바꾸거나 없앨 수 있음

//		13. 비어있는지 확인
		String empty1 = "";
		String empty2 = " ";
		System.out.println("(1) : " + empty1.isBlank());
		System.out.println("(2) : " + empty2.isBlank());

		System.out.println("(3) : " + empty1.isEmpty());
		System.out.println("(4) : " + empty2.isEmpty());

		System.out.println("(5) : " + (empty1.length() == 0));
		System.out.println("(6) : " + (empty2.length() == 0));
		empty2 = empty2.replace(" ", ""); // 문자열 공백 제거
		System.out.println(empty2.length() == 0);

		String empty3 = " 안 녕 ";
		System.out.println(empty3);
		empty3 = empty3.trim();
		System.out.println(empty3);
//		empty3 = empty3.replace(" ", "");
//		System.out.println(empty3);

//		System.out.println("==="); // 맨 앞의 띄어쓰기만 가져가고 뒤에거는 왜 버려짐?
//		String asdf = " 가 나 다 라 ";
//		String[] asdfArr = asdf.split(" ");
//		for (String as : asdfArr) {
//			System.out.println(as);
//		}
//		System.out.println("===");

		String[] students = { "철수", "영희", "길동" };
		String allStudent = String.join("-", students);
		System.out.println(allStudent);

		String cutTest = "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0, 7));
		// cutTest.charAt(3)
		System.out.println(cutTest.substring(3, 4));

		String file = "test.jpg";
		String ex = file.substring(file.lastIndexOf(".") + 1);
		String file_name = file.substring(0, file.lastIndexOf("."));
		System.out.println("파일명 : " + file_name);
		System.out.println("확장자명 : " + ex);

//		valueOf
		double pi = 3.14;
		String piStr = String.valueOf(pi);
		System.out.println(piStr + 2.1);

//		StringBuilder
//		append
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("world!!");
		System.out.println(sb);
//		insert
		sb.insert(5, " Java ");
		System.out.println(sb);
//		delete
		sb.delete(11, 16 + 1);
		System.out.println(sb);
//		deleteCharAt
		int idx = sb.indexOf("!");
		sb.deleteCharAt(idx);
		System.out.println(sb);
//		int idx1 = sb.indexOf(" ");
//		sb.deleteCharAt(idx1);
//		System.out.println(sb);
//		sb.deleteCharAt(idx1);
//		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		Practice p = new Practice();
		System.out.println(p.test("ss"));

	}
}
