package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gn.study.model.vo.Container;
import com.gn.study.model.vo.Student;

public class Run {
	public static void main(String[] args) {
//		Boxing(기본형 -> 참조형)
		Integer iNum = 100;
		System.out.println(iNum);
//		Unboxing(참조형 -> 기본형)
		int num = iNum;
		System.out.println(iNum);
		System.out.println(num);

		System.out.println("===========");

//		parse메소드 - 문자열 형식의 값을 기본 타입으로 변환하는 메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1 + str2);
		int num1 = Integer.parseInt(str1);
//		System.out.println(num1);
		int num2 = Integer.parseInt(str2);
//		System.out.println(num2);
		System.out.println(num1 + num2);

		str2 = "1.34";
		System.out.println(str2 + str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3 + num3);

		System.out.println("===========");

//		NumberFormatException
		try {
			String[] arr = new String[3];
			arr[0] = "일";

			int arrNum = Integer.parseInt(arr[0]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열을 잡아주기 위해 try-catch 썼다.");
		System.out.println("===========");

//		ClassCastException
		try {
			Object o = 9;
			String oStr = (String) o;
//		Object-String / Object-Integer 할수는 있지만 String - Integer 끼리는 상속||구현 관계가 아니라서 예외!
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("선 넘은 형변환");
		System.out.println("===========");

//		제네릭
		Container<Integer> con = new Container<Integer>();
		con.setItem(50);

		Container<String> tain = new Container<String>();
		tain.setItem("안녕하세요.");
		System.out.println(con.getItem() + tain.getItem());
		System.out.println("===========");

//		List(ArrayList)
//		1. 선언과 생성 - 인터페이스를 참조변수로 써야 좋다! 다형성 때문에!
		List<String> list = new ArrayList<String>(); // Import 필수
//		2. 추가
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal); // List는 이미 toString이 되어있다.
		meal.add(1, "아점");
//		meal.add(4, "야식 고?"); 인덱스 3번이 비워진 채로 4번 추가하려니까 IndexOutOfBoundsException 오류가 뜬다.
//		빈 공간 없게 해야된다!
//		3. 삭제
		System.out.println(meal);
//		meal.remove("간식"); 특정 데이터 쓰면 지울 수 있긴 하는데.. 비추비추.. 객체 들어가면 equals 재정의 하는거 아니면 판단 어렵다.
		meal.remove(1);
		System.out.println(meal);
		meal.clear();
		System.out.println(meal);
//		4. 요소 변경
//		meal.set(0, "ddd"); 비어있는 List에서 0번 요소변경은 안되는 구나 
//		System.out.println(meal); 
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums);
		nums.set(1, 112233);
		System.out.println(nums);
//		5. 요소 조회
		System.out.println(nums.get(2));
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(i + " : " + nums.get(i));
		}

		for (Integer n : nums) {
			System.out.println(n);
		}
		for (int n : nums) { // wrapper 형태의 데이터를 기본형 자료형으로 바꾸는 것 : Unboxing !!!!!
			System.out.println(n);
		}

//		6. ArrayList의 정렬
		System.out.println("정렬 전 : " + nums);
		Collections.sort(nums); // 오름차순
		System.out.println("오름차순 : " + nums);

		Collections.sort(nums, Collections.reverseOrder()); // , Collections.reverseOrder() 내림차순
		System.out.println("내림차순 : " + nums);

//		7. ArrayList<객체>
		Student s = new Student();
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("김철수", 50)); // 형태 좀 생소한 느낌이지만 하던거+하던거라서 외워보자

		System.out.println(students);

//		System.out.println("요거요거요거요거");
		if (students.contains(new Student("김철수", 50))) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

//		System.out.println("요거요거요거요거");
		if (students.indexOf(new Student("김철수", 50)) != -1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

		students.add(new Student("이영희", 40));
		students.add(new Student("홍길동", 30));

//		이거이거이거이거이거이거 compareTo 숫자로 받는거야야야야
//		1 -1 0 이런식으로 받고싶으면 compareTo 메소드에서 변형시켜야대ㅐㅐㅐㅐ
		int result000 = students.get(0).compareTo(students.get(1));
		System.out.println(result000);
//		이거이거이거이거이거이거 compareTo 숫자로 받는거야야야야
//		1 -1 0 이런식으로 받고싶으면 compareTo 메소드에서 변형시켜야대ㅐㅐㅐㅐ

		System.out.println("정렬 전 : " + students);

		Collections.sort(students);
		System.out.println("정렬 후 : " + students);

		System.out.println("============HashSet============");
		Set<String> city = new HashSet<String>();
		city.add("서울");
		if (city.add("부산")) {
			System.out.println("부산 넣었음");
		}
		city.add("광명");
		System.out.println(city);
//		중복 데이터 추가 시도
		city.add("서울");
		if (city.add("서울")) {
			System.out.println("서울 넣었음");
			System.out.println(city);
		} else {
			System.out.println("서울 못 넣었음");
			System.out.println(city);
		}

//		전체 출력
		System.out.println("===전체 출력===");
		for (String str : city) {
			System.out.println(str);
//			city.remove(str);
//			if (city.size() == 0) {
//				System.out.println("마지막!!");
//			}
		}
//		System.out.println("확인용" + city);

//		삭제
		city.remove("서울");
		System.out.println("삭제후 : " + city);
		city.clear();
		System.out.println("비우기 : " + city);
		if (city.isEmpty()) {
			System.out.println("도시가 없습니다.");
		}

		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("김철수", 30));
		set1.add(new Student("이영희", 40));
		set1.add(new Student("홍길동", 50));
		set1.add(new Student("김철수", 30));
		System.out.println(set1);
//		hashCode와 equals 모두 만족해야 같은 정보로 판단한다.
//		저번시간에 Student에 equals 오버라이드 해놨으니 오케이~
		set1.remove(new Student("김철수", 30));
		System.out.println("삭제 후 : " + set1);

	}
}
