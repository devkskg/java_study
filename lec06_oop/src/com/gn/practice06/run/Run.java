package com.gn.practice06.run;

import com.gn.practice06.model.vo.Person;

public class Run {
	public static void main(String[] args) {
//		1) 문제
//	아래의 클래스 다이어그램을 보고 클래스를 구성하세요.
//	메인 메소드에 Person 타입의 객체를 생성하세요.
//	아래의 사용 데이터를 참고하여 setter로 값을 추가하세요.
//	information 메소드를 활용하여 정보를 출력하세요.
//	2) 클래스 다이어그램
//	[이미지 첨부]
//	3) 사용 데이터
//	id : user01
//	pwd : 1234
//	name : 김철수
//	age : 43
//	gender : M
//	phone : 010-111-1111
//	email : kcs@gmail.com
		
		Person p1 = new Person();
		
		p1.setId("user01");
		p1.setPwd("1234");
		p1.setName("김철수");
		p1.setAge(43);
		p1.setGender('M');
		p1.setPhone("010-111-1111");
		p1.setEmail("kcs@gmail.com");
		
		System.out.println(p1.information());
		
//		System.out.println("=====");
//		
//		Person p2 = new Person("user01", "1234", "김철수", 43, 'M', "010-111-1111", "kcs@gmail.com");
//		System.out.println(p2.information());
		
		
	}

}
