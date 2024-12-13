package com.gn.practice11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Run {
	public static void main(String[] args) {
		Map<Integer, Fruit> map = new HashMap<Integer, Fruit>();
		map.put(3, new Fruit("포도", "강화도", 3, 35000));
		map.put(2, new Fruit("사과", "영주", 5, 20000));
		map.put(1, new Fruit("귤", "제주", 10, 15000));
		map.put(4, new Fruit("배", "나주", 7, 50000));

		System.out.println("=== 전체 데이터 조회 ===");
		map = new TreeMap<Integer, Fruit>(map);
		Set<Integer> ks1 = map.keySet();
		Iterator<Integer> i1 = ks1.iterator();
		while (i1.hasNext()) {
			Integer no = i1.next();
			System.out.println(no + " : " + map.get(no));
		}

		System.out.println("=== 가격 20000원 이상 ===");
		Set<Entry<Integer, Fruit>> es1 = map.entrySet();
		Iterator<Entry<Integer, Fruit>> i2 = es1.iterator();
		while (i2.hasNext()) {
			Entry<Integer, Fruit> entry = i2.next();
			Integer key = entry.getKey();
			Fruit value = entry.getValue();

			if (value.getPrice() >= 20000) {
				System.out.println(key + " : " + value);
			}
		}

		System.out.println("=== 이름이 한글자인 과일 ===");
		Set<Integer> ks2 = map.keySet();
		Iterator<Integer> i3 = ks2.iterator();
		while (i3.hasNext()) {
			Integer no = i3.next();
			int strLength = map.get(no).getName().length();
			if (strLength == 1) {
				System.out.println(no + " : " + map.get(no));
			}
		}

		System.out.println("=== 포도 가격 인상 ===");
		Set<Entry<Integer, Fruit>> es2 = map.entrySet();
		Iterator<Entry<Integer, Fruit>> i4 = es2.iterator();
		while (i4.hasNext()) {
			Entry<Integer, Fruit> entry = i4.next();
			int key = entry.getKey();
			Fruit value = entry.getValue();
			if (value.getName().equals("포도")) {
				value.setPrice(28000);
				System.out.println(entry);
			}
		}

	}
}
