package com.gn.study.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Why {
	public static void main(String[] args) {
		Map<String, Object> flower = new HashMap<String, Object>();
		flower.put("name", "샌더소니아");
		flower.put("lang", "성공");
		flower.put("price", 40000);
		flower.put("price", 50000);

		Set<String> keySet = flower.keySet();
		Iterator<String> iterKey = keySet.iterator();
		while (iterKey.hasNext()) {
			String key = iterKey.next();
			Object value = flower.get(key);
//			Object value = (String) flower.get(key); // Integer -> String 강제형변환(오류)을 나타낼 수 없어서 오류가 난다!
			System.out.println(key + ":" + value);
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		int age = 24;
		String str = Integer.toString(age);
		System.out.println(str);
	}
}
