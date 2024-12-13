package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Main {
	public static void main(String[] args) {
		Map<String, Planet> map1 = new HashMap<String, Planet>();
		map1.put("Mercury", new Planet("수성", 4879, 0.24));
		map1.put("Venus", new Planet("금성", 12104, 0.62));
		map1.put("Earth", new Planet("지구", 12742, 1.0));
		map1.put("Mars", new Planet("화성", 6779, 1.88));

		System.out.println("*** keySet() 사용 ***");
		Set<String> k = map1.keySet();
		Iterator<String> i1 = k.iterator();
		while (i1.hasNext()) {
			String key = i1.next();
			Planet planet = map1.get(key);
			String str = "";
			str += "행성 이름: " + key;
			str += "(" + planet.getName() + "), ";
			str += "지금: " + planet.getDiameter() + "km, ";
			str += "공전주기: " + planet.getPeriod() + "년";
//			System.out.println("행성 이름: " + key + "(" + map1.get(key).getName() + "), 지름: " + map1.get(key).getDiameter()
//					+ "km, 공전주기: " + map1.get(key).getPeriod() + "년");
			System.out.println(str);
		}

		System.out.println("*** entrySet() 사용 ***");
		Set<Entry<String, Planet>> ent = map1.entrySet();
		Iterator<Entry<String, Planet>> i2 = ent.iterator();
		while (i2.hasNext()) {
			Entry<String, Planet> entry = i2.next();
			String key = entry.getKey();
			Planet value = entry.getValue();
			String str = "";
			str += "키: " + key + ", ";
			str += "값: " + value;
//			System.out.println("키: " + key + ", 값:" + value);
			System.out.println(str);
		}
	}
}
