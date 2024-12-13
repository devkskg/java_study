package com.gn.study.controller;

import java.util.HashMap;
import java.util.Map;

import com.gn.study.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
//		1.  HashMap 생성 // key와 value는 최상위 인터페이스? Object 넣으면 편하다.
		Map<String, Object> flower = new HashMap<String, Object>();
//		2. HashMap 요소 추가
		flower.put("name", "샌더소니아");
		flower.put("lang", "성공");
		flower.put("price", 40000);
//		중복된 key 사용
		flower.put("price", 50000);
		System.out.println(flower);

//		4. HashMap 요소 조회 (1)
		String f_name = (String) flower.get("name"); // Map의 value가 Object로 받았기 때문에 downcasting 필요!!!
		Object f_nameO = flower.get("name");
		System.out.println(f_name);
		System.out.println(f_nameO);
		System.out.println(flower.get("lang"));

//		3. HashMap<key,객체> 요소 추가
		Map<String, Snack> snackMap = new HashMap<String, Snack>();
		snackMap.put("다이제", new Snack("초코맛", 2700));
		snackMap.put("새우깡", new Snack("매운맛", 1600));
		snackMap.put("포테이토칩", new Snack("양파맛", 500));
		System.out.println(snackMap);

//		5. HashMap<key,객체> 요소 조회 (1)
		Snack s1 = snackMap.get("다이제"); // Snack s1 = new Snack("초코맛", 1700);
		System.out.println(s1);
		System.out.println(snackMap.get("다이제"));
		s1.setFlavor("기본맛");
		System.out.println(s1);
//		포테이토칩 양파맛 -> 소금맛
		snackMap.get("포테이토칩").setFlavor("소금맛");
		System.out.println(snackMap.get("포테이토칩"));
	}
}
