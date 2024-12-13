package com.gn.study.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

		System.out.println("===");
//		6. HashMap 요소 조회 (2)
//		(1) HashMap 요소들의 key값으로 Set을 만든다. -> key의 제네릭 사용
		Set<String> keySet = flower.keySet();
//		(2) Iterator 만들기
		Iterator<String> iterKey = keySet.iterator();
//		(3) 손을 집어 넣는다 -> hasNext()
		while (iterKey.hasNext()) {
//			(4) 확인한다 -> next()
			String key = iterKey.next();
//			System.out.println("key 확인");
//			System.out.println(key);
//			System.out.println("value 확인");
			Object value = flower.get(key);
//			Object value = (String) flower.get(key); // 이거 왜 오류남??????????????
			System.out.println(key + ":" + value);
		}
		System.out.println("*****");
//		(1) HashMap 요소들의 key+value 값으로 entrySet 만들기
		Set<Entry<String, Object>> entrySet = flower.entrySet(); // 형태 잘 보기
//		(2) Iterator 만들기
		Iterator<Entry<String, Object>> itEntry = entrySet.iterator();
//		(3) 손을 집어 넣는다
		while (itEntry.hasNext()) {
//			(4) next()
			Entry<String, Object> entry = itEntry.next();
			String key = entry.getKey();
			Object value = entry.getValue();
//			System.out.println(entry); ??
			System.out.println(key + "=" + value);
		}
		System.out.println("----");

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

//		7. HashMap<객체> 요소 조회(2)
//		(1) keySet()
		Set<String> keySet1 = snackMap.keySet();
		Iterator<String> iterKey1 = keySet1.iterator();
		while (iterKey1.hasNext()) {
			String key = iterKey1.next();
			Snack value = snackMap.get(key);
			System.out.println(key + " ### " + value);
		}

//		(2) entrySet()
		Set<Entry<String, Snack>> entSet1 = snackMap.entrySet();
		Iterator<Entry<String, Snack>> iterEnt1 = entSet1.iterator();
		while (iterEnt1.hasNext()) {
			Entry<String, Snack> ent = iterEnt1.next();
			String key = ent.getKey();
			Snack value = ent.getValue();
//			Snack value = snackMap.get(key);
			System.out.println(key + " %%%% " + value);
		}

	}
}
